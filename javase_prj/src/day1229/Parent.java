package day1229;

public class Parent {
	int i;
	
	public Parent(){
		this(100);
		System.out.println("부모기본생성자");
	}//Parent
	
	public Parent(int i){
		System.out.println("부모인자생성자"+i);
	}//Parent
	
}//class
