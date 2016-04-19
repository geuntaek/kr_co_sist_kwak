package day1229;

/**
 * 사람 클래스를 상속받아 만드는 클래스<br>
 * 사람의 공통특징은 Person에서 가져다 사용하고 홍길동의 특징인 싸움을하는 코드만 정의 한 클래스
 * @author user
 */
public class HongGilDong extends Person{
	
	private int level; // 싸움 레벨 
	
	/**
	 * 홍길동이 태어날 때 사용하는 기본생성자<br>
	 * 홍길동의 싸움 level은 6이다.<br> 
	 * 단, 싸움 level은 10이 만렙이다.
	 */
	public HongGilDong(){
		level=6; 
	}//HongGilDong
	
	/**
	 * 싸우는 일을 하는 method
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움의 결과
	 */
	public String Fight(int yourLevel){ // 상대방의 레벨이 들어온다.
		String result = "";
		if(level<yourLevel){ // 홍길동이 지는 경우
			result = "졌다.OTL";
			level--;
		}else if(level>yourLevel){ // 홍길동이 이기는 경우
			result = "이겼다.s('.^)V";
			level++;
		}else{ // 비긴 경우
			result = "비겼다.(ㅡㅡ^)";
		}// end else
		return result;
	}
	
	///////////////////////// 12-30-2015 코드추가 /////////////////////////
	//Person에서 제공하는 eat method 중 외부에서 사먹는 일을 하는 method가 현재 객체와 맞지 않는다
	@Override
	public String eat(String menu,int price){
		return getName()+"이(가) 주막에서 "+menu+"(이)라는 음식을 "+price+"냥 내고 사먹는다.";
	}
	
	
	
}











