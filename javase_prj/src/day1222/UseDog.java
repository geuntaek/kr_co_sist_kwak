package day1222;

public class UseDog {

	public static void main(String[] args) {
		Dog jindo = new Dog();
		System.out.println(jindo.eat("���"));
		
		Dog poodle = new Dog(2,2,5,"����");
		System.out.println(poodle.run("1000����"));
		
		Dog corgi = new Dog(2,1,3,"���̺�");
		System.out.println("���� "+corgi.getEye()+"��, ������ "+corgi.getTail()+
				"��, �ٸ��� "+corgi.getLeg()+"���� �� ���� �л��� "+corgi.getColor());
	}

}
