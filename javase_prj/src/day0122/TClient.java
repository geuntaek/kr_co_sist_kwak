package day0122;

import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class TClient implements Runnable{
	DataInputStream dis;
	DataOutputStream dos;
	public TClient() throws IOException{
		
		//ServerSocket ss=new ServerSocket(30000);
		Socket client=new Socket("211.63.89.144", 30000);
		dis=new DataInputStream(
				client.getInputStream());
		
		dos=new DataOutputStream(
				client.getOutputStream());
		
	}
	
	@Override
	public void run() {
		try {
		while(true){
//				JOptionPane.showMessageDialog(null, 
//					"서버의 메세지 : "+dis.readUTF());
			System.out.println("서버의 메세지 : "+dis.readUTF());
		}
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		
		TClient t=new TClient();
		Thread th=new Thread(t);
		th.start();
		while(true){
			String s=JOptionPane.showInputDialog("클라이언트 - 대화입력");
			if(s.equals("y")){
				System.exit(0);
			}
			System.out.println("소히 "+s);
			t.dos.writeUTF(s);
		}
		
	}


}
