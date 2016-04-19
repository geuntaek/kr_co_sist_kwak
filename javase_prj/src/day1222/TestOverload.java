package day1222;

/**
 *	�ϳ��� Ŭ������ ���� �̸��� method�� ������ 
 *	�ۼ��� �� �ִ� ����� ������ �� overload�� ���
 *	��Ģ: ����������, ��ȯ��, method���� ���Ը����
 *		 	ȣ��ÿ� ������ �ǵ��� �Ű������� �ٸ��� �����.
 * @author user
 */
public class TestOverload {
	/**
	 * ���� �ϳ� ����ϴ� ��
	 */
	public void printStar(){
		System.out.println("��");
	}
	/**
	 * 	�ԷµǴ� ����ŭ�� ���� ����ϴ� �� : Overload�� �޼ҵ�
	 * @param cnt ��� �� ���� ����
	 */
	public void printStar(int cnt){
		int i = 0;
		while(i<cnt){
			System.out.print("��");
			i++;
		}
		System.out.println();
	}
	/**
	 * �����ϱ� ���� method
	 * @param args
	 */
	public static void main(String[] args) {
		// ��üȭ : Ŭ������ ��ü�� = new Ŭ������();
		TestOverload to = new TestOverload(); // �ν��Ͻ�ȭ�� �ϴ� ������? Ŭ������ heap�� �÷����� ����ϱ� ���ؼ�
		// ���� �̸��� �޼ҵ����� �ٸ� ���� �Ѵ�. �����ε��� ���� ����� �ȴ�.
		to.printStar();
		to.printStar(10);
	}//main
}//class
