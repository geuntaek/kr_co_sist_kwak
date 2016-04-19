package day1222;

/**
 *	하나의 클래스에 같은 이름의 method를 여러개 
 *	작성할 수 있는 방법인 다형성 중 overload의 사용
 *	규칙: 접근지정자, 반환형, method명은 같게만들고
 *		 	호출시에 구분이 되도록 매개변수만 다르게 만든다.
 * @author user
 */
public class TestOverload {
	/**
	 * 별을 하나 출력하는 일
	 */
	public void printStar(){
		System.out.println("★");
	}
	/**
	 * 	입력되는 수만큼의 별을 출력하는 일 : Overload된 메소드
	 * @param cnt 출력 할 별의 개수
	 */
	public void printStar(int cnt){
		int i = 0;
		while(i<cnt){
			System.out.print("★");
			i++;
		}
		System.out.println();
	}
	/**
	 * 실행하기 위한 method
	 * @param args
	 */
	public static void main(String[] args) {
		// 객체화 : 클래스명 객체명 = new 클래스명();
		TestOverload to = new TestOverload(); // 인스턴스화를 하는 이유는? 클래스를 heap에 올려놓고 사용하기 위해서
		// 같은 이름의 메소드지만 다른 일을 한다. 오버로딩은 많이 사용이 된다.
		to.printStar();
		to.printStar(10);
	}//main
}//class
