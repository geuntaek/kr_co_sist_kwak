package day1228;

/**
 * ��, ��, ���� �����Ǵ� ������ �迭
 * @author user
 */
public class UseArray3 {
	
	public UseArray3(){
		//1.���� : ��������[][][] �迭�� = null;
		int[][][] arr = null;
		//2.���� : �迭�� = new ��������[��][��][��];
		arr = new int[4][4][5];
		
		System.out.println(arr);
		System.out.println("���� �� : "+arr.length);
		System.out.println("���� �� : "+arr[0].length);
		System.out.println("���� �� : "+arr[0][0].length);
		
		//3.���Ҵ� : �迭��[��][��][��]
		arr[0][0][0] = 10;
		arr[0][1][0] = 20;
		arr[3][3][4] = 200;
//		
		int[][][] arr1={{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
		System.out.println("\n���� �� : "+arr1.length);
		System.out.println("���� �� : "+arr1[0].length);
		System.out.println("���� �� : "+arr1[0][0].length+"\n");
		
//		for (int i = 0; i < arr1.length; i++) { // ��
//			for (int j = 0; j < arr1[i].length; j++) { // ��
//				for (int k = 0; k < arr1[i][j].length; k++) { // ��
//					System.out.printf("arr1[%d][%d][%d] : %d\t",i,j,k,arr1[i][j][k]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		// ���� ������ �迭�� �Ǿ��ִ�.
		for(int[][] arr2 : arr1){
			// ������ �迭�� �� ���� ������ �迭�� �Ǿ��ִ�.
			for(int[] arr3 : arr2){
				// ������ �迭�� ���������� �Ǿ��ִ�.
				for(int value : arr3){
					System.out.printf(value+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new UseArray3();
	}//main

}//class
