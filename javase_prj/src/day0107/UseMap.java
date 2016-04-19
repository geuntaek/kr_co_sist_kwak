package day0107;

import java.util.HashMap;
import java.util.Map;

/**
 * Ű�� ���� ������ �̷���� Map
 * @author user
 */
public class UseMap {

	private void useHashTable(){
		Map<String, String> map = new HashMap<String,String>(); // 11�� ��
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
