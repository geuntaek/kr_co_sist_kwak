package day0106;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 각각의 날짜정보를 얻을 때 사용하는 Calendar
 * @author user
 */
public class UseCalendar {
	
	public UseCalendar(){
		// 추상클래스이므로 객체화가 안되는 Calendar
		// 객체가 생성되면 시스템으로부터 날짜정보를 얻어와서 객체에 저장한다.
		
		// is a 관계의 객체화를 해줘야한다.
		Calendar cal = new GregorianCalendar(); 
		// instance를 얻어내는 method를 사용하는 경우
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(Calendar.MONTH);
		
		
		///// 얻어온 현재 날짜 정보의 변경 /////
		cal.set(Calendar.YEAR, 2017); // 2016->2017
		cal.set(Calendar.MONTH, 7-1); // 1->7 (7월을 설정하려면 6을 넣어야한다.)
		cal.set(Calendar.DAY_OF_MONTH, 16); // 6->16 
		
		
		
//		int year = cal.get(1); // 가독성이 떨어진다.
		int year = cal.get(Calendar.YEAR); //cal이든 cal1도 된다.
		int month = cal.get(Calendar.MONTH)+1; 
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR); // 올해의 몇번째 날인지?
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK); // 일주일의 몇번째 날? 
		
//		String week = "일,월,화,수,목,금,토".split(",")[day_of_week-1];
		String[] weekArr = {"일","월","화","수","목","금","토"};
		String week = weekArr[day_of_week-1];
		
		/*
		String week = "";
		switch (day_of_week) {
		case Calendar.SUNDAY: // 가독성을 위해 필드 사용
			week = "일";break;
		case 2:
			week = "월";break;
		case 3:
			week = "화";break;
		case 4:
			week = "수";break;
		case 5:
			week = "목";break;
		case 6:
			week = "금";break;
		case 7:
			week = "토";break;
		}
		*/
		
		int am_pm = cal1.get(Calendar.AM_PM);
		String am=am_pm==Calendar.AM_PM?"오전":"오후"; // 삼항연산자
		
		int hour = cal1.get(Calendar.HOUR);	//12시간
		int hour_of_day = cal1.get(Calendar.HOUR_OF_DAY); //24시간
		
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+" "+day_of_year+" "+day_of_week+week+"요일"+am_pm+am);
		System.out.println(hour+"("+ hour_of_day+")시" +min+"분"+sec+"초");
		
		int max = cal1.getActualMaximum(Calendar.DATE); // 마지막 날짜
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
