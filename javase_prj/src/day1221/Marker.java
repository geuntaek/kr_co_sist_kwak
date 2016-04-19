package day1221;

/**
 *	마카펜을 대상으로 하여 작성하는 클래스 <br>
 *	명사적인 특징은 뚜껑, 몸체, 색 <br> 
 *	동사적인 특징은 쓴다. <br>
 *	일반적인 객체화 문법을 사용하여 객체를 생성한다.
 *  Marker m = new Marker();
 * @author user
 */
public class Marker {
	private String color; // 색 저장용 변수
	private int cap, body; // 뚜껑, 몸체 저장용 변수
	
	/////// 12-22-2015 생성자 코드 추가 시작 ///////
	/**
	 * 뚜껑한개,몸체한개,검은색인 마카펜을 생성할 때 사용하는 생성자
	 */
	public Marker(){
		/////// 12-23-2015 생성자를 호출하는 this()를 학습한 후 추가
		this(1,1,"검은"); // 생산성을 향상시킴
		/*
		color = "검은";
		cap = 1;
		body = 1;
		System.out.print("기본생성자   ");
		System.out.println("뚜껑"+cap+"개, 몸체는 "+body+"개, 색깔은 "+color+"색인 마카펜 생성");
		*/
	}//Marker
	
	/**
	 * 입력받는 값을 가지고 마카펜을 생성할 때
	 * 뚜껑, 몸체는 같은 수로 1~100개 까지만 설정이 가능하다.<br>
	 * 해당 수량이 아니라면 1로 설정된다.
	 * 색은 검은색,빨간색,파란색이 아니라면 검은색으로 설정이 된다.
	 * 사용예) Marker 객체명 = new Marker(뚜껑,본체,색);
	 * @param cap 설정할 뚜껑의 수
	 * @param body 설정할 몸체의 수
	 * @param color 설정할 색깔
	 */
	public Marker(int cap, int body, String color){
		
		if(cap!=body){ // 뚜껑과 몸체의 개수가 맞지 않다면
			cap=1;
			body=1;
		}//end if
		if(!(cap>0&&cap<101)){
			cap=1;
			body=1;
		}//end if
		if(!(color.equals("검은")||color.equals("빨간")||color.equals("파란"))){
			color = "검은";
		}//end if
		this.cap = cap;
		this.body = body;
		this.color = color;
		System.out.print("인자있는생성자   ");
		System.out.println("뚜껑"+cap+"개, 몸체는 "+body+"개, 색깔은 "+color+"색인 마카펜 생성");			
	}
	
	/////// 12-22-2015 생성자 코드 추가 끝 ///////
	
	//set은 인스턴스 변수에 값을 넣을때 get은 값을 반환하는거 
	/**
	 * 	생성된 마카펜 객체에 색을 설정하는일
	 * @param color : 설정할 색
	 */
	public void setColor(String color){
		this.color = color; // 입력한 color를 private String color라는 변수에 넣어줘야하니깐 this를 써주는건다.  
	}//setColor
	/**
	 * 	생성된 마카펜 객체가 가지고 있는 색을 반환하는일
	 * @return 마카펜 색깔
	 */
	public String getColor(){
		return color; // 인스턴스 변수의 값이 반환 될 것이다.
	}//getColor
	
	/**
	 * 	생성된 마카펜 객체의 뚜껑의 갯수를 설정하는일
	 * @param cap : 설정할 뚜껑의 수
	 */
	public void setCap(int cap){
		this.cap = cap;
	}//setCap
	/**
	 * 	생성된 마카펜 객체에 설정된 뚜껑의 수를 얻는 일
	 * @return 뚜껑의 수
	 */
	public int getCap(){
		return cap;
	}//getCap
	
	/**
	 * 	생성된 마카펜의 몸체의 수를 설정하는 일
	 * @param body : 설정할 몸체의 수
	 */
	public void setBody(int body){
		this.body = body;
	}//setBody
	/**
	 * 	생성된 마카펜 객체에 설정된 몸체의 수를 얻는 일
	 * @return
	 */
	public int getBody(){
		return body;
	}//getBody
	
	/**
	 * 	입력된 메세지를 칠판에 쓰는 일
	 * @param msg 칠판에 기록할 메세지
	 * @return
	 */
	public String write(String msg){
		return "칠판에 "+color+"색 마카펜으로\""+msg+"\" 를 쓴다\n"; // 입력되는 메세지를 반환. 
	}//write
	/**
	 * 	원 소유자가 아닌 다른 사람이 마카펜을 사용하는 경우의 처리
	 * @param msg 칠판에 기록할 메세제
	 * @param writer 작성자
	 * @return 행동
	 */
	public String write(String msg, String writer){
		return writer+ "이(가) 칠판에 "+color+"색 마카펜으로\""+msg+"\" 를 쓴다\n"; // 입력되는 메세지를 반환. 
	}
}//class





