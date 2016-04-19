package day0122;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * nslookup�� ����� �� �ִ� Ŭ����
 * @author user
 */
public class UseInetAddress {

	public UseInetAddress(){
		try {
//			InetAddress ia = InetAddress.getByName("sist.co.kr");
//			System.out.println(ia);
			InetAddress[] ia = InetAddress.getAllByName("daum.net");
			InetAddress temp = null;
			for (int i = 0; i < ia.length; i++) {
				temp = ia[i];
				System.out.println(temp.getHostName());
				System.out.println(temp.getHostAddress());
				System.out.println(temp.getCanonicalHostName()); // �������� ������ �ϳ��� ������ ������?
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new UseInetAddress();
	}//main

}//class
