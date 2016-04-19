package day1222;

/**
 *	사람 클래스를 사용하여 객체를 만들고, 객체가 할 수 있는 일을 시키는 클래스
 * @author user
 */
public class UsePerson {
	
	public static void main(String[] args) {
		Person geuntaek = new Person();
		geuntaek.setName("조근택");
		// 생성자 정의 후 필요없는 코드
//		geuntaek.setEye(2);
//		geuntaek.setMouth(1);
//		geuntaek.setNose(1);
		
		System.out.println(geuntaek.eat());
		System.out.println(geuntaek.eat("\"파스타\"", 15000));
		
		Person jinban = new Person(3,1,1);
		jinban.setName("천진반");
//		jinban.setEye(3);
//		jinban.setMouth(1);
//		jinban.setNose(1);
		System.out.printf("천진반의 눈 개수는 %d개이다.\n",jinban.getEye());
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두", 1));
	}
}
