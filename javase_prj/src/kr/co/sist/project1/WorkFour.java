package kr.co.sist.project1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkFour {
	
	public String method4(){
		ReturnLogList rll = new ReturnLogList(); // ReturnLogListŬ������ ��üȭ
		List<WorkVO> logList = rll.returnList(); // ReturnLogList�� ����Ʈ�� ��ȯ�ϴ� returnList�޼ҵ带 ȣ���Ͽ� List�� ����
		Map<String,Integer> map = new HashMap<String,Integer>(); // map�� ���� -> generic�� String�� Integer��
		WorkVO wv = null; // WorkVO��ü ����
		String temp = "";
		String key = "";
		int value  = 0;
		String maxKey = "";
		int maxValue  = 0;
		
		for (int i = 0; i < logList.size(); i++) { // logList ��ŭ for���� ������. 
			wv = logList.get(i); // logList�� �ε����� ������ WorkVO ��ü�� ���� 
			//wv�� ����� time�� getTime()���� �����ͼ� �ð��� �߶� temp�� ����	
			temp = (wv.getTime()).substring((wv.getTime()).indexOf(":")-2, (wv.getTime()).indexOf(":")); 
			if( map.get(temp)==null ){ // temp��� Ű�� �������� �ʴ´ٸ�
				map.put(temp, 1); // map�� temp�� �ʱⰪ 1�� put
			}else{ // temp��� Ű�� ��(value)�� �ִٸ�
				map.put(temp,map.get(temp)+1); // ��(value)��  +1 ���ش�.
			}
		}
		
		Set<String> keys = map.keySet(); 
		Iterator<String> ita = keys.iterator(); 
		while(ita.hasNext()){ // Ű�� �����Ѵٸ� // iterator�� �����Ͱ�����.
			key = ita.next();
			value = map.get(key); // Ű�� value�� �����´�. 
			if(maxValue<value){ // Ű�� value���� ���ؼ� ���� ū���� Ű�� ���� maxValue�� maxKey�� ����
				maxValue = value;
				maxKey = key;
			}
		}
		
		return maxKey+"��"; // ��ȯ
	}

}
