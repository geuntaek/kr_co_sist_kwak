package day1223;

/**
 * method�� �⺻�� ���������� �Ѱ��ָ� ����� ���� �Ѿ��.
 * @author user
 */
public class CallByValue {
	int i,j; // new�� �ɶ� heap�� �ö󰡸鼭 �ڵ� �ʱ�ȭ �ȴ�. �������
			 // heap�� ����, ���α׷��� ������ �������.
	public void swap(int i, int j){ // int i��j �׸��� temp�� stack�� �ö󰡰�,
//									   ȣ���� ������ �������.
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap �� i = "+i+", j = "+j);
	}
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		cbv.i = 2015;
		cbv.j = 12;
		System.out.println("swap �� i = "+cbv.i+", j = "+cbv.j);
		cbv.swap(cbv.i,cbv.j); // �������� ����Ǿ� int i�� j���� ���޵Ǿ� 
//								  �������� �״�� ������ ����. 
		System.out.println("swap �� i = "+cbv.i+", j = "+cbv.j);
	}
}
