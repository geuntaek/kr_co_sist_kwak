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
 * �����ϸ��Էµ� ip address�� PORT�� ����Ͽ� �ش缭���� ������ �ϴ� Socket
 * @author user
 */
public class UseSocket {
	
	public UseSocket(){
		try {
			//2. ������ ������ ���ϻ���:130,150,161
			
			String ip = JOptionPane.showInputDialog("����ip�Է� 130~161");
			Socket client = new Socket("211.63.89."+ip,30000);
			System.out.println("������ �����Ͽ����ϴ�."+client);
			
			//7. �������� ���Ͽ� �� ������ �б�
			DataInputStream dis = new DataInputStream(client.getInputStream());
			//8. ��Ʈ���� ����Ͽ� ���Ͽ� �����͸� �д´�.
			JOptionPane.showMessageDialog(null, "������ �޼���\n"+dis.readUTF());
			
			
			String sendMsg = "���� ^^b";
			//9. �������� �޼��� ������
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			//10. �޼��� ��Ʈ���� ����
			dos.writeUTF(sendMsg);
			//11. �޼��� ����
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
//			System.out.println("�������� ������ �޼���  "+revMsg);

//			String sendMsg = "���� ^^b";
//			PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
//			out.print(sendMsg);
//			out.flush(); //10. ��Ʈ���� �ִ� �޼����� �������� �������� ����
//			
//			br.close();
//			out.close();