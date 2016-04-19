package day1230;

/**
 * 사람 클래스를 부모로 하여 생성한 Clark 클래스<br>
 * 힘이 세다 (최고값은 10)
 * 
 * // 12-30-2015 상속을 못하게 막는 (자식클래스를 가질 수 없는) 클래스로 변환하는 코드 추가
 *	  클래스의 접근지정자에 final을 추가한다. 
 * 
 * 
 * 01-04-2016 Fly 인터페이스의 구현
 * @author user
 */
public final class Clark extends Person implements Fly{ // 대가 끊긴 clark 클래스. 자식이 생기지 못한다.
	public int power; // 밖에서 값을 변경할 수 있다.
	
	public Clark(){
		power = 10; 
	}//Clark()
	
	/**
	 * 힘이 입력되는 돌에 의해서 변화된다.
	 * @param stone 돌의 종류
	 * @return 입력된 돌에 의한 결과
	 */
	public String power (String stone){
		String result="";
		
		if (stone.equals("다이아몬드")) {
			result = "Thank You";
			power=10;
		} else if(stone.equals("크립토나이트")) {
			result = "OMG";
			power=0;
		}else{
			result = "열받는다.";
			power=11;
		}
		
		return result;
	}
	///////////////////////// 12-30-2015 코드추가 /////////////////////////
	// 먹는 일을 하는 method가 자식에서 사용될때 맞지않기 때문에 자식에 맞도록 Override한다.
	@Override
	public String eat(){
		return getName()+"이(가) 집에서 빵을 먹는다.";
	}
	@Override
	public String eat(String menu,int price){
		return getName()+"이(가) 레스토랑에서 "+menu+"(이)라는 음식을 "+price+"$ 내고 사먹는다.";
	}
	@Override
	public String[] language(){
		String[] lang = "영어,외계어,독일어".split(",");
		
		return lang;
	}
	
	///////////////////////// 01-04-2016 코드추가 /////////////////////////
	@Override
	public String height(){
		return getName()+"이 높게 난다.";
	}
	
	@Override
	public String speed(){
		return getName()+"이 빠르게 난다.";
	}
	
}





