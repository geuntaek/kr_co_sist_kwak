package day1218;

/**
 * �ϳ��� �����ǰ� �����Ͽ� ����ϴ� static ������ ���
 * 	��簴ü�� �������� ����Ѵ�.
 * 	��üȭ���� �ٷ� ����� �� �ִ�.
 * @author user
 */
public class StaticVariable {
	
	static int i ; //���ڸ�ü��. �ڵ��ʱ�ȭ 0
	static char c ; // �ڵ��ʱ�ȭ \u0000
	static double d ; // �ڵ��ʱ�ȭ 0.0
	static boolean b ; // �ڵ��ʱ�ȭ false
	
	public static void main(String[] args) {
		System.out.println(i+" "+c+" "+d+" "+b); // �ٷ� �� �� �ִ�. 
																	// ���� �ٸ� Ŭ�������� static������ ����ϰ� �ʹٸ� Ŭ�����̸�.������
	//	StaticVariable sv1 = new StaticVariable();
	//	StaticVariable sv2 = new StaticVariable();
		i=3; // ���� i�� ���� ������ �� ����ȴ�.
		//System.out.println(sv1.i+" : "+ sv2.i); // sv1.i�� �� �� ���� �� �ƴ����� static���� ����� ��� ���. StaticVariable.i�� ����
		System.out.println(StaticVariable.i);
		
	}// main

}// class
