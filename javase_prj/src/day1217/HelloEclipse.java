package day1217;

import day1218.InstanceVariable; // �ٸ� ��Ű���� import�� �ؾ� ����� �����ϴ�.

public class HelloEclipse extends InstanceVariable{
	public static final int TEST = 1;
	
	public static void main(String[] args) {
		int i = 0; // ��������
		System.out.println(i);
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		switch (args[0]) { // switch�� ���ڸ� �޾Ƶ��� �� ����
		case "A":
			System.out.println("����!");
			break;
		default:
			System.out.println("�ٸ�");
			break;
		}
		
		
		// �ܺ� ��Ű���� Ŭ������ �ν��Ͻ� ������ ���
		// 12-18-2015�� �߰�
		InstanceVariable iv = new InstanceVariable();
		iv.i = 2015; // public
		
		HelloEclipse he = new HelloEclipse(); // protected, ����� �޾ƾ� ����� �� �ִ�. (�ڽ�Ŭ����)
		he.i = 9; // public
		he.j = 15; // protected
		
		//iv.k = 55; // private
		//iv.l = 77; // default
		
	}// main
}// class
