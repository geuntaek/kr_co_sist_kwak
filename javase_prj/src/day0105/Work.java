package day0105;

public class Work {
	
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
		for (int i = 0; i < lottoArr.length; i++) { // 난수 발생 for
			lottoArr[i] = (int) ((Math.random() * 45) + 1); // 1~45
			
			for (int j = 0; j < i; j++) { /// 중복체크 for
				if (lottoArr[i] == lottoArr[j]) { 
					i--;
					break;
				}
			}// end for
			
		} // end for
		return lottoArr;
	}// lotto
	
}//class
