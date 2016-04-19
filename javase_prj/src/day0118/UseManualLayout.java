package day0118;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 좌표를 설정하여 원하는 위치에 component를 배치하는 Layout
 * 늘리거나 줄여도 항상 그 자리.
 * @author user
 */
@SuppressWarnings("serial")
public class UseManualLayout extends Frame{
	
	private Label lbl,lbl2,lbl3,lbl4;
	private TextField tf;
	private Button btn;
	private Panel panel;
	
	public UseManualLayout(){
		super("수동배치");
		// 생성
		lbl = new Label("이름");
		tf = new TextField();
		btn = new Button("입력");
		
		lbl2 = new Label("김정식");
		lbl3 = new Label("손두한");
		lbl4 = new Label("민명선");
		panel = new Panel();
		panel.setLayout(new GridLayout(3, 1));
		
		panel.add(lbl2);
		panel.add(lbl3);
		panel.add(lbl4);
		
		// 배치관리자 해제
		setLayout(null);
		// 위치설정
		lbl.setLocation(10,	50);
		tf.setLocation(70,50);
		// 크기설정
		lbl.setSize(50,20);
		tf.setSize(140,20);
		//위치와 크기를 동시 설정
		btn.setBounds(220,50,50,20);
		panel.setBounds(10,70,50,75);
		
		
		lbl.setBackground(Color.orange);
		lbl3.setBackground(Color.CYAN);
		add(lbl);
		add(tf);
		add(btn);
		add(panel);
		setSize(300, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {	
				dispose();
			}
			
		});
	}//UseManualLayout
	
	
	public static void main(String[] args) {
		new UseManualLayout();
	}//main

}//class
