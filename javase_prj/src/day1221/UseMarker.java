package day1221;

/**
 *	Marker펜을 객체로 만들어 쓰기위한 class
 *	사용하는 주체이다.
 * @author user
 */
public class UseMarker {
	/**
	 * 	실행할 때 사용하는 method
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* 생성자를 정의하지 않았을 때 
		// 객체 생성 : 객체화할 클래스명 변수명 = new 클래스명();
		Marker black = new Marker();
		//setter를 사용하여 생성된 마카펜에 값을 설정한다.
		black.setColor("검은");
		black.setCap(1);
		black.setBody(1);
		// method호출하여 정해진 일
//		black.write("안녕하세요") // 반환하는 값이 있는 메소드는 말 그대로 값. 
											// 연산에 참여시킬 수 있다.
		System.out.println(black.write("안녕하세요"));
		Marker blue = new Marker();
		blue.setColor("파란"); 
		System.out.println(blue.write("Be awesome","이소희"));
		*/
		
		
		/////// 12-22-2015 생성자 정의 후 코드 추가 시작 ///////
		// 기본 생성자 사용 - 검은색 마카펜 생성
		Marker black = new Marker();
		System.out.println(black.write("안녕하세요"));
		
		// 인자있는 생성자 사용 - 검은색이 아니거나, 여러개의 뚜껑과 몸체를 가진 마카펜을 생성할 때
		Marker blue = new Marker(101,101,"노란");
		System.out.println(blue.getColor()+"색, 뚜껑은 "+blue.getCap()+"개 몸체는 "+blue.getBody()+"개");
		/////// 12-22-2015 생성자 정의 후 코드 추가 끝 ///////
		
	}//main
}//class
