package day1229;

/**
 * 상속관계에서 생성자를 호출할때 어떤일이 발생하는지 확인하는 클래스
 * @author user
 */
public class Run {

	public static void main(String[] args) {
		
		//1.Child c = new Child();
		Child c1 = new Child(100);
		
//		Child c = new Child(); // 자식기본생성자를 호출함, 상속관계에 있는 child를 불렀더니 
//							   // 부모기본생성자가 호출되고 자식기본생성자가 호출된다.
//							   // 각 생성자의 첫줄에 super()라는 키워드가 있다. 
//							   // 부모의 기본생성자를 호출하는 super()
//							   // 불러야하는 기본생성자가 없다면 오류가 발생한다.
//		Child c1 = new Child(29); // 부모클래스에는 꼭 기본생성자가 있어야 자식에서 에러가 나지 않는다.
//								  // 기본생성자가 생기지 않은 경우는 인자있는 생성자를 만들었을 경우이다.
								  // 에러가 발생하지 않기 위해서는 child에서 super(인자);를 자식클래스의 생성자에서 호출하면 된다.
	}

}
/*
 * 1. 부모기본,부모인자50,자식인자10,자식기본
 * 
 * 2. 부모인자 100,부모기본,자식기본,자식인자100
 * 
 */
 