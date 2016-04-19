package day1218;

/**
 * 하나만 생성되고 공유하여 사용하는 static 변수의 사용
 * 	모든객체가 공용으로 사용한다.
 * 	객체화없이 바로 사용할 수 있다.
 * @author user
 */
public class StaticVariable {
	
	static int i ; //이텔릭체임. 자동초기화 0
	static char c ; // 자동초기화 \u0000
	static double d ; // 자동초기화 0.0
	static boolean b ; // 자동초기화 false
	
	public static void main(String[] args) {
		System.out.println(i+" "+c+" "+d+" "+b); // 바로 쓸 수 있다. 
																	// 만약 다른 클래스에서 static변수를 사용하고 싶다면 클래스이름.변수명
	//	StaticVariable sv1 = new StaticVariable();
	//	StaticVariable sv2 = new StaticVariable();
		i=3; // 변수 i에 값을 넣으면 다 적용된다.
		//System.out.println(sv1.i+" : "+ sv2.i); // sv1.i로 쓸 수 없는 건 아니지만 static으로 쓰라고 경고가 뜬다. StaticVariable.i가 좋음
		System.out.println(StaticVariable.i);
		
	}// main

}// class
