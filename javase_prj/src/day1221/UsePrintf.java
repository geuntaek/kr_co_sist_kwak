package day1221;

/**
 *	variable arguments�� ���Ե� ��� method��
 *	System.out.printf()�� System.out.format()�� ���, JDK1.5���ϴ� ���Ұ�
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
		System.out.printf("���� : %d\n", 2015);
		System.out.printf("�Ǽ� : %f\n", 2015.12);
		System.out.printf("�Ǽ� : %.2f\n", 2015.12);
		System.out.printf("���� : %c\n", 'A');
		System.out.printf("���ڿ� : %s\n", "������ ������");
		
		//��� �ڸ��� ����, ����� ������ ���� ������ ���� ����
		System.out.printf("[%4d][%-4d]\n", 12,12); 
		System.out.printf("[%.2f][%7.2f][%-7.2f]\n", 3.12345,1.111,1.111111);
		
		int year = 2015, month = 12, day =21;
		char initial = 'A';
		System.out.format("%d�� %d�� %d�� �̴ϼ� %c\n",year,month,day,initial);
		
	}//main
}//class
