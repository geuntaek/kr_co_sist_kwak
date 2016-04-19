package FirstProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkFirst {
	
	/**
	 * �ִٻ�� Ű�� �̸��� Ƚ���� ��ȯ�ϴ� �޼ҵ�
	 * @return
	 */
	public String method1() {
		ReturnLogList rll = new ReturnLogList(); // ����Ʈ�� ��ȯ�ϴ� Ŭ������ rll�� ��üȭ
		List<WorkVO> loglist = rll.returnList(); // VOŬ������ ���ʷ��� ������ list�� ��ȯ�� ����Ʈ�� ����
		Map<String,Integer> map = new HashMap<String,Integer>(); // Map ��üȭ
		WorkVO wv = null; // getter��
		String temp = ""; // �ӽ÷� ���� ������ ����
		String max_Key = ""; // �ִ� ���� Ű ���� ������ ����
		int max_Used = 0; // �ִ� ���� Ű ���� ���� ���� ������ ����

		
		for(int i=0; i<loglist.size(); i++) {
			wv = loglist.get(i); // wv ������ i��° ����Ʈ�� ���� �־��ش�.
			if(wv.getRequestURL().contains("key=")) { // ���� "key=" ��� ������ ���� ��쿡 true ��ȯ
				
			temp = wv.getRequestURL().substring(
					(wv.getRequestURL().indexOf("="))+1, (wv.getRequestURL().indexOf("&"))); // �ʿ��� �κи� �߶� temp�� ����
			
			if(map.get(temp) == null) { // temp�� �˻������� ���� null�� ������. ��, ���ο� ���� map�� ���� ó�� �־��� ��
				map.put(temp, 1); // �ʱⰪ�̱⿡ 1�� �־��ش� 
			} else { // temp�� �˻������� ���� ������. ��, �ߺ��� ���� �˻� �Ǹ�
				map.put(temp, map.get(temp)+1); // ������ �ִ� ���� 1�� �����Ͽ� �����Ѵ�.
			}
		} // end if
		} // end for
		
		Set<String> keys = map.keySet(); // map�� keySet() �޼ҵ带 �̿��Ͽ�, Set�� Map�� key���� �����Ѵ�.
												// keySet() : Map interface�� method��, Map�� key���� Set������ ��ȯ�Ѵ�.
		
		String[] keysArr = new String[keys.size()]; // keys�� ũ���� �迭 ����
		keys.toArray(keysArr); // ������ �迭�� keys(Set)�� ���� �ִ´�.
		
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
		sb.append("�ִ� ��� Ű�� ").append(max_Key).append("�̸�, ��� Ƚ���� ").append(max_Used).append("�Դϴ�.");
		
		return sb.toString();
		
	}
}
