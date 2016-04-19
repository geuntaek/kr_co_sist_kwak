package day1223;

/**
 * 객체가 생성된 이후에서만 사용할 수 있는 this의 사용법<br>
 * heap을 사용한다는 의미.<br>
 * static 영역에서는 사용할 수 없다.<br>
 * this는 method를 호출하는 객체의 주소로 변경된다.<br>
 * @author user
 */
public class UseThis {
	int i; // 인스턴스의 i
	public void test(int i){ // stack의 i
		System.out.println("test =====> "+this); // test를 부르는 객체의 주소가 출력된다.
//		i=i; // 이 코드를 실행해봤자 아무 효과가 없다는 경고가 뜬다.
		this.i=i;
	}
	
	public static void test(){
		// main에서 호출 방법은 클래스명.method명();
		// 어떤 객체가 호출할지 모르기때문에 this를 사용할 수 없다.
	}
	
	public static void main(String[] args) {
		UseThis ut = new UseThis();
		System.out.println("main =====> "+ut); // ut의 주소가 출력된다.
		ut.test(12); // ut가 test method를 호출
		UseThis ut1 = new UseThis();
		System.out.println("main =====> "+ut1); // ut1의 주소가 출력된다.
		ut1.test(120); // ut1가 test method를 호출
		
		System.out.println("ut.i = "+ut.i);
		System.out.println("ut1.i = "+ut1.i);
//		System.out.println(this); // 에러 생김. 사용불가 메인메소드를 부르는 인스턴스가 없기때문에..
	}//main
}//class


