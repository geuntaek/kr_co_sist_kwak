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
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 메세지를 읽어들이는 부분이 무한 loop로 되어있기 때문에 읽기작업이 수행되면 다음 코드가 실행되지 않는다.
 * => Thread를 도입하여 읽기와 쓰기를 동시에 하도록 개선.
 * @author user
 */
@SuppressWarnings("serial")
//1. Runnable를 구현
public class SimpleThreadChatServer extends Frame implements ActionListener, Runnable {

	private TextField tfNick, tfTalk;
	private TextArea taChatDisplay;
	private Button btnOpenServer;
	
	private ServerSocket server;
	private Socket socketClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	public SimpleThreadChatServer(){
		super("쳇 서버");
		tfNick = new TextField(10);
		tfTalk = new TextField();
		btnOpenServer = new Button("서버실행");
		
		taChatDisplay = new TextArea();
		Panel panelNorth = new Panel();
		panelNorth.add(new Label("대화명",Label.CENTER));
		panelNorth.add(tfNick);
		panelNorth.add(btnOpenServer);
		
		add("North",panelNorth);
		add("Center",taChatDisplay);
		add("South",tfTalk);
		btnOpenServer.addActionListener(this);
		tfTalk.addActionListener(this);
		
		setBounds(100,100, 450, 300);
		setVisible(true);
		
//		try {
//			readMsg();
//		} catch (IOException e1) {
//			JOptionPane.showMessageDialog(this, "대화상대 접속종료");
//			e1.printStackTrace();
//		}
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try{
					if(readStream != null){
						readStream.close();
					}
					if(writeStream!=null){
						writeStream.close();
					}
					if(socketClient !=null){
						socketClient.close(); // 소켓을 끊으면 열결된게 다 끊어진다.
					}
				}catch(IOException ie){
					ie.printStackTrace();
				}
				dispose(); // windowClosed를 부른다.
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);//완전히 끝나게 확인 사살
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
		taChatDisplay.append(msg+"\n");
		//상대방에게 보낸다
		writeStream.writeUTF(msg);
		writeStream.flush();//분출
		//대화창 초기화
		tfTalk.setText("");
		tfTalk.setText("");
	}//sendMsg
	
	
	/**
	 * 언제 입력될지 모르는 메세지를 읽어들이는 일
	 * @throws IOException 
	 */
//	private void readMsg() throws IOException{
	public void run(){
		try {
			if(readStream!=null){
				while(true){ // 접속자가 연결을 끊으면 더이상 읽을게 없어서 예외가 발생한다.
					taChatDisplay.append(readStream.readUTF()+"\n");
				}//end while
			}
		}catch (IOException e) {
			JOptionPane.showMessageDialog(this,"상대방이 채팅방을 나갔습니다.");
		}
		
	}//readMsg
	
	/**
	 * 서버소켓을 사용하여 포트를 열고 접속자 소켓이 있다면 접속을 허가하여 소켓을 받고, 소켓에서 스트림을 얻는 일.
	 * @throws IOException 
	 */
	private void openServer() throws IOException{
		if(server == null){ // 서버가 실행중이지 않을 때
			server = new ServerSocket(9501);
			taChatDisplay.setText("");
			taChatDisplay.setText("--서버 가동중--");
			//클라이언트 소켓이 접속하면
			socketClient=server.accept();
			taChatDisplay.append("대화상대 접속\n");
			//접속자 소켓에서 읽기 쓰기 스트림을 연결
			readStream = new DataInputStream(socketClient.getInputStream());
			writeStream = new DataOutputStream(socketClient.getOutputStream());
			//접속자가 있다면 메세지를 읽어내는 코드를 동시에 가동시킨다.
			Thread t = new Thread(this);
			t.start();
			
		}else{
			JOptionPane.showMessageDialog(this, "서버가 실행중입니다");
		}
	}//openServer
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//서버실행 버튼이 클릭되었을 때
		if(ae.getSource()==btnOpenServer){
			try {
				openServer();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "서버오류발생");
				e.printStackTrace();
			}
		}
		
		//대화가 입력되었을 때
		if(ae.getSource()==tfTalk){
			String nick = tfNick.getText();
			String msg = tfTalk.getText();
			try {
				sendMsg("["+nick+"] "+msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new SimpleThreadChatServer();
	}

}
