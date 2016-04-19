package day0119;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Inner Class�� �̺�Ʈ ó��
 * -�̺�Ʈ�� �������� ���� Ŭ���� �ȿ����� ���������� ó���� ��
 * @author user
 */
@SuppressWarnings("serial")
public class EventProcess extends Frame {
	
	private Button btn;
	
	
	public EventProcess(){ // ������
		super("Inner Class�� ����� �̺�Ʈ ó��");
		//����Ŭ���� ����
		EventProcess.CloseEvent ce = this.new CloseEvent();
		
		btn = new Button("����");
		//�̺�Ʈ ���
		btn.addActionListener(ce);
		
		add("South",btn);
		setSize(300, 300);
		setVisible(true);
		
	}//EventProcess
	
	/////////////////////////// Inner Class ����///////////////////////////////
	public class CloseEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*EventProcess ep = getInstance();
			JOptionPane.showConfirmDialog(ep, "");
			if(e.getSource()==ep.btn){ // = if(e.getSource()==btn){
				
			}*/
			
			int flag = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?");
			switch(flag){
			case JOptionPane.OK_OPTION:
				dispose(); //�ٱ�Ŭ������ �θ�Ŭ������ ����  method
 			}
			
		}//actionPerformed
		
	}//CloseEvent
	/////////////////////////// Inner Class ��///////////////////////////////
	
	public EventProcess getInstance(){ // �ν��Ͻ��� �������� ���� �޼ҵ�
		return this;
	}
	
	public static void main(String[] args) {
		new EventProcess();
	}//main

}//class
