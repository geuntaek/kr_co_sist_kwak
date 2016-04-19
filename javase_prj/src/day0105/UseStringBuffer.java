package day0105;

/**
 * 긴문자열을 다룰 때 사용하는 StringBuffer와 StringBuilder
 * @author user
 */
public class UseStringBuffer {
	
	private void useStringBuffer(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(2016);
		sb.append(" 성남시의 이익희");
		
		//추가
		sb.insert(9, "자랑");
		sb.delete(8, 11);
		sb.reverse().reverse().append("짜응");
		
//		String str = sb; // 형이 다르기때문에 str에 넣지 못함.
//		String str = sb.toString(); 
		
		System.out.println(sb); //주소가 나오지 않음. 왜? StringBuffer에서 toString()메서드를 Override해서
	}//useStringBuffer
	
	private void useStringBuilder(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(2016);
		sb.append(" 성남시의 이익희");

		sb.insert(9, "자랑");
		sb.delete(8, 11);
		sb.reverse().reverse().append("짜응");

//		String str = sb.toString(); 
		
		System.out.println(sb); 
	}//useStringBilder
	
	
	public static void main(String[] args) {
		UseStringBuffer usb = new UseStringBuffer();
		usb.useStringBuffer();
		System.out.println("----------------------------------------");
		usb.useStringBuilder();
	}//main

}//class
