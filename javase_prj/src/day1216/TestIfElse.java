package day1216;
/**
	���� �ϳ��� �ڵ带 �����ؾ��� �� ����ϴ� if~else
**/
class TestIfElse {
	public static void main(String[] args) {
		// �ԷµǴ� �̸��� "�Źο�"��� �̸� �տ� "����"�� ���̰� 
		// �׷��� �ʴٸ� �̸� �տ� "���"�� �ٿ��� ���
		if(args[0].equals("�Źο�")){
			System.out.print("���� ");
		}
		else{
			System.out.print("��� ");
		}
		System.out.println(args[0]);

		// �Էµ� args[1]�� ������ �����Ͽ� Ȧ��, ¦���� ����ϴ� if~else
		int num = Integer.parseInt(args[1]);
		System.out.print(num+"��(��) ");
		if(num%2==0){
			System.out.println("¦��");
		}
		else{
			System.out.println("Ȧ��");
		}
	}//main
}//class
