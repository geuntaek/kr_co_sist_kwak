package day0107;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �ߺ������͸� �������� �ʰ�, ���� ��ȸ�� �� ���� Set
 * ����� �����ʹ� ����������� ����ȴ�.
 * @author user
 */
public class UseSet {

	public UseSet(){
		//1.����
		Set<String> set = new HashSet<String>();
		set.add("����ȯ");
		set.add("������");
		set.add("���ֿ�");
		set.add("�ֿ���"); 
		set.add("������"); 
		set.add("����ȯ"); // �ߺ����� ���� �ʴ´�
		set.add("������");
		System.out.println("set�� ũ��" + set.size());
		System.out.println(set);
		
		// �迭�� ������
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		//����
		System.out.println("���� �� set�� ũ��" + set.size());
		set.remove("���ֿ�");
		
//		//��λ���
//		set.clear();
//		System.out.println("��λ��� �� set�� ũ��" + set.size());
//		System.out.println(set);
//		
		/*
		//�˻�
		Iterator<String> ita = set.iterator();
		while(ita.hasNext()){ // ������ ���� ��ü�� �����Ͱ� �����ϸ� true �ƴϸ� false
			//���� ���� �������� ������ġ�� �����͸� �̵��ϴ� method
			System.out.println(ita.next());
		}// end while
		*/
		
		// ������ for�� ����ϸ� Iterator�� ������� �ʰ� ����� ����, �ݵ�� generic�� �־�� ��밡��
		for(String name:set){
			System.out.println(name);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�迭 "+arr[i]);
		}
	}//UseSet
	
	public static void main(String[] args) {
		new UseSet();
	}//main

}//class
