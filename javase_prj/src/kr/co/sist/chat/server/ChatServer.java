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
 * ���������� ���� �������� ������ �޴´�. <br>
 * ���� ������ Helper Ŭ������ �����ϸ鼭 �־��ְ� <br>
 * ������ ���� Helper�� ����Ʈ�� �־��� �� <br>
 * �޼����� �о���� �� �ֵ��� Thread�� ������. <br> 
 * @author user
 */
@SuppressWarnings("serial")
public class ChatServer extends JFrame implements ActionListener, Runnable {
	
	private JTextArea taMemberDisplay;
	private JButton btnOpenServer, btnClose;
	private ServerSocket server;
//	private Thread threadListen;
	private static List<ChatHelper> clientList; // �����ڸ� ������ ����Ʈ
	
	
	public ChatServer(){
		super("::::::::ChatServer::::::::");
		taMemberDisplay = new JTextArea();
		btnOpenServer = new JButton("���� ����");
		btnClose = new JButton("���� ����");
		
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
		if(server==null){ //������ �������� �ʾҴٸ�
			server = new ServerSocket(9501);
			taMemberDisplay.setText("���� ����\n");
			//�����ڸ� �޴� �ڵ尡 ���� ������� ���ÿ� ����� �� �ֵ��� Thread�� ó���Ѵ�.
			Thread thread = new Thread(this);
			thread.start(); //run�� �θ���.
			
		}else{ // ������ ������ �� ���
			JOptionPane.showMessageDialog(this, "������ �̹� �������Դϴ�.");
		}
	}//openServer
	
	@Override
	public void run() {
		//������ ������ �޴´�.
		try {
			ChatHelper client = null;
			Socket temp = null;
			for(int i=0; ;i++){
				temp = server.accept();
				//���Ͽ� �޼����� �о���̰� ������ ���� �ϴ� Ŭ������ ����
				client = new ChatHelper(temp, i, taMemberDisplay);
				//������ Ŭ������ �����ϱ� ���ؼ� ����Ʈ�� �߰�
				clientList.add(client);
				//�߰��� Ŭ���̾�Ʈ���� �޼����� ���ÿ� �б� ���� Thread�� ������.
				client.start(); //ChatHelper�� run
				

				
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	