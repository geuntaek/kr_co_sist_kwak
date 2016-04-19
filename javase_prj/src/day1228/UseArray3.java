package day1228;

/**
 * 면, 행, 열로 구성되는 삼차원 배열
 * @author user
 */
public class UseArray3 {
	
	public UseArray3(){
		//1.선언 : 데이터형[][][] 배열명 = null;
		int[][][] arr = null;
		//2.생성 : 배열명 = new 데이터형[면][행][열];
		arr = new int[4][4][5];
		
		System.out.println(arr);
		System.out.println("면의 수 : "+arr.length);
		System.out.println("행의 수 : "+arr[0].length);
		System.out.println("열의 수 : "+arr[0][0].length);
		
		//3.값할당 : 배열명[면][행][열]
		arr[0][0][0] = 10;
		arr[0][1][0] = 20;
		arr[3][3][4] = 200;
//		
		int[][][] arr1={{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
		System.out.println("\n면의 수 : "+arr1.length);
		System.out.println("행의 수 : "+arr1[0].length);
		System.out.println("열의 수 : "+arr1[0][0].length+"\n");
		
//		for (int i = 0; i < arr1.length; i++) { // 면
//			for (int j = 0; j < arr1[i].length; j++) { // 행
//				for (int k = 0; k < arr1[i][j].length; k++) { // 열
//					System.out.printf("arr1[%d][%d][%d] : %d\t",i,j,k,arr1[i][j][k]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		// 면은 이차원 배열로 되어있다.
		for(int[][] arr2 : arr1){
			// 이차원 배열의 한 행은 일차원 배열로 되어있다.
			for(int[] arr3 : arr2){
				// 일차원 배열은 단일형으로 되어있다.
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
