package day1214;
/*
	���� : ���� ����ȯ�� ���
		    ���� : (�����ҵ�������)���ü
*/
class Casting {
	public static void main(String[] args) {
		
		/*double d = 2015.12; // 8����Ʈ
		int i= 0; // 4����Ʈ
		i = (int)d; // 8����Ʈ�� �Ǽ����� 4 ����Ʈ�� ���������� ����
		System.out.println("���� : "+d+", ��������ȯ�� �� : "+i);;

		float f = (float)3.1415318548543213; // 8����Ʈ�� ������ 4����Ʈ�� ����Ǽ� 4����Ʈ�� �������� �Ҵ�.
		System.out.println(f);*/

		/*char c='A';
		System.out.println((int )c);*/

		// boolean�� ��������ȯ�� �ȵȴ�.
		/*boolean b = true;
		System.out.println((int)b);*/

		// �⺻��<->������������ ��������ȯ�� �ȵȴ�.
		//String s =(String) i; //
		//String s = "13";
		//i=(int)s;
		byte b1 = 12;
		byte b2 = 14;
		byte result = 0;

		result =(byte)(b1+b2);
		System.out.println(result);

	}//main
}//class
