package kr.co.sist.memo;

/**
 * �޸����� �����Ű�� Ŭ����
 * @author user
 */
public class RunJavaMemo {

	public static void main(String[] args) {
		MemoEvent me = new MemoEvent(); // �������� �����ֱ����� �̺�Ʈ ó���� �޾ƾ��Ѵ�.
		JavaMemo jm = new JavaMemo(me);
		me.setJm(jm);
	}//main

}//class
