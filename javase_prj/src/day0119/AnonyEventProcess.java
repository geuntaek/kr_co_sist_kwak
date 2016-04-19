package day0119;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Anonymous Inner Class로 이벤트 처리
 * - 이벤트가 특정 컴포넌트 하나에서만 처리되어야할 때 
 * @author user
 */
@SuppressWarnings("serial")
public class AnonyEventProcess extends Frame {
	
	private Button btn,bt1;
	
	
	public AnonyEventProcess(){ // 생성자
		super("Anonymous Inner Class를 사용한 이벤트 처리");
		//내부클래스 생성
		
		btn = new Button("종료");
		bt1 = new Button("종료");
		//이벤트 등록하면 서 처리
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				test();
			}//actionPerformed
			
			//내가 원하는 메소드도 만들 수 있다.
			//개발자가 필요에 따라 method를 정의할 수 있다.
			public void test(){
				dispose();
			}
		});
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				test();
			}//actionPerformed
			
			//내가 원하는 메소드도 만들 수 있다.
			//개발자가 필요에 따라 method를 정의할 수 있다.
			public void test(){
				dispose();
			}
		});
		
		
		add("South",btn);
		setSize(300, 300);
		setVisible(true);
		
	}//EventProcess
	
	
	public static void main(String[] args) {
		new AnonyEventProcess();
	}//main

}//class
