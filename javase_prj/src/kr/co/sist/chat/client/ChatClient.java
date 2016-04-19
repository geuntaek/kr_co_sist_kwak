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
		
		btnConnect = new JButton("����");
		btnCapture = new JButton("��ȭ ����");
		
		taDisplay = new TextArea();
		taDisplay.setEditable(false);
		taDisplay.setBackground(Color.WHITE);
		
		JPanel panelNorth = new JPanel();
		panelNorth.add(new JLabel("�����ּ�"));
		panelNorth.add(tfIp);
		panelNorth.add(new JLabel("��ȭ��"));
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
		if(client == null){ // �������� ���� ���
			String ip = tfIp.getText().trim(); // �յ� ���� ����
			if(ip.equals("")){
				JOptionPane.showMessageDialog(this, "������ ip�ּҸ� �־��ּ���.");
				tfIp.requestFocus();
				return; // �Ʒ��� �귯���� �ʴ´�.
			}
			client = new Socket("",9501);
			readStream = new DataInputStream(client.getInputStream());
			writeStream = new DataOutputStream(client.getOutputStream());
			
			//������ ��ȭ�� ������
			writeStream.writeUTF(tfNick.getText());
			writeStream.flush();
			
			//����� ��Ʈ������ �޼��� �б�
			Thread thread= new Thread(this);
			thread.start();
			
			taDisplay.setText(tfIp.getText()+" ������ ���� �Ǿ����ϴ�. ��ſ� ä�õǼ���!\n");
			
		}else{// ������ ���
			JOptionPane.showMessageDialog(this, "������ �������Դϴ�.");
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
			JOptionPane.showMessageDialog(this, "�������� ������ ���������ϴ�.");
		}
	}//run

	private void capture() throws IOException{
		//��ȭ������ ���Ϸ� ����
		String path = "c:/dev/capture";
		File mkDir = new File(path);
		if(!mkDir.exists()){
			//������ ������ ������ �������� �ʴ´ٸ� ������ �����ϰ�
			mkDir.mkdirs();
		}
		//����ð��� ����Ͽ� ������ ����
		long tempTime = System.currentTimeMillis();
		File captureFile = new File(path+"/"+tempTime+".log");
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter(captureFile));
			bw.write(taDisplay.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, "��ȭ������"+captureFile+"�� ����Ǿ����ϴ�.");
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
				JOptionPane.showMessageDialog(this, "������ ������ �ּ���.");
			}
		}
	}//actionPerformed

}






