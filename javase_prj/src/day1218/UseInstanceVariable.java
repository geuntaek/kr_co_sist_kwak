package day1218;

/**
 *	�ν��Ͻ� ���� ������������ Ư¡
 * @author user
 */
public class UseInstanceVariable {
	
	public static void main(String[] args) {
		// ���� ��Ű�� �ȿ����� public, protected, default instance ���� ��밡��
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.i+iv.j+iv.i); 
		iv.i = 12; // public
		iv.j = 2015; // protected
		iv.l = 18; // default
		// iv.k = 10; // private�� �ܺο����� ��� �Ұ�
		System.out.println("���������� public "+iv.i+", proctected "+iv.j+", default "+iv.i);
	}// main
}// class

