package day0114;

//import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//import javax.swing.JOptionPane;

/**
 * PORT를 열고 접속 Socket이 들어오면 받아내는 일을 하는 ServerSocket
 * @author user
 */
public class UseServerSocket {

	public  UseServerSocket(){
		//1. 서버소켓생성(TCP/IP)
		try {
			ServerSocket server = new ServerSocket(30000);
			System.out.println("서버가동중");
			//3. 접속자 소켓이 들어오는 것을 허가하여 받는다.
			while(true){
				Socket client = server.accept();
				System.out.println("클라이언트 접속 "+client);
				
				String msg = "아에이오우";
				//4. 접속자가 들어왔을때 보내줄 메세지
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());
				//5. 메세지를 보내기 위한 스트림 소켓에 연결
				dos.writeUTF(msg);
				//6. 스트림에 있는 메세지를 목적지인 소켓으로 분출
				dos.flush();
				//12. 접속자가 보내오는메세지 읽기
				DataInputStream dis = new DataInputStream(client.getInputStream());
				//13. 읽어온 내용을 출력한다.
				System.out.println(dis.readUTF());
				dis.close();
				dos.close();
			}		
//			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new UseServerSocket();
	}//main

}//class

//	JOptionPane.showMessageDialog(null, br.readLine());
//			PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
//			out.print(msg);
//			out.flush(); 
//			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//			br.close();
//			out.close();