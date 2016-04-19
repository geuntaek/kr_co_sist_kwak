package day1223;

/**
 * this()를 사용한 Overload된 생성자 호출<br>
 * 재귀호출되면 에러 발생
 * @author user
 */
public class ThisConstructor {

	//Overload, 생성자는 꼭 new를 통해 불러야한다.
	public ThisConstructor(){
//		this(23); // 인자있는 생성자의 일을 하고 기본생성자의 일을 한다. 
		System.out.println("default Constructor");
	}//ThisConstructor
	public ThisConstructor(int i){
		this(); // 기본생성자를 부르고 기본생성자의 일을 다 하고 
				// }를 만나면 호출한 곳으로 다시 돌아가 나머지 일을 한다.
		System.out.println("Constructor");
	}//ThisConstructor
	
	public static void main(String[] args) {
		ThisConstructor tc = new ThisConstructor(23);
		
	}//main

}//class
