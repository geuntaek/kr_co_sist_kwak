package day1230;

/**
 * 추상클래스를 부모로 하는 자식 클래스<br>
 * 자식클래스는 부모에 존재하는 모든 abstract method를 구현해야한다.<br>
 * 자식클래스가 추상클래스가 된다면 부모의 abstract method를 구현하지 않아도된다.
 * 하지만 이 이후의 자식클래스가 구현하지 않은 추상메서드를 모두 구현해야한다.
 * 
 * @author user
 */
public class AbstractChild extends AbstractParent {
	
	@Override
	public String msg(){
		return "안녕하세요";
	}// msg
	
	@Override
	public int age(int year){
		// 추상 method는 super로 호출할 수 없다.
//		super.msg(); // 직접호출할 수 없어서 에러가 발생한다.
		return 2015-year+1;
	}// age
	
	public static void main(String[]args){
		AbstractChild ac = new AbstractChild();
		System.out.println(ac.msg());
		System.out.println(ac.age(1993));
		ac.method();
	}
	
	
}//AbstractChild
