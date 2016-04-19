package day1218;

/**
 * 작성할 수 있는 method의 4가지 형태
 * 
 * @author user
 */
public class MethodType {
	// 1. 반환형 없고 매개변수 없는 형(고정 일)
	public void typeA() {
		System.out.println("고정 일");
	}

	// 2. 반환형 없고, 매개변수 있는 형(가변 일)
	public void typeB(char c, int i) {
		System.out.println("가변 일 :" + c + " " + i);
	}

	// 3. 반환형 있고, 매개변수 없는 형 (고정 값)
	// 반환형이 있는 메소드는 반드시 가장 마지막줄에 return 값;의 구문이 나와야한다.
	public int typeC() {
		return 3;
	}

	// 4. 반환형 있고, 매개변수 있는 형 (가변 값)
	public int typeD(char c) {
		return (int) c;
	}

	public static void main(String[] args) {
		MethodType mt = new MethodType();
		for (int i = 0; i < 10; i++) {
			mt.typeA();
			mt.typeB((char) (i + 65), i);// 가변 일
		}
		// mt.typeC();
		System.out.println(mt.typeC());
		int i = mt.typeC() + 1;
		System.out.println("고정값 : " + i);
		System.out.println(mt.typeD('Z'));
		System.out.println(mt.typeD('T')); // 입력되는 값에 따라 결과가 다르게 나온다.

	}

}
