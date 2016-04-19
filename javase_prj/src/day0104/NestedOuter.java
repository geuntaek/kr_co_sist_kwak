package day0104;

/**
 * 클래스를 static 변수처럼 사용할 때<br>
 * 동일영역(static영역)의 변수, method는 static방식으로 사용할 수 있다.
 * @author user
 */
public class NestedOuter {
	int i;
	static int j;
	
	public NestedOuter(){
		System.out.println("외부클래스의 생성자");
	}
	
	public void outMethod(){ // static이 붙지 않은 method는 instance method //  heap에 올라가는 것과 method에 올라가는거 둘다 사용가능
		System.out.println("외부 인스턴스 method");
	}
	public static void outStaticMethod(){ // static method
		System.out.println("외부 스태틱 method");
		NestedInner.k=4;
	}
	
	
	//////////////////////////////중첩 클래스 시작 ///////////////////////////////////
	static class NestedInner{
		static int k;
		public static void inMethod(){
			
//			i=10; // 영역이 다르기 때문에 사용이 불가능
			j=1; // 동일 영역이기 때문에 사용 가능
			
			NestedOuter.outStaticMethod();
			System.out.println("중첩 클래스 method");
		}
		
	}
	//////////////////////////////중첩 클래스 끝  .///////////////////////////////////
	
	
	
	public static void main(String[] args) {
		NestedInner.inMethod(); // 클래스명은 생략가능하지 않다.
		
	}//main

}//class




