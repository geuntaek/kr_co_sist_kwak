package day0107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * ������ �ߺ��� ����ϸ� �˻��� ����� �ִ� List�� ���
 * �����ʹ� ���������� �Էµȴ�
 * 1. List �� �����Ͱ� �ڷ� �߰� �� �� ����ϴ� ��
 * 		ArrayList : Multi Thread���� �������� ���� (����ȭó���� �Ǿ����� �ʴ�.) �ӵ��� ������
 * 		Vector : Multi Thread���� �������� �Ұ��� (����ȭó���� �Ǿ��ִ�.) �ӵ��� ������
 * 2. List �� �����Ͱ� �ڷ� �߰��Ǳ⵵ ������ �߰��� �Ǵ����� ����� �� ���
 * 		LinkedList
 * @author user
 */
public class UseList {

//	@SuppressWarnings({"rawtypes","unused"}) // annotation, SuppressWarnings�� �迭�ε� ���� 
	
	@SuppressWarnings("unchecked") // ���� üũ���� �ʴ´�.
	private void useArrayList(){ // �ۿ� ���� ������ �����ϱ� private
		
		/*
		jdk1.4���� �⺻�� ���������� �߰��� ������ Wrapper�� ���μ� (��ü��) �־�� �Ѵ�.
		generic�� jdk1.5�������� ����� �� �ִ�. 
		List list = new ArrayList(); // Generic�� ���� ��� -> warning�� ���.
		list.add(2016); // ����, jdk 1.4�� 2016���� �ϸ� ������ �߻�. auto boxing�� �ȵǼ�. wrapper�� �ξ��Ѵ�. new Integer(2016));
		list.add("����"); // ���ڿ�
		list.add(3.5); // �Ǽ�
		*/
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList(10); // capacity�� ����, ������ ũ�⸦ ����ϸ� capacity�� �ƴ϶� �����Ͱ� �����ϴ� ũ�Ⱑ ��µȴ�. 
		// generic�� �������� ������ ��� ���� �߰��� �� �ִ�. ������ warning�� ���.
		list.add(2016); // ���� : auto boxing
		list.add("����"); // ���ڿ� : ��ü�ϱ� auto boxing�� �Ͼ�� �ʴ´�.
		list.add(3.5); // �Ǽ� : auto boxing
		
		System.out.println(list.size());
		System.out.println(list); // instance Ȯ��, �ּҰ� �ƴ� ���� ���´�. ��? toString() method�� overriding�߱� �����̴�.
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // �ܼ��� ��� ���� ������ ���� �ʴ´�.
//			System.out.println(list.get(i)*2); // ������ ���� �ʴ� ���� �ֱ⶧���� ������ ����.
		}// end for
		
		//////////////////////////// Generic ��� ////////////////////////////
		
		List<String> list1 = new ArrayList<String>(10); // capacity�� ������ ����ִ� ���� ����.
//		list1.add(1); // �������̱� ������ ������ �߻��Ѵ�.
		list1.add("�̼���1");
		list1.add("�̼���2");
		list1.add("�̼���3");
		list1.add("�̼���4");
		list1.add("�̼���2"); // �ߺ� �� ����Ѵ�.
		list1.add("�̼���5");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		// �迭�� ������
		// 1. �迭���� : ���� ��
		String[] names = new String[list1.size()];
		// 2. ������ �迭�� List �� ������
//		list.toArray(names); // generic�� �Ƚ��� �־ �����ϸ� �����߻�
		list1.toArray(names); // ���� �±⶧���� ������ �߻����� ����
		
		// ����
		list1.remove(2); // list�� ����� ����� ��������� �迭�� �ƴϴ�.
		System.out.println("ù��° ���� �� "+list1);
		list1.remove("�̼���2"); // �ߺ��� ���� ���ﶧ�� ���� ���� ������ ���� �����.
		System.out.println("�ι�° ���� �� "+list1);
		// ��λ���
//		list1.clear();
//		System.out.println("����° ���� �� "+list1);
		
//		// list�� ��� �� ���
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("����Ʈ "+list1.get(i));
//		}// end for
		
