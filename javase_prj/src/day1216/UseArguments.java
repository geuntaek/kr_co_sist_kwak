package day1216;
/*
	main tethod에 외부값넣기
	dos : java UseArguments 값 값 값 ..... 
	입력되는 값은 문자열이므로 연산이 되지 않는다.
*/
class UseArguments {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		// 문자열을 정수로 변환하는 일을 해주는 method를 사용
		// Integer.parseInt(숫자형식의 문자열)
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}
}
