package day1217;

public class Homework3 {
	public static final int BUS_COST = 1200;
	public static final int SW_COST = 1250;
	public static final int MBUS_COST = 900;

	public static void main(String[] args) {
		// ����1
		System.out.println("����1");
		if (args[0].equals("����")) {
			System.out.println("�Է��Ͻ� ������� [" + args[0] + "], " + "������ " + BUS_COST + ", �պ����� " + BUS_COST * 2
					+ ", �Ѵ� 20�� ���� " + BUS_COST * 40 + "�Դϴ�.");
		} else if (args[0].equals("����ö")) {
			System.out.println("�Է��Ͻ� ������� [" + args[0] + "], " + "������ " + SW_COST + ", �պ����� " + SW_COST * 2
					+ ", �Ѵ� 20�� ���� " + SW_COST * 40 + "�Դϴ�.");
		} else if (args[0].equals("��������")) {
			System.out.println("�Է��Ͻ� ������� [" + args[0] + "], " + "������ " + MBUS_COST + ", �պ����� " + MBUS_COST * 2
					+ ", �Ѵ� 20�� ���� " + MBUS_COST * 40 + "�Դϴ�.");
		} else {
			System.out.println("Ȳ��");
		}

		// ����2
		System.out.println("\n����2");
		int score = Integer.parseInt(args[1]);
		if (score <= 100 && score >= 60) {
			System.out.println(score + "�� �հ�");
		} else if (score >= 40) {
			System.out.println(score + "�� �ٸ����� ����");
		} else if (score >= 0) {
			System.out.println(score + "�� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}
