package day0106;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 난수만을 사용하기 위해서 만들어진 Random
 * @author user
 */
public class UseRandom {
	
	public UseRandom(){
		Random random = new Random();
		
		/////////////////////// 정수 난수 ///////////////////////
		int i = random.nextInt();
		System.out.println("발생된 수 : "+i);
		System.out.println("범위의 수 : "+i%10);
		System.out.println("범위의 양수 : "+Math.abs(i%10));
		
		int j = random.nextInt(10); // 범위의 수 + 양수
		System.out.println(j);
		
		/////////////////////// 실수 난수 ///////////////////////
		double d = random.nextDouble();
		System.out.println("발생된 수 : "+d);
		System.out.println("범위의 수 : "+d*10);
		System.out.println("범위의 수 정수 : "+(int)(d*10));
		
		/////////////////////// 불린 난수 ///////////////////////
		boolean b = random.nextBoolean();
		System.out.println(b);
		 
		String name = JOptionPane.showInputDialog("이름을 입력해주세요!");
		int select = JOptionPane.showConfirmDialog(null, name+"은 잘생겼나요?"); // 사용자의 의향을 물어보는
		String msg = "";
		switch (select) {
		case JOptionPane.OK_OPTION:
			msg = "저도 그렇게 생각해요";break;
		case JOptionPane.NO_OPTION:
			msg = "지는?";break;
		case JOptionPane.CANCEL_OPTION:
			msg = "포기하는건가요?";break;

		}
		JOptionPane.showMessageDialog(null, msg);
		
	}//UseRandom
	
	public static void main(String[] args) {
		new UseRandom();
		
	}//main

}//class
