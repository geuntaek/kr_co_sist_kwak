package day1223;

/**
 * ������ ��ü�� �ּҴ� heap�� ����ǰ� �� heap�� �ּҴ� stack�� �����
 * ������ ��ü�� �ּҸ� method�� �����ϱ�
 * @author user
 */
public class PassAddr {
	int i;
	public void test(PassAddr p){ // �ּҸ� �޴´�.
		System.out.println(p+"������ i ����"+i);
	}//test
	public static void main(String[] args) { 
		PassAddr pa = new PassAddr();
		PassAddr pa1 = new PassAddr();
		System.out.println("main method : (pa)"+pa); // pa�� �ּҸ� ���� ���̴�. pa ��ü�� stack�� ����. 
		System.out.println("main method : (pa1)"+pa1); // pa1�� pa�� �ٸ� �ּҸ� ���� ���̴�.
		//�ּҸ� ����
		pa.test(pa);//@139a55�� �ִ� test()�� �ҷ��� ���̴�. @139a55�� �ִ� i�� print�ȴ�.
		pa1.test(pa1); //�޼ҵ�� ������ �ּҴ� �ٸ���.@1db9742�� �ִ� i�� print�ȴ�.
	}//main

}//class
