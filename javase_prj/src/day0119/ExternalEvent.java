package day0119;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * 이벤트를 처리하기 위한 목적으로 만드는 클래스
 * @author user
 */
public class ExternalEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		
		System.exit(JFrame.ABORT);
	}//actionPerformed

}//class
