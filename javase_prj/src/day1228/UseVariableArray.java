package day1228;

/**
 * �ึ�� ���� ���� �ٸ� �����迭�� ���
 * @author user
 */
public class UseVariableArray {
	
	public UseVariableArray(){
		int[][] arr = null;
		arr = new int[4][]; // ���� ������ �������� �ʴ´�.
		// �ึ�� ������
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[]{1,2,3,4,5,6}; // �ʱ�ȭ
		arr[3] = new int[1];
		
		System.out.println("���� �� : "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]�� �� : %d\n",i,j,arr[i].length);
			}
		}
		
		
	}
	public static void main(String[] args) {
		new UseVariableArray();
	}

}
