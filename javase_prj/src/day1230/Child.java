package day1230;

/**
 * 부모클래스와 자식클래스가 같은이름의 변수를 또는 method를 가지고 있을 때
 * 부모클래스의 변수와 method를 식별하고싶다면 super를 사용한다.
 * @author user
 */
public class Child extends Parent {
	int i,k;
	
	@Override
	public void printVariable(){
		i = 100; // 자식
		super.i = 400; // 같은 이름의 대상을 식별 : super.변수명
		j = 200; // 부모
		k = 300; // 자식
		System.out.println("자식 i = "+this.i+" j = "+this.j+" k = "+this.k+" 부모 i = "+super.i); 
		// j는 super.j 와 this.j 둘다 가능하다. 나한테 없는 변수이지만 부모님꺼가 내꺼이기 때문에 this.j가 가능한 것이다.
		
		super.printVariable(); // 부모의 method를 호출, 부모와 자식이 같은 이름의 method가 있다면 super로 식별가능
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.printVariable(); // 자식
		
	}//main

}//class
