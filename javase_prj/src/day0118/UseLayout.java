package day0118;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class UseLayout extends Frame{
	// ����� ������Ʈ ����
	private Label lblName,lblAge,lblAddr;
	private TextField tfName, tfAge, tfAddr;
	private TextArea taMemo;
	private Button btnAdd, btnRemove, btnEnd;
	private Panel paCenter, paLeft, paBottom;
	
	
	public UseLayout(){
		super("�ڵ� ��ġ ���");
		// ������Ʈ ����
		lblName = new Label("�̸�");
		lblAge = new Label("����");
		lblAddr = new Label("�ּ�");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAddr = new TextField();
		
		taMemo = new TextArea();
		
		btnAdd = new Button("�߰�"); 
		btnRemove = new Button("����");
		btnEnd = new Button("����");
		
		paCenter = new Panel(); // ��� ��ġ�� �г�
		paLeft = new Panel(); // ��� ��ġ�� �гο��� ���ʿ� �� �г�
		paBottom = new Panel(); // �Ʒ��ʿ� �� �г�
		
		// �гο� ���̾ƿ� ����
		paCenter.setLayout(new GridLayout(1, 2));
		paLeft.setLayout(new GridLayout(3, 2));
		
		//�гο� �Ϲ� ������Ʈ�� ��ġ
		
		//���ʿ� �� �гο� ����
		paLeft.add(lblName);
		paLeft.add(tfName);
		paLeft.add(lblAge);
		paLeft.add(tfAge);
		paLeft.add(lblAddr);
		paLeft.add(tfAddr);
		
		//��� �� �гο� ����
		paCenter.add(paLeft);
		paCenter.add(taMemo);
		
		//�Ʒ��ʿ� �� �гο� ������Ʈ�� ����
		paBottom.add(btnAdd);
		paBottom.add(btnRemove);
		paBottom.add(btnEnd);
		
		//������Ʈ ��ġ�� �г��� ������ ������Ʈ�� ��ġ
		add("Center",paCenter);
		add("South",paBottom);
		
		//ũ�⼳��
		setBounds(100,100,300,140);
		setVisible(true);
		
		//ũ�⺯��Ұ�
		setResizable(false);
		
		//����
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	public static void main(String[] args) {
		new UseLayout();
	}

}
