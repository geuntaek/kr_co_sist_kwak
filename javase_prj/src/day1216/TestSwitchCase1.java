package day1216;
/*******************************************
	switch~case를 이용한 학점 구하기
*******************************************/
class TestSwitchCase1 {
	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		char grade = 64;
		switch(score/10){
			case GRADE_D : grade ++;
			case GRADE_C : grade ++;
			case GRADE_B : grade ++;
			case GRADE_A :
			case GRADE_A_PLUS : grade ++; break;
			default : grade +=6;
			/* break를 많이 사용해서 처리한 것.
			case GRADE_A_PLUS:
			case GRADE_A: grade = 'A'; break;
			case GRADE_B: grade = 'B'; break;
			case GRADE_C: grade = 'C'; break;
			case GRADE_D: grade = 'D'; break;
			default : grade = 'F';*/
		}
		System.out.println("\n점수는 "+score+", 학점은 "+grade);
	}
}
