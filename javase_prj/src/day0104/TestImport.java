package day0104;

import java.util.Calendar;
import java.util.Date;

//같은 이름의 클래스(인터페이스)는 둘 중 하나만 import로 처리

import java.util.StringTokenizer;

/**
 * 현재패키지나 java.lang패키지가 아닌 다른 패키지에 존재하는 
 * class(interface)를 손쉽게 참조하여 사용할 때 필요한 import<br>
 * 외부 단체나 개발자가 만들어서 배포되는 클래스는 대부분 jar로 
 * 압축되어 있을 것이고 해당 jar는 class path를 설정하여 사용한다.<br>
 * 패키지는 다르나 클래스(인터페이스)의 이름이 같다면 많이 사용되는 
 * 클래스를 import로 처리하고 적게 사용되는 클래스는 패키지명을 모두 기술하여 사용한다.
 * @author user
 */

//import java.util.Date;
//import java.util.*;

public class TestImport {

	public static void main(String[] args) {
		Date d = new Date();
		Date d1 = new Date();
		
		
//		// import를 받지않아도 이 클래스에서 사용할 수 있다.
//		java.util.StringTokenizer stk = new java.util.StringTokenizer(""); 
		
		StringTokenizer stk = new StringTokenizer("");
		Calendar cal = Calendar.getInstance();
		
	}//main

}//class
