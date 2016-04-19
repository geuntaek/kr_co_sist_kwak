package day1216;
/*****************************************************************
	정수를 비교하는 switch~case, 조건을 갖지 않기때문에
	크다작다를 비교하지않음.
*****************************************************************/
class TestSwitchCase {
	public static final int ZERO=0;
	public static void main(String[] args) {
		int i = 0;
		switch(i){
			case ZERO : 
				System.out.println("안녕"); break;
			case 1 : 
				System.out.println("자바"); break;
			case 2 : 
				System.out.println("수요일"); break;
			default :
				System.out.println("해당 상수 없음");
		}
/*
		// 학점구하기, 100~90 A 89~80 B ... 59~0 F
		int score =73;
		char grade = ' ';
		System.out.print("\n점수는 "+score+", 학점은 ");
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
