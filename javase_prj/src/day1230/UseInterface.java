package day1230;

/**
 * �������̽��� �����ϴ� Ŭ����
 * @author user
 */
public class UseInterface implements TestInterface {
	
	@Override
	public String msg(){
		return "Happy New Year";
	}
	@Override
	public int asciiCode(char paramChar){
		return (int)paramChar;
	}
	
	public int year(){
		return 2016;
	}
	
	public static void main(String[] args) {
//		�������̽��� ���� ��üȭ �� �� ����.
//		TestInterface ti= new TestInterface();
		
//		�ڽ�Ŭ������ ��üȭ�� ����
		UseInterface ui = new UseInterface();
		System.out.println(ui.msg());
		System.out.println(ui.asciiCode('A'));
		
//		is a ������ ��üȭ�� ����. 
//		Override�� method�� �������̽� ���� constant�� ȣ���� �����ϴ�. 
//		�ڽ��� method�� ȣ���� �Ұ����ϴ�. ��Ӱ� ���� ���̴�.
		TestInterface ti = new UseInterface();
		System.out.println(ti.msg());
		System.out.println(ti.asciiCode('Z'));
//		System.out.println(ti.year()); // �����߻�. �ڽ��� method�� ȣ���� �Ұ���.
		
		
	}//main

}//class
