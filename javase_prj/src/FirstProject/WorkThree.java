package FirstProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkThree {
	/**
	 * ���񽺸� ���������� ������ Ƚ���� ������ Ƚ���� ��ȯ�ϴ� �޼ҵ�
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
	      Set<String> keys = map.keySet(); // Ű�� ������ �� �ְ� Generic�� String���� �Ѵ�.
	      Iterator<String> ita = keys.iterator(); 
	      
	      while(ita.hasNext()){ //������ 
	         key = ita.next();
	         value = map.get(key); // Ű�� �ϳ� �־
	         if(key.equals("404")){
	            cnt404 = value;
	            
	         }//end if
	         if(key.equals("200")){
	            cnt200 = value;
	         }//end if
	         
	      }//end while
	      sb.append("������ Ƚ�� ( 404 ) : ").append(cnt404).append("\n").append("������ Ƚ�� ( 200 ) : ").append(cnt200);
	      
	      return sb.toString();

	}
}
