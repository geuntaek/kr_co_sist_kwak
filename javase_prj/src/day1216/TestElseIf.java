package day1216;
/****************************************************************************
	관련있는 조건을 물어볼 때 사용하는 다중 if (else if)의 사용
****************************************************************************/
class TestElseIf {
	public static void main(String[] args) {
		// 입력된 수의 범위 체크, 값은 0과 100사이여야함
		int num = Integer.parseInt(args[0]);
		System.out.print(num);
		if(num<0){
			System.out.println("은 0보다 작을 수 없다");
		}
		else if(num>100){
			System.out.println("은 100보다 클 수 없다");
		}
		else{
			System.out.println("은 0~100사이의 숫자이다! 입력 성공");
		}
		
		int year = Integer.parseInt(args[1]);
		int flag = year%12;
		System.out.print("\n"+year);
		if(flag==0){
			System.out.println("년생은 원숭이띠");
		}
		else if(flag==1){
			System.out.println("년생은 닭띠");
		}
		else if(flag==2){
			System.out.println("년생은 개띠");
		}
		else if(flag==3){
			System.out.println("년생은 돼지띠");
		}
		else if(flag==4){
			System.out.println("년생은 쥐띠");
		}
		else if(flag==5){
			System.out.println("년생은 소띠");
		}
		else if(flag==6){
			System.out.println("년생은 호랑이띠");
		}
		else if(flag==7){
			System.out.println("년생은 토끼띠");
		}
		else if(flag==8){
			System.out.println("년생은 용띠");
		}
		else if(flag==9){
			System.out.println("년생은 뱀띠");
		}
		else if(flag==10){
			System.out.println("년생은 말띠");
		}
		else{
			System.out.println("년생은 양띠");
		}
	}//main
}//class
