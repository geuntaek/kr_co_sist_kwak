package day0106;

import java.util.Random;

import javax.swing.JOptionPane;

public class UpDown {

	public UpDown() {
		System.out.println("����2");
		Random random = new Random(); // ��ü

		int secret = random.nextInt(50) + 1; // 1~50 �� �������� ������ ������ ����
		int choice = 0; // ��, �ƴϿ�, ��� ���� ����
		String str = null; // �Է¹��� ���� ���� ����
		int inputNum = 0; // str�� ��ȯ�� ���� ���� ����
		int cnt = 0; // �Է� Ƚ�� 

		do {
			cnt++; // �Է� Ƚ�� ����
			str = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���");
			inputNum = Integer.parseInt(str);

			if (inputNum < secret) {
				JOptionPane.showMessageDialog(null, "�� ū�� �Է��ϼ���");
			} else if (inputNum > secret) {
				JOptionPane.showMessageDialog(null, "�� ������ �Է��ϼ���");
			} else { // ���� ���
				if (cnt == 1) { // �ѹ��� ���� ���
					choice = JOptionPane.showConfirmDialog(null, cnt + "mȸ �Է�! \n ��� ����!!\n�ٽ��Ͻðڽ��ϱ�?");
				} else {
					choice = JOptionPane.showConfirmDialog(null, cnt + "ȸ �Է�! \n ����!!\n�ٽ��Ͻðڽ��ϱ�?");
				}
				
				// ��� or �ƴϿ��� ������ ���  
				if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.NO_OPTION) {
					break;
				}
				secret = random.nextInt(50) + 1; // ���ο� �����ѹ�
				cnt = 0; // �Է� Ƚ�� �ʱ�ȭ
			}
		} while (true); // while (inputNum!=secret&&choice==JOptionPane.OK_OPTION);

	}// UpDown

	public static void main(String[] args) {
		new UpDown();
	}// main

}// class
