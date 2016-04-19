package day0108;

/**
 * method 내부에서 발생한 예외를 호출한 곳에서 처리하도록 하는 throws
 * 예외발생코드와 예외처리코드를 구분할 수 있다.
 * 
 * @author user
 */
public class UseThrows implements Cloneable{
	
	public UseThrows() throws ClassNotFoundException{ // 생성자에서 throws되면 instance한 곳에서 처리해라, 부모클래스의 생성자에서 예외가 날라오면 자식생성자에서 또 throws를 헤야한다.
		Class.forName("day0108.UseThrows"); // 내 자신을 로딩
//		Class.forName("day0108.UseThrows1"); // 없는걸 로딩
		System.out.println("로딩성공");
	}//UseThrows
	
	public void test() throws CloneNotSupportedException{ // method도 예외를 날린다.
		UseThrows ut = (UseThrows)clone();
		System.out.println("복제 : "+ut);
	}
	
	public static void main(String[] args) { // main에는 throws를 쓰지마라. 자바가상머신이 잡아버린다.
		try {
			UseThrows ut = new UseThrows();
			ut.test();
		} catch (ClassNotFoundException e) { // 호출한 곳
			System.err.println("경로를 확인하세요.");
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			System.err.println("implements Cloneable했는지 확인하세요.");
			e.printStackTrace();
		} 
		
	}//main

}//class
