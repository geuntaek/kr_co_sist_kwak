package day1218;

/**
 *	���۰� ���� �� �� ����ϴ� �ݺ��� while, do~while�� ����
 *	while(���ǽ�){
 *		�ݺ����๮��;
 *	}
 *	�ּ� 0�� ���� �ִ� ���Ǳ��� ����
 *
 *	do{ 
 *		�ݺ����๮��;
 *	}while(���ǽ�); 
 *	�ּ� 1�� ���� �ִ� ���Ǳ��� ����
 * @author user
 */
public class TestWhile {
	public static void main(String[] args) {
		System.out.println("------------------while-----------------");
		int i = 0;
		while(i<10){
			System.out.print(i+" "); // �ݺ��� ���๮
			i++; // �������� ������ ��� 0�� ��µȴ�. -> ���ѷ���
			//break; // �극��ũ�� ������ while���� ����������.
		}//end while
		
		System.out.println("\n---------------do while-----------------");
		int j = 0;
		do{
			System.out.print(j+" ");
			j++;
		}while(j<10);
		// while�� ������ 5��
		System.out.println("\n\n5��");
		j=1;
		while(j<10){
			System.out.print(j+" * 5 = "+j*5+"     ");
			j++;
		}
	}//main
}//class


















