package day1217;

/**
 *	for�� �ȿ� for���� ���� ���� for�� ���
 *	�ٱ�for�� �ѹ� ����� �� ���� for�� ��� ����Ǵ���?	 
 * @author user
 */
public class TestFor1 {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 5; i++) {
			// ���� for����
			System.out.println("����");
			for (int j = 0; j < 6; j++) {
				System.out.print("i = "+i+" j = "+j+" ");
			}
			System.out.println("��");
			// ���� for����
		}
		*/
		// ������
		for (int i = 2; i < 10; i++) { // ��
			System.out.println("["+i+"] �� ����");
			for (int j = 1; j < 10; j++) { // ��
				System.out.print(i+" * "+j+" = "+i*j+"         ");
			}
			System.out.println();
			System.out.println("["+i+"] �� ��\n");
		}//end for
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}//end for
		
	}// main
}//class















