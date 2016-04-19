package day1218;

/**
 *	������ ��ü�� �������� ���Ǵ� instance(member)������  ���
 *	��ü�� ��������� ��ü���� ����
 *	�ڵ��ʱ�ȭ�� �ȴ�.
 *	�ۼ��� = �������� �� �������� ������;
 *	���� = 1. ��üȭ : Ŭ������ ��ü�� = new Ŭ������();
 *				 2. ��� : ��ü��.������
 * @author user
 */
public class InstanceVariable {
	// heap�� �÷����� �� �� �ִ�. 
	public int i; // Ŭ���� �ܺο��� ���ٰ���
	protected int j; //���� ��Ű���� Ŭ����, �ܺ���Ű���� �ڽ�Ŭ������
	private int k; // Ŭ���� �ȿ�����
	int l; // ���� ��Ű���� Ŭ����
	
	public static void main(String[] args) {
		//i = 100; // instance������ ���������� �� ����. ��? static�� ���� ���� �޸𸮿� �ö󰡱⶧��. 
		// heap �� ����� �� �ִ� ������ ��üȭ�� �ؼ� ����Ѵ�.
		InstanceVariable iv = new InstanceVariable(); // ��ü ������. 
		// ��üȭ�� �Ǹ� ��������� �ڵ��ʱ�ȭ�ȴ�.
		System.out.println(iv.i+" "+iv.j+" "+iv.k+" "+iv.l); // ����������� ���⿡ syso�� ���� ������ ����.
		iv.i = 12;
		iv.j = 2015;
		iv.k = 42;
		iv.l = 12;
		System.out.println(iv.i+" "+iv.j+" "+iv.k+" "+iv.l);
		
		InstanceVariable iv1 = new InstanceVariable();
		// iv�� iv1�� �ö� heap�� �ּҴ� ���� �ٸ���.
		System.out.println(iv);
		System.out.println(iv1);
		System.out.println(iv1.i+" "+iv1.j+" "+iv1.k+" "+iv1.l);
		iv1.i = 18;
		iv1.j = 85;
		iv1.k = 98;
		iv1.l = 55;
		System.out.println(iv1.i+" "+iv1.j+" "+iv1.k+" "+iv1.l);
		
		
	}//main
}//class





