package day0111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시스템에서 줄단위 입력받기<br>
 * 8 bit stream과  16 bit stream의 연결 사용 (기능확장)
 * @author user
 */
public class UseSystemIn1 {

	public UseSystemIn1() throws IOException{ // 이 생성자를 호출한 곳에서 try~catch를 해야한다.
		System.out.println("아무키나 누르고 엔터");
//		// 8 bit stream과  16 bit stream의 연결하기 위한 중간 스트림 사용
//		InputStreamReader isr = new InputStreamReader(System.in);
//		// 줄단위로 읽어들이는 기능을 가진 Stream 연결
//		BufferedReader br = new BufferedReader(isr);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		System.out.println("입력값 : "+str); // 입력값 출력
		
		// Stream을 다 사용하면 끊는다.
		br.close();
	} // UseSystemIn1
	
	public static void main(String[] args) {
		
		try {
			new UseSystemIn1(); // 인스턴스화, 생성자 호출함.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // main

}// class
