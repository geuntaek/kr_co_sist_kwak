package day1215;
/*
	삼항(조건)연산자
	조건식 ? 항1 : 항2
	전항의 조건식이 TURE를 반환하면 항1을 반환, FALSE를 반환하면 항2를 반환.
*/
class Operator5 {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(num+"은 "+((num>=0) ?"양수입니다" : "음수입니다"));
		// 변수의 값이 0이면 5를 출력하고 그렇지 않으면 변수값에 10일 곱한 값을 출력
		System.out.println(num+" -> "+(num==0 ? "5" : num*10));
	}// main
}// class
