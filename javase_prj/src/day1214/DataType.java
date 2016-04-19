package day1214;
/**
	작성일 : 12-14-2015
	작성자 : 이소희
	내용 : 기본형 데이터형의 사용과 형명시의 사용
**/
class DataType{
	public static void main(String[] args) {
		//정수형 : byte, short, int, long
		byte a=10;
		short b=20;
		int c=30;
		long d=40; // 40이 int 범위 안이기 때문에 형명시 생략
		long e=21474836498L; // 에러발생, 형명시 필수, 리터럴의 크기를 8바이트로 변경
		System.out.println("byte : "+a+" short : "+b+" int : "+c+" long : "+d+" long : "+e);
		////////////////////문자형////////////////////
		// unicode 값 (2byte) 이 할당된다.
		char f = 'A';
		char g = '가';
		char h = '1';
		char i = 97; // code값 직접 할당 가능, 문자로 나옴
		System.out.println("f : "+f+" g : "+g+" h : "+h+" i : "+i);
		////////////////////실수형////////////////////
		float j = 3.14f; // 형명시 해줘야한다.
		double k = 3.14;
		double l = 3.14D;
		System.out.println("j : "+j+" k : "+k+" l : "+l);
		////////////////////불린형////////////////////
		boolean m = true;
		boolean n = false;
		System.out.println("m : "+m+" n : "+n);
	}//main
}//class
