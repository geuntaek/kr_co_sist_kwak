package day0111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ý��ۿ��� �ٴ��� �Է¹ޱ�<br>
 * 8 bit stream��  16 bit stream�� ���� ��� (���Ȯ��)
 * @author user
 */
public class UseSystemIn1 {

	public UseSystemIn1() throws IOException{ // �� �����ڸ� ȣ���� ������ try~catch�� �ؾ��Ѵ�.
		System.out.println("�ƹ�Ű�� ������ ����");
//		// 8 bit stream��  16 bit stream�� �����ϱ� ���� �߰� ��Ʈ�� ���
//		InputStreamReader isr = new InputStreamReader(System.in);
//		// �ٴ����� �о���̴� ����� ���� Stream ����
//		BufferedReader br = new BufferedReader(isr);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		System.out.println("�Է°� : "+str); // �Է°� ���
		
		// Stream�� �� ����ϸ� ���´�.
		br.close();
	} // UseSystemIn1
	
	public static void main(String[] args) {
		
		try {
			new UseSystemIn1(); // �ν��Ͻ�ȭ, ������ ȣ����.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // main

}// class
