package day1218;

/**
 *	반복문의 수행을 건너 뛰는 continue의 사용
 * @author user
 */
public class TestContinue {
	public static void main(String[] args) {
		//1~100까지 짝수만 출력
		for (int i = 1; i < 101; i++) {
			if(i%2==1){
				continue;
			}//end if
			System.out.print(i+" ");
		}//end for
	}//main
}//class







