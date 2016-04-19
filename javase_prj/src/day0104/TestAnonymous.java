package day0104;

import day1230.Clark;
import day1230.Fly;

/**
 * 클래스를 arguments로 사용하는 anonymous inner class의 사용
 * @author user
 */
public class TestAnonymous {
	
	public void useFly(Fly fly){ // clark이 fly를 구현함. 
		System.out.println(fly.height()); // 높이
		System.out.println(fly.speed()); // 속도
	}
	
	public static void main(String[] args) {
		TestAnonymous ta = new TestAnonymous();
		//1. Fly와 is a 관계의 클래스를 만들고 객체를 생성하여
		Clark clark = new Clark();
		Fly clark2 = new Clark(); 
		//2. 생성된 객체를 넣어준다.
		ta.useFly(clark);
		ta.useFly(clark2);
		
		// 위의 코드는 자식클래스를 따로 만들어야한다는 단점이 있다. 클래스가 많아진다.
		// 그래서 anonymous inner class를 만든다. 클래스를 만들어야할 필요가 없다.
		ta.useFly(new Fly(){
			public String height(){
				return "높게 나는 일의 구현";
			}
			public String speed(){
				return "빠르게 나는 일을 알아서 구현";
			}
		});
		
		
	}

}
