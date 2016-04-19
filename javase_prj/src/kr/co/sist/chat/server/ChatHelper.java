package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JTextArea;

/**
 * �Էµ� ���Ͽ� �޼����� ������ ���� �� �ֵ��� ��Ʈ���� �����ϴ� ��.
 * @author user
 */
public class ChatHelper extends Thread {
	
	private Socket someClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	private int cnt;
	private JTextArea jtaDisplay;
	private String nick;
	
	public ChatHelper(Socket client, int count, JTextArea display) throws IOException{
		someClient = client;
		cnt = count;
		jtaDisplay = display;
		//�Էµ� ���Ͽ� ��Ʈ�� ����
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());
		
		//�����ڰ� �������� ��ȭ�� �ޱ�
		nick = readStream.readUTF();
		
		jtaDisplay.append(cnt+"��° ���� ["+nick+"] ����["+someClient.getInetAddress().getHostAddress()+
				"/"+someClient.getInetAddress().getHostName()+"]\n");
		
		msgBroadCast(cnt+"��° ���� ["+nick+"] ����!");
		
	}//ChatHelper
	
	@Override
	public void run(){
		 //�޼����� ���� loop�� �о���δ�.
        String msg="";
        try {
	        while(true){
	              msg=readStream.readUTF();
	              //�о���� �޼����� ��� �����ڿ��� �����Ѵ�.
	              msgBroadCast(msg);
	        }//end while
        } catch (IOException ie) {
        	jtaDisplay.append(cnt+"��° ���� ["+nick+"] ����["+someClient.getInetAddress().getHostAddress()+
    				"/"+someClient.getInetAddress().getHostName()+"]\n");
        	
        	jtaDisplay.append("------"+cnt+" ��° ������ ["+nick+"] ���["+someClient.getInetAddress()+"]\n");
        	try {
        		msgBroadCast(cnt+"��° ���� ���!"); //��� �����ڿ��� �ѷ��ֱ�
        		//��Ʈ�� ����
        		if(readStream != null){
        			readStream.close();
        		}
        		if(writeStream != null){
        			writeStream.close();
        		}
        		//���� ����
        		if(someClient != null){
        			someClient.close();
        		}
        		
        		//����Ʈ���� ����
        		ChatServer.connectClientList().remove(this); // �ε����� �ƴ� this�� �������Ѵ�. ���� ������.
        		
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        }//end catch

	}//run
	
	private synchronized void msgBroadCast (String msg) throws IOException{
		int cnt = ChatServer.connectClientList().size();
//		System.out.println("������ �� : "+cnt);
		ChatHelper tempClient = null;
		for(int i = 0; i< cnt; i++){
			tempClient = ChatServer.connectClientList().get(i);
			tempClient.writeStream.writeUTF(msg);
			tempClient.writeStream.flush();
		}
		
	}//msgBroadCast
	
}
