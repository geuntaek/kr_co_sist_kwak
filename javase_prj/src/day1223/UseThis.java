package day1223;

/**
 * ��ü�� ������ ���Ŀ����� ����� �� �ִ� this�� ����<br>
 * heap�� ����Ѵٴ� �ǹ�.<br>
 * static ���������� ����� �� ����.<br>
 * this�� method�� ȣ���ϴ� ��ü�� �ּҷ� ����ȴ�.<br>
 * @author user
 */
public class UseThis {
	int i; // �ν��Ͻ��� i
	public void test(int i){ // stack�� i
		System.out.println("test =====> "+this); // test�� �θ��� ��ü�� �ּҰ� ��µȴ�.
//		i=i; // �� �ڵ带 �����غ��� �ƹ� ȿ���� ���ٴ� ��� ���.
		this.i=i;
	}
	
	public static void test(){
		// main���� ȣ�� ����� Ŭ������.method��();
		// � ��ü�� ȣ������ �𸣱⶧���� this�� ����� �� ����.
	}
	
	public static void main(String[] args) {
		UseThis ut = new UseThis();
		System.out.println("main =====> "+ut); // ut�� �ּҰ� ��µȴ�.
		ut.test(12); // ut�� test method�� ȣ��
		UseThis ut1 = new UseThis();
		System.out.println("main =====> "+ut1); // ut1�� �ּҰ� ��µȴ�.
		ut1.test(120); // ut1�� test method�� ȣ��
		
		System.out.println("ut.i = "+ut.i);
		System.out.println("ut1.i = "+ut1.i);
//		System.out.println(this); // ���� ����. ���Ұ� ���θ޼ҵ带 �θ��� �ν��Ͻ��� ���⶧����..
	}//main
}//class


