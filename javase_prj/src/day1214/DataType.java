package day1214;
/**
	�ۼ��� : 12-14-2015
	�ۼ��� : �̼���
	���� : �⺻�� ���������� ���� ������� ���
**/
class DataType{
	public static void main(String[] args) {
		//������ : byte, short, int, long
		byte a=10;
		short b=20;
		int c=30;
		long d=40; // 40�� int ���� ���̱� ������ ����� ����
		long e=21474836498L; // �����߻�, ����� �ʼ�, ���ͷ��� ũ�⸦ 8����Ʈ�� ����
		System.out.println("byte : "+a+" short : "+b+" int : "+c+" long : "+d+" long : "+e);
		////////////////////������////////////////////
		// unicode �� (2byte) �� �Ҵ�ȴ�.
		char f = 'A';
		char g = '��';
		char h = '1';
		char i = 97; // code�� ���� �Ҵ� ����, ���ڷ� ����
		System.out.println("f : "+f+" g : "+g+" h : "+h+" i : "+i);
		////////////////////�Ǽ���////////////////////
		float j = 3.14f; // ����� ������Ѵ�.
		double k = 3.14;
		double l = 3.14D;
		System.out.println("j : "+j+" k : "+k+" l : "+l);
		////////////////////�Ҹ���////////////////////
		boolean m = true;
		boolean n = false;
		System.out.println("m : "+m+" n : "+n);
	}//main
}//class
