package day1217;

/**
 *
 * @author user
 */
public class TestFor2 {
	public static void main(String[] args) {
		//����loop
		for (; ;) {
			System.out.println("�ȳ�");	
			break;
		}//end for
		// ���ѷ��� for�� �ؿ� ���� �ν��� �ȵȴ�. ������ break;�� ���� ���ѷ����� �ǹ̰� �������鼭 ���ٿ� �ڵ带 �� �� �ִ�. 
		
		//�������� ����loop
//		for (int i = 0;; i++) { //i��� ������ break;�� ���� �������� �ʱ⶧���� �����ڵ�� ���ǥ�ð� �ߴ°�
//			System.out.println("����"+i);
//			break;
//		}//end for
		//�ʱⰪ�� ������ ����
		for (int i = 0,j=10; i < 5; i++,j--) {
			System.out.println(i+" "+j);
		}//end for
	}//main
}//class
