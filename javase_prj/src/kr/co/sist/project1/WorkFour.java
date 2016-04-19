package kr.co.sist.project1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkFour {
	
	public String method4(){
		ReturnLogList rll = new ReturnLogList(); // ReturnLogList클래스를 객체화
		List<WorkVO> logList = rll.returnList(); // ReturnLogList의 리스트를 반환하는 returnList메소드를 호출하여 List에 저장
		Map<String,Integer> map = new HashMap<String,Integer>(); // map을 생성 -> generic을 String과 Integer로
		WorkVO wv = null; // WorkVO객체 생성
		String temp = "";
		String key = "";
		int value  = 0;
		String maxKey = "";
		int maxValue  = 0;
		
		for (int i = 0; i < logList.size(); i++) { // logList 만큼 for문을 돌린다. 
			wv = logList.get(i); // logList의 인덱스의 값들을 WorkVO 객체에 저장 
			//wv에 저장된 time을 getTime()으로 가져와서 시간만 잘라서 temp에 저장	
			temp = (wv.getTime()).substring((wv.getTime()).indexOf(":")-2, (wv.getTime()).indexOf(":")); 
			if( map.get(temp)==null ){ // temp라는 키가 존재하지 않는다면
				map.put(temp, 1); // map에 temp와 초기값 1을 put
			}else{ // temp라는 키에 값(value)이 있다면
				map.put(temp,map.get(temp)+1); // 값(value)을  +1 해준다.
			}
		}
		
		Set<String> keys = map.keySet(); 
		Iterator<String> ita = keys.iterator(); 
		while(ita.hasNext()){ // 키가 존재한다면 // iterator는 포인터같은거.
			key = ita.next();
			value = map.get(key); // 키의 value를 가져온다. 
			if(maxValue<value){ // 키의 value들을 비교해서 가장 큰값과 키를 각각 maxValue와 maxKey에 저장
				maxValue = value;
				maxKey = key;
			}
		}
		
		return maxKey+"시"; // 반환
	}

}
