package day1229;

/**
 * 자식 클래스 : 공통적인 일은 부모클래스의 자원을 사용하고, 
 * 				 자식클래스에서는 자신만의 특징을 정의한다.
 * @author user
 */
public class Sub extends Super{
	
	int j;
	
	public Sub(){
		System.out.println("자식클래스의 생성자");
	}
	
	public void subMethod(){
		this.i = 200;
		System.out.println("자식의 method "+this.i+"/"+this.j); // 나한테는 없지만 부모에게 있기때문에 내꺼다.
		this.superMethod();
	}//subMethod
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.subMethod();
		
	}//main

}//class
