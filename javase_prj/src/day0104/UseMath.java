package day0104;

/**
 * �����ڰ� ������ �ʾ� ��üȭ �� �� ���� 
 * �������� �ڵ带 �̸� ������ ���� Math class�� ���
 * @author user
 */
import static java.lang.System.out;

public class UseMath {
	
	public UseMath(){ // ������
//		Math math = new Math(); // ��üȭ �Ұ���, �⺻�����ڰ� ������ �ʱ� ������.
		out.println(Math.sin(10));
		out.println(Math.tan(10));
		out.println(Math.cos(10));
		
		int i= -2016;
		out.printf("i�� ���� %d\n",Math.abs(i));
		double d = 3.45;
		out.println(d+"�� �ݿø� "+Math.round(d));
		d = 3.1;
		out.println(d+"�� �ø� "+Math.ceil(d));
		d = 3.9;
		out.println(d+"�� ���� "+Math.floor(d));
		d = Math.random();
		out.println("�߻��� ���� "+d);
		out.println("������ ���� "+d*10);
		out.println("�Ҽ����ϸ� ���� ������ ���� "+(int)(d*10)); // ������ �켱������ ��������!!!! 0~9
		out.println("�Ҽ����ϸ� ���� ������ ���� "+((int)(d*10)+1)); //1~10
		
		// A-Z
		out.println("A~Z ���� "+(char)((d*26)+65));
		
	}//UseMath
	
	public static void main(String[] args) {
		
		new UseMath();
		
	}//main

}//class
