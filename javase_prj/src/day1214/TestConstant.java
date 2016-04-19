package day1214;
/*
	내용 : 변수를 상수처럼 사용하기
			가독성을 높이면서 변경되지 말아야할 값 사용해야할 때 (기준값)
*/
class TestConstant {
	public static final int MAX_SCORE = 100; // 최고점수
	public static final int MIN_SCORE = 0; // 최저점수
	
	public static void main(String[] args) {
		// 상수명, 클래스명.상수명 두가지로 사용할 수 있다.
		System.out.println("최고점수 : "+MAX_SCORE+", 최저점수 : "+TestConstant.MIN_SCORE);

		//값 할당 시 에러 발생
		//MAX_SCORE=80;
		int my_score = 90;
		System.out.println("최고점수 : "+TestConstant.MAX_SCORE+", 획득점수 : "+my_score+", 점수 차이 : "+(MAX_SCORE-my_score));
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		//진수 확인
		int i = 10;
		int j = 012;
		int k = 0xa;
		System.out.println("i = "+i+" j ="+j+" k= "+k+" i+j+k = "+(i+j+k));
	}//main
}// class
