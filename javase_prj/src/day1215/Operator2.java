package day1215;
class Operator2 {
	public static void main(String[] args) {
		int num = 15;
		System.out.println(num+"을 2개의 가짓수 "+num%2);
		int year = 1993;
		System.out.println(year+"을 12개로 나눈 나머지 = "+year%12+"\n");

		// << : 비트를 왼쪽으로 밀고, 밀어서 빈칸은 항상 0을 채운다
		// >> : 비트를 오른쪽으로 밀고, 밀어서 빈칸은 최상위.
		//		  부호비트에 따라 양수면 0을 채우고 음수면 1을치운다
		//>>>: 비트를 오른쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채운다
		int i = 9;
		System.out.println("9 = "+Integer.toBinaryString(i));
		System.out.println(i+" << 2 = "+(i<<2));
		System.out.println((i<<2)+" = "+Integer.toBinaryString((i<<2))+"\n");

		i = 30;
		System.out.println("30 = "+Integer.toBinaryString(i));
		System.out.println(i+" >> 3 = "+(i>>3));
		System.out.println((i>>3)+" = "+Integer.toBinaryString((i>>3))+"\n");

		i= -1;
		System.out.println("-1 = "+Integer.toBinaryString(i));
		System.out.println(i+" >> 4 = "+(i>>4));
		System.out.println((i>>4)+" = "+Integer.toBinaryString((i>>4))+"\n");

		i = 25;
		System.out.println("25 = "+Integer.toBinaryString(i));
		System.out.println(i+" >>> 2 = "+(i>>>2));
		System.out.println((i>>>2)+" = "+Integer.toBinaryString((i>>>2))+"\n");

		i = -1;
		System.out.println("-1 = "+Integer.toBinaryString(i));
		System.out.println(i+" >>> 1 = "+(i>>>1));
		System.out.println((i>>>1)+" = "+Integer.toBinaryString((i>>>1))+"\n");

	}// main
}// class
