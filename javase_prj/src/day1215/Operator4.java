package day1215;
/*
	�� ������
	�Ϲݳ� = �������� ���迬���ڸ� ������ �� ���
	&&(AND) : ���װ� ������ ��� ���� �� ���� ��ȯ
	||(OR) : ���װ� ������ ��� ������ �� ������ ��ȯ
	��Ʈ�� = ��Ʈ����� ���
	& (AND) : ������Ʈ�� ������Ʈ ��� 1�϶��� 1�� ����
	| (OR) :  ������Ʈ�� ������Ʈ ��� 0�϶��� 0����
	^ (XOR) : ������Ʈ�� ������Ʈ ���� �ϳ��� 1�϶� 1����

*/
class Operator4 {
	public static void main(String[] args) {
		/*boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		System.out.println("==========AND===========");
		// ������ FALSE�� ������� �ʰ� FALSE�� ������
		System.out.println(flag1+" && "+flag3+" = "+(flag1&&flag3));
		System.out.println(flag1+" && "+flag2+" = "+(flag1&&flag2));
		System.out.println(flag2+" && "+flag3+" = "+(flag2&&flag3));
		System.out.println(flag2+" && "+flag4+" = "+(flag2&&flag4));
		System.out.println("==========OR===========");
		// ������ TRUE�� ������� �ʰ� TURE�� ������
		System.out.println(flag1+" || "+flag3+" = "+(flag1||flag3));
		System.out.println(flag1+" || "+flag2+" = "+(flag1||flag2));
		System.out.println(flag2+" || "+flag3+" = "+(flag2||flag3));
		System.out.println(flag2+" || "+flag4+" = "+(flag2||flag4)+"\n");

		// ������ ����ִ� ���� 0~10 ���̸� TRUE, �׷��� ������ FALSE�� ���
		int num=10;
		System.out.println((num>=0&&num<=10));
		int num = 5;
		int result = 0;
		System.out.println(num>=0||(result=3)<=10);
		System.out.println(result);*/

		System.out.println("===========��Ʈ��=============");
		int i=19;
		int j=24;
		System.out.println(i+" & "+j+" = "+(i&j));
		System.out.println(i+" | "+j+" = "+(i|j));
		System.out.println(i+" ^ "+j+" = "+(i^j));


	}// main
}// class
