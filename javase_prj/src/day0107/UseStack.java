package day0107;

import java.util.Stack;

/**
 * LIFO�� ������ �ڷᱸ��Stack
 * @author user
 */
public class UseStack {

	public UseStack(){
		// 1. ���� : jdk1.5�������ʹ� Generic ��� ����
		Stack<String> stack = new Stack<>();
		//�� �ֱ�
		stack.push("�յ���1");
		stack.push("������2");
		stack.push("ȫ����3");
		stack.push("�̿뼮4");

		System.out.println(stack); // ���°� ������� ����.
		
		/*
		System.out.println(stack.pop()); // ������, �󸶳� �������ϴ��� �� �� ����. 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/
		
		while(!stack.empty()){ // ������, ����ִ��� Ȯ���ϸ鼭 ������.
			System.out.println(stack.pop());
		}
		System.out.println(stack); // ������ Stack�� ���.
		
	}
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
