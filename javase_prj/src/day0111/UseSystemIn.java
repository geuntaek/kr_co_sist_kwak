package day0111;

import java.io.IOException;

/**
 * 키보드의 입력을 받는 System.in(InputStream)의 사용
 * @author user
 */
public class UseSystemIn {

	public UseSystemIn(){
		System.out.println("아무키나 누르고 엔터");
		try {
//			// 입력 : 엔터가 쳐지기 전까지 아무런 동작을 하지 않는다. latency
//			int read = System.in.read();
//			System.out.println("입력값 : 코드값 "+read+", 문자 : "+(char)read);
			
			// 입력되는 모든 값 받기
			int temp = 0;
			while((temp = System.in.read())!=13){
//				System.out.println("입력값 : 코드값 "+temp+", 문자 : "+(char)temp);
				System.out.print((char)temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	} // UseSystemIn
	
	public static void main(String[] args) {
		new UseSystemIn();
	}//main
}//class
