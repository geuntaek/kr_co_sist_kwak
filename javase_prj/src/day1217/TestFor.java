package day1217;

/**
 * 	시작과 끝을 알 때 사용하는 반복문 for문의 사용<br>
 * 	for (초기값; 조건식; 증감소식) {<br>
 *		반복수행할 문장<br>	
 * }
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		for(int i=0; i<10;i++){
			System.out.println(i+"번 안녕하세요");
		}// end for
		
		// 1~100까지 한줄록 출력하는 반복문
		for(int i=1;i<101;i++){
			System.out.print(i+" ");
		}// end for
		System.out.println("\n");
		
		//1~100까지 짝수 출력
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		/* for (int i = 1; i < 51; i++) {
			System.out.print(i*2+" ");
		}*/
		System.out.println("\n");
		// 1~100까지 홀수만 출력
		// 증감식은 변수의 값을 변경하고 유지할 수 있는 연산자를 사용할 수 있다.
		// ++,--,산술대입,쉬프트대입,일반 논리대입의 연산자를 사용할 수 있다.
		for (int i = 1; i< 101; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		// 2단 출력
		for (int i = 1; i < 10; i++) {
			System.out.print("2 * "+i +"= "+i*2+" ");
		}
		System.out.println("\n");
		// A~Z까지 출력
		for (char c = 65;  c<91;c ++) {
			System.out.print(c+"("+(int)c+")"+" ");
		}
		/*for (int i = 65; i < 65+26; i++) {
			char c = (char)i;
			System.out.print(c+" ");
		}*/
		System.out.println("\n");
		//1~100까지의 합 (누적합)
		int sum = 0; // 초기화를 해줘야 에러가 나지않는다. 초기화를 안하면 어떤 값이 들어있는지 모르기때문에 for문안에서 더하기 연산이 되지않는다.
		for (int i = 1; i < 101; i++) {
			sum += i; // sum = sum+i
		}
		System.out.println("1~100까지의 합 = "+sum);
	}// main
}// class


















