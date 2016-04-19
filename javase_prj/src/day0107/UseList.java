package day0107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 데이터 중복을 허용하며 검색의 기능이 있는 List의 사용
 * 데이터는 순차적으로 입력된다
 * 1. List 중 데이터가 뒤로 추가 될 때 사용하는 것
 * 		ArrayList : Multi Thread에서 동시접근 가능 (동기화처리가 되어있지 않다.) 속도가 빠르다
 * 		Vector : Multi Thread에서 동시접근 불가능 (동기화처리가 되어있다.) 속도가 느리다
 * 2. List 중 데이터가 뒤로 추가되기도 하지만 중간에 되는일이 빈번할 때 사용
 * 		LinkedList
 * @author user
 */
public class UseList {

//	@SuppressWarnings({"rawtypes","unused"}) // annotation, SuppressWarnings는 배열로도 가능 
	
	@SuppressWarnings("unchecked") // 형을 체크하지 않는다.
	private void useArrayList(){ // 밖에 보일 이유가 없으니까 private
		
		/*
		jdk1.4에서 기본형 데이터형을 추가할 때에는 Wrapper로 감싸서 (객체로) 넣어야 한다.
		generic은 jdk1.5에서부터 사용할 수 있다. 
		List list = new ArrayList(); // Generic이 없는 경우 -> warning이 뜬다.
		list.add(2016); // 정수, jdk 1.4는 2016으로 하면 에러가 발생. auto boxing이 안되서. wrapper로 싸야한다. new Integer(2016));
		list.add("오전"); // 문자열
		list.add(3.5); // 실수
		*/
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList(10); // capacity를 지정, 하지만 크기를 출력하면 capacity가 아니라 데이터가 존재하는 크기가 출력된다. 
		// generic을 설정하지 않으면 모든 값을 추가할 수 있다. 하지만 warning이 뜬다.
		list.add(2016); // 정수 : auto boxing
		list.add("오전"); // 문자열 : 객체니까 auto boxing이 일어나지 않는다.
		list.add(3.5); // 실수 : auto boxing
		
		System.out.println(list.size());
		System.out.println(list); // instance 확인, 주소가 아닌 값이 나온다. 왜? toString() method를 overriding했기 때문이다.
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 단순히 찍는 것은 에러가 나지 않는다.
//			System.out.println(list.get(i)*2); // 연산이 되지 않는 값이 있기때문에 에러가 난다.
		}// end for
		
		//////////////////////////// Generic 사용 ////////////////////////////
		
		List<String> list1 = new ArrayList<String>(10); // capacity를 적절히 잡아주는 것이 좋다.
//		list1.add(1); // 정수형이기 때문에 에러가 발생한다.
		list1.add("이소희1");
		list1.add("이소희2");
		list1.add("이소희3");
		list1.add("이소희4");
		list1.add("이소희2"); // 중복 값 허용한다.
		list1.add("이소희5");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		// 배열로 보내기
		// 1. 배열생성 : 방의 수
		String[] names = new String[list1.size()];
		// 2. 생성된 배열에 List 값 보내기
//		list.toArray(names); // generic이 안써져 있어서 실행하면 에러발생
		list1.toArray(names); // 형이 맞기때문에 에러가 발생하지 않음
		
		// 삭제
		list1.remove(2); // list는 지우면 사이즈가 변경되지만 배열은 아니다.
		System.out.println("첫번째 삭제 후 "+list1);
		list1.remove("이소희2"); // 중복된 값을 지울때는 제일 먼저 나오는 값을 지운다.
		System.out.println("두번째 삭제 후 "+list1);
		// 모두삭제
//		list1.clear();
//		System.out.println("세번째 삭제 후 "+list1);
		
//		// list의 모든 방 출력
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("리스트 "+list1.get(i));
//		}// end for
		
		// 개선된 for도 사용이 가능, Generic이 쓰여있지 않으면 사용하지 못한다.
		for(String str : list1){
			System.out.println(str);
		}// endfor
		
