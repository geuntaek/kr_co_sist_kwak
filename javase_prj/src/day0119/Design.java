package day0119;

import java.awt.Button;
import java.awt.Frame;

/**
 * �ܺ�Ŭ������ �̺�Ʈ�� ó���ϰ� 
 * ����Ŭ������ �������� ó���� �� 
 * @author user
 */
@SuppressWarnings("serial")
public class Design extends Frame {
	
	private Button btn;
	
	
	public Design(ExternalEvent ee){ // has a ����
		super("�ܺ�Ŭ������ ����� �̺�Ʈó��");
		btn = new Button("����");
		System.out.println("������ - "+btn);
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
