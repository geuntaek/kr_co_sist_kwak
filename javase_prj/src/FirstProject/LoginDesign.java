package FirstProject;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * �α��� â ������
 * @author user
 */
@SuppressWarnings("serial")
public class LoginDesign extends JFrame {
	
	
	public JLabel lblID, lblPW; //���̵� ��й�ȣ 
	public JTextField tfID; //���̵� �Է�â
	public JPasswordField tfPW; //��й�ȣ �Է�â
	public JButton btnLogin, btnReset; //�α��ι�ư, �ʱ�ȭ��ư
	public Map<String, String> loginMap; //������ ���̵�� ��й�ȣ���� ��
	
	public LoginDesign(){
		super("log ������Ʈ");//â�� �̸�
		//������Ʈ ����
		lblID = new JLabel("���̵�");
		lblPW = new JLabel("��й�ȣ");
		tfID = new JTextField(12);//�Է�â�� ũ��
		tfPW = new JPasswordField(12);//�Է�â�� ũ��
		btnLogin = new JButton("�α���"); //
		btnReset = new JButton("�ʱ�ȭ");
		
		
		//map�� ���̵�� ��й�ȣ put
		loginMap = new HashMap<String, String>();//������ ���̵�� ��й�ȣ�� 
		loginMap.put("admin","1234");
		loginMap.put("root","1111");
		
		//Panel ����
		JPanel panel = new JPanel(); 
		JPanel panelTop = new JPanel(); // ���̵�, �н����� ��ġ panel
		JPanel panelBottom = new JPanel(); // ��ư ��ġ panel
		
		//panel�� layout ����
		panelTop.setLayout(new GridLayout(2, 2));
		panelBottom.setLayout(new FlowLayout());
		
		//������Ʈ ��ġ
		panelTop.add(lblID);
		panelTop.add(tfID);
		panelTop.add(lblPW);
		panelTop.add(tfPW);
		
		panelBottom.add(btnLogin);
		panelBottom.add(btnReset);
		
		panel.add(panelTop);
		panel.add(panelBottom);

		//border���� �� panel�� �����ӿ� ��ġ
		panel.setBorder(new TitledBorder("�α���"));
		add(panel);
		
		
		//LoginEvent��� �̺�Ʈó��Ŭ�������� ��ư�� ������ �� �߻��� �̺�Ʈ�� ó��
		LoginEvent ea=new LoginEvent( this );
		tfID.addActionListener(ea);   
		tfPW.addActionListener(ea);
		btnLogin.addActionListener(ea);
		btnReset.addActionListener(ea);
		
		//��ġ����
		setBounds(100, 100, 450, 150);
		//����ڿ��� �����ֱ�
		setVisible(true);
		//ũ�� ����
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// �̺�Ʈó�� Ŭ�������� ������ �� �ְ� �ν��Ͻ������� ���� ��ȯ get�޼ҵ� �ۼ�.
	public JTextField getTfID() {
		return tfID;
	}

	public JPasswordField getTfPW() {
		return tfPW;
	}
	
	public JButton getBtnLogin() {
		return btnLogin;
	}

	public JButton getBtnReset() {
		return btnReset;
	}

	public Map<String, String> getLoginMap() {
		return loginMap;
	}

	public static void main(String[] args) {
		new LoginDesign();
	}//main

}//class