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
//1. Runnable�� ����
public class SimpleThreadChatClient extends Frame implements ActionListener,Runnable {

	private TextField tfNick, tfServerIp, tfTalk;
	private Button btnConnect;
	private TextArea taTalkDisplay;
	
	private Socket client;
	private Socket socketClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	public SimpleThreadChatClient(){
		super("�� Ŭ���̾�Ʈ");
		tfNick = new TextField(10);
		tfServerIp = new TextField("211.63.89.");
		tfTalk = new TextField();
		btnConnect = new Button("����");
		
		taTalkDisplay = new TextArea();
		Panel panelNorth = new Panel();
		panelNorth.add(new Label("�����ּ�",Label.CENTER));
		panelNorth.add(tfServerIp);
		panelNorth.add(new Label("��ȭ��",Label.CENTER));
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
						client.close(); // ������ ������ ����Ȱ� �� ��������.
					}
				}catch(IOException ie){
					ie.printStackTrace();
				}
				dispose();
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
		taTalkDisplay.append(msg+"\n");
		//���濡�� ������
		writeStream.writeUTF(msg);
		writeStream.flush();//����
		tfTalk.setText("");
		tfTalk.setText("");
	}//sendMsg
	
	
	/**
	 * ���� �Էµ��� �𸣴� �޼����� �о���̴� ��
	 * @throws IOException 
	 */
//	private void readMsg() throws IOException{
	@Override
	public void run(){
		try {
			if(readStream!=null){
				while(true){ // �����ڰ� ������ ������ ���̻� ������ ��� ���ܰ� �߻��Ѵ�.
						taTalkDisplay.append(readStream.readUTF()+"\n");
				}
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "���� ���!");
		}//end while
	}//readMsg
	
	/**
	 * ���������� ����Ͽ� ������ ��Ʈ�� ���� �������Ͽ� �����ϴ� ��
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	private void connectToServer() throws UnknownHostException, IOException{
		String ip = tfServerIp.getText().trim();
		socketClient = new Socket(ip,9501);
		taTalkDisplay.setText(ip+"������ ����Ǿ����ϴ�\n");
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
			} catch (UnknownHostException e) { //������ �𸣴� ����
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
		//3-1. ��ü����
		new SimpleThreadChatClient();
//		//3-2. Thread�� has a ���� ����
//		Thread thread = new Thread(stcc);
//		//3-3. startȣ��
//		thread.start();
	}

}
