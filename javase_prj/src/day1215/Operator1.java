package day1215;
/**************************
	���׿������� ���
	~, !, +, -, ++, --
***************************/
class Operator1{
	public static void main(String[] args) {
		/*int temp = 10;
		System.out.println(temp+" �� 2���� "+Integer.toBinaryString(temp));
		System.out.println(temp+" �� 8���� "+Integer.toOctalString(temp));
		System.out.println(temp+" �� 16���� "+Integer.toHexString(temp));*/
		// ������ ���ü;
		// 1. ~ : 1�� ��������
		int num1=15, num2=-12;
		System.out.println("~"+num1+" = "+~num1); // ~��� : ��ȣ���� 1����
		System.out.println("~"+num2+" = "+~num2+"\n"); // ~���� : ��ȣ���� 1���� 
		// 2. ! : true -> flase, false -> true
		boolean b1 = true, b2 = false;
		System.out.println("!"+b1+" = "+!b1);
		System.out.println("!"+b2+" = "+!b2);
		System.out.println(!(3<2)+"\n");
		// 3. + : �������� ����, ����� �� ������ ���� ������ �ʴ´�.
		System.out.println("+"+num1+" = "+ +num1);
		System.out.println("+"+num2+" = "+ +num2+"\n");
		// 4. - : 2�� ��������
		System.out.println("-"+num1+" = "+ -num1);
		System.out.println("-"+num2+" = "+ -num2+"\n");
		// 5. ++(���ü�� ���� 1 ����) , -- (���ü�� ���� 1 ����)
		++num1;
		System.out.println("�������� = "+num1); // 15->16
		num1++;
		System.out.println("�������� = "+num1); // 16->17
		--num1;
		System.out.println("�������� = "+num1);
		num1--;
		System.out.println("�������� = "+num1);
		// ���Կ����ڿ� ���� ���Ǹ� ������ ������ �ٸ� ���� �������ش�.
		// ������ ���͸���, ������ ����� ����. ������ ���� �� ����, ������ ������ �Ѵ�.
		int result = 0;
		result = ++num1;
		System.out.println("\n���� ���� �� num1 = "+num1+", result = "+result);
		result = 0;
		result = num1++;
		System.out.println("���� ���� �� num1 = "+num1+", result = "+result);
		}// main
}// class
