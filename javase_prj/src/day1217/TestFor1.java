package day1217;

/**
 *	for문 안에 for문이 들어가는 다중 for의 사용
 *	바깥for가 한번 실행될 때 안쪽 for는 몇번 실행되는지?	 
 * @author user
 */
public class TestFor1 {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 5; i++) {
			// 단일 for영역
			System.out.println("시작");
			for (int j = 0; j < 6; j++) {
				System.out.print("i = "+i+" j = "+j+" ");
			}
			System.out.println("끝");
			// 단일 for영역
		}
		*/
		// 구구단
		for (int i = 2; i < 10; i++) { // 단
			System.out.println("["+i+"] 단 시작");
			for (int j = 1; j < 10; j++) { // 수
				System.out.print(i+" * "+j+" = "+i*j+"         ");
			}
			System.out.println();
			System.out.println("["+i+"] 단 끝\n");
		}//end for
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}//end for
		
	}// main
}//class















