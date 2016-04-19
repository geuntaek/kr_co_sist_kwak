package day0104;

/**
 * Ŭ������ static ����ó�� ����� ��<br>
 * ���Ͽ���(static����)�� ����, method�� static������� ����� �� �ִ�.
 * @author user
 */
public class NestedOuter {
	int i;
	static int j;
	
	public NestedOuter(){
		System.out.println("�ܺ�Ŭ������ ������");
	}
	
	public void outMethod(){ // static�� ���� ���� method�� instance method //  heap�� �ö󰡴� �Ͱ� method�� �ö󰡴°� �Ѵ� ��밡��
		System.out.println("�ܺ� �ν��Ͻ� method");
	}
	public static void outStaticMethod(){ // static method
		System.out.println("�ܺ� ����ƽ method");
		NestedInner.k=4;
	}
	
	
	//////////////////////////////��ø Ŭ���� ���� ///////////////////////////////////
	static class NestedInner{
		static int k;
		public static void inMethod(){
			
//			i=10; // ������ �ٸ��� ������ ����� �Ұ���
			j=1; // ���� �����̱� ������ ��� ����
			
			NestedOuter.outStaticMethod();
			System.out.println("��ø Ŭ���� method");
		}
		
	}
	//////////////////////////////��ø Ŭ���� ��  .///////////////////////////////////
	
	
	
	public static void main(String[] args) {
		NestedInner.inMethod(); // Ŭ�������� ������������ �ʴ�.
		
	}//main

}//class




