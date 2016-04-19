package day1222;

public class Dog {
	private int eye;
	private int tail;
	private int leg;
	private String color;
	
	public Dog(){
		eye = 2;
		tail = 1;
		leg = 4;
		color = "흰";
	}
	
	/**
	 * 개는 꼭 눈이 하나 꼬리가 하나 다리가 4개이어야 하고 이외의 개수라면 기본으로 다 바꿔준다.
	 * 개의 색깔은 흰색, 검은색, 갈색 이외의 색깔은 잡색이라고 한다.
	 * @param eye 눈의 수
	 * @param tail 꼬리의 수
	 * @param leg 다리의 수
	 * @param color 색깔
	 */
	public Dog(int eye, int tail, int leg, String color){
		if(eye!=2||tail!=1||leg!=4){
			eye = 2;
			tail = 1;
			leg = 4;
		}
		if(!(color=="흰"||color=="검은"||color=="갈")){
			color = "잡색";
		}
		this.eye = eye;
		this.tail = tail;
		this.leg = leg;
		this.color = color;
	}
	
	//setter&getter
	public int getEye() {
		return eye;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/////동사적/////
	public String eat(String food){
		return "털의 색이 "+color+"색인 개가 "+food+"를 먹고 싶어 한다.";
	}
	public String run(String meter){
		return "다리가 "+leg+"개인 개가 "+meter+"를 달렸다.";
	}
	
}
