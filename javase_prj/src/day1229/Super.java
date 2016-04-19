package day1229;

/**
 * 부모 클래스 : 모든 자식클래스가 사용할 수 있는 공통 특징을 정의
 * @author user
 */
public class Super {
	
	int i;
	public Super(){
		System.out.println("부모클래스의 생성자");
	}//Super
	
	public void superMethod(){
		System.out.println("부모 method "+i);
	}//superMethod
	
}
