package day0107;

import java.util.Stack;

/**
 * LIFO를 구현한 자료구조Stack
 * @author user
 */
public class UseStack {

	public UseStack(){
		// 1. 생성 : jdk1.5에서부터는 Generic 사용 가능
		Stack<String> stack = new Stack<>();
		//값 넣기
		stack.push("손두한1");
		stack.push("이익희2");
		stack.push("홍가현3");
		stack.push("이용석4");

		System.out.println(stack); // 들어가는건 순서대로 들어간다.
		
		/*
		System.out.println(stack.pop()); // 꺼내기, 얼마나 꺼내야하는지 알 수 없다. 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/
		
		while(!stack.empty()){ // 꺼내기, 비어있는지 확인하면서 꺼낸다.
			System.out.println(stack.pop());
		}
		System.out.println(stack); // 꺼내면 Stack은 빈다.
		
	}
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
