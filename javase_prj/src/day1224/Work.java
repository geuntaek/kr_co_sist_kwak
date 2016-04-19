package day1224;

/**
 * 입력된 주민등록번호를 사용하여 연산
 * @author user
 */
public class Work {
	private String ssn; // 밖에서 들어오지 못하게 주민번호를 만든다.
	
	/**
	 * 임시 주민번호인 930927-2222222을 가지고 동작을 검증할 때 사용  
	 */
	public Work(){//기본생성자
		this("151515-5151515");
	}//Work
	
	/**
	 * 입력받은 주민번호로 유효성 검증과 연산
	 * @param ssn
	 */
	public Work(String ssn){
		this.ssn = ssn; // 지역변수와 인스턴스변수를 구분하기 위해 this를 씀
	}//Work
	
	public String getSssn(){//인스턴스변수의 값을 반환하는 getter
		return ssn;
	}
	
	
	
	/**
	 * 주민번호의 성별부분(-바로 뒷자리)을 구하는 일
	 * @return 성별 부분의 수
	 */
	private int genderFlag(){ // 밖에서 볼 수 없다.
		int temp = ssn.charAt(7)-48; // '1'의 코드값이 49 '2'의 코드값은 50
		return temp; // 성별에 대한 숫자가 반환
	}//genderFlag
	
	/**
	 * 주민번호의 전체길이가 14자리인지 확인
	 * @return true-14자리, false-14자리가 아닌경우
	 */
	public boolean checkLength(){
		boolean flag = false;
		if(ssn.length() == 14){
			flag = true;
		}//end if
		return flag;
	}//checkLength
	
	/**
	 * 주민번호의 6번째자리에 "-"이 있는 확인하는일
	 * @return true-올바른자리에 위치 false-없거나 다른위치
	 */
	public boolean checkHyphen(){
		boolean flag = false;
		if(ssn.indexOf("-")==6){
			flag = true;
		}
		return flag;
	}//checkHyphen
	
	
	/**
	 * 입력된 주민번호에서 생년월일을 반환하는 일
	 * 반환형식 xxxx년 xx월 xx일<br>
	 * 성별이 1,2,3,4에 대해서만 처리하고 그 외에는 "처리불가"가 반환된다.
	 * @return 처리된 값
	 */
	public String birth(){
		String result = "처리불가";
		String tempYear = ssn.substring(0,2);
		String tempMonth = ssn.substring(2,4);
		String tempDay = ssn.substring(4,6);
		if(genderFlag()<3){ // 1,2 : 1900
			result = "19"+tempYear+"년 "+tempMonth+"월 "+tempDay+"일";
		}else if(genderFlag()<5){ // 3,4 : 2000
			result = "20"+tempYear+"년 "+tempMonth+"월 "+tempDay+"일";
		}
		return result;
	}//birth
	
	/**
	 * 입력된 주민번호의 나이를 계산하는 일
	 * @return
	 */
	public int age(){
		int age = (genderFlag()<3?1900:2000)+Integer.parseInt((ssn.substring(0,2)));
		age = 2015-age+1;
		return age;
	}//age
	
	/**
	 * 입력된 주민번호를 가지고 성별을 처리하는 일
	 * @return 성별
	 */
	public String gender(){
		String gender = "여자";
		if(genderFlag()%2==1){
			gender = "남자";
		}
		return gender;
	}//gender
	
	/**
	 * 입력된 주민번호의 생년월일을 계산하여 띠를 구하는 일
	 * @return 띠
	 */
	public String zodiac(){
		String tempZodiac="";
		int birthYear = Integer.parseInt(birth().substring(0, 4));
		
		switch ( birthYear % 12) {
		case 0:
			tempZodiac = "원숭이띠";
			break;
		case 1:
			tempZodiac = "닭띠";
			break;
		case 2:
			tempZodiac = "개띠";
			break;
		case 3:
			tempZodiac = "돼지띠";
			break;
		case 4:
			tempZodiac = "쥐띠";
			break;
		case 5:
			tempZodiac = "소띠";
			break;
		case 6:
			tempZodiac = "호랑이띠";
			break;
		case 7:
			tempZodiac = "토끼띠";
			break;
		case 8:
			tempZodiac = "용띠";
			break;
		case 9:
			tempZodiac = "뱀띠";
			break;
		case 10:
			tempZodiac = "말띠";
			break;
		case 11:
			tempZodiac = "양띠";
			break;
		}
		return tempZodiac; 
	}
	
	

}//class

















