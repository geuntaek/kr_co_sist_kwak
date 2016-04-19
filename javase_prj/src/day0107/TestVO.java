package day0107;

/**
 * VO(Value Object) : 값을 저장하고 반환할 목적으로 만드는 객체. = DTO(Data Transfer Object) = Domain
 * 규칙 : 변수의 접근지정자는 private(default)로 한다!!!!!!
 * 			값을 설정하는 목적의 method인 setter(public void set변수명(매개변수)),
 * 			설정된 값을 반환하는 목적의 method인 getter(public 반환형 get변수명())
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
	public String toString() { // 인스턴스의 주소가 아닌 값을 보이기 위해 Overriding
		return "TestVO [name=" + name + ", age=" + age + "]";
	}
	
	

	
}//class
