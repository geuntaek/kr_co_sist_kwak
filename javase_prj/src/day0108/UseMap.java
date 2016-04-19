package day0108;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ű�� ���� ������ �̷���� Map
 * @author user
 */
public class UseMap {

	public UseMap(){
		// 1. ����
		Map<String,String> map = new HashMap<String,String>();  // 16�� ��, capacity�� �� �� �ִ�.
		// 2. ���Ҵ� : ���� ���� (Ű���ߺ������ʰ� ���� �ߺ��� �ȴ�), ����������� ����.
		map.put("A", "�ȳ�");
		map.put("B", "�ȳ�2");
		map.put("C", "�ȳ�3");
		map.put("D", "�ȳ�4");
		map.put("E", "�ȳ�5");
		System.out.println(map.toString()); // map = map.toString() ������ ��µ�
		map.put("B", "�ȳ�5"); // Ű�� ���ٸ� �⺻�� Ű�� ���� ������.
		System.out.println(map.toString()); // map = map.toString() ������ ��µ�
		// 3. ����
		map.remove("D");
		System.out.println(map);
//		map.clear();
//		System.out.println(map);
		
		// ��� ���� ���. for�� �̿��ؼ� ����� �Ұ����ϴ�.
		// ��� Ű�� �޾ƾ� ����� �����ϴ�.
		Set<String> keys=null;
		keys = map.keySet(); // Ű�� ������ �� �ְ� Generic�� String���� �Ѵ�.
		Iterator<String> ita = keys.iterator(); 
		
		String key, value = "";
		while(ita.hasNext()){ 
			key = ita.next();
			value = map.get(key); // Ű�� �ϳ� ����
			System.out.println(value); // �ʿ� Ű�� �־� ���� ��ȸ
//			System.out.println(ita.next()); // Ű ���
//			System.out.println(map.get(ita.next())); // �� ���
		}
		
		
		
	}//UseMap
	
	
	private void useHashTable(){
		Map<String, String> map = new Hashtable<String,String>(); // 11�� ��
		map.put("A", "�����ϴ�, ģ���ϴ�^0^b");
		map.put("B", "�����巴��");
		map.put("AB", "������");
		map.put("O", "�����δ��ϴ�");
		map.put("A", "�ҽ��ϴ�"); 
		System.out.println(map);// ���� Ű�� ������ ������ ������� ����.
		
		String blood = "a";
		String value = map.get(blood.toUpperCase()); // Ű�� ���ٸ� null�� ���´�.
		if(value !=null){
			System.out.println(blood+"���� Ư¡�� "+value);
		}else{
			System.out.println(blood+"���� ����� ���� �ƴմϴ�.");
		}
	}//useHashtable
	private void useHashMap(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("��ź����", "�޸� ��Ű��, ���� ��´�.");
		map.put("�����̼�", "�������� ����");
		map.put("���乫��", "��������");
		map.put("����õ��", "�񸶸� ����� �칰�� �Ǵ�");
		map.put("����ġ��", "�Լ��� ������ �̰� �ø�");
		map.put("�Ź�����", "���̻� �Ź��� �������� ����");
		map.put("���ֿ뾾", "�� ���ϴ� ���");
		
		String key = "���ֱ���";
		String value = map.get(key);
		if (value == null) {
			value=" ���� �غ�����ʾҽ��ϴ�.";
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
