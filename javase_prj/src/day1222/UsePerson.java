package day1222;

/**
 *	��� Ŭ������ ����Ͽ� ��ü�� �����, ��ü�� �� �� �ִ� ���� ��Ű�� Ŭ����
 * @author user
 */
public class UsePerson {
	
	public static void main(String[] args) {
		Person geuntaek = new Person();
		geuntaek.setName("������");
		// ������ ���� �� �ʿ���� �ڵ�
//		geuntaek.setEye(2);
//		geuntaek.setMouth(1);
//		geuntaek.setNose(1);
		
		System.out.println(geuntaek.eat());
		System.out.println(geuntaek.eat("\"�Ľ�Ÿ\"", 15000));
		
		Person jinban = new Person(3,1,1);
		jinban.setName("õ����");
//		jinban.setEye(3);
//		jinban.setMouth(1);
//		jinban.setNose(1);
		System.out.printf("õ������ �� ������ %d���̴�.\n",jinban.getEye());
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����", 1));
	}
}
