package day1215;
/*
	대입연산자
	= (순수대입) 
	+=, -=, *=, /=, %= (산술대입) : 산술연산자와 대입연산자가 합쳐진 연산자 
	<<= ,>>=,>>>= (쉬프트대입) : 쉬프트와 대입
	&= ,|=, ^= (비트논리대입) : 비트논리와 대입연산자가 합쳐짐 
*/
class Operator6 {
	public static void main(String[] args) {
		int i = 3;
		// 산술대입
		System.out.println("------------------산술 대입------------------");
		i += 2;
		System.out.println(i);
		i -= 1;
		System.out.println(i);
		i *= 3;
		System.out.println(i);
		i /= 2;
		System.out.println(i);
		i %= 5;
		System.out.println(i);
		// 쉬프트대입
		System.out.println("------------------쉬프트 대입------------------");
		i<<=5; // 0000 0001 -> 0010 0000
		System.out.println(i);
		i>>=2; // 0010 0000 -> 0000 1000
		System.out.println(i);
		i>>>=1; // 0000 1000 -> 0000 0100
		System.out.println(i);
		System.out.println("------------------비트논리 대입------------------");
		i &= 15; // 0100 & 1111  -> 0100
		System.out.println(i);
		i |= 1; // 0100 | 0001 -> 0101
		System.out.println(i);
		i ^= 3; // 0101 ^ 0011 -> 0110
		System.out.println(i);
	}//main
}//class
