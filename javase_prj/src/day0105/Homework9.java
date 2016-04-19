package day0105;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Homework9 {
	private static final String format = "yyyy-MM-dd a hh:mm:ss EEEE";

	public Homework9() { // 생성자
		System.out.println("숙제1");

		String[] data = this.cut();
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("\n숙제2");
		String worldTime = this.worldDate(2);
		System.out.println(worldTime);
	}

	public String[] cut() { // 문자열 자르는 method

		// 변수선언
		String str = "최수웅,홍준기.오윤상~신민우^민명선 도윤환"; // data
		int num = 0; // 인덱스 number
		int i = 0; // while문에서 사용할 변수 i
		String temp = null; // nextToken()으로 반환된 문자열을 저장할 변

		StringTokenizer st = new StringTokenizer(str, ",.~ ^");
		num = st.countTokens(); // TokenCount
		String[] dataArr = new String[st.countTokens()];

		while (st.hasMoreTokens() && i < num) {
			temp = st.nextToken();
			dataArr[i] = temp;
			if (temp.equals("신민우")) {
				dataArr[i] = "반장 " + temp + " ^0^b";
			} // end if
			i++;
		} // end while
		
		return dataArr;
	}// cut


	public String worldDate(int world) {
		
		Date date = new Date();
		Locale[] loc={Locale.KOREA,Locale.US,Locale.CHINA}; // 모든 데이터형은 배열로 선언이 가능하다!!!!!
		SimpleDateFormat sdf = new SimpleDateFormat(format, loc[world]);
		
		return sdf.format(date);

	}// worldDate

	public static void main(String[] args) {
		new Homework9(); // 객체화

	}// main
}// class




//	private static final String zero = "0";
//	private static final String one = "1";
//	private static final String two = "2";


//public String worldDate(String world) {
//		String date = null;
//		switch (world) {
//		case zero:
//			sdf = new SimpleDateFormat(format, Locale.KOREA);
//			date = sdf.format(d); break;
//		case one:
//			sdf = new SimpleDateFormat(format, Locale.US);
//			date = sdf.format(d); break;
//		case two:
//			sdf = new SimpleDateFormat(format, Locale.CHINA);
//			date = sdf.format(d); break;
//		default:
//			date = "입력한 값이 0,1,2 가 아니므로 다시 입력하세요.";
//			break;
//		}// end switch

/*
 * if(world.equals("0")){ sdf = new
 * SimpleDateFormat(format,Locale.KOREA); }else if(world.equals("1")){
 * sdf = new SimpleDateFormat(format,Locale.US); }else
 * if(world.equals("2")){ sdf = new
 * SimpleDateFormat(format,Locale.CHINA); }else{ date =
 * "0,1,2 중 하나를 입력하세요."; }
 * 
 * date = sdf.format(d);
 */



//		System.out.println("숙제1");

//		String[] data = hw.cut();
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}

//		System.out.println("\n숙제2");

//		String worldTime = hw.worldDate(args[0]);
//		String worldTime = hw.worldDate(2);
//		System.out.println(worldTime);