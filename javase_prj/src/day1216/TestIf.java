package day1216;
/******
	조건(상황)에 맞을 때에만 코드를 실행하는 단일 if의 사용
	if (조건식){
		조건에 맞을 때 수행할 코드;
	}
******/
class TestIf {
	public static void main(String[] args) {
		// 변수의 값이 음수일 때만 양수로 변경하는 일
		int num = Integer.parseInt(args[0]); // 동적
		if(num< 0)
			num = -num;
		System.out.println(num);

		// 문자열을 비교할 때에는 같은지에 대해서는 비교할 수 있는데 ==, equals를 사용
		// 문자열.equals(비교할 문자열)
		//System.out.println(args[1].equals("자바"));

		// 입력된 문자열이 '자바'인 경우에만 '완벽한 객체 지향언어'를 출력
		System.out.println(args[1]);
		if(args[1].equals("자바")){
			System.out.println("완벽한 객체 지향 언어");
		}
		// args[2]를 사용하여 입력된 값(수의 형태)이 0~100사이일 때만 '유효정수'를 출력
		int temp = Integer.parseInt(args[2]);
		if(temp<=100 && temp>=0){
			System.out.println("유효점수");
		}

	}//main
}//class
