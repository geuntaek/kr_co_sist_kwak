package day1228;

/**
 * 
 * @author user
 */
public class UseArray2 {
	
	public static final int JAVA=0;

	public UseArray2() {
		// 1.���� : ��������[][]]�迭�� = null;
		int[][] arr = null;
		// 2.���� : �迭�� = new ��������[���� ��][���� ��];
		arr = new int[2][3];
		// 1+2
		int[][] arr1 = new int[4][10];
		System.out.println(arr + " " + arr1); // ���������������̱⶧���� �ּҸ� ���´�.

		System.out.println("arr�� ���� ��" + arr.length);
		System.out.println("arr1�� ���� ��" + arr1.length);

		System.out.println("arr[0]���� ���� ��" + arr[0].length);
		System.out.println("arr1[0]���� ���� ��" + arr1[0].length);
		// 3.���Ҵ� : �迭��[���� ��ȣ][���� ��ȣ]=��;
		arr[0][0] = 10;
		arr[1][2] = 100;
		// 4.����� : �迭��[���� ��ȣ][���� ��ȣ];
		System.out.println(arr[0][0] + " " + arr[0][1]);
		// ������ �� ���
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
		// }
		// System.out.println();
		// }//end for
		// ������ for
		for (int[] temp_arr : arr) {
			for (int value : temp_arr) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}// UseArray2

	public void processScore() {
		// �� �л��� ������ ������ ������ �迭
		int[][] score = { { 89, 71, 90 }, { 74, 79, 80 }, { 66, 61, 70 }, { 95, 86, 99 }, { 50, 78, 92 } };
		String[] names = "������,����ȣ,����õ,���ؼ�,��â��".split(","); // �л��� �̸��� ������ ������ �迭
		int sum = 0; // �� �л��� ������ ������ ����
		float avg = 0.0f; // ��

		int max_sum = 0; // 1�� �л��� ����
		String top_name = ""; // 1�� �л��� �̸�
		int num = 0; // 1�� �л��� ��ȣ
		int[] top_score = new int[score[0].length]; // 1�� �л��� ������ ������ 1���� �迭

		System.out.printf("�����ο� %d��\n", score.length);
		System.out.println("��ȣ\t�̸�\tJAVA\tOracle\tJSP\t����\t���");
		System.out.println("====================================================");

		// �� �л��� ������ ��� ���ϱ�
		for (int i = 0; i < score.length; i++) { // ��
			System.out.printf("%d\t%s\t", i + 1, names[i]);

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				sum += score[i][j];
			} // end for

			avg = (float) sum / score[i].length;
			System.out.printf("%d��\t%.2f\n", sum, avg);

			// ������ ���� ���� ����� ���ϱ�
			if (sum > max_sum) {
				max_sum = sum;
				top_name = names[i];
				num = i; // 1�� �л��� ��ȣ
			} // end if

			sum = 0; // �ʱ�ȭ
			avg = .0f;
		} // end for

		System.out.println("----------------------------------------------------");
		
		int[] total = new int[score[0].length]; // �� ������ ���� ����
		float[] allAvg = new float[score[0].length]; // �� ������ ��� ����
		
		// java�� �ְ����� ������ ����
		int max_java = 0;
		int min_java = 100;

		for (int i = 0; i < score[0].length; i++) { // ��

			for (int j = 0; j < score.length; j++) { // ��
				
				total[i] += score[j][i]; 
				
				switch (i) { // java�� ���� ���� 0
				case JAVA :
					if (score[j][i] > max_java) { // java �ְ���
						max_java = score[j][i];
					}
					if (score[j][i] < min_java) { // java ������
						min_java = score[j][i];
					}
				} // end if
			} // end for
			
			allAvg[i] = (float)total[i]/score.length;
		} // end for
		
		// �� ���� ���� ���
		System.out.printf("\t����\t");
		for (int totaltemp: total) {
			System.out.printf(totaltemp + "\t");
		} 
		
		// �� ���� ��� ���
		System.out.printf("\n\t���\t");
		for (int i = 0; i < allAvg.length; i++) {
			System.out.printf("%.2f\t",allAvg[i]);;
		}
		
		System.out.println("\n----------------------------------------------------");

		// java������ �ְ����� ������ ���
		System.out.printf("�ڹ� ���� �ְ� [%d] ���� [%d]\n", max_java, min_java);
		System.out.println("----------------------------------------------------");

		// 1�� �л��� ��ȣ�� �̸��� ���
		System.out.printf("1�� �л��� ��ȣ [%d��] �̸� [%s] ���� [%d]\n", num + 1, top_name, max_sum);

		// 1�� �л��� ������ top_score �迭�� ����
		for (int i = num; i < num + 1; i++) {
			for (int j = 0; j < score[num].length; j++) {
				top_score[j] = score[i][j];
			}
		} // end for

		System.out.println("1�� �л��� ���� ������ ���� ��");
		for (int sort : top_score) {
			System.out.printf(sort + "\t");
		} // end for

		// top_score �迭�� ������ ������������ ����
		int temp = 0;
		for (int i = 0; i < top_score.length; i++) { 

			if (i != top_score.length - 1) {

				if (top_score[i] > top_score[i + 1]) {
					temp = top_score[i];
					top_score[i] = top_score[i + 1];
					top_score[i + 1] = temp;
				} // end if

				temp = 0; // �ʱ�ȭ
			} // end if
		} // end for

		System.out.println("\n1�� �л��� ���� ������ ���� ��");
		for (int sort : top_score) {
			System.out.printf(sort + "\t");
		} // end for

	}// processScore

	public static void main(String[] args) {
		UseArray2 ua2 = new UseArray2();
		System.out.println("----------------------------------------------------");
		ua2.processScore();
	}// main

}// class
