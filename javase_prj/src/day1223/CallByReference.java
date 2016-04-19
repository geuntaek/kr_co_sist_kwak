package day1223;

/**
 * �ּҸ� �����ϸ� ������ �ϳ��� �ּҰ� �Ѿ��. <br> 
 * ���簡 �Ǿ� �Ѿ�� ���� �ƴ϶� �״�� ������ �ȴ�.
 * @author user
 */
public class CallByReference {
	int i,j; 
	
	// ���������� Ŭ������ �ϸ� �ּҸ� ���� �� �ִ�. ������ ����
	public void swap(CallByReference cbr){ 
		// heap�� �ִ� ���� stack�� �ִ� temp�� �Ѱ��ְ�
		// temp�� �ִ°� heap�� �Ѱ��ְ� �ؼ� swap�� �ϼ�
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap �� i = "+cbr.i+", j = "+cbr.j);
	}// swap
	// �ѹ� ������ �ּҴ� ��� ��������.
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference(); // �ν��Ͻ�ȭ.
		cbr.i = 2015;
		cbr.j = 12;
		System.out.println("swap �� i = "+cbr.i+", j = "+cbr.j);
		cbr.swap(cbr); // ��ü�� �Ѱ��ش�.
//						  main�����ӿ��� swap���������� �ּҰ� ������ �ȴ�.
		System.out.println("swap �� i = "+cbr.i+", j = "+cbr.j);
	}//main
}//class
