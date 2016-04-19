package day0121;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * �� Ŭ���� ��ü�� �̺�Ʈ�� ó���ϴ� Ŭ����
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVC extends JFrame implements ActionListener, ListSelectionListener {

	private JLabel lblName;
	private JTextField tfName;
	private JButton btnAdd;
	
	private JList listName; // �����ֱ�
	
	private JTextArea taName;
	
	private DefaultListModel<String> dlm;
	
	public UseMVC() { // �⺻������
		super("MVC Pattern�� ����� jList�� ���");
		lblName = new JLabel("�̸�") ;
		tfName = new JTextField(10); // size���� 
		btnAdd = new JButton("Ŭ��");
		
		dlm = new DefaultListModel<String>();
		listName = new JList(dlm);
		
		taName = new JTextArea();
		
		JPanel panelNorth = new JPanel();
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.setBorder(new TitledBorder("�̸� �Է�"));
		JScrollPane spList = new JScrollPane(listName);
		spList.setBorder(new TitledBorder("�߰��� �̸� ����Ʈ"));
		
		JScrollPane spName = new JScrollPane(taName);
		spName.setBorder(new TitledBorder("���õ� �̸�"));
		
		setLayout(null); // ������ġ�ϰڴ�. layout�� ������ �ʰڴ�.
		
		//ũ��� ��ġ ����
		panelNorth.setBounds(10, 15, 400, 60);
		spList.setBounds(10, 85, 400, 150);
		spName.setBounds(10, 245, 400, 100);
		
		add(panelNorth);
		add(spList);
		add(spName);
		
		//�̺�Ʈ �߰�
		btnAdd.addActionListener(this); // this -> �� Ŭ���� �ȿ��� ó���Ѵ�.
		tfName.addActionListener(this);
//		listName.addListSelectionListener(this);
		
		listName.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectName = (String) listName.getSelectedValue();
				taName.append(selectName); // �޼ҵ� ü�� �Ұ���
				taName.append("\n");
				dlm.remove(listName.getSelectedIndex()); //�����͸� �������ִ� ������ �����.
			}//mouseClicked
			
		});
		
		
		setBounds(100,50,450,400);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseMVC
	boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//����Ʈ�� ���õ� ���� ���ͼ� �ؽ�Ʈ ���� �߰�
		if(flag){
			String selectName = (String) listName.getSelectedValue();
			taName.append(selectName); // �޼ҵ� ü�� �Ұ���
			taName.append("\n");
			
			//����Ʈ���� ���õ� ���� ����
//			dlm.removeElementAt(listName.getSelectedIndex());
//			dlm.removeElement(selectName);
		}
		flag = !flag;
	}//valueChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		//�ؽ�Ʈ �ʵ��� ���� �����ͼ�
		String name = tfName.getText().trim(); // �յ� ������ �߶� ���ڿ� ������ �ִ´�.
		
		if(name.equals("")){ // textfield�� ���� ������� ���� ���
			JOptionPane.showMessageDialog(this, "�̸��� �ʼ� �Է�");
			tfName.requestFocus();
			return;
		}
		
		//����Ʈ�� ������ �̸��� �߰� (Model�� ����ؾ��Ѵ�.)
//		listName.add(name); // view�� ���� �۾��̶� �Ұ���
		dlm.addElement(name);
		//�ؽ�Ʈ�ʵ��� ���� �ʱ�ȭ
		tfName.setText("");

	}//actionPerformed

	public static void main(String[] args) {
		new UseMVC();
	}//main

}//class
