package day1214;
/*
	���� : ������ ���ó�� ����ϱ�
			�������� ���̸鼭 ������� ���ƾ��� �� ����ؾ��� �� (���ذ�)
*/
class TestConstant {
	public static final int MAX_SCORE = 100; // �ְ�����
	public static final int MIN_SCORE = 0; // ��������
	
	public static void main(String[] args) {
		// �����, Ŭ������.����� �ΰ����� ����� �� �ִ�.
		System.out.println("�ְ����� : "+MAX_SCORE+", �������� : "+TestConstant.MIN_SCORE);

		//�� �Ҵ� �� ���� �߻�
		//MAX_SCORE=80;
		int my_score = 90;
		System.out.println("�ְ����� : "+TestConstant.MAX_SCORE+", ȹ������ : "+my_score+", ���� ���� : "+(MAX_SCORE-my_score));
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		//���� Ȯ��
		int i = 10;
		int j = 012;
		int k = 0xa;
		System.out.println("i = "+i+" j ="+j+" k= "+k+" i+j+k = "+(i+j+k));
	}//main
}// class
