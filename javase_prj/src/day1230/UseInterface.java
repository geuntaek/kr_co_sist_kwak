package day1230;

/**
 * 인터페이스를 구현하는 클래스
 * @author user
 */
public class UseInterface implements TestInterface {
	
	@Override
	public String msg(){
		return "Happy New Year";
	}
	@Override
	public int asciiCode(char paramChar){
		return (int)paramChar;
	}
	
	public int year(){
		return 2016;
	}
	
	public static void main(String[] args) {
//		인터페이스는 직접 객체화 할 수 없다.
//		TestInterface ti= new TestInterface();
		
//		자식클래스로 객체화가 가능
		UseInterface ui = new UseInterface();
		System.out.println(ui.msg());
		System.out.println(ui.asciiCode('A'));
		
//		is a 관계의 객체화가 가능. 
//		Override한 method와 인터페이스 내의 constant만 호출이 가능하다. 
//		자식의 method는 호출이 불가능하다. 상속과 같은 점이다.
		TestInterface ti = new UseInterface();
		System.out.println(ti.msg());
		System.out.println(ti.asciiCode('Z'));
//		System.out.println(ti.year()); // 에러발생. 자식의 method는 호출이 불가능.
		
		
	}//main

}//class
