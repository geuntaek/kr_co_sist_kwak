package day0122;

import java.util.Random;

/**
 * 생명주기 method
 * @author user
 */
//1.Runnable 구현
public class UseSleep implements Runnable {
	


	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 15; i++) {
			System.out.printf(".");
			try {
				Thread.sleep(100*random.nextInt(11));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		UseSleep us = new UseSleep();
		Thread t = new Thread(us);
		t.start();
	}//main

}//class
