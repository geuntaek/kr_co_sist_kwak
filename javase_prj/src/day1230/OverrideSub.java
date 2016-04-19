package day1230;

/**
 * �θ�Ŭ������ ������ �ִ� �ڿ�(����,method)�� �ڽ��� ��ó�� ����� �� �ִ�.
 * 
 * @author user
 *
 */
public class OverrideSub extends OverrideSuper {

	int j;

	public void cMethod() {
		System.out.println("�ڽ��� method");
	}// cMethod

	// annotation : Compiler���� annotation�Ʒ��� method�� Override �Ȱ����� üũ�ϵ��� ���鶧
	// ����ϴ� @Override
	@Override
	public void pMethod1() {
		System.out.println("�ڽ��� ������ method");
	}// pMethod1
	
	@Override
	public String toString(){
		return "Happy New Year";
	}
	
	public static void main(String[] args) {
		OverrideSub os = new OverrideSub(); // ���� ���� �θ� �ִ� ������ �� �� �ִ�.
		os.pMethod(); // �θ�
		os.pMethod1(); // Override
		os.i = 10; // �θ�
		os.j = 100;
		os.cMethod();

		System.out.println("---------------------------------------------------------");
		// is a ������ ��üȭ : �θ�Ŭ������ �ڿ��� ȣ�Ⱑ��. Override�� method�� �ڽİ��� �ֿ켱������ ȣ���Ѵ�.
		// �θ�Ŭ������ ��ü�� = new �ڽ�Ŭ���� ������();

		OverrideSuper os1 = new OverrideSub();  // ������ ���������� ��üȭ�ؼ� ����Ѵ�
		os1.i = 1000; // �θ�
//		os1.j = 2000; // �ڽ� : ����� �� ����
		os1.pMethod(); // �θ�
		os1.pMethod1(); // Override : �ڽ��� ������ method�� ���� ȣ���� �ȴ�. 
//		os1.cMethod(); // �ڽ� : ����� �� ����
		
		/**
		 * ��������������(class,���ڿ�,array)�� ��ü���� ����ϸ� �� �ּҰ� ����� �ȴ�.  
		 * (�� �ȿ��� toString()�� ȣ���ϱ� ������ �ּҰ� ����� �ȴ�.)
		 **/
		System.out.println(os1); // �ּ�. ��ü�� �ּҰ� ����� �ȴ�. toString�� �θ��� �ʾƵ� �ȿ��� toString�� �θ��� �ִ�.
								 // ������ toString�� �������̵��ϸ� ���� ���ϴ� �޽����� ���´�.
		String s1 = new String("�ȳ��ϼ���"); // ������ ���������� ��üȭ�ؼ� ����Ѵ�
		System.out.println(s1.toString()); // ��. �ּҰ� �ƴ� ���ڿ��� ����� �ȴ�. ��ü�� ������ �ִ� ���� ���´�.
		//Object�� �ִ� toString()�� Override�� �ߴ�.
		
		
		
	}// main

}// class





