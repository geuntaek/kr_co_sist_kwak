package day1214;
/*
	내용 : 강제 형변환의 사용
		    문법 : (변경할데이터형)대상체
*/
class Casting {
	public static void main(String[] args) {
		
		/*double d = 2015.12; // 8바이트
		int i= 0; // 4바이트
		i = (int)d; // 8바이트의 실수값이 4 바이트의 정수값으로 변경
		System.out.println("원본 : "+d+", 강제형변환된 값 : "+i);;

		float f = (float)3.1415318548543213; // 8바이트의 공간에 4바이트로 변경되서 4바이트의 공간으로 할당.
		System.out.println(f);*/

		/*char c='A';
		System.out.println((int )c);*/

		// boolean은 강제형변환이 안된다.
		/*boolean b = true;
		System.out.println((int)b);*/

		// 기본형<->참조형끼리는 강제형변환이 안된다.
		//String s =(String) i; //
		//String s = "13";
		//i=(int)s;
		byte b1 = 12;
		byte b2 = 14;
		byte result = 0;

		result =(byte)(b1+b2);
		System.out.println(result);

	}//main
}//class
