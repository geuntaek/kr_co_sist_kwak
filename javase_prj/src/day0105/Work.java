package day0105;

public class Work {
	
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
		for (int i = 0; i < lottoArr.length; i++) { // ���� �߻� for
			lottoArr[i] = (int) ((Math.random() * 45) + 1); // 1~45
			
			for (int j = 0; j < i; j++) { /// �ߺ�üũ for
				if (lottoArr[i] == lottoArr[j]) { 
					i--;
					break;
				}
			}// end for
			
		} // end for
		return lottoArr;
	}// lotto
	
}//class
