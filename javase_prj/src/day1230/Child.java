package day1230;

/**
 * �θ�Ŭ������ �ڽ�Ŭ������ �����̸��� ������ �Ǵ� method�� ������ ���� ��
 * �θ�Ŭ������ ������ method�� �ĺ��ϰ�ʹٸ� super�� ����Ѵ�.
 * @author user
 */
public class Child extends Parent {
	int i,k;
	
	@Override
	public void printVariable(){
		i = 100; // �ڽ�
		super.i = 400; // ���� �̸��� ����� �ĺ� : super.������
		j = 200; // �θ�
		k = 300; // �ڽ�
		System.out.println("�ڽ� i = "+this.i+" j = "+this.j+" k = "+this.k+" �θ� i = "+super.i); 
		// j�� super.j �� this.j �Ѵ� �����ϴ�. ������ ���� ���������� �θ�Բ��� �����̱� ������ this.j�� ������ ���̴�.
		
		super.printVariable(); // �θ��� method�� ȣ��, �θ�� �ڽ��� ���� �̸��� method�� �ִٸ� super�� �ĺ�����
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.printVariable(); // �ڽ�
		
	}//main

}//class
