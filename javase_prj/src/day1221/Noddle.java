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
		return "����� �̸��� " + name + " ������ ������" + soup + "���̰� brand�� " + brand + "�̴� ����" + min + "���� ���� ���̴�\n";
	}

}
