package day1215;
/*
	����(����)������
	���ǽ� ? ��1 : ��2
	������ ���ǽ��� TURE�� ��ȯ�ϸ� ��1�� ��ȯ, FALSE�� ��ȯ�ϸ� ��2�� ��ȯ.
*/
class Operator5 {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(num+"�� "+((num>=0) ?"����Դϴ�" : "�����Դϴ�"));
		// ������ ���� 0�̸� 5�� ����ϰ� �׷��� ������ �������� 10�� ���� ���� ���
		System.out.println(num+" -> "+(num==0 ? "5" : num*10));
	}// main
}// class
