package day1217;

/**
 *
 * @author user
 */
public class TestFor2 {
	public static void main(String[] args) {
		//무한loop
		for (; ;) {
			System.out.println("안녕");	
			break;
		}//end for
		// 무한루프 for문 밑에 쓰면 인식이 안된다. 하지만 break;를 쓰면 무한루프의 의미가 없어지면서 밑줄에 코드를 쓸 수 있다. 
		
		//수를세는 무한loop
//		for (int i = 0;; i++) { //i라는 변수가 break;를 만나 증가되지 않기때문에 죽은코드라서 경고표시가 뜨는것
//			System.out.println("무한"+i);
//			break;
//		}//end for
		//초기값을 여러개 선언
		for (int i = 0,j=10; i < 5; i++,j--) {
			System.out.println(i+" "+j);
		}//end for
	}//main
}//class
