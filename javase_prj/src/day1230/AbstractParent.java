package day1230;

/**
 * 상속관계에서 부모클래스를 작성할 때 사용하는 클래스<br>
 * 구현의 강제성을 가지는 abstract method를 가질 수 있다.<br>
 * 객체화가 되지 않는다.
 * 
 * @author user
 */
public abstract class AbstractParent {
	
	int i;
	public AbstractParent(){ // 추상클래스는 변수와 생성자도 가진다.
		System.out.println("부모생성자");
	}//AbstractParent
	
	public void method(){
		System.out.println("부모의 일반 method");
	}// method
	
	///////// 추상 method를 가진다는 것이 다른 클래스와 다른 점
//	public String msg();
	public abstract String msg(); // 추상 method는 body를 가질 수 없다. 에러난다.
	public abstract int age(int year); 
	
//	public static void main(String[]args){ // 추상클래스도 main을 가질 수 있다.
//		new AbstractParent(); // 추상클래스는 직접 객체화가 되지 않는다. 
//		
//		
//	}//main
	
}//class
