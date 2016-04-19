package day1223;

/**
 * 생성된 객체의 주소는 heap에 저장되고 그 heap의 주소는 stack에 저장됨
 * 생성된 객체의 주소를 method로 전달하기
 * @author user
 */
public class PassAddr {
	int i;
	public void test(PassAddr p){ // 주소를 받는다.
		System.out.println(p+"번지의 i 값은"+i);
	}//test
	public static void main(String[] args) { 
		PassAddr pa = new PassAddr();
		PassAddr pa1 = new PassAddr();
		System.out.println("main method : (pa)"+pa); // pa는 주소를 가질 것이다. pa 자체는 stack에 존재. 
		System.out.println("main method : (pa1)"+pa1); // pa1는 pa와 다른 주소를 가질 것이다.
		//주소를 전달
		pa.test(pa);//@139a55에 있는 test()를 불러올 것이다. @139a55에 있는 i가 print된다.
		pa1.test(pa1); //메소드는 같지만 주소는 다르다.@1db9742에 있는 i가 print된다.
	}//main

}//class
