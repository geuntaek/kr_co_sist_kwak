package day1221;

/**
 *	variable arguments가 도입된 출력 method인
 *	System.out.printf()와 System.out.format()의 사용, JDK1.5이하는 사용불가
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
		System.out.printf("정수 : %d\n", 2015);
		System.out.printf("실수 : %f\n", 2015.12);
		System.out.printf("실수 : %.2f\n", 2015.12);
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("문자열 : %s\n", "오늘은 월요일");
		
		//출력 자릿수 설정, 양수는 오른쪽 정렬 음수는 왼쪽 정렬
		System.out.printf("[%4d][%-4d]\n", 12,12); 
		System.out.printf("[%.2f][%7.2f][%-7.2f]\n", 3.12345,1.111,1.111111);
		
		int year = 2015, month = 12, day =21;
		char initial = 'A';
		System.out.format("%d년 %d월 %d일 이니셜 %c\n",year,month,day,initial);
		
	}//main
}//class
