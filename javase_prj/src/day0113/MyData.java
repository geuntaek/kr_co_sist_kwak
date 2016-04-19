package day0113;

import java.io.Serializable;
import java.util.Calendar;

/**
 * 객체 생성 후 직렬화 되어야 하는 대상
 * 객체는 직렬화가 되지 않지만 Serializable interface를 구현 하면 직렬화가 된다.
 * 직렬화를 막으려면 transient 키워드를 붙인다.
 * @author user
 */
public class MyData implements Serializable {
	
	private static final long serialVersionUID = 1L;
//			Calendar.getInstance().get(Calendar.MINUTE);
	
	private transient String name;
	private int age;
	private transient double weight; // 인스턴스이기때문에 자동 초기화가 된다.
	public MyData() { // 기본생성자
	}
	public MyData(String name, int age, double weight) { // 인자있는 생성자
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "MyData [name=" + name + ", age=" + age + ", weight=" + weight +"버전 =  "+serialVersionUID+"]";
	}
	
	
	
	
	
}



