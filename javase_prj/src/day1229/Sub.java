package day1229;

/**
 * �ڽ� Ŭ���� : �������� ���� �θ�Ŭ������ �ڿ��� ����ϰ�, 
 * 				 �ڽ�Ŭ���������� �ڽŸ��� Ư¡�� �����Ѵ�.
 * @author user
 */
public class Sub extends Super{
	
	int j;
	
	public Sub(){
		System.out.println("�ڽ�Ŭ������ ������");
	}
	
	public void subMethod(){
		this.i = 200;
		System.out.println("�ڽ��� method "+this.i+"/"+this.j); // �����״� ������ �θ𿡰� �ֱ⶧���� ������.
		this.superMethod();
	}//subMethod
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.subMethod();
		
	}//main

}//class
