package day0111;

import java.util.Random;

/**
 * 예외강제 발생 : throw
 * throw new 예외처리클래스(); 로 기술하고 이 코드가 작성되면 try~catch로 처리하든, throws로 날려서 호출하는 곳에서 처리하든 해야한다.
 * @author user
 */
public class UseThrow {
//	발생된 예외를 최상위로 날리면 어떤 예외가 발생했는지 모른다.
//	public String tobacco() throws Exception{
	
//	발생된 예외를 날려주면(throws)하면 호출하는 곳에서 어떤 문제로 예외가 발생했는지 명확하게 알 수 있다.
	public String tobacco() throws TobaccoException{
		StringBuilder result = new StringBuilder();
		
		// 0 - 초등학생 , 1 - 중등학생, 2 - 고등학생 , 3 - 일반인
		Random random = new Random();
		int grade = random.nextInt(3); // 0~3까지 튀어나온다.
		String[] title = "초딩,중딩,고딩,직장인".split(",");
		
		// 0 일때 예외를 발생시키자.
		if(grade == 0){
			// 예외가 발생되고 throws로 날리면  발생된 예외 다음줄은 수행되지 않는다.
			// 1. 최상위 예외로 처리한 경우 : 어떤 예외가 발생하는지 모른다.
			//throw new Exception("담배예외") ; // 내가 처리하고싶은 예외가 runtimeException이라면 throw new RuntimeException()이라고 하면 된다.
			
			// 2. 사용자 정의 예외로 처리한 경우
			throw new TobaccoException(title[grade]+"들. 담배는 건강에 해로워요"); // 담배로 인한 예외가 생김을 알 수 있다.
		}
		
		result.append(title[grade]).append("님 흡연중 모른척 지나간다");
		
		return result.toString(); // 중간에 예외가 발생하면 return은 안될것이다. // 문자열로 반환하기 위해 toString()을 사용한다.
		
	}// tobacco
	
	
	public static void main(String[] args) {
		UseThrow ut = new UseThrow(); 
//		ut.tobacco(); // try~catch를 처리하지 않아서 에러가 발생
		try {
			String str = ut.tobacco(); // tobacco()는 String을 return하므로 받아야한다.
			System.out.println(str);
//		} catch (Exception e) {
		} catch (TobaccoException e) { // 예외처리클래스로 잡아주고 , 부모예외를 처리한다.
			System.err.println(e.getMessage());
			System.err.println(e);
			e.printStackTrace();
		} finally{ // 반드시 실행되어야 할때
			System.out.println("가야할길을간다.");
		}
		
		
	} // main

} // class
