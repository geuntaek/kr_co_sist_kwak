package day0114;

//import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 생성하면입력된 ip address와 PORT를 사용하여 해당서버에 연결을 하는 Socket
 * @author user
 */
public class UseSocket {
	
	public UseSocket(){
		try {
			//2. 서버에 접속할 소켓생성:130,150,161
			
			String ip = JOptionPane.showInputDialog("접속ip입력 130~161");
			Socket client = new Socket("211.63.89."+ip,30000);
			System.out.println("서버에 접속하였습니다."+client);
			
			//7. 서버에서 소켓에 쓴 데이터 읽기
			DataInputStream dis = new DataInputStream(client.getInputStream());
			//8. 스트림을 사용하여 소켓에 데이터를 읽는다.
			JOptionPane.showMessageDialog(null, "서버의 메세지\n"+dis.readUTF());
			
			
			String sendMsg = "하이 ^^b";
			//9. 서버에게 메세지 보내기
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			//10. 메세지 스트림에 쓰기
			dos.writeUTF(sendMsg);
			//11. 메세지 분출
			dos.flush();
			dos.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		new UseSocket();
	}// main

}// class



//			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//			String revMsg = "";
//			revMsg = br.readLine();
//			System.out.println("서버에서 보내온 메세지  "+revMsg);

//			String sendMsg = "하이 ^^b";
//			PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
//			out.print(sendMsg);
//			out.flush(); //10. 스트림에 있는 메세지를 목적지인 소켓으로 분출
//			
//			br.close();
//			out.close();