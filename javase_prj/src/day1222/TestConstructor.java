package day1222;

/**
 * Ŭ������ ��ü�� �����ɶ� ��ü�� �������� �⺻���� 
 * �����ؾ��� �� ����ϴ� ������<br>
 * ���������� Ŭ������(�Ű�����.......)�� �������� �ۼ��Ѵ�.
 * @author user
 */
public class TestConstructor {
	int i;
	public TestConstructor(){
		i=100;
		// ��ü�� �������ϴ� �⺻ �� ����
		System.out.println("�⺻������(default constrictor)");
	}
	//������ Overload
	public TestConstructor(int i){
		this.i=i;
		System.out.println("���� �ִ� ������");
	}//TestConstructor
	
	public void test(){
		//TestConstructor(); // method ȣ���ϵ� ȣ�� �Ұ�
	}
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor(10000); // �⺻ �����ڸ� �θ��� �ν��Ͻ�ȭ
																 // ���� �����ڰ� �����ִ� �����ڸ� ����� �⺻�����ڸ� ������ �ʱ⶧����
																 // �⺻�����ڸ� �θ��� �ڵ�� ������ �߻�
		tc.test();
//		tc.TestConstructor(); // method ȣ���ϵ� ȣ�� �Ұ�
		new TestConstructor(); // �⺻�����ڴ� �������� ����. �ڵ����� �� �� ������ ���� ����� �� ���ִ�.
							   		  // �ν��Ͻ�ȭ �� �� �����ڰ� �ҷ�����.
		System.out.println("tc.i = "+tc.i);
									
	} //main

}//class
