package day0119;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Anonymous Inner Class�� �̺�Ʈ ó��
 * - �̺�Ʈ�� Ư�� ������Ʈ �ϳ������� ó���Ǿ���� �� 
 * @author user
 */
@SuppressWarnings("serial")
public class AnonyEventProcess extends Frame {
	
	private Button btn,bt1;
	
	
	public AnonyEventProcess(){ // ������
		super("Anonymous Inner Class�� ����� �̺�Ʈ ó��");
		//����Ŭ���� ����
		
		btn = new Button("����");
		bt1 = new Button("����");
		//�̺�Ʈ ����ϸ� �� ó��
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				test();
			}//actionPerformed
			
			//���� ���ϴ� �޼ҵ嵵 ���� �� �ִ�.
			//�����ڰ� �ʿ信 ���� method�� ������ �� �ִ�.
			public void test(){
				dispose();
			}
		});
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				test();
			}//actionPerformed
			
			//���� ���ϴ� �޼ҵ嵵 ���� �� �ִ�.
			//�����ڰ� �ʿ信 ���� method�� ������ �� �ִ�.
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
