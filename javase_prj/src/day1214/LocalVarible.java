package day1214;
/*******************************************************
	작성일 : 12-14-2015
	작성자 : 이소희
	내용 : 지역 변수의 작성과 사용법
*******************************************************/
class LocalVarible{			
	public static void main(String[] args) {
		// 1. 선언 : 자동초기화가 안된다.
		//			 같은 이름의 변수는 선언 할 수 없다.
		//			 선언법: 데이터형 변수명;
		int i;
		// 2. 값할당 : 변수명 = 값;
		i=12;
		// 3. 값사용 : 출력, 연산에 참여, 재할당
		System.out.println(i);

		// 값할당은 여러번 가능
		i=2015;
		System.out.println(i);

		// 같은 이름의 변수는 선언 할 수 없다. int i;
		// 초기화 되지 않은 변수를 사용하면 에러 int k;	System.out.println(k);

		// 한글로 변수를 작성할 수 있다.
		int 나이 = 20;
		System.out.println(나이);
		//byte b = -128;
		//long j = 2100000001;

		//////////////// Constant class가 작성된 후 코드 추가//////////////////
		//다른 클래스의 상수(기준값) 사용
		System.out.println(TestConstant.MAX_SCORE);
		
	}//main
}//class
