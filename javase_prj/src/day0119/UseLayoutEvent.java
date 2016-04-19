package day0119;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class UseLayoutEvent extends Frame implements ActionListener, ItemListener{
	// ����� ������Ʈ ����
	private Label lblName,lblAge,lblAddr;
	private TextField tfName, tfAge, tfAddr;
	private List listView;
	private Button btnAdd, btnRemove, btnEnd;
	private Panel paCenter, paLeft, paBottom;
	
	private int removeFlag;
	
	public UseLayoutEvent(){
		super("�ڵ� ��ġ�� �̺�Ʈ ���");
		
		removeFlag = -1;
		// ������Ʈ ����
		lblName = new Label("�̸�");
		lblAge = new Label("����");
		lblAddr = new Label("�ּ�");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAddr = new TextField();
		
		listView = new List();
		
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
		paCenter.add(listView);
		
		//�Ʒ��ʿ� �� �гο� ������Ʈ�� ����
		paBottom.add(btnAdd);
		paBottom.add(btnRemove);
		paBottom.add(btnEnd);
		
		//������Ʈ ��ġ�� �г��� ������ ������Ʈ�� ��ġ
		add("Center",paCenter);
		add("South",paBottom);
		
		
		//������Ʈ���� �߻��� �̺�Ʈ�� ������ �� �ֵ��� �̺�Ʈ �����ʿ� ���(add)
		//actionPerformed�� ȣ��Ǿ� ó��
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		btnEnd.addActionListener(this);
		
		tfName.addActionListener(this);
		tfAge.addActionListener(this);
		tfAddr.addActionListener(this);
		
		
		//��ϵ� �̺�Ʈ�� �߻��Ǹ� itemStateChaned�� ȣ��Ǿ� ó��
		listView.addItemListener(this);
		
		
		//ũ�⼳��
		setBounds(100,100,350,140);
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
		new UseLayoutEvent();
	}
	
	@Override
	public void itemStateChanged(ItemEvent ie) { // ����Ʈ�� Ŭ������ �� ����, ������ �������� �ε����� ��´�.
		removeFlag = listView.getSelectedIndex();
		
		
//		listView.remove(listView.getSelectedIndex()); //Ŭ�����ڸ��� ����
		//������ �������� ��´�.
//		System.out.println(listView.getSelectedItem());
		String[] data = listView.getSelectedItem().split(",");
		if(data != null){
			//�ؽ�Ʈ �ʵ忡 ���ֱ�
			tfName.setText(data[0]);
			tfAge.setText(data[1]);
			tfAddr.setText(data[2]);
		}
		
	}
	
	private void addItem(){
		//����Ʈ�� �Է°��� �߰��Ѵ�.
		//�ؽ�Ʈ �ʵ��� �� ��������
		String name = tfName.getText();
		String age = tfAge.getText();
		String addr = tfAddr.getText();
		
		if(name.equals("")||age.equals("")||addr.equals("")){
			JOptionPane.showMessageDialog(this, "�����͸� �Է����ּ���");
			return; //��ȯ���� void�� �� return�� �Ʒ����� �ڵ带 �������� ���� addItem�� ȣ���� ������ �ǵ��ư���� �ǹ��̴�. 
		}
		
		// �̸��� �Է����� �ʾ��� �� �̸��� �Է��϶�� dialog�� �����ְ� ��Ŀ���� tfName���� �̵�.
//		if(name.equals("")){
//			JOptionPane.showMessageDialog(this, "�̸��� �Է����ּ���");
//			tfName.requestFocus();
//			return; //��ȯ���� void�� �� return�� �Ʒ����� �ڵ带 �������� ���� addItem�� ȣ���� ������ �ǵ��ư���� �ǹ��̴�. 
//		}
		
		StringBuilder addItem = new StringBuilder();
		addItem.append(name).append(",").append(age).append(",").append(addr);
		
		//����Ʈ�� �߰�
		listView.add(addItem.toString());
		
		//�ؽ�Ʈ�ʵ��� �ʱ�ȭ
		tfName.setText("");
		tfAge.setText("");
		tfAddr.setText("");
		
		//Ŀ���� �̸��� ��ġ
		tfName.requestFocus(); 
	}
	
	public void removeItem(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==tfName){
			tfAge.requestFocus();
		}
		if(ae.getSource()==tfAge){
			tfAddr.requestFocus();
		}
		if(ae.getSource()==tfAddr||ae.getSource()==btnAdd){
			addItem();
		}
		
		if(ae.getSource()==btnRemove){
			//����Ʈ�� �Է°��� ���Ͽ� �ش� �׺��� �����Ѵ�.
			if(removeFlag == -1){ // ������ �������� �������� ���� ���
				JOptionPane.showMessageDialog(this, "������ �������� Ŭ�����ּ���");
				return;
			}
			
			//����
			listView.remove(removeFlag);
			
			//������ �� ���� �������� ������ �� �����Ƿ� flag���� �ʱ�ȭ �����ش�.
			removeFlag = -1;
			
			//�ؽ�Ʈ�ʵ� �ʱ�ȭ
			tfName.setText("");
			tfAge.setText("");
			tfAddr.setText("");
			
		}
		if(ae.getSource()==btnEnd){
			dispose();
		}
		
		
	}

}











//		if(ae.getSource()==btnAdd){
//			addItem();
//		}