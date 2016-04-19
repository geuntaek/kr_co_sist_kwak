package FirstProject;

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
		 ReturnLogList rll = new ReturnLogList();
	      List<WorkVO> logList = rll.returnList();
	      Map<String,Integer> map = new HashMap<String,Integer>();
	      WorkVO wv = null;
	      String temp = "";
	      int value = 0;
	      String key = "";
	      
	      
	      int cnt404  = 0;
	      int cnt200  = 0;
	      StringBuilder sb = new StringBuilder();
	      
	      for (int i = 0; i < logList.size(); i++) {
	         wv = logList.get(i);
	         temp = wv.getResponse();
	         if( map.get(temp)==null ){
	            map.put(temp, 1);
	         }else{
	            map.put(temp, map.get(temp)+1);
	         }
	      }
	      Set<String> keys = map.keySet(); // 키를 저장할 수 있게 Generic을 String으로 한다.
	      Iterator<String> ita = keys.iterator(); 
	      
	      while(ita.hasNext()){ //포인터 
	         key = ita.next();
	         value = map.get(key); // 키를 하나 넣어서
	         if(key.equals("404")){
	            cnt404 = value;
	            
	         }//end if
	         if(key.equals("200")){
	            cnt200 = value;
	         }//end if
	         
	      }//end while
	      sb.append("성공한 횟수 ( 404 ) : ").append(cnt404).append("\n").append("실패한 횟수 ( 200 ) : ").append(cnt200);
	      
	      return sb.toString();

	}
}
