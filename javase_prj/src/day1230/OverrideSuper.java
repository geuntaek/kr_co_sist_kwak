package day1230;

/**
 * 부모클래스에서 제공하는 method가 자식클래스에서 사용될 때 자식클래스의 상황과
 * 맞지않는다면 자식클래스에서 부모클래스의 method를 동일하게 만들어 사용하는 override의 연슴 <br>
 * 접근지정자는 달라도 되고, 반환형, method명, 매개변수는 같아야한다.<br>
 * 좀 더 접근이 잘되는 쪽의 접근지정자로 바꾼다. default -> protected -> public 
 * @author user
 */
public class OverrideSuper {
	
	int i;
	
	public void pMethod(){
		System.out.println("부모의 method");
	}//pMethod
	protected void pMethod1(){
		System.out.println("부모의 method1 "+i);
	}//pMethod1
	
}
