package day1230;

/**
 * ��Ӱ��迡�� �θ�Ŭ������ �ۼ��� �� ����ϴ� Ŭ����<br>
 * ������ �������� ������ abstract method�� ���� �� �ִ�.<br>
 * ��üȭ�� ���� �ʴ´�.
 * 
 * @author user
 */
public abstract class AbstractParent {
	
	int i;
	public AbstractParent(){ // �߻�Ŭ������ ������ �����ڵ� ������.
		System.out.println("�θ������");
	}//AbstractParent
	
	public void method(){
		System.out.println("�θ��� �Ϲ� method");
	}// method
	
	///////// �߻� method�� �����ٴ� ���� �ٸ� Ŭ������ �ٸ� ��
//	public String msg();
	public abstract String msg(); // �߻� method�� body�� ���� �� ����. ��������.
	public abstract int age(int year); 
	
//	public static void main(String[]args){ // �߻�Ŭ������ main�� ���� �� �ִ�.
//		new AbstractParent(); // �߻�Ŭ������ ���� ��üȭ�� ���� �ʴ´�. 
//		
//		
//	}//main
	
}//class
