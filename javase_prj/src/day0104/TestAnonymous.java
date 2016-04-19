package day0104;

import day1230.Clark;
import day1230.Fly;

/**
 * Ŭ������ arguments�� ����ϴ� anonymous inner class�� ���
 * @author user
 */
public class TestAnonymous {
	
	public void useFly(Fly fly){ // clark�� fly�� ������. 
		System.out.println(fly.height()); // ����
		System.out.println(fly.speed()); // �ӵ�
	}
	
	public static void main(String[] args) {
		TestAnonymous ta = new TestAnonymous();
		//1. Fly�� is a ������ Ŭ������ ����� ��ü�� �����Ͽ�
		Clark clark = new Clark();
		Fly clark2 = new Clark(); 
		//2. ������ ��ü�� �־��ش�.
		ta.useFly(clark);
		ta.useFly(clark2);
		
		// ���� �ڵ�� �ڽ�Ŭ������ ���� �������Ѵٴ� ������ �ִ�. Ŭ������ ��������.
		// �׷��� anonymous inner class�� �����. Ŭ������ �������� �ʿ䰡 ����.
		ta.useFly(new Fly(){
			public String height(){
				return "���� ���� ���� ����";
			}
			public String speed(){
				return "������ ���� ���� �˾Ƽ� ����";
			}
		});
		
		
	}

}
