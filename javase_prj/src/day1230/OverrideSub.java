package day1230;

/**
 * 부모클래스가 가지고 있는 자원(변수,method)를 자신의 것처럼 사용할 수 있다.
 * 
 * @author user
 *
 */
public class OverrideSub extends OverrideSuper {

	int j;

	public void cMethod() {
		System.out.println("자식의 method");
	}// cMethod

	// annotation : Compiler에게 annotation아래의 method가 Override 된것인지 체크하도록 만들때
	// 사용하는 @Override
	@Override
	public void pMethod1() {
		System.out.println("자식이 구현한 method");
	}// pMethod1
	
	@Override
	public String toString(){
		return "Happy New Year";
	}
	
	public static void main(String[] args) {
		OverrideSub os = new OverrideSub(); // 나와 나의 부모에 있는 모든것을 쓸 수 있다.
		os.pMethod(); // 부모
		os.pMethod1(); // Override
		os.i = 10; // 부모
		os.j = 100;
		os.cMethod();

		System.out.println("---------------------------------------------------------");
		// is a 관계의 객체화 : 부모클래스의 자원만 호출가능. Override된 method는 자식것을 최우선적으로 호출한다.
		// 부모클래스명 객체명 = new 자식클래스 생성자();

		OverrideSuper os1 = new OverrideSub();  // 참조형 데이터형을 객체화해서 사용한다
		os1.i = 1000; // 부모
//		os1.j = 2000; // 자식 : 사용할 수 없음
		os1.pMethod(); // 부모
		os1.pMethod1(); // Override : 자식이 구현한 method가 먼저 호출이 된다. 
//		os1.cMethod(); // 자식 : 사용할 수 없음
		
		/**
		 * 참조형데이터형(class,문자열,array)의 객체명을 출력하면 그 주소가 출력이 된다.  
		 * (그 안에서 toString()을 호출하기 때문에 주소가 출력이 된다.)
		 **/
		System.out.println(os1); // 주소. 객체의 주소가 출력이 된다. toString을 부르지 않아도 안에서 toString을 부르고 있다.
								 // 하지만 toString을 오버라이딩하면 내가 원하는 메시지가 나온다.
		String s1 = new String("안녕하세요"); // 참조형 데이터형을 객체화해서 사용한다
		System.out.println(s1.toString()); // 값. 주소가 아닌 문자열이 출력이 된다. 객체가 가지고 있는 값이 나온다.
		//Object에 있는 toString()을 Override를 했다.
		
		
		
	}// main

}// class





