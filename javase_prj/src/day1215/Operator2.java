package day1215;
class Operator2 {
	public static void main(String[] args) {
		int num = 15;
		System.out.println(num+"�� 2���� ������ "+num%2);
		int year = 1993;
		System.out.println(year+"�� 12���� ���� ������ = "+year%12+"\n");

		// << : ��Ʈ�� �������� �а�, �о ��ĭ�� �׻� 0�� ä���
		// >> : ��Ʈ�� ���������� �а�, �о ��ĭ�� �ֻ���.
		//		  ��ȣ��Ʈ�� ���� ����� 0�� ä��� ������ 1��ġ���
		//>>>: ��Ʈ�� ���������� �а�, �о ��ĭ�� �׻� 0���� ä���
		int i = 9;
		System.out.println("9 = "+Integer.toBinaryString(i));
		System.out.println(i+" << 2 = "+(i<<2));
		System.out.println((i<<2)+" = "+Integer.toBinaryString((i<<2))+"\n");

		i = 30;
		System.out.println("30 = "+Integer.toBinaryString(i));
		System.out.println(i+" >> 3 = "+(i>>3));
		System.out.println((i>>3)+" = "+Integer.toBinaryString((i>>3))+"\n");

		i= -1;
		System.out.println("-1 = "+Integer.toBinaryString(i));
		System.out.println(i+" >> 4 = "+(i>>4));
		System.out.println((i>>4)+" = "+Integer.toBinaryString((i>>4))+"\n");

		i = 25;
		System.out.println("25 = "+Integer.toBinaryString(i));
		System.out.println(i+" >>> 2 = "+(i>>>2));
		System.out.println((i>>>2)+" = "+Integer.toBinaryString((i>>>2))+"\n");

		i = -1;
		System.out.println("-1 = "+Integer.toBinaryString(i));
		System.out.println(i+" >>> 1 = "+(i>>>1));
		System.out.println((i>>>1)+" = "+Integer.toBinaryString((i>>>1))+"\n");

	}// main
}// class
