package day1217;

/**
 * 	���۰� ���� �� �� ����ϴ� �ݺ��� for���� ���<br>
 * 	for (�ʱⰪ; ���ǽ�; �����ҽ�) {<br>
 *		�ݺ������� ����<br>	
 * }
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		for(int i=0; i<10;i++){
			System.out.println(i+"�� �ȳ��ϼ���");
		}// end for
		
		// 1~100���� ���ٷ� ����ϴ� �ݺ���
		for(int i=1;i<101;i++){
			System.out.print(i+" ");
		}// end for
		System.out.println("\n");
		
		//1~100���� ¦�� ���
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		/* for (int i = 1; i < 51; i++) {
			System.out.print(i*2+" ");
		}*/
		System.out.println("\n");
		// 1~100���� Ȧ���� ���
		// �������� ������ ���� �����ϰ� ������ �� �ִ� �����ڸ� ����� �� �ִ�.
		// ++,--,�������,����Ʈ����,�Ϲ� �������� �����ڸ� ����� �� �ִ�.
		for (int i = 1; i< 101; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		// 2�� ���
		for (int i = 1; i < 10; i++) {
			System.out.print("2 * "+i +"= "+i*2+" ");
		}
		System.out.println("\n");
		// A~Z���� ���
		for (char c = 65;  c<91;c ++) {
			System.out.print(c+"("+(int)c+")"+" ");
		}
		/*for (int i = 65; i < 65+26; i++) {
			char c = (char)i;
			System.out.print(c+" ");
		}*/
		System.out.println("\n");
		//1~100������ �� (������)
		int sum = 0; // �ʱ�ȭ�� ����� ������ �����ʴ´�. �ʱ�ȭ�� ���ϸ� � ���� ����ִ��� �𸣱⶧���� for���ȿ��� ���ϱ� ������ �����ʴ´�.
		for (int i = 1; i < 101; i++) {
			sum += i; // sum = sum+i
		}
		System.out.println("1~100������ �� = "+sum);
	}// main
}// class


















