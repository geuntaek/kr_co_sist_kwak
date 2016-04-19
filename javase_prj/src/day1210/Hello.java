package day1210;

import java.util.Calendar;

class Hello{
	static int i;
	int j;
	
	
	//main method : 단독으로 실행하는 프로그램(application)을 작성할 때 씀
	public static void main(String[] args){
//		System.out.println("안녕자바");
		System.out.println(Math.round(2015.05F)+1);
		Calendar cal = Calendar.getInstance();
		String str = "chi189@naver.com";
		System.out.println(str);
		System.out.println(cal);
		System.out.println(cal.toString());
	}//main
}//class 









// 2. 저장 : class명.java (Hello.java)-source file

// 3. compile : javac.exe (complier)
//		실행방법
//		javac. source file 명
// (path)	javac Hello.java
//		성공 : byte code 가 생성됨 - 기계어
//		       class file (Hello.java)

// 4. run : java.exe
// 문법     java byte code명
//	    java Hello