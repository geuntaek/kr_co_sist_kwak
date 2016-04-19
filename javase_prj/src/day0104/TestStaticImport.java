package day0104;

/**
 * 다른클래스에 존재하는 static 변수, static method, constant를 현재 클래스에 
 * 존재하는 것처럼 클래스명 없이 사용할 때 필요한 static import<br>
 * import static 패키지명.클래스명.static변수명;
 * @author user
 */

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.lang.System.out;


public class TestStaticImport {

	public static void main(String[] args) {
		
		out.println(Byte.MAX_VALUE);
		out.println(MAX_VALUE);
		int temp = parseInt(args[0]);
		String value = valueOf(temp);
		System.out.println((int)(Math.random()*1000));
	}//main

}//class
