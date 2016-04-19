package day1221;

/**
 *	method의 매개변수는 하나지만 여러개의 인자를 넣을 수 있는 가변인자형의 사용
 *		public void method(데이터형 ... 매개변수명){ // 접근지정자와 반환형은 주고싶은대로 줘도 된다.
 *		
 *		}
 * @author user
 */
public class VariableArguments {
	public void test( int ... param_i){ // 가변 일 
		// ... 이 붙은 매개변수는 배열로 처리된다.
		for (int i = 0; i < param_i.length; i++) {
			System.out.print(param_i[i]+"\t");
		}
		System.out.println();
	}//test
	
	//variable arguments는 다른 매개변수와 같이 
	//정의될때 가장 마지막에만 정의할 수 있다.
	public void vaTest(int j, String s, char c, int ... i){
		System.out.println(j);
		System.out.println(s);
		System.out.println(c);
		for (int k = 0; k < i.length; k++) {
			System.out.print(i[k]+"\t");
		}
	}
	public static void main(String[] args) {
		//객체화 : 클래스명 객체명 = new 클래스명();
		VariableArguments va = new VariableArguments();
		va.test(10,20,30,40,50,60); // 인자 없이 불러오기 -> 주소가 출력됨.
		va.vaTest(52121704, "이소희", 'A', 4,5,6,4,54,864,233);
	}
}
