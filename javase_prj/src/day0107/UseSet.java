package day0107;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 중복데이터를 저장하지 않고, 값을 조회할 수 없는 Set
 * 저장된 데이터는 비순차적으로 저장된다.
 * @author user
 */
public class UseSet {

	public UseSet(){
		//1.생성
		Set<String> set = new HashSet<String>();
		set.add("도윤환");
		set.add("조근택");
		set.add("진주용");
		set.add("최웅열"); 
		set.add("이익희"); 
		set.add("도윤환"); // 중복값이 들어가지 않는다
		set.add("조근택");
		System.out.println("set의 크기" + set.size());
		System.out.println(set);
		
		// 배열로 보내기
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		//삭제
		System.out.println("삭제 후 set의 크기" + set.size());
		set.remove("진주용");
		
//		//모두삭제
//		set.clear();
//		System.out.println("모두삭제 후 set의 크기" + set.size());
//		System.out.println(set);
//		
		/*
		//검색
		Iterator<String> ita = set.iterator();
		while(ita.hasNext()){ // 포인터 다음 위체에 데이터가 존재하면 true 아니면 false
			//방의 값을 꺼내오고 다음위치로 포인터를 이동하는 method
			System.out.println(ita.next());
		}// end while
		*/
		
		// 개선된 for를 사용하면 Iterator를 사용하지 않고 출력이 가능, 반드시 generic이 있어야 사용가능
		for(String name:set){
			System.out.println(name);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 "+arr[i]);
		}
	}//UseSet
	
	public static void main(String[] args) {
		new UseSet();
	}//main

}//class
