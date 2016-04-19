package day0113;

import java.io.Serializable;
import java.util.Calendar;

/**
 * ��ü ���� �� ����ȭ �Ǿ�� �ϴ� ���
 * ��ü�� ����ȭ�� ���� ������ Serializable interface�� ���� �ϸ� ����ȭ�� �ȴ�.
 * ����ȭ�� �������� transient Ű���带 ���δ�.
 * @author user
 */
public class MyData implements Serializable {
	
	private static final long serialVersionUID = 1L;
//			Calendar.getInstance().get(Calendar.MINUTE);
	
	private transient String name;
	private int age;
	private transient double weight; // �ν��Ͻ��̱⶧���� �ڵ� �ʱ�ȭ�� �ȴ�.
	public MyData() { // �⺻������
	}
	public MyData(String name, int age, double weight) { // �����ִ� ������
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
		return "MyData [name=" + name + ", age=" + age + ", weight=" + weight +"���� =  "+serialVersionUID+"]";
	}
	
	
	
	
	
}



