package day0105;

import static java.lang.System.out;

public class RunWork {
	
	private Work work;
	public RunWork(){ // 메소드마다 객체화할 필요를 줄여준다.
		work = new Work();
	}
	private void viewPass(){ // 이 클래스 안에서만 사용할거기때문에 private
		char[] pass = work.password();
		
		out.printf("비밀번호 : ");
		for (int i = 0; i < pass.length; i++) {
			out.print(pass[i]);
		}
		/* 개선된 for문은 어쨌든 원래의 for문으로 번역이 된다.
		for (char temp : pass) { 
			out.print(temp);
		} // end for
		 */
	}// viewPass
	
	private void viewLotto(){ // 이 클래스 안에서만 사용할거기때문에 private
		int[] lotto = work.lotto();
		
		out.printf("\n로또번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			out.print(lotto[i]+" ");
		}// end for
	}// viewPass
	
	public static void main(String[] args) {
		RunWork rw = new RunWork();
		rw.viewPass();
		rw.viewLotto();
		String str = "안녕";
		System.out.println(str+"하세요!"+"화요일");
		
		
	}

}
