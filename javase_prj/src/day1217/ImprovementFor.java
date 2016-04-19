package day1217;

/**
 *	JDK 1.5에서부터 제공되는 개선된 for문의 사용
 *	for(방의 값을 저장할 변수 선언 : 배열명|collection계열){
 		변수명
 *	}
 * @author user
 */
public class ImprovementFor {
	public static void main(String[] args) {
		int[] arr={10,20,30,400,5000,6000,7000};
		for (int i : arr) { // 개선된 for문
			System.out.print(i+" ");
		}
		/* 원래 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
	}//main
}//class
