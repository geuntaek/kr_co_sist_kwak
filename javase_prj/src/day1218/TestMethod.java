package day1218;

/**
 *	instance method�� static method�� �ۼ��ϰ� ȣ���ϴ� ���
 * @author user
 */
public class TestMethod {
	public void instanceMethod(){ // static�� �Ⱥپ��ֱ⶧���� ����ȣ�� �Ұ���
		System.out.println("instance method ȣ��");
	}//instanceMethod
	public static void staticMethod(){
		System.out.println("static method ȣ��");
	}//staticMethod
	
	public static void main(String[] args) {
		// instance method ȣ��
		//intstanceMethod(); // ����ȣ�� �Ұ���
									  // 1. ��üȭ : Ŭ������ ��ü�� = new Ŭ������();
		TestMethod tm = new TestMethod();
		tm.instanceMethod();
		
		// static method ȣ��
		//tm.staticMethod(); // ��ü�� ���� ȣ���ϴ� ���� �����ϱ������� �׷��� ����ȣ���ϴ� ���� ����.
									  // static method�� �����̱� ������ Ư�� ��ü�� �����ִ� methodó�� ȣ���ϸ� ��� ���
									  // Ŭ������.method��();
		TestMethod.staticMethod(); // ����ȣ�� ����
		
	}//main
}//class
