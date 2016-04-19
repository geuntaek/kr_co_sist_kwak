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
 * ��ǥ�� �����Ͽ� ���ϴ� ��ġ�� component�� ��ġ�ϴ� Layout
 * �ø��ų� �ٿ��� �׻� �� �ڸ�.
 * @author user
 */
@SuppressWarnings("serial")
public class UseManualLayout extends Frame{
	
	private Label lbl,lbl2,lbl3,lbl4;
	private TextField tf;
	private Button btn;
	private Panel panel;
	
	public UseManualLayout(){
		super("������ġ");
		// ����
		lbl = new Label("�̸�");
		tf = new TextField();
		btn = new Button("�Է�");
		
		lbl2 = new Label("������");
		lbl3 = new Label("�յ���");
		lbl4 = new Label("�θ�");
		panel = new Panel();
		panel.setLayout(new GridLayout(3, 1));
		
		panel.add(lbl2);
		panel.add(lbl3);
		panel.add(lbl4);
		
		// ��ġ������ ����
		setLayout(null);
		// ��ġ����
		lbl.setLocation(10,	50);
		tf.setLocation(70,50);
		// ũ�⼳��
		lbl.setSize(50,20);
		tf.setSize(140,20);
		//��ġ�� ũ�⸦ ���� ����
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
