package kr.co.sist.memo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MemoDialog extends Dialog {
	
	private Button btnClose;
	
	
	public MemoDialog(JavaMemo jm){
		//���, Dialog�� ���� �� �θ�â�� ������ �� ����.
		super(jm,"����",true);
		btnClose = new Button("����");
		
		TextArea taInfo = new TextArea();
		taInfo.setText("�޸�������\n�� �޸���� ������ ����� ����� �� �ִ� ���������Դϴ�.\n�ۼ��� : �̼���");
		taInfo.setEditable(false);//�������
		
		
		Panel panelSouth = new Panel();
		panelSouth.add(btnClose);
		
		add("Center",taInfo);
		add("South",panelSouth);
		
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		taInfo.setBackground(Color.white);
		taInfo.setFont(new Font("Serif", Font.BOLD, 15));
		taInfo.setForeground(Color.darkGray);
		
		setResizable(false);
		setBounds(jm.getX()+100,jm.getY()+100,500,250);
		setVisible(true);
	}//MemoDialog


	public Button getBtnClose() {
		return btnClose;
	}

	
	
}
