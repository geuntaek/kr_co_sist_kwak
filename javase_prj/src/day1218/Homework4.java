package day1218;

public class Homework4 {

	public static void main(String[] args) {
		{
			System.out.println("\n����1");
			int year = Integer.parseInt(args[0]);
			System.out.print("�¾ �� : " + year + ", ���� : " + (2015 - year + 1) + ", �� :");
			switch (year % 12) {
			case 0:
				System.out.println("�����̶�");
				break;
			case 1:
				System.out.println("�߶�");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("���");
				break;
			case 5:
				System.out.println("�Ҷ�");
				break;
			case 6:
				System.out.println("ȣ���̶�");
				break;
			case 7:
				System.out.println("�䳢��");
				break;
			case 8:
				System.out.println("���");
				break;
			case 9:
				System.out.println("���");
				break;
			case 10:
				System.out.println("����");
				break;
			case 11:
				System.out.println("���");
				break;
			}
			
			System.out.println("\n����2");
			int count = 0;
			for (int i = 1; i < 101; i++) {
				if (i % 3 == 0) {
					System.out.print("¦ ");
					count++;
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println("\n¦�� ���� : " + count);
			
			System.out.println("\n����3");
			for (int i = 0; i < 5; i++) {
				for (int j = i + 1; j < 6; j++) {
					System.out.print(i + " " + j + " ");
				}
				System.out.println();
			}
			
			System.out.println("\n����4");
			int num = 0;
			num = Integer.parseInt(args[1]);
			int times = 1;
			if (num > 1 && num < 10) {
				System.out.println(num + "��");
				while (times < 10) {
					System.out.print(num + " * " + times + " : " + num * times + "   ");
					times++;
				}
			} else
				System.out.println("�߸��Է���");
		}
		
		System.out.println("\"�ȳ�\"");
		//System.out.println("c:\dev\a.txt");
		System.out.println("�ȳ�\n�ϼ���");
		System.out.println("������\"������\"�Դϴ�");
	}
}
