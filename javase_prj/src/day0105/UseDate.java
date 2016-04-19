package day0105;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 날짜 정보를 얻어낼 수 있는 Date와 형식을 설정할 수 있는 SimpleDateFormat의 사용
 * @author user
 */
public class UseDate {
	
	public UseDate(){
		Date d = new Date();
		System.out.println(d); // toString을 오버라이딩함.
		System.out.println(d.getYear()+1900); // 비추천 method는 사용하지 않는것이 좋다.
		System.out.println(System.currentTimeMillis()); // os의 정보를 빼올 수 있는 유일한 클래스는 System!
		Date d2 = new Date(System.currentTimeMillis()+(1000*60));
		System.out.println(d); 
		System.out.println(d2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh(HH,kk):mm:ss EEEE",Locale.CHINA);
		System.out.println(sdf.format(d)); // 주소가 출력됨.
		
	}
	
	public static void main(String[] args) {
		
		new UseDate();
		
		
	}//main

}//class
