package day0122;

/**
 * Thread�� �������
 * @author user
 */
//1. Thread�� ��ӹ޴´�.
public class UseThread extends Thread {
	//2. run method Override
	@Override
	public void run(){
		//���ÿ� ó���Ǿ���� �ڵ�
		for (int i = 0; i < 500; i++) {
			System.out.println("run i ==== "+i);
		}
		
	}
	public static void main(String[] args) {
		//start() method�� ȣ��
		UseThread ut = new UseThread();
		//3. start�� ȣ���Ͽ� Thread�� �����Ų��.
		ut.run();
		for (int i = 0; i < 500; i++) {
			System.out.println("main i -------- "+i);
		}
	}//main

}//class
