package day0107;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author user
 */
public class UseArrayList {
	
	public List<TestVO> processData() { // 반환을 List로 해야할 때 반환형을 List로 한다.
		List<TestVO> list = new ArrayList<TestVO>();

		list.add(new TestVO("진주용",25));
		list.add(new TestVO("조근택",28));
		TestVO tv = new TestVO("도윤환",25);
		list.add(tv);
		TestVO tv1 = new TestVO("손두한",31);
		list.add(tv1);
//		System.out.println(tv.toString());
		return list;
	}//processData
	
	public void viewData(){ // 보여주는 method
		List<TestVO> list = processData(); // this.processData()라고 안써도 된다.
		TestVO tv = null;
//		System.out.println(str);
//		List list = processData(); // Generic을 안쓴경우 
//		tv = (TestVO)list.get(i) // 변수 = (저장된클래스)list.get(i);와 같이 casting해서 변수에 저장한다.
		int totalAge = 0;
		for (int i = 0; i < list.size(); i++) {
			tv = list.get(i);
			System.out.println(tv.getName()+"의 나이 "+tv.getAge()+"살");
			totalAge +=tv.getAge();
		}
		System.out.println("나이의 합 : "+totalAge);
		
	}//viewData
	
	public static void main(String[] args) {
		UseArrayList ual = new UseArrayList();
		ual.viewData();
	}//main

}//class
