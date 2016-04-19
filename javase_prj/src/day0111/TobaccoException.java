package day0111;

/**
 * 사용자 정의 예외처리클래스<br>
 * 1. 예외클래스를 부모로 한다. <br>
 * 2. 부모클래스의 생성자를 호출하여 예외가 발생되었을 때 출력할 메세지를 넣어준다.
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class TobaccoException extends Exception {
	public TobaccoException() { // 기본생성자
		// this(); // 재귀호출, stackOverflow발생.
		this("담배는 건강에 해롭습니다.");

	}// TobaccoException

	public TobaccoException(String msg) {
		super(msg); // 부모클래스의 인자있는 생성자 호출

	}// TobaccoException
}// class
