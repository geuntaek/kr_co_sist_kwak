package day1223;

public class Homework6 {
	String secretNum;

	public boolean checkMail(String mail) { // �̸����� ��ȿ���� Ȯ��
		System.out.println("����1");
		if (mail.indexOf("@") < 0 || mail.indexOf(".") < 0) {
			return false;
		} else {
			if (mail.length() > 2) {
				return true;
			} else {
				return false;
			}
		}
	}//checkMail

	// �����ִ� ������
	public Homework6(String secretNum) {
		this.secretNum = secretNum; // �̸��� ���� �ν��Ͻ������� ���������� �������ֱ� ���ؼ� this�� ���
	}//Homework6

	// 2-1, �ֹι�ȣ 14�ڸ� Ȯ��
	public boolean checkLength() {
		if (secretNum.length() == 14) {
			return true;
		} else {
			return false;
		}
	}//boolean Homework6

	// 2-2, �ֹι�ȣ�� "-" �����ϴ��� Ȯ��
	public boolean checkSecretNum() {
		if (secretNum.indexOf("-") == 6) {
			return true;
		}
		return false;
	}//checkSecretNum

	// 2-3, 8��°�ڸ��� 1,2,3,4�� �ƴѰ� ó���Ұ�. 1,2,3,4��� ������ ��ȯ
	public String printBirth() {
		if (secretNum.charAt(7) == '3' || secretNum.charAt(7) == '4') {
			return "20" + secretNum.substring(0, 2) + "�� " + secretNum.substring(2, 4) + "�� "
					+ secretNum.substring(4, 6) + "��";
		} else if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '2') {
			return "19" + secretNum.substring(0, 2) + "�� " + secretNum.substring(2, 4) + "�� "
					+ secretNum.substring(4, 6) + "��";
		} else {
			return "ó���Ұ�";
		}
	}//printBirth

	// 2-4, ���̸� ����� ���������� ��ȯ
	public int age() {
		String year; //
		int age;
		if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '2') {
			year = "19" + secretNum.substring(0, 2);
		} else {
			year = "20" + secretNum.substring(0, 2);
		}
		age = 2015 - (Integer.parseInt(year)) + 1;
		return age;
	}//age

	// 2-5, ������ ��ȯ
	public String gender() {
		if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '3') {
			return "����";
		} else {
			return "����";
		}
	}//gender
	

	// 2-6, �츦 ��ȯ
	public String animal() {
		String year; // ���ڿ��� �⵵�� ������ ����
		String zodiacSign = null; // �츦 ������ ����

		if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '2') {
			year = "19" + secretNum.substring(0, 2);
		} else {
			year = "20" + secretNum.substring(0, 2);
		}

		switch ((Integer.parseInt(year)) % 12) {
		case 0:
			zodiacSign = "�����̶�";
			break;
		case 1:
			zodiacSign = "�߶�";
			break;
		case 2:
			zodiacSign = "����";
			break;
		case 3:
			zodiacSign = "������";
			break;
		case 4:
			zodiacSign = "���";
			break;
		case 5:
			zodiacSign = "�Ҷ�";
			break;
		case 6:
			zodiacSign = "ȣ���̶�";
			break;
		case 7:
			zodiacSign = "�䳢��";
			break;
		case 8:
			zodiacSign = "���";
			break;
		case 9:
			zodiacSign = "���";
			break;
		case 10:
			zodiacSign = "����";
			break;
		case 11:
			zodiacSign = "���";
			break;
		}
		return zodiacSign;
	}//animal

	public static void main(String[] args) {
		Homework6 hw = new Homework6("941116-1345678");
		System.out.println(hw.checkMail("chi189@naver.com")); // ���� Ȯ��

		System.out.println("\n����2");
		if (hw.checkLength()) { // 2-1
			System.out.println("�ֹι�ȣ 14�ڸ� " + hw.checkLength());

			if (hw.checkSecretNum()) {

				System.out.println("�ֹι�ȣ ���� " + hw.checkSecretNum());

				if (hw.printBirth().equals("ó���Ұ�")) {

					System.out.println(hw.printBirth());

				} else {

					System.out.println("������ " + hw.printBirth());
					System.out.println("���̴� " + hw.age());
					System.out.println("������ " + hw.gender());
					System.out.println("��� " + hw.animal());
				}

			} else {// �ֹι�ȣ ���� Ʋ���ٸ�

				System.out.println("�ֹι�ȣ ���� " + hw.checkSecretNum());
			}
		} else {

			System.out.println("14�ڸ� " + hw.checkLength());
		}
	}// main
}// class
