package day0122;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * nslookup을 사용할 수 있는 클래스
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
				System.out.println(temp.getCanonicalHostName()); // 여러개의 서버에 하나의 네임을 빼낼때?
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new UseInetAddress();
	}//main

}//class
