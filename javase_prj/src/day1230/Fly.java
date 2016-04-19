package day1230;

/**
 * 01-04-2016 작성
 * 나는 것들이 반드시 구현해야할 일의 목록을 정의<br>
 * 높이와 속도를 가진다.
 * @author user
 */
public interface Fly{ // 추상메소드밖에 가지지 못한다. abstract를 붙이든 안붙이든 어쨌든 abstract method.
	/**
	 * 높낮이의 구현
	 * @return
	 */
	public abstract String height(); 
	/**
	 * 속도의 구현
	 * @return
	 */
	public String speed();
}
