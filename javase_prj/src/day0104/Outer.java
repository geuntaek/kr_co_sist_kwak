package day0104;

/**
 * Ŭ������ �ν��Ͻ� ����ó�� ����� �� �ִ� inner class<br>
 * ����Ŭ������ �ܺ�Ŭ������ �ڿ��� ������� ����� �� ������
 * �ܺ�Ŭ������ ����Ŭ������ �ڿ��� ������ ����� �� ����
 * ��üȭ�� ���ؼ��� ����� �� �ִ�.
 * @author user
 */
public class Outer {
	
	int out_i;
	
	public Outer(){
		System.out.println("�ܺ�Ŭ������ ������");
	}//Outer
	
	public void outMethod(){
		System.out.println("�ܺ�Ŭ������ method out_i = "+out_i);
		//�ܺ�Ŭ�������� ����Ŭ������ �ڿ��� ��������� �� ����.
//		in_i=100;
		
		//�ܺ� Ŭ������ method ���� ����Ŭ������ ��ü�� ������ ������ 
		//�ٱ�Ŭ������ �ν��Ͻ��ּҸ� ����� �� �ִ� this�� ����Ͽ� �����Ѵ�.
//		Outer.Inner in = this.new Inner(); // �� �޼ҵ带 �θ��� �ν��Ͻ��� �ּҸ� ������ �ִ� this
		
		
	}//outMethod
	
	////////////////////////////// ���� Ŭ���� ���� ///////////////////////////////////
	public class Inner{
		int in_i;
		
		public Inner(){
			System.out.println("����Ŭ������ ������");
		}//Inner
		
		public void inMethod(){
			//�ܺ�Ŭ������ �ڿ��� ������� ������ ����� �� �ִ�.
			out_i = 10000;
			System.out.println("����Ŭ������ method in_i = "+in_i);
		}
		
	}//class
	////////////////////////////// ���� Ŭ���� ��  ///////////////////////////////////
	public static void main(String[] args) {
		
		//1.�ܺ�Ŭ������ ��üȭ
		Outer out = new Outer();
		out.out_i = 1;
		out.outMethod();
//		out.in_i = 4;//����Ŭ������ �ڿ��� ���� ���Ұ���
		
		System.out.println("-----------------------------------------------");
		//2.����Ŭ������ ��üȭ
		//�ܺ�Ŭ������.����Ŭ������ ��ü�� = �ܺ�Ŭ���� ��ü��.new ����Ŭ����������();
//		Inner in = new Inner(); // �߸��� ��üȭ. ������ �� ����.
		Outer.Inner in = out.new Inner();
		in.in_i = 4;
		in.inMethod();
		out.outMethod();
		
		
	}//main

}//class