		// 배열의 모든 방 출력
		for (int i = 0; i < names.length; i++) {
			System.out.println("배열 "+names[i]);
		}// end for
		
		
	} // useArrayList
	
	
	private void useVector(){ // 밖에 보일 이유가 없으니까 private
		
		
		Vector<String> list1 = new Vector<String>(10); // capacity를 적절히 잡아주는 것이 좋다.
//		list1.add(1); // 정수형이기 때문에 에러가 발생한다.
		list1.add("이소희1");
		list1.add("이소희2");
		list1.add("이소희3");
		list1.add("이소희4");
		list1.add("이소희2"); // 중복 값 허용한다.
		list1.add("이소희5");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		// 배열로 보내기
		// 1. 배열생성 : 방의 수
		String[] names = new String[list1.size()];
		// 2. 생성된 배열에 List 값 보내기
//		list.toArray(names); // generic이 안써져 있어서 실행하면 에러발생
		list1.toArray(names); // 형이 맞기때문에 에러가 발생하지 않음
		
		// 삭제
		list1.remove(2); // list는 지우면 사이즈가 변경되지만 배열은 아니다.
		System.out.println("첫번째 삭제 후 "+list1);
		list1.remove("이소희2"); // 중복된 값을 지울때는 제일 먼저 나오는 값을 지운다.
		System.out.println("두번째 삭제 후 "+list1);
		// 모두삭제
//		list1.clear();
//		System.out.println("세번째 삭제 후 "+list1);
		
//		// list의 모든 방 출력
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("리스트 "+list1.get(i));
//		}// end for
		
		// 개선된 for도 사용이 가능, Generic이 쓰여있지 않으면 사용하지 못한다.
		for(String str : list1){
			System.out.println(str);
		}// endfor
		
		// 배열의 모든 방 출력
		for (int i = 0; i < names.length; i++) {
			System.out.println("배열 "+names[i]);
		}// end for
		
	} // useVector
	private void useLinkedList(){ // 밖에 보일 이유가 없으니까 private
		LinkedList<String> list1 = new LinkedList<String>(); // capacity를 줄 수 없다.
//		list1.add(1); // 정수형이기 때문에 에러가 발생한다.
		list1.add("이소희1");
		list1.add("이소희2");
		list1.add(1,"이소희3"); // LinkedList는 새치기가 가능하다.
		list1.add("이소희4");
		list1.add("이소희2"); // 중복 값 허용한다.
		list1.add("이소희5");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		// 배열로 보내기
		// 1. 배열생성 : 방의 수
		String[] names = new String[list1.size()];
		// 2. 생성된 배열에 List 값 보내기
//		list.toArray(names); // generic이 안써져 있어서 실행하면 에러발생
		list1.toArray(names); // 형이 맞기때문에 에러가 발생하지 않음
		
		// 삭제
		list1.remove(2); // list는 지우면 사이즈가 변경되지만 배열은 아니다.
		System.out.println("첫번째 삭제 후 "+list1);
		list1.remove("이소희2"); // 중복된 값을 지울때는 제일 먼저 나오는 값을 지운다.
		System.out.println("두번째 삭제 후 "+list1);
		// 모두삭제
//		list1.clear();
//		System.out.println("세번째 삭제 후 "+list1);
		
//		// list의 모든 방 출력
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("리스트 "+list1.get(i));
//		}// end for
		
		// 개선된 for도 사용이 가능, Generic이 쓰여있지 않으면 사용하지 못한다.
		for(String str : list1){
			System.out.println(str);
		}// endfor
		
		// 배열의 모든 방 출력
		for (int i = 0; i < names.length; i++) {
			System.out.println("배열 "+names[i]);
		}// end for
	} // useLinkedList
	public static void main(String[] args) {
		
		UseList ul = new UseList();
		ul.useArrayList();
		System.out.println("--------------------------------------------------");
		ul.useVector();
		System.out.println("--------------------------------------------------");
		ul.useLinkedList();
		
		
	} // main

}// class






