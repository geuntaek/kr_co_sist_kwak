package day0107;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author user
 */
public class UseArrayList {
	
	public List<TestVO> processData() { // ��ȯ�� List�� �ؾ��� �� ��ȯ���� List�� �Ѵ�.
		List<TestVO> list = new ArrayList<TestVO>();

		list.add(new TestVO("���ֿ�",25));
		list.add(new TestVO("������",28));
		TestVO tv = new TestVO("����ȯ",25);
		list.add(tv);
		TestVO tv1 = new TestVO("�յ���",31);
		list.add(tv1);
//		System.out.println(tv.toString());
		return list;
	}//processData
	
	public void viewData(){ // �����ִ� method
		List<TestVO> list = processData(); // this.processData()��� �Ƚᵵ �ȴ�.
		TestVO tv = null;
//		System.out.println(str);
//		List list = processData(); // Generic�� �Ⱦ���� 
//		tv = (TestVO)list.get(i) // ���� = (�����Ŭ����)list.get(i);�� ���� casting�ؼ� ������ �����Ѵ�.
		int totalAge = 0;
		for (int i = 0; i < list.size(); i++) {
			tv = list.get(i);
			System.out.println(tv.getName()+"�� ���� "+tv.getAge()+"��");
			totalAge +=tv.getAge();
		}
		System.out.println("������ �� : "+totalAge);
		
	}//viewData
	
	public static void main(String[] args) {
		UseArrayList ual = new UseArrayList();
		ual.viewData();
	}//main

}//class
