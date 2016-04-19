package kr.co.sist.memo;

/**
 * 메모장을 실행시키는 클래스
 * @author user
 */
public class RunJavaMemo {

	public static void main(String[] args) {
		MemoEvent me = new MemoEvent(); // 디자인을 보여주기위해 이벤트 처리를 받아야한다.
		JavaMemo jm = new JavaMemo(me);
		me.setJm(jm);
	}//main

}//class
