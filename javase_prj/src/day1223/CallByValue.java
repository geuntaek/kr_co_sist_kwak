package day1223;

/**
 * method에 기본형 데이터형을 넘겨주면 복사된 값이 넘어간다.
 * @author user
 */
public class CallByValue {
	int i,j; // new가 될때 heap에 올라가면서 자동 초기화 된다. 멤버변수
			 // heap에 있음, 프로그램이 끝날때 사라진다.
	public void swap(int i, int j){ // int i와j 그리고 temp는 stack에 올라가고,
//									   호출이 끝나면 사라진다.
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap 내 i = "+i+", j = "+j);
	}
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		cbv.i = 2015;
		cbv.j = 12;
		System.out.println("swap 전 i = "+cbv.i+", j = "+cbv.j);
		cbv.swap(cbv.i,cbv.j); // 원본값이 복사되어 int i와 j에게 전달되어 
//								  원본값은 그대로 변함이 없다. 
		System.out.println("swap 후 i = "+cbv.i+", j = "+cbv.j);
	}
}
