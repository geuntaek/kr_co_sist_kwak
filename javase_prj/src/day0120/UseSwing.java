package day0120;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseSwing extends JFrame implements ActionListener {
	
	private JTextField jtfName;
	private JPasswordField jpfAddr;
	private JButton jbtAdd;
	
	public UseSwing(){
		super("swing ����");
		jtfName = new JTextField();
		jpfAddr = new JPasswordField();
		jbtAdd = new JButton("�Է�");
		
		jpfAddr.setEchoChar('*');
		
		JPanel panel = new JPanel();
		JPanel panelBtn = new JPanel();

		panel.setLayout(new GridLayout(3, 1));
		
		//Border����
		panel.setBorder(new TitledBorder("�����Է�"));
		jtfName.setBorder(new TitledBorder("�̸�"));
		jpfAddr.setBorder(new TitledBorder("�ּ�"));

		panelBtn.add(jbtAdd);
		
		panel.add(jtfName);
		panel.add(jpfAddr);
		panel.add(panelBtn);
		
		add("Center",panel);
		
		//�̺�Ʈ ���
		jbtAdd.addActionListener(this);
		
		setBounds(500,500,250,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseSwing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String name = jtfName.getText();
		String addr = new String(jpfAddr.getPassword());
		
		JTextArea jta = new JTextArea(10,45); //10���� �ְ�, �� �ึ�� �����ִ� ���ڼ��� 45�� 
		jta.setText("�Է��� ���� \n�̸� "+name+"\n�ּ� "+addr);
		//scrollBar�� �ʿ��� ������Ʈ�� ���ؼ� JScrollPane�� ����
		JScrollPane jsp = new JScrollPane(jta); 
		
		if(ae.getSource()==jbtAdd){
			JOptionPane.showMessageDialog(this, jsp);
		}
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseSwing();
	}//main

}//class
