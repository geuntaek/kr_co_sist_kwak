package day1229;

public class Child extends Parent{
	int i;
	public Child(){
		super();
		System.out.println("�ڽı⺻������");
	}//child
	public Child(int i){
		//1.super(50);
		this();
		System.out.println("�ڽ����ڻ�����"+i);
	}//child
	public static void main(String[ ]args){
		new Child();
	}
}//class


