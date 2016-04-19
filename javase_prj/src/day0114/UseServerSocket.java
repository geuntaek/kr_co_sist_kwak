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
 * PORT�� ���� ���� Socket�� ������ �޾Ƴ��� ���� �ϴ� ServerSocket
 * @author user
 */
public class UseServerSocket {

	public  UseServerSocket(){
		//1. �������ϻ���(TCP/IP)
		try {
			ServerSocket server = new ServerSocket(30000);
			System.out.println("����������");
			//3. ������ ������ ������ ���� �㰡�Ͽ� �޴´�.
			while(true){
				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ ���� "+client);
				
				String msg = "�ƿ��̿���";
				//4. �����ڰ� �������� ������ �޼���
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());
				//5. �޼����� ������ ���� ��Ʈ�� ���Ͽ� ����
				dos.writeUTF(msg);
				//6. ��Ʈ���� �ִ� �޼����� �������� �������� ����
				dos.flush();
				//12. �����ڰ� �������¸޼��� �б�
				DataInputStream dis = new DataInputStream(client.getInputStream());
				//13. �о�� ������ ����Ѵ�.
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