		// ������ for�� ����� ����, Generic�� �������� ������ ������� ���Ѵ�.
		for(String str : list1){
			System.out.println(str);
		}// endfor
		
		// �迭�� ��� �� ���
		for (int i = 0; i < names.length; i++) {
			System.out.println("�迭 "+names[i]);
		}// end for
		
		
	} // useArrayList
	
	
	private void useVector(){ // �ۿ� ���� ������ �����ϱ� private
		
		
		Vector<String> list1 = new Vector<String>(10); // capacity�� ������ ����ִ� ���� ����.
//		list1.add(1); // �������̱� ������ ������ �߻��Ѵ�.
		list1.add("�̼���1");
		list1.add("�̼���2");
		list1.add("�̼���3");
		list1.add("�̼���4");
		list1.add("�̼���2"); // �ߺ� �� ����Ѵ�.
		list1.add("�̼���5");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		// �迭�� ������
		// 1. �迭���� : ���� ��
		String[] names = new String[list1.size()];
		// 2. ������ �迭�� List �� ������
//		list.toArray(names); // generic�� �Ƚ��� �־ �����ϸ� �����߻�
		list1.toArray(names); // ���� �±⶧���� ������ �߻����� ����
		
		// ����
		list1.remove(2); // list�� ����� ����� ��������� �迭�� �ƴϴ�.
		System.out.println("ù��° ���� �� "+list1);
		list1.remove("�̼���2"); // �ߺ��� ���� ���ﶧ�� ���� ���� ������ ���� �����.
		System.out.println("�ι�° ���� �� "+list1);
		// ��λ���
//		list1.clear();
//		System.out.println("����° ���� �� "+list1);
		
//		// list�� ��� �� ���
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("����Ʈ "+list1.get(i));
//		}// end for
		
		// ������ for�� ����� ����, Generic�� �������� ������ ������� ���Ѵ�.
		for(String str : list1){
			System.out.println(str);
		}// endfor
		
		// �迭�� ��� �� ���
		for (int i = 0; i < names.length; i++) {
			System.out.println("�迭 "+names[i]);
		}// end for
		
	} // useVector
	private void useLinkedList(){ // �ۿ� ���� ������ �����ϱ� private
		LinkedList<String> list1 = new LinkedList<String>(); // capacity�� �� �� ����.
//		list1.add(1); // �������̱� ������ ������ �߻��Ѵ�.
		list1.add("�̼���1");
		list1.add("�̼���2");
		list1.add(1,"�̼���3"); // LinkedList�� ��ġ�Ⱑ �����ϴ�.
		list1.add("�̼���4");
		list1.add("�̼���2"); // �ߺ� �� ����Ѵ�.
		list1.add("�̼���5");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		// �迭�� ������
		// 1. �迭���� : ���� ��
		String[] names = new String[list1.size()];
		// 2. ������ �迭�� List �� ������
//		list.toArray(names); // generic�� �Ƚ��� �־ �����ϸ� �����߻�
		list1.toArray(names); // ���� �±⶧���� ������ �߻����� ����
		
		// ����
		list1.remove(2); // list�� ����� ����� ��������� �迭�� �ƴϴ�.
		System.out.println("ù��° ���� �� "+list1);
		list1.remove("�̼���2"); // �ߺ��� ���� ���ﶧ�� ���� ���� ������ ���� �����.
		System.out.println("�ι�° ���� �� "+list1);
		// ��λ���
//		list1.clear();
//		System.out.println("����° ���� �� "+list1);
		
//		// list�� ��� �� ���
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println("����Ʈ "+list1.get(i));
//		}// end for
		
		// ������ for�� ����� ����, Generic�� �������� ������ ������� ���Ѵ�.
		for(String str : list1){
			System.out.println(str);
		}// endfor
		
		// �迭�� ��� �� ���
		for (int i = 0; i < names.length; i++) {
			System.out.println("�迭 "+names[i]);
		}// end for
	} // useLinkedList
	public static void main(String[] args) {
		
		UseList ul = new UseList();
		ul.useArrayList();
		System.out.println("--------------------------------------------------");
		ul.useVector();
		System.out.println("--------------------------------------------------");
		ul.useLinkedList();
		
		
	} // main

}// class






