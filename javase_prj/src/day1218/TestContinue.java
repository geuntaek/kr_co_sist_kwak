package day1218;

/**
 *	�ݺ����� ������ �ǳ� �ٴ� continue�� ���
 * @author user
 */
public class TestContinue {
	public static void main(String[] args) {
		//1~100���� ¦���� ���
		for (int i = 1; i < 101; i++) {
			if(i%2==1){
				continue;
			}//end if
			System.out.print(i+" ");
		}//end for
	}//main
}//class







