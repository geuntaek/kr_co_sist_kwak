package day1216;
/*
	main tethod�� �ܺΰ��ֱ�
	dos : java UseArguments �� �� �� ..... 
	�ԷµǴ� ���� ���ڿ��̹Ƿ� ������ ���� �ʴ´�.
*/
class UseArguments {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		// ���ڿ��� ������ ��ȯ�ϴ� ���� ���ִ� method�� ���
		// Integer.parseInt(���������� ���ڿ�)
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}
}
