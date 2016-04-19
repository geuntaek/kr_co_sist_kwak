package day0104;

/**
 * 생성자가 보이지 않아 객체화 할 수 없고 
 * 수학적인 코드를 미리 정의해 놓은 Math class의 사용
 * @author user
 */
import static java.lang.System.out;

public class UseMath {
	
	public UseMath(){ // 생성자
//		Math math = new Math(); // 객체화 불가능, 기본생성자가 보이지 않기 때문임.
		out.println(Math.sin(10));
		out.println(Math.tan(10));
		out.println(Math.cos(10));
		
		int i= -2016;
		out.printf("i의 절댓값 %d\n",Math.abs(i));
		double d = 3.45;
		out.println(d+"의 반올림 "+Math.round(d));
		d = 3.1;
		out.println(d+"의 올림 "+Math.ceil(d));
		d = 3.9;
		out.println(d+"의 버림 "+Math.floor(d));
		d = Math.random();
		out.println("발생된 난수 "+d);
		out.println("범위의 난수 "+d*10);
		out.println("소수이하를 없앤 범위의 난수 "+(int)(d*10)); // 연산의 우선순위를 잊지말기!!!! 0~9
		out.println("소수이하를 없앤 범위의 난수 "+((int)(d*10)+1)); //1~10
		
		// A-Z
		out.println("A~Z 난수 "+(char)((d*26)+65));
		
	}//UseMath
	
	public static void main(String[] args) {
		
		new UseMath();
		
	}//main

}//class
