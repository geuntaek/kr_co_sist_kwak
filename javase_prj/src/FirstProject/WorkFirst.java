package FirstProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkFirst {
	
	/**
	 * 최다사용 키의 이름과 횟수를 반환하는 메소드
	 * @return
	 */
	public String method1() {
		ReturnLogList rll = new ReturnLogList(); // 리스트를 반환하는 클래스를 rll로 객체화
		List<WorkVO> loglist = rll.returnList(); // VO클래스를 제너럴로 지정한 list에 반환한 리스트를 저장
		Map<String,Integer> map = new HashMap<String,Integer>(); // Map 객체화
		WorkVO wv = null; // getter용
		String temp = ""; // 임시로 값을 저장할 변수
		String max_Key = ""; // 최대 사용된 키 값을 저장할 변수
		int max_Used = 0; // 최대 사용된 키 값의 사용된 값을 저장할 변수

		
		for(int i=0; i<loglist.size(); i++) {
			wv = loglist.get(i); // wv 변수에 i번째 리스트의 값을 넣어준다.
			if(wv.getRequestURL().contains("key=")) { // 값에 "key=" 라는 문장이 있을 경우에 true 반환
				
			temp = wv.getRequestURL().substring(
					(wv.getRequestURL().indexOf("="))+1, (wv.getRequestURL().indexOf("&"))); // 필요한 부분만 잘라서 temp에 저장
			
			if(map.get(temp) == null) { // temp를 검색했을때 값이 null이 나오면. 즉, 새로운 값을 map에 값을 처음 넣어줄 때
				map.put(temp, 1); // 초기값이기에 1을 넣어준다 
			} else { // temp를 검색했을때 값이 나오면. 즉, 중복된 값이 검색 되면
				map.put(temp, map.get(temp)+1); // 기존에 있던 값에 1을 증가하여 저장한다.
			}
		} // end if
		} // end for
		
		Set<String> keys = map.keySet(); // map의 keySet() 메소드를 이용하여, Set에 Map의 key값을 저장한다.
												// keySet() : Map interface의 method로, Map의 key값을 Set형으로 반환한다.
		
		String[] keysArr = new String[keys.size()]; // keys의 크기대로 배열 생성
		keys.toArray(keysArr); // 생성된 배열에 keys(Set)의 값을 넣는다.
		
		for(int i=0; i<keysArr.length; i++) {
			if(i == 0) {
				max_Key = keysArr[i];
				max_Used = map.get(keysArr[i]);
			} else {
				if(map.get(keysArr[i])>max_Used) {
					max_Key = keysArr[i];
					max_Used = map.get(keysArr[i]);
				} // if
			} //else
		} // for
		
		StringBuilder sb = new StringBuilder();
		sb.append("최대 사용 키는 ").append(max_Key).append("이며, 사용 횟수는 ").append(max_Used).append("입니다.");
		
		return sb.toString();
		
	}
}
