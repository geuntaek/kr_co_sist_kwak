package day0105;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� �ϳ��� ����� �����ϴ� StringTokenizer
 * @author user
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer(){
		String data = "�ֿ���, ���ֿ�, �ּ���. ������, ����ȯ~ �̼���";
//		StringTokenizer stk = new StringTokenizer(data); 
//		StringTokenizer stk = new StringTokenizer(data,"~, ."); // ���ع��ڿ��� �����ϴ� ������ ���, or����� �ִ�.
		 

//		���ع��ڿ��� �����ϴ� ������ ���,
//		���ع��ڿ��� ��ū���� ��������� ���θ� �����ϴ� ������ true�� ��ū���� ���, false�� ����
		StringTokenizer stk = new StringTokenizer(data,",.��",true); // ,.�� �� ��ū���� ����Ѵ�. 
		System.out.println("��ū�� �� = "+stk.countTokens());
		/*
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken()); // �ִ� ����ŭ �߶���Ѵ�.
		*/
		
		 while(stk.hasMoreTokens()){ // ��ū�� �����ϴ���
			 //��ū�� �����Ѵٸ� ��ū�� ���� �� �����͸� �̵�
			 System.out.println(stk.nextToken());
		 }
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main
}//class
