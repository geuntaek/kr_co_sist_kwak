package day1223;

/**
 * 주소를 전달하면 생성된 하나의 주소가 넘어간다. <br> 
 * 복사가 되어 넘어가는 것이 아니라 그대로 전달이 된다.
 * @author user
 */
public class CallByReference {
	int i,j; 
	
	// 데이터형을 클래스로 하면 주소를 받을 수 있다. 참조형 변수
	public void swap(CallByReference cbr){ 
		// heap에 있는 값을 stack에 있는 temp에 넘겨주고
		// temp에 있는걸 heap에 넘겨주고 해서 swap을 완성
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap 내 i = "+cbr.i+", j = "+cbr.j);
	}// swap
	// 한번 생성된 주소는 계속 쓰여진다.
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference(); // 인스턴스화.
		cbr.i = 2015;
		cbr.j = 12;
		System.out.println("swap 전 i = "+cbr.i+", j = "+cbr.j);
		cbr.swap(cbr); // 객체를 넘겨준다.
//						  main프레임에서 swap프레임으로 주소가 전달이 된다.
		System.out.println("swap 후 i = "+cbr.i+", j = "+cbr.j);
	}//main
}//class
