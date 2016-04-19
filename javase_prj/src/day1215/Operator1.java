package day1215;
/**************************
	단항연산자의 사용
	~, !, +, -, ++, --
***************************/
class Operator1{
	public static void main(String[] args) {
		/*int temp = 10;
		System.out.println(temp+" 의 2진수 "+Integer.toBinaryString(temp));
		System.out.println(temp+" 의 8진수 "+Integer.toOctalString(temp));
		System.out.println(temp+" 의 16진수 "+Integer.toHexString(temp));*/
		// 연산자 대상체;
		// 1. ~ : 1의 보수연산
		int num1=15, num2=-12;
		System.out.println("~"+num1+" = "+~num1); // ~양수 : 부호변경 1증가
		System.out.println("~"+num2+" = "+~num2+"\n"); // ~음수 : 부호변경 1감소 
		// 2. ! : true -> flase, false -> true
		boolean b1 = true, b2 = false;
		System.out.println("!"+b1+" = "+!b1);
		System.out.println("!"+b2+" = "+!b2);
		System.out.println(!(3<2)+"\n");
		// 3. + : 형식적인 제공, 사용할 수 있으나 일을 하지는 않는다.
		System.out.println("+"+num1+" = "+ +num1);
		System.out.println("+"+num2+" = "+ +num2+"\n");
		// 4. - : 2의 보수연산
		System.out.println("-"+num1+" = "+ -num1);
		System.out.println("-"+num2+" = "+ -num2+"\n");
		// 5. ++(대상체의 값을 1 증가) , -- (대상체의 값을 1 감소)
		++num1;
		System.out.println("전위연산 = "+num1); // 15->16
		num1++;
		System.out.println("후위연산 = "+num1); // 16->17
		--num1;
		System.out.println("전위연산 = "+num1);
		num1--;
		System.out.println("후위연산 = "+num1);
		// 대입연산자와 같이 사용되면 전위와 후위는 다른 값을 대입해준다.
		// 전위는 내것먼저, 연산후 결과를 대입. 후위는 남의 것 먼저, 대입후 연산을 한다.
		int result = 0;
		result = ++num1;
		System.out.println("\n전위 연산 후 num1 = "+num1+", result = "+result);
		result = 0;
		result = num1++;
		System.out.println("후위 연산 후 num1 = "+num1+", result = "+result);
		}// main
}// class
