package day0108;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 키와 값의 쌍으로 이루어진 Map
 * @author user
 */
public class UseMap {

	public UseMap(){
		// 1. 생성
		Map<String,String> map = new HashMap<String,String>();  // 16개 행, capacity를 줄 수 있다.
		// 2. 값할당 : 행의 증가 (키는중복되지않고 값은 중복이 된다), 비순차적으로 들어간다.
		map.put("A", "안녕");
		map.put("B", "안녕2");
		map.put("C", "안녕3");
		map.put("D", "안녕4");
		map.put("E", "안녕5");
		System.out.println(map.toString()); // map = map.toString() 같은게 출력됨
		map.put("B", "안녕5"); // 키가 같다면 기본의 키에 덮어 써진다.
		System.out.println(map.toString()); // map = map.toString() 같은게 출력됨
		// 3. 삭제
		map.remove("D");
		System.out.println(map);
//		map.clear();
//		System.out.println(map);
		
		// 모든 행을 출력. for를 이용해서 출력은 불가능하다.
		// 모든 키를 받아야 출력이 가능하다.
		Set<String> keys=null;
		keys = map.keySet(); // 키를 저장할 수 있게 Generic을 String으로 한다.
		Iterator<String> ita = keys.iterator(); 
		
		String key, value = "";
		while(ita.hasNext()){ 
			key = ita.next();
			value = map.get(key); // 키를 하나 어더어서
			System.out.println(value); // 맵에 키를 넣어 값을 조회
//			System.out.println(ita.next()); // 키 출력
//			System.out.println(map.get(ita.next())); // 값 출력
		}
		
		
		
	}//UseMap
	
	
	private void useHashTable(){
		Map<String, String> map = new Hashtable<String,String>(); // 11개 행
		map.put("A", "세심하다, 친절하다^0^b");
		map.put("B", "성질드럽다");
		map.put("AB", "싸이코");
		map.put("O", "우유부단하다");
		map.put("A", "소심하다"); 
		System.out.println(map);// 같은 키는 덮어씌우고 순서는 마음대로 들어간다.
		
		String blood = "a";
		String value = map.get(blood.toUpperCase()); // 키가 없다면 null로 나온다.
		if(value !=null){
			System.out.println(blood+"형의 특징은 "+value);
		}else{
			System.out.println(blood+"형은 사람의 것이 아닙니다.");
		}
	}//useHashtable
	private void useHashMap(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("감탄고토", "달면 삼키고, 쓰면 뱉는다.");
		map.put("감언이설", "좋은말로 꼬심");
		map.put("무념무상", "생각없음");
		map.put("갈이천정", "목마른 사람이 우물을 판다");
		map.put("순망치한", "입술이 없으면 이가 시림");
		map.put("신문사절", "더이상 신문을 구독하지 않음");
		map.put("진주용씨", "잘 피하는 사람");
		
		String key = "각주구검";
		String value = map.get(key);
		if (value == null) {
			value=" 뜻이 준비되지않았습니다.";
		}
		System.out.println(key+":"+value);
		
	}//useHashtable
	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashTable();
		System.out.println("---------------------------------------");
		um.useHashMap();
	}//main

}//class
