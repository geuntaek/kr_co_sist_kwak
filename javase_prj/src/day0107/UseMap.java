package day0107;

import java.util.HashMap;
import java.util.Map;

/**
 * 키와 값의 쌍으로 이루어진 Map
 * @author user
 */
public class UseMap {

	private void useHashTable(){
		Map<String, String> map = new HashMap<String,String>(); // 11개 행
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
