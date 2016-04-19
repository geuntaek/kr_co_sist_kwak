package day0105;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 하나의 마디로 구분하는 StringTokenizer
 * @author user
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer(){
		String data = "최웅열, 진주용, 최수웅. 조근택, 도윤환~ 이소희";
//		StringTokenizer stk = new StringTokenizer(data); 
//		StringTokenizer stk = new StringTokenizer(data,"~, ."); // 기준문자열로 구분하는 생성자 사용, or기능이 있다.
		 

//		기준문자열로 구분하는 생성자 사용,
//		기준문자열을 토큰으로 취급할지의 여부를 결정하는 생성자 true는 토큰으로 취급, false는 삭제
		StringTokenizer stk = new StringTokenizer(data,",.최",true); // ,.최 는 토큰으로 취급한다. 
		System.out.println("토큰의 수 = "+stk.countTokens());
		/*
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken()); // 있는 수만큼 잘라야한다.
		*/
		
		 while(stk.hasMoreTokens()){ // 토큰이 존재하는지
			 //토큰이 존재한다면 토큰을 얻어온 후 포인터를 이동
			 System.out.println(stk.nextToken());
		 }
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main
}//class
