package day1216;
/*****************************************************************
	������ ���ϴ� switch~case, ������ ���� �ʱ⶧����
	ũ���۴ٸ� ����������.
*****************************************************************/
class TestSwitchCase {
	public static final int ZERO=0;
	public static void main(String[] args) {
		int i = 0;
		switch(i){
			case ZERO : 
				System.out.println("�ȳ�"); break;
			case 1 : 
				System.out.println("�ڹ�"); break;
			case 2 : 
				System.out.println("������"); break;
			default :
				System.out.println("�ش� ��� ����");
		}
/*
		// �������ϱ�, 100~90 A 89~80 B ... 59~0 F
		int score =73;
		char grade = ' ';
		System.out.print("\n������ "+score+", ������ ");
		switch(score/10){
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade = 'F';
		}
		System.out.println(grade); 
*/
	}
}
