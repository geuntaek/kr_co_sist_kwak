package kr.co.sist.project1;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class LoginDesign extends JFrame implements ActionListener{
	
	
	private JLabel lblID, lblPW;
	private JTextField tfID;
	private JPasswordField tfPW;
	private JButton btnLogin, btnReset;
	private Map<String, String> loginMap;
	
	public LoginDesign(){
		super("log ������Ʈ");
		
		//������Ʈ ����
		lblID = new JLabel("���̵�");
		lblPW = new JLabel("��й�ȣ");
		tfID = new JTextField(12);
		tfPW = new JPasswordField(12);
		btnLogin = new JButton("�α���"); 
		btnReset = new JButton("�ʱ�ȭ");
		
		
		//map�� ���̵�� ��й�ȣ put
		loginMap = new HashMap<String, String>();
		loginMap.put("admin","1234");
		loginMap.put("root","1111");
		
		//Panel ����
		JPanel panel = new JPanel(); 
		JPanel panelTop = new JPanel(); // ���̵�, �н����� ��ġ panel
		JPanel panelBottom = new JPanel(); // ��ư ��ġ panel
		
		//panel�� layout ����
		panelTop.setLayout(new GridLayout(2, 2));
		
		//������Ʈ ��ġ
		panelTop.add(lblID);
		panelTop.add(tfID);
		panelTop.add(lblPW);
		panelTop.add(tfPW);
		
		panelBottom.setLayout(new FlowLayout());
		
		panelBottom.add(btnLogin);
		panelBottom.add(btnReset);
		
		panel.add("North",panelTop);
		panel.add("South",panelBottom);
		
		//border���� �� panel ��ġ
		panel.setBorder(new TitledBorder("�α���"));
		add(panel);
		
		//�̺�Ʈ ó��
		tfID.addActionListener(this);
		tfPW.addActionListener(this);
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		
		//��ġ����
		setBounds(100, 100, 450, 150);
		//����ڿ��� �����ֱ�
		setVisible(true);
		//ũ�� ����
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LoginDesign();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==tfID){
			tfPW.requestFocus();
		}
		if(ae.getSource()==tfPW){
			btnLogin.requestFocus();
		}
		
		//�α��� ��ư���� �̺�Ʈ �߻����� ��
		if(ae.getSource()==btnLogin){ 
			// textField�� �Է��� ���� strID�� strPW�� ����.
			String strID = tfID.getText();
			String strPW = new String(tfPW.getPassword());
			
			if(loginMap.get(strID)!=null){ //�Է¹��� ���̵�� ���� Ű�� ���� �����Ѵٸ�
				if(loginMap.get(strID).equals(strPW)){ //Ű�� value(��й�ȣ)�� ��ġ�ϴ� ���
					new WorkDesign();
				}else{ //Ű�� value�� ��ġ���� �ʴ°��
					JOptionPane.showMessageDialog(this, "���̵� ��й�ȣ �ٽ� �Է����ּ���");
				}
			}else{ // ���̵� �������� �ʴ°��
				JOptionPane.showMessageDialog(this, "���̵� ��й�ȣ �ٽ� �Է����ּ���");
			}

		}
		// �ʱ�ȭ
		if(ae.getSource()==btnReset){ 
			tfID.setText("");
			tfPW.setText("");
			
		}
	}

}

