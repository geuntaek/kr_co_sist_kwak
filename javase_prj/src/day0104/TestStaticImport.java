package day0104;

/**
 * �ٸ�Ŭ������ �����ϴ� static ����, static method, constant�� ���� Ŭ������ 
 * �����ϴ� ��ó�� Ŭ������ ���� ����� �� �ʿ��� static import<br>
 * import static ��Ű����.Ŭ������.static������;
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
