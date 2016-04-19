package day0122;

import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class TServer  implements Runnable{
	DataInputStream dis;
	DataOutputStream dos;
	public TServer() throws IOException{
		
		ServerSocket ss=new ServerSocket(30000);
		Socket client=ss.accept();
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
//					"접속자 메세지 : "+dis.readUTF());
			System.out.println("접속자 메세지 : "+dis.readUTF());
		}
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		
		TServer t=new TServer();
		Thread th=new Thread(t);
		th.start();
		while(true){
			String s=JOptionPane.showInputDialog("서버 - 대화입력");
			if(s.equals("y")){
				System.exit(0);
			}
			System.out.println("소히  "+s);
			t.dos.writeUTF(s);
		}
		
	}



}
