package day1230;

/**
 * �ڽ�Ŭ������ �ؾ��� ���� ��ϸ� ����
 * @author user
 */
public interface TestInterface {
//	int i;// �������̽��� �ν��Ͻ� ������ ���� �� ����. ����. static������ ������ ����.
	public static final int i=0; // static���� ����. �ݵ�� �ʱ�ȭ���� ������Ѵ�. 
								 //������ �������̽��� ����� �߻�method���� ����
//	public TestInterface(){  �������̽��� �����ڸ� ���� �� ����.
//	}
	
//	public void method(){ // �Ϲ� method�� ���� �� ����.
//	}
	
	// abstract method ����
	public abstract String msg(); // �߻�method�� ������.
	public int asciiCode(char c); // ������ interface�� �Ϲ�method�� ���ǰ� �����ʱ� ������ abstract�� �����ϰ� �� �� �ִ�.
	
	

}//interface
