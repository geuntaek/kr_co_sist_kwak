package day1229;

public class Child extends Parent{
	int i;
	public Child(){
		super();
		System.out.println("자식기본생성자");
	}//child
	public Child(int i){
		//1.super(50);
		this();
		System.out.println("자식인자생성자"+i);
	}//child
	public static void main(String[ ]args){
		new Child();
	}
}//class


