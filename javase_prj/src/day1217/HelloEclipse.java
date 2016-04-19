package day1217;

import day1218.InstanceVariable; // 다른 패키지를 import를 해야 사용이 가능하다.

public class HelloEclipse extends InstanceVariable{
	public static final int TEST = 1;
	
	public static void main(String[] args) {
		int i = 0; // 지역변수
		System.out.println(i);
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		switch (args[0]) { // switch가 문자를 받아들일 수 있음
		case "A":
			System.out.println("에이!");
			break;
		default:
			System.out.println("다름");
			break;
		}
		
		
		// 외부 패키지의 클래스내 인스턴스 변수의 사용
		// 12-18-2015에 추가
		InstanceVariable iv = new InstanceVariable();
		iv.i = 2015; // public
		
		HelloEclipse he = new HelloEclipse(); // protected, 상속을 받아야 사용할 수 있다. (자식클래스)
		he.i = 9; // public
		he.j = 15; // protected
		
		//iv.k = 55; // private
		//iv.l = 77; // default
		
	}// main
}// class
