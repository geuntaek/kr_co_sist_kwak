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
		super(" �͸�Ŭ���� ����");
		Button btn = new Button("��ư");
		add(btn);
		setSize(400, 400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) { // ���� ���ϴ°͸� �޾Ƽ� ����� �� �ִ�.
				dispose();
			}
		});
		
	}//TestAnony
	
	public static void main(String[] args) {
		new TestAnony();
	}//main

}//class
