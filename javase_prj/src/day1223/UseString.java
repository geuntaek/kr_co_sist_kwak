package day1223;

/**
 * 짧은 문자열을 다루는 String class의 사용
 * java에서 제공하는 클래스의 이름과 동일한 이름으로 클래스를작성하면 
 * 해당 패키지의 다른 클래스나 작성된 클래스는 사용자가 만든 클래스를 
 * 가장 먼저 참조하여 사용하게 된다. java에서 제공하는 클래스를 식별하여 
 * 사용하고 싶다면 패키지명.클래스명 의 형태로 작성해야한다.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		// 기본형의 사용 (new를 사용하지 않는다.)
		String str = "ABC"; 
		// 참조형의 사용 (new 사용)
		String str1 = new String("ABC");
		System.out.println("기본형 == 비교 "+(str=="ABC"));
		System.out.println("참조형 == 비교 "+(str1=="ABC"));
		
		// 문자열의 비교는 equals를 사용한다.
		System.out.println("기본형 equals 비교 "+str.equals("ABC"));
		System.out.println("참조형 equals 비교 "+str1.equals("ABC"));
		
		String mail = new String("chi189@naver.com"); // 참조형
		String temp = "abcdEFgHi"; // 기본형
		System.out.println(mail+"의 길이 "+mail.length());
		System.out.println(temp+"의 길이 "+temp.length());
		
		System.out.println(temp+"를 모두 대문자로 "+temp.toUpperCase());
		System.out.println(temp+"를 모두 소문자로 "+temp.toLowerCase());
		
		// 인덱스의 시작은 0번부터이다.
		System.out.println(mail+"에서 @의 인덱스는 "+mail.indexOf("@"));
		
		temp = "abcabcabc";
		// indexOf는 왼쪽에서 오른쪽의 방향으로 진행하면서 가장 처음 발견된 문자의 인덱스를 얻는다.
		System.out.println(temp+"에서 처음 b의 인덱스는 "+temp.indexOf("b"));
		System.out.println(temp+"에서 끝 b의 인덱스는 "+temp.lastIndexOf("b"));
		
		// 없는 문자가 찾으려고 한다면 값은 -1이 나온다.
		System.out.println(temp+"에서 d의 인덱스는 "+temp.indexOf("d"));
		
		// 특정인덱스에 해당하는 문자얻기
		System.out.println(mail+"에서 6번째 인덱스의 문자 "+mail.charAt(6));
		
		// 자식문자열 자르기
		temp = "abCdEfg";
		//      0123456 <- String index
		System.out.println(temp+"에서 2~4번째 인덱스에 해당하는 자식 문자열"+temp.substring(2, 4+1));
		
		System.out.println();
		// 이 문자열로 시작했는지
		temp = "서울시 강남구";
		System.out.println(temp.startsWith("서울"));
		System.out.println(temp.startsWith("성남"));
		System.out.println(temp.endsWith("구"));
		System.out.println(temp.endsWith("시"));
		
		//temp = "씨방";
		temp = "씨방새리";
		if(temp.startsWith("씨방")){
			System.out.println("욕은 사용하실 수 없습니다.");
		}else{
			System.out.println(temp);
		}
		
		temp = "나 지금 피씨방인데 넌 어디니 씨 방새야?";
		// 값으로 쓰는 메소드들은 반환형에 따라서 . 으로 계속 연결하여 사용할 수 있다.
		System.out.println(temp.replaceAll("씨", "*").replaceAll("방", "*" ));// 메소드 체인
		
		temp = "   A BC   ";
		System.out.println("["+temp+"] -> ["+temp.trim()+"]"); // temp의 앞뒤 공백을 제거. 단, 중간에 있는 공백은 제거불가
		System.out.println("["+temp+"] -> ["+temp.replaceAll(" ", "")+"]"); // 모든 공백을 제거
		
		int i = 12;
//		temp = i; // 그냥 할당도 안되고 형변환도 안된다.
		temp = i +""; // 문자열에 + 를 사용하여 처리
		System.out.println(temp);
		temp = String.valueOf(i); // temp.valueOf() 해도 괜찮지만 경고가 뜬다.
		System.out.println(temp);
		
	}//main

}//class











