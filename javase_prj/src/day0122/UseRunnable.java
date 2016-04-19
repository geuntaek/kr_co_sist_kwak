package day0122;

/**
 * Runnable 인터페이스를 구현한 Thread의 사용
 * @author user
 */
//1.Runnable구현
public class UseRunnable implements Runnable {
	//2. run method override
	@Override
	public void run(){
		for(int i = 0; i<500;i++){
			System.out.println("run i ---------- "+i);
		}
	}
	public static void main(String[] args) {
		//3-1.구현클래스를 객체로 생성하고 
		UseRunnable ur = new UseRunnable();
//		ur.run();
//		3-2. Thread클래스와 has a 관계를 설정
		Thread t = new Thread(ur);
		t.start();
		for(int i = 0; i<500;i++){
			System.out.println("main i ============ "+i);
		}
	}//main

}//class
