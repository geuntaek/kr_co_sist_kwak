package day1221;

public class Noddle {
	private String name;
	private int soup;
	private String brand;

	public void setName(String name) {
		this.name = name;
	}

	public int getSoup() {
		return soup;
	}

	public void setSoup(int soup) {
		this.soup = soup;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public String boil(String min) {
		return "라면의 이름은 " + name + " 스프의 개수는" + soup + "개이고 brand는 " + brand + "이다 나는" + min + "동안 끓일 것이다\n";
	}

}
