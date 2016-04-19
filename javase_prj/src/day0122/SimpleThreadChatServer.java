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
 * �޼����� �о���̴� �κ��� ���� loop�� �Ǿ��ֱ� ������ �б��۾��� ����Ǹ� ���� �ڵ尡 ������� �ʴ´�.
 * => Thread�� �����Ͽ� �б�� ���⸦ ���ÿ� �ϵ��� ����.
 * @author user
 */
@SuppressWarnings("serial")
//1. Runnable�� ����
public class SimpleThreadChatServer extends Frame implements ActionListener, Runnable {

	private TextField tfNick, tfTalk;
	private TextArea taChatDisplay;
	private Button btnOpenServer;
	
	private ServerSocket server;
	private Socket socketClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	public SimpleThreadChatServer(){
		super("�� ����");
		tfNick = new TextField(10);
		tfTalk = new TextField();
		btnOpenServer = new Button("��������");
		
		taChatDisplay = new TextArea();
		Panel panelNorth = new Panel();
		panelNorth.add(new Label("��ȭ��",Label.CENTER));
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
//			JOptionPane.showMessageDialog(this, "��ȭ��� ��������");
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
						socketClient.close(); // ������ ������ ����Ȱ� �� ��������.
					}
				}catch(IOException ie){
					ie.printStackTrace();
				}
				dispose(); // windowClosed�� �θ���.
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);//������ ������ Ȯ�� ���
			}
			
		});
		
	}
	
	/**
	 * �ؽ�Ʈ�ʵ忡�� �̺�Ʈ�� �߻����� �� ��� ��Ʈ���� ����Ͽ� �Ű������� �Էµ� �޼����� ������ ��
	 * @param msg
	 * @throws IOException 
	 */
	private void sendMsg(String msg) throws IOException{
		//�Է��� �޼����� ���� ��ȸâ�� �����ְ�
		taChatDisplay.append(msg+"\n");
		//���濡�� ������
		writeStream.writeUTF(msg);
		writeStream.flush();//����
		//��ȭâ �ʱ�ȭ
		tfTalk.setText("");
		tfTalk.setText("");
	}//sendMsg
	
	
	/**
	 * ���� �Էµ��� �𸣴� �޼����� �о���̴� ��
	 * @throws IOException 
	 */
//	private void readMsg() throws IOException{
	public void run(){
		try {
			if(readStream!=null){
				while(true){ // �����ڰ� ������ ������ ���̻� ������ ��� ���ܰ� �߻��Ѵ�.
					taChatDisplay.append(readStream.readUTF()+"\n");
				}//end while
			}
		}catch (IOException e) {
			JOptionPane.showMessageDialog(this,"������ ä�ù��� �������ϴ�.");
		}
		
	}//readMsg
	
	/**
	 * ���������� ����Ͽ� ��Ʈ�� ���� ������ ������ �ִٸ� ������ �㰡�Ͽ� ������ �ް�, ���Ͽ��� ��Ʈ���� ��� ��.
	 * @throws IOException 
	 */
	private void openServer() throws IOException{
		if(server == null){ // ������ ���������� ���� ��
			server = new ServerSocket(9501);
			taChatDisplay.setText("");
			taChatDisplay.setText("--���� ������--");
			//Ŭ���̾�Ʈ ������ �����ϸ�
			socketClient=server.accept();
			taChatDisplay.append("��ȭ��� ����\n");
			//������ ���Ͽ��� �б� ���� ��Ʈ���� ����
			readStream = new DataInputStream(socketClient.getInputStream());
			writeStream = new DataOutputStream(socketClient.getOutputStream());
			//�����ڰ� �ִٸ� �޼����� �о�� �ڵ带 ���ÿ� ������Ų��.
			Thread t = new Thread(this);
			t.start();
			
		}else{
			JOptionPane.showMessageDialog(this, "������ �������Դϴ�");
		}
	}//openServer
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//�������� ��ư�� Ŭ���Ǿ��� ��
		if(ae.getSource()==btnOpenServer){
			try {
				openServer();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "���������߻�");
				e.printStackTrace();
			}
		}
		
		//��ȭ�� �ԷµǾ��� ��
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
