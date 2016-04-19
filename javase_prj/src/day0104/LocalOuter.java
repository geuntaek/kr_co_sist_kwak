package day0104;

/**
 * 클래스를 지역변수처럼 사용할 때
 * @author user
 */
public class LocalOuter {
	int i; // 인스턴스 변수, heap
	
	public void test(final int param_a, final int param_b){ // 매개 변수, stack
		final int j=10; // 지역 변수, stack
		int k=10;
		//jdk 1.5에서 부터는 final이 붙어있지않아도 매개변수는 사용가능
		//////////////////////////////지역 클래스 시작 ///////////////////////////////////
		class LocalInner{ // 접근지정자는 static변수처럼 default
			int l;
			public LocalInner(){ // 생성자
				System.out.println("지역클래스 생성자");
			}//LocalInner
			public void localMethod(){
				System.out.println("지역 클래스내 method l : "+l);
				System.out.println("외부 클래스의 인스턴스 변수 i : "+i);
				System.out.println("매개변수 param_a : "+param_a+", param_b : "+param_b);
				System.out.println("지역변수 j = "+j+", k = "+k);
			}
		}//
		//////////////////////////////지역 클래스 시작 ///////////////////////////////////
		
		//지역클래스의 객체화
		LocalInner li = new LocalInner(); 
		li.localMethod();
		
	}//test
	
	public static void main(String[] args) {
		// 외부클래스의 객체화
		LocalOuter lo = new LocalOuter();
		lo.test(1, 4); // method를 불렀다고 객체가 만들어지는것은 아님.
		
	}//main

}//class
