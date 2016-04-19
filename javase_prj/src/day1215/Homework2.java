package day1215;
class Homework2 {
	public static void main(String[] args) {
		System.out.println("숙제1");
		//고객등급은 0과 1만 존재, 0은 일반고객 1은 특별고객
		//물건가격을 변수에 넣고 특별고객은 35%의 할인율을 적용
		//일반고객은 10%의 할인율을 적용하여 물건값을 계산하여 변수에 저장 후 출력
		int grade=1;
		int real_cost=10000;
		System.out.println("고객의 등급은 "+ ((grade == 0) ? "일반고객":"특별고객"));
		System.out.println("정상가는 "+real_cost);
		System.out.println("할인가는 "+ ((grade == 0) ? real_cost*0.9 : real_cost * 0.65));
		
		System.out.println("\n숙제2");
		//변수에 입력된 수가 홀수인지 짝수인지 출력
		int temp1 = 14;
		System.out.println(temp1 +"는 "+((temp1%2==1) ? "홀수" : "짝수"));

		System.out.println("\n숙제3");
		//char 형에 '가'를 입력하고 상위1바이트의 값과 하위 1바이트의 값을 따로 출력
		char c = '나';
		//int c_num = c;
		//System.out.println(c+"는 숫자로 "+c);
		System.out.println("2진수 = "+Integer.toBinaryString(c));
		System.out.println("16진수 = "+Integer.toHexString(c));
		//System.out.println("상위 1byte = "+Integer.toBinaryString(c>>8));
		System.out.println("상위 1byte = "+Integer.toBinaryString((c&0xff00)>>8));
		System.out.println("하위 1byte = "+Integer.toBinaryString(c&0x00ff));
		System.out.println(Integer.toBinaryString(0x00ff));

		System.out.println("\n숙제4");
		// 변수에 저장된 값을 ~을 붙여 출력하는데 부호만 변경되고 값은 그대로 출력되도록 작성(삼항)
		int temp2 = -7;
		System.out.println(~temp2<0 ? "~"+(-temp2): "~"+(-temp2));
	}
}
