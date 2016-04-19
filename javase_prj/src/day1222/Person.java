package day1222;

/**
 * 사람을 추상화(공통특징 추출)하여 만든클래스.<br>
 * 명사적인 특징 : 눈, 코, 입, 이름<br>
 * 동사적인 특징 : 먹는일(Overload)<br>
 * 사람은 일반 클래스의 객체화를 하여 사용한다.<br>
 * ex> Person 객체명 = new Person();<br>
 * 
 * @author user
 */
public class Person {
	private String name; // 이름
	private int nose, eye, mouth; // 눈, 코, 입 저장
	
	/**
	 * 사람객체를 생성 할 때 사용하는 기본생성자<br>
	 * 눈 두개, 코 하나, 입 하나인 사람객체를 생성 
	 */
	public Person(){
		/////// 12-23-2015 코드 수정
		this(2,1,1);
		
		/*eye = 2;
		nose = 1;
		mouth = 1;
		System.out.println("눈"+eye+"개, 코 "+nose+"개, 입"+mouth+"개 인 사람태어남");*/
	}
	
	/**
	 * 눈 두개, 코 하나, 입 하나가 아닌 사람객체를 생성할 때 사용하는 생성자
	 * @param eye 눈의 수
	 * @param nose 코의 수
	 * @param mouth 입의 수
	 */
	public Person(int eye, int nose, int mouth){
		
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
		System.out.println("\n인자 있는 생성자   눈"+eye+"개, 코 "+nose+"개, 입"+mouth+"개 인 사람태어남");
	}
	
	/**
	 *	생성된 사람 객체에 이름을 설정하는 일
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	/**
	 * 	생성된 사람객체의 저장된 이름을 반환하는 일
	 * @return 설정된 이름
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * 생성된 사람 객체 눈의 수를 설정하는 일
	 * @param eye 설정할 눈의 수
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye
	/**
	 * 	생성된 사람 객체의 저장된 눈의 수를 반환하는 일
	 * @return 설정된 눈의 수
	 */
	public int getEye() {
		return eye;
	}//getEye
	/**
	 * 	생성된 사람 객체에 코의 수를 설정하는 일
	 * @param nose 설정할 코의 수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose
	/**
	 * 생성된 사람객체의 설정된 코의 수를 반환하는 일
	 * @return 설정된 코의 수
	 */
	public int getNose() {
		return nose;
	}//getNose
	/**
	 * 	생성된 사람 객체 입의 수를 설정하는 일
	 * @param mouth 설정할 입의 수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouth
	/**
	 * 	생성된 사람 객체의 설정된 입의 수를 반환하는 일
	 * @return 설정된 입의 수
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	////////////////// 동사적인 특징 정의 //////////////////
	/**
	 * 	생성된 사람 객체가 집에서 밥을 먹는 일
	 * @return 행동
	 */
	public String eat(){
		return name+"이(가) 집에서 밥을 먹는다.";
	}//eat
	/**
	 * 	생성된 사람 객체가 식당에서 밥을 사먹는 일
	 * @param menu 사먹을 음식의 종류
	 * @param price 해당 음식의 책정된 가격
	 * @return 행동
	 */
	public String eat(String menu, int price){
		return name+"이(가) 식당에서 "+menu+"라는 음식을 "+price+"원 내고 사먹는다.";
	}//eat
}//class
