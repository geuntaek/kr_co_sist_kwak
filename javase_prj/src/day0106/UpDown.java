package day0106;

import java.util.Random;

import javax.swing.JOptionPane;

public class UpDown {

	public UpDown() {
		System.out.println("숙제2");
		Random random = new Random(); // 객체

		int secret = random.nextInt(50) + 1; // 1~50 중 랜덤으로 저장할 정수형 변수
		int choice = 0; // 예, 아니오, 취소 저장 변수
		String str = null; // 입력받은 숫자 저장 변수
		int inputNum = 0; // str을 변환해 정수 저장 변수
		int cnt = 0; // 입력 횟수 

		do {
			cnt++; // 입력 횟수 증가
			str = JOptionPane.showInputDialog("숫자를 입력하세요");
			inputNum = Integer.parseInt(str);

			if (inputNum < secret) {
				JOptionPane.showMessageDialog(null, "더 큰수 입력하세요");
			} else if (inputNum > secret) {
				JOptionPane.showMessageDialog(null, "더 작은수 입력하세요");
			} else { // 맞춘 경우
				if (cnt == 1) { // 한번에 맞춘 경우
					choice = JOptionPane.showConfirmDialog(null, cnt + "m회 입력! \n 대박 성공!!\n다시하시겠습니까?");
				} else {
					choice = JOptionPane.showConfirmDialog(null, cnt + "회 입력! \n 성공!!\n다시하시겠습니까?");
				}
				
				// 취소 or 아니오를 선택한 경우  
				if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.NO_OPTION) {
					break;
				}
				secret = random.nextInt(50) + 1; // 새로운 랜덤넘버
				cnt = 0; // 입력 횟수 초기화
			}
		} while (true); // while (inputNum!=secret&&choice==JOptionPane.OK_OPTION);

	}// UpDown

	public static void main(String[] args) {
		new UpDown();
	}// main

}// class
