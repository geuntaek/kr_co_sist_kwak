package day0105;

import static java.lang.System.out;

public class RunWork {
	
	private Work work;
	public RunWork(){ // �޼ҵ帶�� ��üȭ�� �ʿ並 �ٿ��ش�.
		work = new Work();
	}
	private void viewPass(){ // �� Ŭ���� �ȿ����� ����Ұű⶧���� private
		char[] pass = work.password();
		
		out.printf("��й�ȣ : ");
		for (int i = 0; i < pass.length; i++) {
			out.print(pass[i]);
		}
		/* ������ for���� ��·�� ������ for������ ������ �ȴ�.
		for (char temp : pass) { 
			out.print(temp);
		} // end for
		 */
	}// viewPass
	
	private void viewLotto(){ // �� Ŭ���� �ȿ����� ����Ұű⶧���� private
		int[] lotto = work.lotto();
		
		out.printf("\n�ζǹ�ȣ : ");
		for (int i = 0; i < lotto.length; i++) {
			out.print(lotto[i]+" ");
		}// end for
	}// viewPass
	
	public static void main(String[] args) {
		RunWork rw = new RunWork();
		rw.viewPass();
		rw.viewLotto();
		String str = "�ȳ�";
		System.out.println(str+"�ϼ���!"+"ȭ����");
		
		
	}

}
