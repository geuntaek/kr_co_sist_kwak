package day1228;

/**
 * 행마다 열의 수가 다른 가변배열의 사용
 * @author user
 */
public class UseVariableArray {
	
	public UseVariableArray(){
		int[][] arr = null;
		arr = new int[4][]; // 열의 갯수를 설정하지 않는다.
		// 행마다 열생성
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[]{1,2,3,4,5,6}; // 초기화
		arr[3] = new int[1];
		
		System.out.println("행의 수 : "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]의 수 : %d\n",i,j,arr[i].length);
			}
		}
		
		
	}
	public static void main(String[] args) {
		new UseVariableArray();
	}

}
