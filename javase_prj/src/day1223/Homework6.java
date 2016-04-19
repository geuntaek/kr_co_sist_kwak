package day1223;

public class Homework6 {
	String secretNum;

	public boolean checkMail(String mail) { // 이메일이 유효한지 확인
		System.out.println("숙제1");
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

	// 인자있는 생성자
	public Homework6(String secretNum) {
		this.secretNum = secretNum; // 이름이 같은 인스턴스변수와 지역변수를 구분해주기 위해서 this를 사용
	}//Homework6

	// 2-1, 주민번호 14자리 확인
	public boolean checkLength() {
		if (secretNum.length() == 14) {
			return true;
		} else {
			return false;
		}
	}//boolean Homework6

	// 2-2, 주민번호에 "-" 존재하는지 확인
	public boolean checkSecretNum() {
		if (secretNum.indexOf("-") == 6) {
			return true;
		}
		return false;
	}//checkSecretNum

	// 2-3, 8번째자리가 1,2,3,4가 아닌건 처리불가. 1,2,3,4라면 생일을 반환
	public String printBirth() {
		if (secretNum.charAt(7) == '3' || secretNum.charAt(7) == '4') {
			return "20" + secretNum.substring(0, 2) + "년 " + secretNum.substring(2, 4) + "월 "
					+ secretNum.substring(4, 6) + "일";
		} else if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '2') {
			return "19" + secretNum.substring(0, 2) + "년 " + secretNum.substring(2, 4) + "월 "
					+ secretNum.substring(4, 6) + "일";
		} else {
			return "처리불가";
		}
	}//printBirth

	// 2-4, 나이를 계산해 정수형으로 반환
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

	// 2-5, 성별을 반환
	public String gender() {
		if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '3') {
			return "남자";
		} else {
			return "여자";
		}
	}//gender
	

	// 2-6, 띠를 반환
	public String animal() {
		String year; // 문자열형 년도를 저장할 변수
		String zodiacSign = null; // 띠를 저장할 변수

		if (secretNum.charAt(7) == '1' || secretNum.charAt(7) == '2') {
			year = "19" + secretNum.substring(0, 2);
		} else {
			year = "20" + secretNum.substring(0, 2);
		}

		switch ((Integer.parseInt(year)) % 12) {
		case 0:
			zodiacSign = "원숭이띠";
			break;
		case 1:
			zodiacSign = "닭띠";
			break;
		case 2:
			zodiacSign = "개띠";
			break;
		case 3:
			zodiacSign = "돼지띠";
			break;
		case 4:
			zodiacSign = "쥐띠";
			break;
		case 5:
			zodiacSign = "소띠";
			break;
		case 6:
			zodiacSign = "호랑이띠";
			break;
		case 7:
			zodiacSign = "토끼띠";
			break;
		case 8:
			zodiacSign = "용띠";
			break;
		case 9:
			zodiacSign = "뱀띠";
			break;
		case 10:
			zodiacSign = "말띠";
			break;
		case 11:
			zodiacSign = "양띠";
			break;
		}
		return zodiacSign;
	}//animal

	public static void main(String[] args) {
		Homework6 hw = new Homework6("941116-1345678");
		System.out.println(hw.checkMail("chi189@naver.com")); // 메일 확인

		System.out.println("\n숙제2");
		if (hw.checkLength()) { // 2-1
			System.out.println("주민번호 14자리 " + hw.checkLength());

			if (hw.checkSecretNum()) {

				System.out.println("주민번호 형식 " + hw.checkSecretNum());

				if (hw.printBirth().equals("처리불가")) {

					System.out.println(hw.printBirth());

				} else {

					System.out.println("생일은 " + hw.printBirth());
					System.out.println("나이는 " + hw.age());
					System.out.println("성별은 " + hw.gender());
					System.out.println("띠는 " + hw.animal());
				}

			} else {// 주민번호 형식 틀리다면

				System.out.println("주민번호 형식 " + hw.checkSecretNum());
			}
		} else {

			System.out.println("14자리 " + hw.checkLength());
		}
	}// main
}// class
