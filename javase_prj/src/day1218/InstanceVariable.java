package day1218;

/**
 *	생성된 객체에 속해져서 사용되는 instance(member)변수의  사용
 *	객체가 만들어지면 객체마다 생성
 *	자동초기화가 된다.
 *	작성법 = 접근지정 자 데이터형 변수명;
 *	사용법 = 1. 객체화 : 클래스명 객체명 = new 클래스명();
 *				 2. 사용 : 객체명.변수명
 * @author user
 */
public class InstanceVariable {
	// heap에 올려져야 쓸 수 있다. 
	public int i; // 클래스 외부에서 접근가능
	protected int j; //같은 패키지의 클래스, 외부패키지는 자식클래스만
	private int k; // 클래스 안에서만
	int l; // 같은 패키지의 클래스
	
	public static void main(String[] args) {
		//i = 100; // instance변수를 직접참조할 수 없다. 왜? static이 가장 먼저 메모리에 올라가기때문. 
		// heap 을 사용할 수 있는 구문인 객체화를 해서 사용한다.
		InstanceVariable iv = new InstanceVariable(); // 객체 생성함. 
		// 객체화가 되면 멤버변수는 자동초기화된다.
		System.out.println(iv.i+" "+iv.j+" "+iv.k+" "+iv.l); // 지역변수라면 여기에 syso를 쓰면 에러가 난다.
		iv.i = 12;
		iv.j = 2015;
		iv.k = 42;
		iv.l = 12;
		System.out.println(iv.i+" "+iv.j+" "+iv.k+" "+iv.l);
		
		InstanceVariable iv1 = new InstanceVariable();
		// iv와 iv1이 올라간 heap의 주소는 서로 다르다.
		System.out.println(iv);
		System.out.println(iv1);
		System.out.println(iv1.i+" "+iv1.j+" "+iv1.k+" "+iv1.l);
		iv1.i = 18;
		iv1.j = 85;
		iv1.k = 98;
		iv1.l = 55;
		System.out.println(iv1.i+" "+iv1.j+" "+iv1.k+" "+iv1.l);
		
		
	}//main
}//class





