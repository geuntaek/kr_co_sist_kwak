package day1229;

/**
 *
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		
		HongGilDong gd = new HongGilDong(); // Person을 상속받은 HongGilDong 클래스.
		gd.setName("홍길동"); // 부모클래스의 method
		System.out.printf("눈%d개 입%d개 코%d개\n",gd.getEye(),gd.getMouth(),gd.getNose()); // 부모클래스의 method
		System.out.println(gd.eat());// 부모클래스의 method
		System.out.println(gd.eat("국밥", 1));// 부모클래스의 method
		
		System.out.println(gd.getName()+"이(가)"+gd.Fight(5)); //
		System.out.println(gd.getName()+"이(가)"+gd.Fight(6)); //
		System.out.println(gd.getName()+"이(가)"+gd.Fight(9)); //
		System.out.println(gd.getName()+"이(가)"+gd.Fight(7)); //
		
		System.out.println("\n---------------------------------------------");
		
		Clark superman = new Clark();
		superman.setName("클락");
		System.out.printf("눈%d개 입%d개 코%d개\n",superman.getEye(),
				superman.getMouth(),superman.getNose()); // 부모클래스의 method
		System.out.println(superman.eat());
		System.out.println(superman.eat("피자",10));
		
		String stone = "크립토나이트";
		System.out.println(stone+"  "+superman.power(stone));
		
		System.out.println("\n---------------------------------------------");
		
		Sohee sh = new Sohee();
		sh.setName("이소희");
		String fruit = "배";
		System.out.println(sh.getName()+"는 "+fruit+"를(을) "+sh.hateFruit(fruit));
		fruit = "포도";
		System.out.println(sh.getName()+"는 "+fruit+"를(을) "+sh.hateFruit(fruit));
		fruit = "용과";
		System.out.println(sh.getName()+"는 "+fruit+"를(을) "+sh.hateFruit(fruit));
		fruit = "사과";
		System.out.println(sh.getName()+"는 "+fruit+"를(을) "+sh.hateFruit(fruit));
		fruit = "귤";
		System.out.println(sh.getName()+"는 "+fruit+"를(을) "+sh.hateFruit(fruit));
		
		
	}// main

}// class
