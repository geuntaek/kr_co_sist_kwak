package day0104;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 
 * @author user
 */
public class TestAnony extends Frame{
	
	public TestAnony(){
		super(" 익명클래스 연습");
		Button btn = new Button("버튼");
		add(btn);
		setSize(400, 400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) { // 내가 원하는것만 받아서 사용할 수 있다.
				dispose();
			}
		});
		
	}//TestAnony
	
	public static void main(String[] args) {
		new TestAnony();
	}//main

}//class
