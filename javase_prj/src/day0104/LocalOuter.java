package day0104;

/**
 * Ŭ������ ��������ó�� ����� ��
 * @author user
 */
public class LocalOuter {
	int i; // �ν��Ͻ� ����, heap
	
	public void test(final int param_a, final int param_b){ // �Ű� ����, stack
		final int j=10; // ���� ����, stack
		int k=10;
		//jdk 1.5���� ���ʹ� final�� �پ������ʾƵ� �Ű������� ��밡��
		//////////////////////////////���� Ŭ���� ���� ///////////////////////////////////
		class LocalInner{ // ���������ڴ� static����ó�� default
			int l;
			public LocalInner(){ // ������
				System.out.println("����Ŭ���� ������");
			}//LocalInner
			public void localMethod(){
				System.out.println("���� Ŭ������ method l : "+l);
				System.out.println("�ܺ� Ŭ������ �ν��Ͻ� ���� i : "+i);
				System.out.println("�Ű����� param_a : "+param_a+", param_b : "+param_b);
				System.out.println("�������� j = "+j+", k = "+k);
			}
		}//
		//////////////////////////////���� Ŭ���� ���� ///////////////////////////////////
		
		//����Ŭ������ ��üȭ
		LocalInner li = new LocalInner(); 
		li.localMethod();
		
	}//test
	
	public static void main(String[] args) {
		// �ܺ�Ŭ������ ��üȭ
		LocalOuter lo = new LocalOuter();
		lo.test(1, 4); // method�� �ҷ��ٰ� ��ü�� ��������°��� �ƴ�.
		
	}//main

}//class
