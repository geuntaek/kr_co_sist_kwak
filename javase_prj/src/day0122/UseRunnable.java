package day0122;

/**
 * Runnable �������̽��� ������ Thread�� ���
 * @author user
 */
//1.Runnable����
public class UseRunnable implements Runnable {
	//2. run method override
	@Override
	public void run(){
		for(int i = 0; i<500;i++){
			System.out.println("run i ---------- "+i);
		}
	}
	public static void main(String[] args) {
		//3-1.����Ŭ������ ��ü�� �����ϰ� 
		UseRunnable ur = new UseRunnable();
//		ur.run();
//		3-2. ThreadŬ������ has a ���踦 ����
		Thread t = new Thread(ur);
		t.start();
		for(int i = 0; i<500;i++){
			System.out.println("main i ============ "+i);
		}
	}//main

}//class
