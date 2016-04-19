package day1230;

/**
 * 자식클래스가 해야할 일의 목록만 정의
 * @author user
 */
public interface TestInterface {
//	int i;// 인터페이스는 인스턴스 변수를 가질 수 없다. 에러. static형태의 변수는 가능.
	public static final int i=0; // static변수 가능. 반드시 초기화값을 써줘야한다. 
								 //하지만 인터페이스는 상수와 추상method만을 가짐
//	public TestInterface(){  인터페이스는 생성자를 가질 수 없다.
//	}
	
//	public void method(){ // 일반 method를 가질 수 없다.
//	}
	
	// abstract method 정의
	public abstract String msg(); // 추상method를 가진다.
	public int asciiCode(char c); // 어차피 interface는 일반method는 정의가 되지않기 때문에 abstract를 생략하고 쓸 수 있다.
	
	

}//interface
