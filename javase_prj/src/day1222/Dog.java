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
		color = "��";
	}
	
	/**
	 * ���� �� ���� �ϳ� ������ �ϳ� �ٸ��� 4���̾�� �ϰ� �̿��� ������� �⺻���� �� �ٲ��ش�.
	 * ���� ������ ���, ������, ���� �̿��� ������ ����̶�� �Ѵ�.
	 * @param eye ���� ��
	 * @param tail ������ ��
	 * @param leg �ٸ��� ��
	 * @param color ����
	 */
	public Dog(int eye, int tail, int leg, String color){
		if(eye!=2||tail!=1||leg!=4){
			eye = 2;
			tail = 1;
			leg = 4;
		}
		if(!(color=="��"||color=="����"||color=="��")){
			color = "���";
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
	
	/////������/////
	public String eat(String food){
		return "���� ���� "+color+"���� ���� "+food+"�� �԰� �;� �Ѵ�.";
	}
	public String run(String meter){
		return "�ٸ��� "+leg+"���� ���� "+meter+"�� �޷ȴ�.";
	}
	
}
