package day1217;

/**
 *	JDK 1.5�������� �����Ǵ� ������ for���� ���
 *	for(���� ���� ������ ���� ���� : �迭��|collection�迭){
 		������
 *	}
 * @author user
 */
public class ImprovementFor {
	public static void main(String[] args) {
		int[] arr={10,20,30,400,5000,6000,7000};
		for (int i : arr) { // ������ for��
			System.out.print(i+" ");
		}
		/* ���� for��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
	}//main
}//class
