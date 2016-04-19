package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JTextArea;

/**
 * 입력된 소켓에 메세지를 보내고 읽을 수 있도록 스트림을 연결하는 일.
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
		//입력된 소켓에 스트림 연결
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());
		
		//접속자가 보내오는 대화명 받기
		nick = readStream.readUTF();
		
		jtaDisplay.append(cnt+"번째 유저 ["+nick+"] 접속["+someClient.getInetAddress().getHostAddress()+
				"/"+someClient.getInetAddress().getHostName()+"]\n");
		
		msgBroadCast(cnt+"번째 유저 ["+nick+"] 접속!");
		
	}//ChatHelper
	
	@Override
	public void run(){
		 //메세지를 무한 loop로 읽어들인다.
        String msg="";
        try {
	        while(true){
	              msg=readStream.readUTF();
	              //읽어들인 메세지를 모든 접속자에게 전송한다.
	              msgBroadCast(msg);
	        }//end while
        } catch (IOException ie) {
        	jtaDisplay.append(cnt+"번째 유저 ["+nick+"] 접속["+someClient.getInetAddress().getHostAddress()+
    				"/"+someClient.getInetAddress().getHostName()+"]\n");
        	
        	jtaDisplay.append("------"+cnt+" 번째 접속자 ["+nick+"] 퇴실["+someClient.getInetAddress()+"]\n");
        	try {
        		msgBroadCast(cnt+"번째 유저 퇴실!"); //모든 접속자에게 뿌려주기
        		//스트림 끊기
        		if(readStream != null){
        			readStream.close();
        		}
        		if(writeStream != null){
        			writeStream.close();
        		}
        		//소켓 끊기
        		if(someClient != null){
        			someClient.close();
        		}
        		
        		//리스트에서 삭제
        		ChatServer.connectClientList().remove(this); // 인덱스가 아닌 this로 지워야한다. 나를 지워라.
        		
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        }//end catch

	}//run
	
	private synchronized void msgBroadCast (String msg) throws IOException{
		int cnt = ChatServer.connectClientList().size();
//		System.out.println("접속자 수 : "+cnt);
		ChatHelper tempClient = null;
		for(int i = 0; i< cnt; i++){
			tempClient = ChatServer.connectClientList().get(i);
			tempClient.writeStream.writeUTF(msg);
			tempClient.writeStream.flush();
		}
		
	}//msgBroadCast
	
}
