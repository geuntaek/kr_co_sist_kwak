package day0104;

import static java.lang.System.out;

public class Homework8 {
	
	/*private Homework8 hw;
	
	public Homework8() { // ������
		hw = new Homework8();
	}*/
	/*test*/
	/**
	 * flag(���غ���)�� ����Ͽ� �ӽú�й�ȣ�� ������ �� ��ȯ�ϴ� ��
	 * @return
	 */
	public char[] password() { // �н����� ����
		char[] passArr = new char[8]; // ��й�ȣ 8�ڸ� �迭
		int flag = 0;
		for (int i = 0; i < passArr.length; i++) {
			flag = (int) (Math.random() * 123); // 0~122
			if( (flag>47 && flag<58) ||(flag>64 && flag<91)||(flag>96 && flag<123) ){
				passArr[i] = (char) (flag);
			}else{
				i--;
			}
			
			/*cnt = (int) (Math.random() * 3);
			if (cnt == 0) { // �빮��
				passArr[i] = (char) ((Math.random() * 26) + 65);
			} else if (cnt == 1) { // �ҹ���
				passArr[i] = (char) ((Math.random() * 26) + 97);
			} else { // 0~9
				passArr[i] = (char) ((Math.random() * 10) + 48);
			}*/
			
		} // end for
		return passArr;
	}// password

	public int[] lotto() { // �ζ� ����
		int[] lottoArr = new int[6]; // �ζ� 6�ڸ� �迭
		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = (int) ((Math.random() * 45) + 1); // 1~45
			
			for (int j = 0; j < i; j++) {
				if (lottoArr[i] == lottoArr[j]) { // �ߺ�üũ
					i--;
					break;
				}
			}// end for
			
		} // end for
		return lottoArr;
	}// lotto
	
	private void viewPass1(){ // �� Ŭ���� �ȿ����� ����Ұű⶧���� private
		Homework8 hw = new Homework8();
		char[] pass = hw.password();
		
		out.printf("��й�ȣ : ");
		for (int i = 0; i < pass.length; i++) {
			out.print(pass[i]);
		}
		/*
		for (char temp : pass) { 
			out.print(temp);
		} // end for
		 */
	}// viewPass
	
	private void viewPass2(){ // �� Ŭ���� �ȿ����� ����Ұű⶧���� private
		Homework8 hw = new Homework8();
		int[] lotto = hw.lotto();
		
		out.printf("\n�ζǹ�ȣ : ");
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