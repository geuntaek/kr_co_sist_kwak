package day1228;

/**
 * 
 * @author user
 */
public class UseArray2 {
	
	public static final int JAVA=0;

	public UseArray2() {
		// 1.선언 : 데이터형[][]]배열명 = null;
		int[][] arr = null;
		// 2.생성 : 배열명 = new 데이터형[행의 수][열의 수];
		arr = new int[2][3];
		// 1+2
		int[][] arr1 = new int[4][10];
		System.out.println(arr + " " + arr1); // 참조형데이터형이기때문에 주소를 갖는다.

		System.out.println("arr의 행의 수" + arr.length);
		System.out.println("arr1의 행의 수" + arr1.length);

		System.out.println("arr[0]행의 열의 수" + arr[0].length);
		System.out.println("arr1[0]행의 열의 수" + arr1[0].length);
		// 3.값할당 : 배열명[행의 번호][열의 번호]=값;
		arr[0][0] = 10;
		arr[1][2] = 100;
		// 4.값사용 : 배열명[행의 번호][열의 번호];
		System.out.println(arr[0][0] + " " + arr[0][1]);
		// 모든방의 값 사용
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
		// }
		// System.out.println();
		// }//end for
		// 개선된 for
		for (int[] temp_arr : arr) {
			for (int value : temp_arr) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}// UseArray2

	public void processScore() {
		// 각 학생의 점수를 저장한 이차원 배열
		int[][] score = { { 89, 71, 90 }, { 74, 79, 80 }, { 66, 61, 70 }, { 95, 86, 99 }, { 50, 78, 92 } };
		String[] names = "김재중,정윤호,박유천,김준수,심창민".split(","); // 학생의 이름을 저장한 일차원 배열
		int sum = 0; // 각 학생의 총점을 저장할 변수
		float avg = 0.0f; // 각

		int max_sum = 0; // 1등 학생의 총점
		String top_name = ""; // 1등 학생의 이름
		int num = 0; // 1등 학생의 번호
		int[] top_score = new int[score[0].length]; // 1등 학생의 점수를 저장할 1차원 배열

		System.out.printf("응시인원 %d명\n", score.length);
		System.out.println("번호\t이름\tJAVA\tOracle\tJSP\t총점\t평균");
		System.out.println("====================================================");

		// 각 학생의 총점과 평균 구하기
		for (int i = 0; i < score.length; i++) { // 행
			System.out.printf("%d\t%s\t", i + 1, names[i]);

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				sum += score[i][j];
			} // end for

			avg = (float) sum / score[i].length;
			System.out.printf("%d점\t%.2f\n", sum, avg);

			// 총점이 제일 높은 사람을 구하기
			if (sum > max_sum) {
				max_sum = sum;
				top_name = names[i];
				num = i; // 1등 학생의 번호
			} // end if

			sum = 0; // 초기화
			avg = .0f;
		} // end for

		System.out.println("----------------------------------------------------");
		
		int[] total = new int[score[0].length]; // 각 과목의 총점 변수
		float[] allAvg = new float[score[0].length]; // 각 과목의 평균 변수
		
		// java의 최고점과 최저점 변수
		int max_java = 0;
		int min_java = 100;

		for (int i = 0; i < score[0].length; i++) { // 행

			for (int j = 0; j < score.length; j++) { // 열
				
				total[i] += score[j][i]; 
				
				switch (i) { // java는 열의 수가 0
				case JAVA :
					if (score[j][i] > max_java) { // java 최고점
						max_java = score[j][i];
					}
					if (score[j][i] < min_java) { // java 최저점
						min_java = score[j][i];
					}
				} // end if
			} // end for
			
			allAvg[i] = (float)total[i]/score.length;
		} // end for
		
		// 각 과목 총점 출력
		System.out.printf("\t총점\t");
		for (int totaltemp: total) {
			System.out.printf(totaltemp + "\t");
		} 
		
		// 각 과목 평균 출력
		System.out.printf("\n\t평균\t");
		for (int i = 0; i < allAvg.length; i++) {
			System.out.printf("%.2f\t",allAvg[i]);;
		}
		
		System.out.println("\n----------------------------------------------------");

		// java점수중 최고점과 최하점 출력
		System.out.printf("자바 점수 최고 [%d] 최하 [%d]\n", max_java, min_java);
		System.out.println("----------------------------------------------------");

		// 1등 학생의 번호와 이름을 출력
		System.out.printf("1등 학생의 번호 [%d번] 이름 [%s] 점수 [%d]\n", num + 1, top_name, max_sum);

		// 1등 학생의 점수를 top_score 배열에 저장
		for (int i = num; i < num + 1; i++) {
			for (int j = 0; j < score[num].length; j++) {
				top_score[j] = score[i][j];
			}
		} // end for

		System.out.println("1등 학생의 점수 내림차 정렬 전");
		for (int sort : top_score) {
			System.out.printf(sort + "\t");
		} // end for

		// top_score 배열의 값들을 오름차순으로 정렬
		int temp = 0;
		for (int i = 0; i < top_score.length; i++) { 

			if (i != top_score.length - 1) {

				if (top_score[i] > top_score[i + 1]) {
					temp = top_score[i];
					top_score[i] = top_score[i + 1];
					top_score[i + 1] = temp;
				} // end if

				temp = 0; // 초기화
			} // end if
		} // end for

		System.out.println("\n1등 학생의 점수 내림차 정렬 후");
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
