package day0122;

/**
 * Thread의 구현방법
 * @author user
 */
//1. Thread를 상속받는다.
public class UseThread extends Thread {
	//2. run method Override
	@Override
	public void run(){
		//동시에 처리되어야할 코드
		for (int i = 0; i < 500; i++) {
			System.out.println("run i ==== "+i);
		}
		
	}
	public static void main(String[] args) {
		//start() method를 호출
		UseThread ut = new UseThread();
		//3. start를 호출하여 Thread를 실행시킨다.
		ut.run();
		for (int i = 0; i < 500; i++) {
			System.out.println("main i -------- "+i);
		}
	}//main

}//class
