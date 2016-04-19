package day0105;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ��¥ ������ �� �� �ִ� Date�� ������ ������ �� �ִ� SimpleDateFormat�� ���
 * @author user
 */
public class UseDate {
	
	public UseDate(){
		Date d = new Date();
		System.out.println(d); // toString�� �������̵���.
		System.out.println(d.getYear()+1900); // ����õ method�� ������� �ʴ°��� ����.
		System.out.println(System.currentTimeMillis()); // os�� ������ ���� �� �ִ� ������ Ŭ������ System!
		Date d2 = new Date(System.currentTimeMillis()+(1000*60));
		System.out.println(d); 
		System.out.println(d2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh(HH,kk):mm:ss EEEE",Locale.CHINA);
		System.out.println(sdf.format(d)); // �ּҰ� ��µ�.
		
	}
	
	public static void main(String[] args) {
		
		new UseDate();
		
		
	}//main

}//class
