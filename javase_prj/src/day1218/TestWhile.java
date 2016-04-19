package day1218;

/**
 *	시작과 끝을 모를 때 사용하는 반복문 while, do~while의 문법
 *	while(조건식){
 *		반복수행문장;
 *	}
 *	최소 0번 수행 최대 조건까지 수행
 *
 *	do{ 
 *		반복수행문장;
 *	}while(조건식); 
 *	최소 1번 수행 최대 조건까지 수행
 * @author user
 */
public class TestWhile {
	public static void main(String[] args) {
		System.out.println("------------------while-----------------");
		int i = 0;
		while(i<10){
			System.out.print(i+" "); // 반복할 수행문
			i++; // 증감식이 없으면 계속 0이 출력된다. -> 무한루프
			//break; // 브레이크를 만나면 while문을 빠져나간다.
		}//end while
		
		System.out.println("\n---------------do while-----------------");
		int j = 0;
		do{
			System.out.print(j+" ");
			j++;
		}while(j<10);
		// while로 구구단 5단
		System.out.println("\n\n5단");
		j=1;
		while(j<10){
			System.out.print(j+" * 5 = "+j*5+"     ");
			j++;
		}
	}//main
}//class


















