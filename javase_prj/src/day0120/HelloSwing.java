package day0120;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HelloSwing extends JFrame{

	private JButton jbtn;
	private Button btn;
	
	
	public HelloSwing(){
		super("Swing ����");
		
		jbtn = new JButton("������ư");
		btn = new Button("awt��ư");
		
		add("North",jbtn);
		add("South",btn);
		
		setSize(400,300);
		setVisible(true);
		//JFrame�� ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//			
//		});
	}//HelloSwing
	
	public static void main(String[] args) {
		new HelloSwing();
		
		
	}

}
