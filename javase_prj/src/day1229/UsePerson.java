package day1229;

/**
 *
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		
		HongGilDong gd = new HongGilDong(); // Person�� ��ӹ��� HongGilDong Ŭ����.
		gd.setName("ȫ�浿"); // �θ�Ŭ������ method
		System.out.printf("��%d�� ��%d�� ��%d��\n",gd.getEye(),gd.getMouth(),gd.getNose()); // �θ�Ŭ������ method
		System.out.println(gd.eat());// �θ�Ŭ������ method
		System.out.println(gd.eat("����", 1));// �θ�Ŭ������ method
		
		System.out.println(gd.getName()+"��(��)"+gd.Fight(5)); //
		System.out.println(gd.getName()+"��(��)"+gd.Fight(6)); //
		System.out.println(gd.getName()+"��(��)"+gd.Fight(9)); //
		System.out.println(gd.getName()+"��(��)"+gd.Fight(7)); //
		
		System.out.println("\n---------------------------------------------");
		
		Clark superman = new Clark();
		superman.setName("Ŭ��");
		System.out.printf("��%d�� ��%d�� ��%d��\n",superman.getEye(),
				superman.getMouth(),superman.getNose()); // �θ�Ŭ������ method
		System.out.println(superman.eat());
		System.out.println(superman.eat("����",10));
		
		String stone = "ũ���䳪��Ʈ";
		System.out.println(stone+"  "+superman.power(stone));
		
		System.out.println("\n---------------------------------------------");
		
		Sohee sh = new Sohee();
		sh.setName("�̼���");
		String fruit = "��";
		System.out.println(sh.getName()+"�� "+fruit+"��(��) "+sh.hateFruit(fruit));
		fruit = "����";
		System.out.println(sh.getName()+"�� "+fruit+"��(��) "+sh.hateFruit(fruit));
		fruit = "���";
		System.out.println(sh.getName()+"�� "+fruit+"��(��) "+sh.hateFruit(fruit));
		fruit = "���";
		System.out.println(sh.getName()+"�� "+fruit+"��(��) "+sh.hateFruit(fruit));
		fruit = "��";
		System.out.println(sh.getName()+"�� "+fruit+"��(��) "+sh.hateFruit(fruit));
		
		
	}// main

}// class
