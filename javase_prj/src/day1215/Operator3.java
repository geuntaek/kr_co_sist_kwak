package day1215;
/*
	<< : ��Ʈ�� �������� �а�, �о ��ĭ�� �׻� 0�� ä��� 
	>> : ��Ʈ�� ���������� �а�, �о ��ĭ�� �ֻ���. 
		  ��ȣ��Ʈ�� ���� ����� 0�� ä��� ������ 1��ġ��� 
	>>>: ��Ʈ�� ���������� �а�, �о ��ĭ�� �׻� 0���� ä��� (����ǥ������ �ʴ´�)
*/

class Operator3 {
	public static void main(String[] args) {
		int num = 12;
		System.out.println(num+"<<2 = "+(num<<2));
		num = 40;
		System.out.println(num+">>1 = "+(num>>1));
		num = 30;
		System.out.println(num+">>>2 = "+(num>>>2));
	}
}
