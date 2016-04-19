package day0104;

/**
 * 클래스를 인스턴스 변수처럼 사용할 수 있는 inner class<br>
 * 내부클래스는 외부클래스의 자원을 마음대로 사용할 수 있지만
 * 외부클래스는 내부클래스의 자원을 직접은 사용할 수 없고
 * 객체화를 통해서만 사용할 수 있다.
 * @author user
 */
public class Outer {
	
	int out_i;
	
	public Outer(){
		System.out.println("외부클래스의 생성자");
	}//Outer
	
	public void outMethod(){
		System.out.println("외부클래스의 method out_i = "+out_i);
		//외부클래스에서 내부클래스의 자원을 직접사용할 수 없다.
//		in_i=100;
		
		//외부 클래스의 method 에서 내부클래스의 객체를 생성할 때에는 
		//바깥클래스의 인스턴스주소를 사용할 수 있는 this를 사용하여 생성한다.
//		Outer.Inner in = this.new Inner(); // 이 메소드를 부르는 인스턴스의 주소를 가지고 있는 this
		
		
	}//outMethod
	
	////////////////////////////// 내부 클래스 시작 ///////////////////////////////////
	public class Inner{
		int in_i;
		
		public Inner(){
			System.out.println("내부클래스의 생성자");
		}//Inner
		
		public void inMethod(){
			//외부클래스의 자원을 마음대로 가져다 사용할 수 있다.
			out_i = 10000;
			System.out.println("내부클래스의 method in_i = "+in_i);
		}
		
	}//class
	////////////////////////////// 내부 클래스 끝  ///////////////////////////////////
	public static void main(String[] args) {
		
		//1.외부클래스의 객체화
		Outer out = new Outer();
		out.out_i = 1;
		out.outMethod();
//		out.in_i = 4;//내부클래스의 자원은 직접 사용불가능
		
		System.out.println("-----------------------------------------------");
		//2.내부클래스의 객체화
		//외부클래스명.내부클래스명 객체명 = 외부클래스 객체명.new 내부클래스생성자();
//		Inner in = new Inner(); // 잘못된 객체화. 직접할 수 없다.
		Outer.Inner in = out.new Inner();
		in.in_i = 4;
		in.inMethod();
		out.outMethod();
		
		
	}//main

}//class






