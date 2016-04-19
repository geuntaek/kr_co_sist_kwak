package day1217;

public class Homework3 {
	public static final int BUS_COST = 1200;
	public static final int SW_COST = 1250;
	public static final int MBUS_COST = 900;

	public static void main(String[] args) {
		// 숙제1
		System.out.println("숙제1");
		if (args[0].equals("버스")) {
			System.out.println("입력하신 교통수단 [" + args[0] + "], " + "편도차비 " + BUS_COST + ", 왕복차비 " + BUS_COST * 2
					+ ", 한달 20일 기준 " + BUS_COST * 40 + "입니다.");
		} else if (args[0].equals("지하철")) {
			System.out.println("입력하신 교통수단 [" + args[0] + "], " + "편도차비 " + SW_COST + ", 왕복차비 " + SW_COST * 2
					+ ", 한달 20일 기준 " + SW_COST * 40 + "입니다.");
		} else if (args[0].equals("마을버스")) {
			System.out.println("입력하신 교통수단 [" + args[0] + "], " + "편도차비 " + MBUS_COST + ", 왕복차비 " + MBUS_COST * 2
					+ ", 한달 20일 기준 " + MBUS_COST * 40 + "입니다.");
		} else {
			System.out.println("황족");
		}

		// 숙제2
		System.out.println("\n숙제2");
		int score = Integer.parseInt(args[1]);
		if (score <= 100 && score >= 60) {
			System.out.println(score + "점 합격");
		} else if (score >= 40) {
			System.out.println(score + "점 다른과목에 의존");
		} else if (score >= 0) {
			System.out.println(score + "점 과락");
		} else {
			System.out.println("점수 오류");
		}
	}
}
