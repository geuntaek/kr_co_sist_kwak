package day1216;
/******
	����(��Ȳ)�� ���� ������ �ڵ带 �����ϴ� ���� if�� ���
	if (���ǽ�){
		���ǿ� ���� �� ������ �ڵ�;
	}
******/
class TestIf {
	public static void main(String[] args) {
		// ������ ���� ������ ���� ����� �����ϴ� ��
		int num = Integer.parseInt(args[0]); // ����
		if(num< 0)
			num = -num;
		System.out.println(num);

		// ���ڿ��� ���� ������ �������� ���ؼ��� ���� �� �ִµ� ==, equals�� ���
		// ���ڿ�.equals(���� ���ڿ�)
		//System.out.println(args[1].equals("�ڹ�"));

		// �Էµ� ���ڿ��� '�ڹ�'�� ��쿡�� '�Ϻ��� ��ü ������'�� ���
		System.out.println(args[1]);
		if(args[1].equals("�ڹ�")){
			System.out.println("�Ϻ��� ��ü ���� ���");
		}
		// args[2]�� ����Ͽ� �Էµ� ��(���� ����)�� 0~100������ ���� '��ȿ����'�� ���
		int temp = Integer.parseInt(args[2]);
		if(temp<=100 && temp>=0){
			System.out.println("��ȿ����");
		}

	}//main
}//class
