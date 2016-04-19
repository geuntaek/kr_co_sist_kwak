package day1218;

/**
 * �ۼ��� �� �ִ� method�� 4���� ����
 * 
 * @author user
 */
public class MethodType {
	// 1. ��ȯ�� ���� �Ű����� ���� ��(���� ��)
	public void typeA() {
		System.out.println("���� ��");
	}

	// 2. ��ȯ�� ����, �Ű����� �ִ� ��(���� ��)
	public void typeB(char c, int i) {
		System.out.println("���� �� :" + c + " " + i);
	}

	// 3. ��ȯ�� �ְ�, �Ű����� ���� �� (���� ��)
	// ��ȯ���� �ִ� �޼ҵ�� �ݵ�� ���� �������ٿ� return ��;�� ������ ���;��Ѵ�.
	public int typeC() {
		return 3;
	}

	// 4. ��ȯ�� �ְ�, �Ű����� �ִ� �� (���� ��)
	public int typeD(char c) {
		return (int) c;
	}

	public static void main(String[] args) {
		MethodType mt = new MethodType();
		for (int i = 0; i < 10; i++) {
			mt.typeA();
			mt.typeB((char) (i + 65), i);// ���� ��
		}
		// mt.typeC();
		System.out.println(mt.typeC());
		int i = mt.typeC() + 1;
		System.out.println("������ : " + i);
		System.out.println(mt.typeD('Z'));
		System.out.println(mt.typeD('T')); // �ԷµǴ� ���� ���� ����� �ٸ��� ���´�.

	}

}
