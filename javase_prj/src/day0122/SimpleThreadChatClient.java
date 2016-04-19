package day0122;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
//1. Runnable을 구현
public class SimpleThreadChatClient extends Frame implements ActionListener,Runnable {

	private TextField tfNick, tfServerIp, tfTalk;
	private Button btnConnect;
	private TextArea taTalkDisplay;
	
	private Socket client;
	private Socket socketClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	public SimpleThreadChatClient(){
		super("쳇 클라이언트");
		tfNick = new TextField(10);
		tfServerIp = new TextField("211.63.89.");
		tfTalk = new TextField();
		btnConnect = new Button("접속");
		
		taTalkDisplay = new TextArea();
		Panel panelNorth = new Panel();
		panelNorth.add(new Label("서버주소",Label.CENTER));
		panelNorth.add(tfServerIp);
		panelNorth.add(new Label("대화명",Label.CENTER));
		panelNorth.add(tfNick);
		panelNorth.add(btnConnect);
		
		add("North",panelNorth);
		add("Center",taTalkDisplay);
		add("South",tfTalk);
		
		btnConnect.addActionListener(this);
		tfTalk.addActionListener(this);
		
		setBounds(700,100, 450, 300);
		setVisible(true);

		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try{
					if(readStream !=null){ readStream.close();}
					if(writeStream!=null){writeStream.close();}
					if(client !=null){
						client.close(); // 소켓을 끊으면 열결된게 다 끊어진다.
					}
				}catch(IOException ie){
					ie.printStackTrace();
				}
				dispose();
			}
			
		});
		
	}
	
	/**
	 * 텍스트필드에서 이벤트가 발생했을 때 출력 스트림을 사용하여 매개변수로 입력된 메세지를 보내는 일
	 * @param msg
	 * @throws IOException 
	 */
	private void sendMsg(String msg) throws IOException{
		//입력한 메세지를 현재 대회창에 보여주고
		taTalkDisplay.append(msg+"\n");
		//상대방에게 보낸다
		writeStream.writeUTF(msg);
		writeStream.flush();//분출
		tfTalk.setText("");
		tfTalk.setText("");
	}//sendMsg
	
	
	/**
	 * 언제 입력될지 모르는 메세지를 읽어들이는 일
	 * @throws IOException 
	 */
//	private void readMsg() throws IOException{
	@Override
	public void run(){
		try {
			if(readStream!=null){
				while(true){ // 접속자가 연결을 끊으면 더이상 읽을게 없어서 예외가 발생한다.
						taTalkDisplay.append(readStream.readUTF()+"\n");
				}
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "상대방 퇴실!");
		}//end while
	}//readMsg
	
	/**
	 * 서버소켓을 사용하여 임의의 포트를 열고 서버소켓에 접속하는 일
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	private void connectToServer() throws UnknownHostException, IOException{
		String ip = tfServerIp.getText().trim();
		socketClient = new Socket(ip,9501);
		taTalkDisplay.setText(ip+"서버에 연결되었습니다\n");
		readStream = new DataInputStream(socketClient.getInputStream());
		writeStream = new DataOutputStream(socketClient.getOutputStream()); 
		Thread t = new Thread(this);
		t.start();
	}//openServer
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnConnect){
			try {
				connectToServer();
			} catch (UnknownHostException e) { //서버를 모르는 예외
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==tfTalk){
			try {
				sendMsg("["+tfNick.getText()+"] "+tfTalk.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		//3-1. 객체생성
		new SimpleThreadChatClient();
//		//3-2. Thread와 has a 관계 설정
//		Thread thread = new Thread(stcc);
//		//3-3. start호출
//		thread.start();
	}

}
