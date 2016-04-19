package day0108;

/**
 * method ���ο��� �߻��� ���ܸ� ȣ���� ������ ó���ϵ��� �ϴ� throws
 * ���ܹ߻��ڵ�� ����ó���ڵ带 ������ �� �ִ�.
 * 
 * @author user
 */
public class UseThrows implements Cloneable{
	
	public UseThrows() throws ClassNotFoundException{ // �����ڿ��� throws�Ǹ� instance�� ������ ó���ض�, �θ�Ŭ������ �����ڿ��� ���ܰ� ������� �ڽĻ����ڿ��� �� throws�� ����Ѵ�.
		Class.forName("day0108.UseThrows"); // �� �ڽ��� �ε�
//		Class.forName("day0108.UseThrows1"); // ���°� �ε�
		System.out.println("�ε�����");
	}//UseThrows
	
	public void test() throws CloneNotSupportedException{ // method�� ���ܸ� ������.
		UseThrows ut = (UseThrows)clone();
		System.out.println("���� : "+ut);
	}
	
	public static void main(String[] args) { // main���� throws�� ��������. �ڹٰ���ӽ��� ��ƹ�����.
		try {
			UseThrows ut = new UseThrows();
			ut.test();
		} catch (ClassNotFoundException e) { // ȣ���� ��
			System.err.println("��θ� Ȯ���ϼ���.");
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			System.err.println("implements Cloneable�ߴ��� Ȯ���ϼ���.");
			e.printStackTrace();
		} 
		
	}//main

}//class
