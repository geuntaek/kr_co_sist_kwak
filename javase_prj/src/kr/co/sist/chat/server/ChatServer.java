package kr.co.sist.chat.server;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 서버소켓을 열고 접속자의 소켓을 받는다. <br>
 * 받은 소켓을 Helper 클래스를 샌성하면서 넣어주고 <br>
 * 소켓을 가진 Helper를 리스트에 넣어준 후 <br>
 * 메세지를 읽어들일 수 있도록 Thread를 돌린다. <br> 
 * @author user
 */
@SuppressWarnings("serial")
public class ChatServer extends JFrame implements ActionListener, Runnable {
	
	private JTextArea taMemberDisplay;
	private JButton btnOpenServer, btnClose;
	private ServerSocket server;
//	private Thread threadListen;
	private static List<ChatHelper> clientList; // 접속자를 관리할 리스트
	
	
	public ChatServer(){
		super("::::::::ChatServer::::::::");
		taMemberDisplay = new JTextArea();
		btnOpenServer = new JButton("서버 실행");
		btnClose = new JButton("서버 종료");
		
		JScrollPane jspCenter = new JScrollPane(taMemberDisplay);
		taMemberDisplay.setEditable(false);
		taMemberDisplay.setBackground(Color.WHITE);
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(btnOpenServer);
		jpSouth.add(btnClose);
		
		add("Center", jspCenter);
		add("South", jpSouth);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				endServer();
				
			}//windowClosed

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
		});
		
		btnOpenServer.addActionListener(this);
		btnClose.addActionListener(this);
		
		clientList = new ArrayList<ChatHelper>();
		
		setBounds(100, 100, 300, 500);
		setVisible(true);
	}
	
	private void endServer(){
		try {
			if(server!=null){
				server.close();
			}
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		System.exit(JFrame.ABORT);
	}//endServer
	
	
	public void openServer() throws IOException{
		if(server==null){ //서버가 생성되지 않았다면
			server = new ServerSocket(9501);
			taMemberDisplay.setText("서버 실행\n");
			//접속자를 받는 코드가 현재 윈도우와 동시에 실행될 수 있도록 Thread로 처리한다.
			Thread thread = new Thread(this);
			thread.start(); //run을 부른다.
			
		}else{ // 서버가 생성이 된 경우
			JOptionPane.showMessageDialog(this, "서버가 이미 가동중입니다.");
		}
	}//openServer
	
	@Override
	public void run() {
		//접속자 소켓을 받는다.
		try {
			ChatHelper client = null;
			Socket temp = null;
			for(int i=0; ;i++){
				temp = server.accept();
				//소켓에 메세지를 읽어들이고 보내는 일을 하는 클래스를 생성
				client = new ChatHelper(temp, i, taMemberDisplay);
				//생성된 클래스를 관리하기 위해서 리스트에 추가
				clientList.add(client);
				//추가된 클라이언트에서 메세지를 동시에 읽기 위해 Thread를 돌린다.
				client.start(); //ChatHelper의 run
				

				
			}//end for 
		}catch (IOException ie) {
			ie.printStackTrace();
		}
	}//run
	
	public static List<ChatHelper> connectClientList(){
		return clientList;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnOpenServer){
			try {
				openServer();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end if
		
		if(ae.getSource()==btnClose){
			endServer();
		}//end if
		
	}//actionPerformed

}//class

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	