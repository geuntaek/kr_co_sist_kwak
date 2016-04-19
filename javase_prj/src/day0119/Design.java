package day0119;

import java.awt.Button;
import java.awt.Frame;

/**
 * 외부클래스가 이벤트만 처리하고 
 * 현재클래스는 디자인을 처리할 때 
 * @author user
 */
@SuppressWarnings("serial")
public class Design extends Frame {
	
	private Button btn;
	
	
	public Design(ExternalEvent ee){ // has a 관계
		super("외부클래스를 사용한 이벤트처리");
		btn = new Button("종료");
		System.out.println("디자인 - "+btn);
		btn.addActionListener(ee);
		
		add("South",btn);
		setSize(300, 300);
		setVisible(true);
		
	}//EventProcess
	
	
	public static void main(String[] args) {
		ExternalEvent ee = new ExternalEvent(); 
		new Design(ee);
	}//main

}//class
