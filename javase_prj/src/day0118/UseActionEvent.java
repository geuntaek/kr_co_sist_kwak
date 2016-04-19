package day0118;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
// ���� Ŭ�������� �߻��� �̺�Ʈ ó���ϱ� //
// E-1. ���
// E-2. ���� Ŭ������ �̺�Ʈ�� ó���� �� �ֵ��� xxxListener�� �Ǿ���Ѵ�.
// E-3. Override�� method�ȿ��� �̺�Ʈ�� �߻��Ǿ��� �� ������ �ڵ� �ۼ�

// E-2
public class UseActionEvent extends Frame implements ActionListener {

	// ����Ǵ� Component���� �̺�Ʈ�� �����ִ� �͵鸸 ����
	private TextField tfName;
	private Button btnAdd,btnReset;
	private TextArea taDisplay;
	
	public UseActionEvent() {
		super("�׼��̺�Ʈ ó��");
		Label lblName = new Label("�̸� : ",Label.CENTER); // �̺�Ʈ�� �������� �ʱ� ������ ���������� �������.
		tfName = new TextField(10);
		btnAdd = new Button("�߰�");
		btnReset = new Button("�ʱ�ȭ");
		taDisplay = new TextArea();
		
		Panel panelNorth = new Panel();
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnReset);
		
		add(BorderLayout.NORTH,panelNorth);
		add(BorderLayout.CENTER,taDisplay);
		
		//E-1
		btnAdd.addActionListener(this);
		btnReset.addActionListener(this);
		tfName.addActionListener(this);
		
		setVisible(true);
		setBounds(700, 500, 400, 250);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}
	
	//E-3
	@Override
	public void actionPerformed(ActionEvent e) {
		//�ؽ�Ʈ�ʵ忡�� �ηµ� �̸��� �����ͼ�  �ؽ�Ʈ���� ����
		if(e.getSource()==btnAdd||e.getSource()==tfName){
			String name = tfName.getText();
			taDisplay.append(name+"��\n");
			
			//�ؽ�Ʈ�ʵ忡 �Է°��� �ʱ�ȭ
			tfName.setText("");
		}
		if(e.getSource()==btnReset){//�ʱ�ȭ
			taDisplay.getText(); //��ü�� �ѹ��� �ν��� ��Ű�� setText�ؾ��Ѵ�. ���׶�����...(?)
			taDisplay.setText(null);
		}
	}
	
	public static void main(String[] args) {
		new UseActionEvent();
	}//main

}//class
