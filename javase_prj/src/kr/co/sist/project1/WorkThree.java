package kr.co.sist.project1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkThree {
	/**
	 * 서비스를 성공적으로 수행한 횟수와 실패한 횟수를 반환하는 메소드
	 * @return
	 */
	public String method3(){
		ReturnLogList rll = new ReturnLogList(); // ReturnLogList클래스를 객체화
		List<WorkVO> logList = rll.returnList(); // ReturnLogList의 리스트를 반환하는 returnList메소드를 호출하여 List에 저장
		Map<String,Integer> map = new HashMap<String,Integer>(); // map을 생성 -> generic을 String과 Integer로
	    WorkVO wv = null;
	    String temp = "";
	    int value = 0;
	    String key = "";
	    int cnt404  = 0;
	    int cnt200  = 0;
	      
	    for (int i = 0; i < logList.size(); i++) { // logList의 크기만큼 for문 돌림
	    	wv = logList.get(i); // logList의 i번째 방을 wv에 저장
	    	temp = wv.getResponse(); // wv의 응답결과를 temp에 저장
	        if( map.get(temp)==null ){ // temp라는 키값에 value가 없다면 
	        	map.put(temp, 1); // map에 temp와 초기값 1을 put
	        }else{ // temp라는 키값에 value가 있다면
	        	map.put(temp,map.get(temp)+1); // value를 +1 해준다.
			}
	   }
      	     
	   Set<String> keys = map.keySet(); // 키를 저장할 수 있게 Generic을 String으로 한다.
	   Iterator<String> ita = keys.iterator(); 
	     
	   while(ita.hasNext()){ //포인터 
		   key = ita.next();
	       value = map.get(key); 
	       if(key.equals("404")){ // key가 404일 경우의 value를 cnt404에 저장
	    	   cnt404 = value;
	            
	       }//end if
	       if(key.equals("200")){ // key가 200일 경우의 value를 cnt200에 저장
	          cnt200 = value;
	       }//end if
	         
	   }//end while
	     
	   StringBuilder sb = new StringBuilder();
	   sb.append("성공한 횟수 ( 404 ) : ").append(cnt404).append("\n").append("실패한 횟수 ( 200 ) : ").append(cnt200);
	      
	   return sb.toString();
	   }
}
