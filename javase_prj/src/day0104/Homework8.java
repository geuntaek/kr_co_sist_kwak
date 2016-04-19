package day0104;

import static java.lang.System.out;

public class Homework8 {
	
	/*private Homework8 hw;
	
	public Homework8() { // 생성자
		hw = new Homework8();
	}*/
	/*test*/
	/**
	 * flag(기준변수)를 사용하여 임시비밀번호를 생성한 후 반환하는 일
	 * @return
	 */
	public char[] password() { // 패스워드 생성
		char[] passArr = new char[8]; // 비밀번호 8자리 배열
		int flag = 0;
		for (int i = 0; i < passArr.length; i++) {
			flag = (int) (Math.random() * 123); // 0~122
			if( (flag>47 && flag<58) ||(flag>64 && flag<91)||(flag>96 && flag<123) ){
				passArr[i] = (char) (flag);
			}else{
				i--;
			}
			
			/*cnt = (int) (Math.random() * 3);
			if (cnt == 0) { // 대문자
				passArr[i] = (char) ((Math.random() * 26) + 65);
			} else if (cnt == 1) { // 소문자
				passArr[i] = (char) ((Math.random() * 26) + 97);
			} else { // 0~9
				passArr[i] = (char) ((Math.random() * 10) + 48);
			}*/
			
		} // end for
		return passArr;
	}// password

	public int[] lotto() { // 로또 생성
		int[] lottoArr = new int[6]; // 로또 6자리 배열
		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = (int) ((Math.random() * 45) + 1); // 1~45
			
			for (int j = 0; j < i; j++) {
				if (lottoArr[i] == lottoArr[j]) { // 중복체크
					i--;
					break;
				}
			}// end for
			
		} // end for
		return lottoArr;
	}// lotto
	
	private void viewPass1(){ // 이 클래스 안에서만 사용할거기때문에 private
		Homework8 hw = new Homework8();
		char[] pass = hw.password();
		
		out.printf("비밀번호 : ");
		for (int i = 0; i < pass.length; i++) {
			out.print(pass[i]);
		}
		/*
		for (char temp : pass) { 
			out.print(temp);
		} // end for
		 */
	}// viewPass
	
	private void viewPass2(){ // 이 클래스 안에서만 사용할거기때문에 private
		Homework8 hw = new Homework8();
		int[] lotto = hw.lotto();
		
		out.printf("\n로또번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			out.printf("%d\t",lotto[i]);
		}// end for
	}// viewPass
	
	public static void main(String[] args) {
		
		Homework8 hw = new Homework8();
		hw.viewPass1();
		hw.viewPass2();
	}// main

}// class