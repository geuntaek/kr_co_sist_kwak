package day1216;
/**
	둘중 하나의 코드를 실행해야할 때 사용하는 if~else
**/
class TestIfElse {
	public static void main(String[] args) {
		// 입력되는 이름이 "신민우"라면 이름 앞에 "반장"을 붙이고 
		// 그렇지 않다면 이름 앞에 "평민"을 붙여서 출력
		if(args[0].equals("신민우")){
			System.out.print("반장 ");
		}
		else{
			System.out.print("평민 ");
		}
		System.out.println(args[0]);

		// 입력된 args[1]을 정수로 변경하여 홀수, 짝수를 출력하는 if~else
		int num = Integer.parseInt(args[1]);
		System.out.print(num+"는(은) ");
		if(num%2==0){
			System.out.println("짝수");
		}
		else{
			System.out.println("홀수");
		}
	}//main
}//class
