package day1222;

/**
 * 클래스가 객체로 생성될때 객체가 가져야할 기본값을 
 * 설정해야할 때 사용하는 생성자<br>
 * 접근지정자 클래스명(매개변수.......)의 형식으로 작성한다.
 * @author user
 */
public class TestConstructor {
	int i;
	public TestConstructor(){
		i=100;
		// 객체가 가져야하는 기본 값 설정
		System.out.println("기본생성자(default constrictor)");
	}
	//생성자 Overload
	public TestConstructor(int i){
		this.i=i;
		System.out.println("인자 있는 생성자");
	}//TestConstructor
	
	public void test(){
		//TestConstructor(); // method 호출하듯 호출 불가
	}
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor(10000); // 기본 생성자를 부르는 인스턴스화
																 // 만약 개발자가 인자있는 생성자를 만들면 기본생성자를 만들지 않기때문에
																 // 기본생성자를 부르는 코드는 오류가 발생
		tc.test();
//		tc.TestConstructor(); // method 호출하듯 호출 불가
		new TestConstructor(); // 기본생성자는 없을수가 없다. 자동으로 들어갈 수 있지만 내가 명시할 수 도있다.
							   		  // 인스턴스화 할 때 생성자가 불려진다.
		System.out.println("tc.i = "+tc.i);
									
	} //main

}//class
