package day0119;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * �̺�Ʈ�� ó���ϱ� ���� �������� ����� Ŭ����
 * @author user
 */
public class ExternalEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		
		System.exit(JFrame.ABORT);
	}//actionPerformed

}//class
