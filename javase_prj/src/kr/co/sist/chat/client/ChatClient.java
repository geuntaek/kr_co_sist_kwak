package kr.co.sist.chat.client;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatClient extends JFrame implements ActionListener, Runnable {
	
	private JTextField tfIp, tfNick, tfTalk;
	private JButton btnConnect, btnCapture;
	private TextArea taDisplay;
	private Socket client;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	//16616656
	public ChatClient() {
		super("::::::::ChatClient:::::::");
		tfIp = new JTextField("211.63.89.",8);
		tfNick = new JTextField(10);
		tfTalk = new JTextField();
		
		btnConnect = new JButton("접속");
		btnCapture = new JButton("대화 저장");
		
		taDisplay = new TextArea();
		taDisplay.setEditable(false);
		taDisplay.setBackground(Color.WHITE);
		
		JPanel panelNorth = new JPanel();
		panelNorth.add(new JLabel("서버주소"));
		panelNorth.add(tfIp);
		panelNorth.add(new JLabel("대화명"));
		panelNorth.add(tfNick);
		panelNorth.add(btnConnect);
		panelNorth.add(btnCapture);
		
		add("North",panelNorth);
		add("Center",taDisplay);
		add("South",tfTalk);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				try{
					if(readStream != null){
						readStream.close();
					}
					if(writeStream != null){
						writeStream.close();
					}
					if(client != null){
						client.close();
					}
				}catch(IOException ie){
					ie.printStackTrace();
				}
				System.exit(JFrame.EXIT_ON_CLOSE);
			}//windowClosed
			
		});
		btnConnect.addActionListener(this);
		btnCapture.addActionListener(this);
		tfTalk.addActionListener(this);
		
		setBounds(500, 100, 500, 350);
		setVisible(true);
		
		
	}//ChatClient
	
	private void connectToServer()throws IOException{
		if(client == null){ // 접속하지 않은 경우
			String ip = tfIp.getText().trim(); // 앞뒤 공백 제거
			if(ip.equals("")){
				JOptionPane.showMessageDialog(this, "서버의 ip주소를 넣어주세요.");
				tfIp.requestFocus();
				return; // 아래로 흘러가지 않는다.
			}
			client = new Socket("",9501);
			readStream = new DataInputStream(client.getInputStream());
			writeStream = new DataOutputStream(client.getOutputStream());
			
			//서버로 대화명 보내기
			writeStream.writeUTF(tfNick.getText());
			writeStream.flush();
			
			//연결된 스트림에서 메세지 읽기
			Thread thread= new Thread(this);
			thread.start();
			
			taDisplay.setText(tfIp.getText()+" 서버에 연결 되었습니다. 즐거운 채팅되세요!\n");
			
		}else{// 접속한 경우
			JOptionPane.showMessageDialog(this, "서버에 접속중입니다.");
		}
		
	}
	
	private void sendMsg(String msg) throws IOException{
		writeStream.writeUTF(msg);
		writeStream.flush();
		tfTalk.setText("");
	}
	
	@Override
	public void run() {
		String msg = "";
		try{
			while(true){
				msg = readStream.readUTF();
				taDisplay.append(msg+"\n");
			}
		}catch(IOException e){
			JOptionPane.showMessageDialog(this, "서버와의 연결이 끊어졌습니다.");
		}
	}//run

	private void capture() throws IOException{
		//대화내용을 파일로 저장
		String path = "c:/dev/capture";
		File mkDir = new File(path);
		if(!mkDir.exists()){
			//파일을 저장할 폴더가 존재하지 않는다면 폴더를 생성하고
			mkDir.mkdirs();
		}
		//현재시간을 사용하여 파일을 생성
		long tempTime = System.currentTimeMillis();
		File captureFile = new File(path+"/"+tempTime+".log");
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter(captureFile));
			bw.write(taDisplay.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, "대화내용이"+captureFile+"로 저장되었습니다.");
		}finally{
			if(bw!=null){bw.close();};
		}
		
		
	}//capture
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==btnConnect){
			try {
				connectToServer();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		
		if(ae.getSource()==btnCapture){
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		
		if(ae.getSource()==tfTalk){
			try{
				sendMsg("["+ tfNick.getText()+"]"+tfTalk.getText());
				
			}catch(IOException e){
				JOptionPane.showMessageDialog(this, "서버에 접속해 주세요.");
			}
		}
	}//actionPerformed

}






