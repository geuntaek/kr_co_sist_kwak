package kr.co.sist.project1;

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
		ReturnLogList rll = new ReturnLogList(); // ReturnLogListŬ������ ��üȭ
		List<WorkVO> logList = rll.returnList(); // ReturnLogList�� ����Ʈ�� ��ȯ�ϴ� returnList�޼ҵ带 ȣ���Ͽ� List�� ����
		Map<String,Integer> map = new HashMap<String,Integer>(); // map�� ���� -> generic�� String�� Integer��
	    WorkVO wv = null;
	    String temp = "";
	    int value = 0;
	    String key = "";
	    int cnt404  = 0;
	    int cnt200  = 0;
	      
	    for (int i = 0; i < logList.size(); i++) { // logList�� ũ�⸸ŭ for�� ����
	    	wv = logList.get(i); // logList�� i��° ���� wv�� ����
	    	temp = wv.getResponse(); // wv�� �������� temp�� ����
	        if( map.get(temp)==null ){ // temp��� Ű���� value�� ���ٸ� 
	        	map.put(temp, 1); // map�� temp�� �ʱⰪ 1�� put
	        }else{ // temp��� Ű���� value�� �ִٸ�
	        	map.put(temp,map.get(temp)+1); // value�� +1 ���ش�.
			}
	   }
      	     
	   Set<String> keys = map.keySet(); // Ű�� ������ �� �ְ� Generic�� String���� �Ѵ�.
	   Iterator<String> ita = keys.iterator(); 
	     
	   while(ita.hasNext()){ //������ 
		   key = ita.next();
	       value = map.get(key); 
	       if(key.equals("404")){ // key�� 404�� ����� value�� cnt404�� ����
	    	   cnt404 = value;
	            
	       }//end if
	       if(key.equals("200")){ // key�� 200�� ����� value�� cnt200�� ����
	          cnt200 = value;
	       }//end if
	         
	   }//end while
	     
	   StringBuilder sb = new StringBuilder();
	   sb.append("������ Ƚ�� ( 404 ) : ").append(cnt404).append("\n").append("������ Ƚ�� ( 200 ) : ").append(cnt200);
	      
	   return sb.toString();
	   }
}
