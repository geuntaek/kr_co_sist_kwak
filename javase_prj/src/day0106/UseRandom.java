package day0106;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * �������� ����ϱ� ���ؼ� ������� Random
 * @author user
 */
public class UseRandom {
	
	public UseRandom(){
		Random random = new Random();
		
		/////////////////////// ���� ���� ///////////////////////
		int i = random.nextInt();
		System.out.println("�߻��� �� : "+i);
		System.out.println("������ �� : "+i%10);
		System.out.println("������ ��� : "+Math.abs(i%10));
		
		int j = random.nextInt(10); // ������ �� + ���
		System.out.println(j);
		
		/////////////////////// �Ǽ� ���� ///////////////////////
		double d = random.nextDouble();
		System.out.println("�߻��� �� : "+d);
		System.out.println("������ �� : "+d*10);
		System.out.println("������ �� ���� : "+(int)(d*10));
		
		/////////////////////// �Ҹ� ���� ///////////////////////
		boolean b = random.nextBoolean();
		System.out.println(b);
		 
		String name = JOptionPane.showInputDialog("�̸��� �Է����ּ���!");
		int select = JOptionPane.showConfirmDialog(null, name+"�� �߻��峪��?"); // ������� ������ �����
		String msg = "";
		switch (select) {
		case JOptionPane.OK_OPTION:
			msg = "���� �׷��� �����ؿ�";break;
		case JOptionPane.NO_OPTION:
			msg = "����?";break;
		case JOptionPane.CANCEL_OPTION:
			msg = "�����ϴ°ǰ���?";break;

		}
		JOptionPane.showMessageDialog(null, msg);
		
	}//UseRandom
	
	public static void main(String[] args) {
		new UseRandom();
		
	}//main

}//class
