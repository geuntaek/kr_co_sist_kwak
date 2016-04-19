package day0107;

/**
 * VO(Value Object) : ���� �����ϰ� ��ȯ�� �������� ����� ��ü. = DTO(Data Transfer Object) = Domain
 * ��Ģ : ������ ���������ڴ� private(default)�� �Ѵ�!!!!!!
 * 			���� �����ϴ� ������ method�� setter(public void set������(�Ű�����)),
 * 			������ ���� ��ȯ�ϴ� ������ method�� getter(public ��ȯ�� get������())
 * @author user
 */
public class TestVO {
	
	private String name;
	private int age;
	
	public TestVO() { 
	}
	
	public TestVO(String name, int age) { 
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() { // �ν��Ͻ��� �ּҰ� �ƴ� ���� ���̱� ���� Overriding
		return "TestVO [name=" + name + ", age=" + age + "]";
	}
	
	

	
}//class
