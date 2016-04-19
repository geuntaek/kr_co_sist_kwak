package day1218;

/**
 *	instance method와 static method를 작성하고 호출하는 방법
 * @author user
 */
public class TestMethod {
	public void instanceMethod(){ // static이 안붙어있기때문에 직접호출 불가능
		System.out.println("instance method 호출");
	}//instanceMethod
	public static void staticMethod(){
		System.out.println("static method 호출");
	}//staticMethod
	
	public static void main(String[] args) {
		// instance method 호출
		//intstanceMethod(); // 직접호출 불가능
									  // 1. 객체화 : 클래스명 객체명 = new 클래스명();
		TestMethod tm = new TestMethod();
		tm.instanceMethod();
		
		// static method 호출
		//tm.staticMethod(); // 객체를 통해 호출하는 것이 가능하긴하지만 그래도 직접호출하는 것이 좋다.
									  // static method는 공용이기 때문에 특정 객체에 속해있는 method처럼 호출하면 경고가 뜬다
									  // 클래스명.method명();
		TestMethod.staticMethod(); // 직접호출 가능
		
	}//main
}//class
