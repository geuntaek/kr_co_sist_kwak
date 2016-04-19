package day1214;
class Practice2 {
	public static final int PAY = 10000;
	public static final int FARE = 1350;
	public static void main(String[] args) {
		System.out.println("¼÷Á¦ 1");
		int lunch=0;
		int remain=0;
		lunch = 4000;
		remain = (PAY-FARE*2-lunch);
		System.out.println("ÇÏ·ç ¿ëµ· : "+PAY+", Á¡½É°ª : "+lunch+", ÆíµµÂ÷ºñ : "+FARE+", ¿Õº¹Â÷ºñ : "+(FARE*2)+
			"\n³²Àºµ· : "+remain);

		System.out.println("\n¼÷Á¦ 2");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		System.out.println(Character.MAX_VALUE); //	MAX_VALUE The constant value of this field is the largest value of type char, '\uFFFF'.
		//System.out.println(Character.MIN_VALUE); MIN_VALUE The constant value of this field is the smallest value of type char, '\u0000'.
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);

		System.out.println("\n¼÷Á¦ 3");
		char n1 = 'L';
		char n2 = 'S';
		char n3 = 'H';
		int name1 = (int)n1;
		int name2 = (int)n2;
		int name3 = (int)n3;
		System.out.println("L = "+name1+", S = "+name2+", H = "+name3);
	}
}
