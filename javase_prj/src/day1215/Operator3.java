package day1215;
/*
	<< : 비트를 왼쪽으로 밀고, 밀어서 빈칸은 항상 0을 채운다 
	>> : 비트를 오른쪽으로 밀고, 밀어서 빈칸은 최상위. 
		  부호비트에 따라 양수면 0을 채우고 음수면 1을치운다 
	>>>: 비트를 오른쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채운다 (음수표현하지 않는다)
*/

class Operator3 {
	public static void main(String[] args) {
		int num = 12;
		System.out.println(num+"<<2 = "+(num<<2));
		num = 40;
		System.out.println(num+">>1 = "+(num>>1));
		num = 30;
		System.out.println(num+">>>2 = "+(num>>>2));
	}
}
