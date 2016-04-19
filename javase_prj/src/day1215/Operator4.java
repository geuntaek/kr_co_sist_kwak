package day1215;
/*
	논리 연산자
	일반논리 = 여러개의 관계연산자를 연결할 때 사용
	&&(AND) : 전항과 후항이 모두 참일 때 참을 반환
	||(OR) : 전항과 후항이 모두 거짓일 때 거짓을 반환
	비트논리 = 비트연산시 사용
	& (AND) : 상위비트와 하위비트 모두 1일때만 1을 내림
	| (OR) :  상위비트와 하위비트 모두 0일때만 0내림
	^ (XOR) : 상위비트와 하위비트 둘중 하나만 1일때 1내림

*/
class Operator4 {
	public static void main(String[] args) {
		/*boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		System.out.println("==========AND===========");
		// 전항이 FALSE면 계산하지 않고 FALSE를 내보냄
		System.out.println(flag1+" && "+flag3+" = "+(flag1&&flag3));
		System.out.println(flag1+" && "+flag2+" = "+(flag1&&flag2));
		System.out.println(flag2+" && "+flag3+" = "+(flag2&&flag3));
		System.out.println(flag2+" && "+flag4+" = "+(flag2&&flag4));
		System.out.println("==========OR===========");
		// 전항이 TRUE면 계산하지 않고 TURE를 내보냄
		System.out.println(flag1+" || "+flag3+" = "+(flag1||flag3));
		System.out.println(flag1+" || "+flag2+" = "+(flag1||flag2));
		System.out.println(flag2+" || "+flag3+" = "+(flag2||flag3));
		System.out.println(flag2+" || "+flag4+" = "+(flag2||flag4)+"\n");

		// 변수에 들어있는 수가 0~10 사이면 TRUE, 그렇지 않으면 FALSE를 출력
		int num=10;
		System.out.println((num>=0&&num<=10));
		int num = 5;
		int result = 0;
		System.out.println(num>=0||(result=3)<=10);
		System.out.println(result);*/

		System.out.println("===========비트논리=============");
		int i=19;
		int j=24;
		System.out.println(i+" & "+j+" = "+(i&j));
		System.out.println(i+" | "+j+" = "+(i|j));
		System.out.println(i+" ^ "+j+" = "+(i^j));


	}// main
}// class
