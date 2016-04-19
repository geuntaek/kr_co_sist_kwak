package day1218;

public class Homework4 {

	public static void main(String[] args) {
		{
			System.out.println("\n¼÷Á¦1");
			int year = Integer.parseInt(args[0]);
			System.out.print("ÅÂ¾î³­ ÇØ : " + year + ", ³ªÀÌ : " + (2015 - year + 1) + ", ¶ì :");
			switch (year % 12) {
			case 0:
				System.out.println("¿ø¼şÀÌ¶ì");
				break;
			case 1:
				System.out.println("´ß¶ì");
				break;
			case 2:
				System.out.println("°³¶ì");
				break;
			case 3:
				System.out.println("µÅÁö¶ì");
				break;
			case 4:
				System.out.println("Áã¶ì");
				break;
			case 5:
				System.out.println("¼Ò¶ì");
				break;
			case 6:
				System.out.println("È£¶ûÀÌ¶ì");
				break;
			case 7:
				System.out.println("Åä³¢¶ì");
				break;
			case 8:
				System.out.println("¿ë¶ì");
				break;
			case 9:
				System.out.println("¹ì¶ì");
				break;
			case 10:
				System.out.println("¸»¶ì");
				break;
			case 11:
				System.out.println("¾ç¶ì");
				break;
			}
			
			System.out.println("\n¼÷Á¦2");
			int count = 0;
			for (int i = 1; i < 101; i++) {
				if (i % 3 == 0) {
					System.out.print("Â¦ ");
					count++;
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println("\nÂ¦ÀÇ °³¼ö : " + count);
			
			System.out.println("\n¼÷Á¦3");
			for (int i = 0; i < 5; i++) {
				for (int j = i + 1; j < 6; j++) {
					System.out.print(i + " " + j + " ");
				}
				System.out.println();
			}
			
			System.out.println("\n¼÷Á¦4");
			int num = 0;
			num = Integer.parseInt(args[1]);
			int times = 1;
			if (num > 1 && num < 10) {
				System.out.println(num + "´Ü");
				while (times < 10) {
					System.out.print(num + " * " + times + " : " + num * times + "   ");
					times++;
				}
			} else
				System.out.println("Àß¸øÀÔ·ÂÇÔ");
		}
		
		System.out.println("\"¾È³ç\"");
		//System.out.println("c:\dev\a.txt");
		System.out.println("¾È³ç\nÇÏ¼¼¿ä");
		System.out.println("¿À´ÃÀº\"¿ù¿äÀÏ\"ÀÔ´Ï´Ù");
	}
}
