package day1215;
/*
	���Կ�����
	= (��������) 
	+=, -=, *=, /=, %= (�������) : ��������ڿ� ���Կ����ڰ� ������ ������ 
	<<= ,>>=,>>>= (����Ʈ����) : ����Ʈ�� ����
	&= ,|=, ^= (��Ʈ������) : ��Ʈ���� ���Կ����ڰ� ������ 
*/
class Operator6 {
	public static void main(String[] args) {
		int i = 3;
		// �������
		System.out.println("------------------��� ����------------------");
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
		// ����Ʈ����
		System.out.println("------------------����Ʈ ����------------------");
		i<<=5; // 0000 0001 -> 0010 0000
		System.out.println(i);
		i>>=2; // 0010 0000 -> 0000 1000
		System.out.println(i);
		i>>>=1; // 0000 1000 -> 0000 0100
		System.out.println(i);
		System.out.println("------------------��Ʈ�� ����------------------");
		i &= 15; // 0100 & 1111  -> 0100
		System.out.println(i);
		i |= 1; // 0100 | 0001 -> 0101
		System.out.println(i);
		i ^= 3; // 0101 ^ 0011 -> 0110
		System.out.println(i);
	}//main
}//class
