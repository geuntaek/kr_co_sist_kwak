package day0111;

import java.io.IOException;

/**
 * Ű������ �Է��� �޴� System.in(InputStream)�� ���
 * @author user
 */
public class UseSystemIn {

	public UseSystemIn(){
		System.out.println("�ƹ�Ű�� ������ ����");
		try {
//			// �Է� : ���Ͱ� ������ ������ �ƹ��� ������ ���� �ʴ´�. latency
//			int read = System.in.read();
//			System.out.println("�Է°� : �ڵ尪 "+read+", ���� : "+(char)read);
			
			// �ԷµǴ� ��� �� �ޱ�
			int temp = 0;
			while((temp = System.in.read())!=13){
//				System.out.println("�Է°� : �ڵ尪 "+temp+", ���� : "+(char)temp);
				System.out.print((char)temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	} // UseSystemIn
	
	public static void main(String[] args) {
		new UseSystemIn();
	}//main
}//class
