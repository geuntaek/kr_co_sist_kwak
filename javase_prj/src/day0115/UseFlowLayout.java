package day0115;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �帧���̾ƿ��� ��� : ũ�Ⱑ ����Ǹ� ������Ʈ�� ��ġ�� ����� �� �ִ�.
 * @author user
 */
//1.Frame�� ��� �޴´�.
@SuppressWarnings("serial")
public class UseFlowLayout extends Frame{
	//2. �Ϲ�������Ʈ ����
	// �ν��Ͻ�����
	private Label lblName,lblAge;
	private TextField tfName,tfAge;
	private Button btnAdd;
	
	public UseFlowLayout(){
		super("FlowLayout ����"); // �θ�Ŭ������ ������ ȣ��
		
		//3. �Ϲ� ������Ʈ�� ����
		lblName = new Label("�̸�");
		tfName = new TextField(10); // ũ�� ����
		
		lblAge = new Label("����");
		tfAge = new TextField("0",3); // �⺻���� ũ�� ����
		
		btnAdd = new Button("�Է�");
		
		// �̸� Label�� �ٴڻ� ����
		lblName.setBackground(Color.RED);
		// �̸� Label�� ���ڻ� ����
		lblName.setForeground(Color.blue);
		
		// RGB Color�� ����
		tfName.setBackground(new Color(0x8041D9));// 0x�� ���̸� 16������ �ȴ�.
		tfName.setForeground(new Color(0xFAED7D));// 0x�� ���̸� 16������ �ȴ�.
		
		setBackground(new Color(0xD1E1F0));
		
		//4. Layout����. BorderLayout -> FlowLayout
		setLayout(new FlowLayout()); // �������� ������ borderLayout�̿��� ���� �������͸� ���δ�.
		// add�ϴ� ������� ������Ʈ�� ��ġ�ȴ�.
		// ������Ʈ�� ����ũ�⸦ ������.
		// �������� ũ�Ⱑ ����Ǹ� ������Ʈ���� ��ġ�� ������ �ȴ�.
		add(lblName);
		add(tfName);
		
		add(lblAge);
		add(tfAge);
		add(btnAdd);
		
		//5. ũ�� ����
		setBounds(100,100,400,300);
		
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//���� �̺�Ʈ ó�� (�����쿡 �����ư�� ������ �� �� �����츦 �����ϴ� ��)
		addWindowListener(new WindowAdapter() { // anonymous inner class

			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(Frame.ABORT);//�������� JVM�� ��� instance�� �����Ѵ�.
//				System.exit(0);//�������� JVM�� ��� instance�� �����Ѵ�.
				dispose(); // �������� JVM�� ���簴ü�� �����Ѵ�.
			} 
		});
		
		
	}//UseFlowLayout
	
	public static void main(String[] args) {
		new UseFlowLayout(); // �ν��Ͻ�ȭ
	}// main

}// class
