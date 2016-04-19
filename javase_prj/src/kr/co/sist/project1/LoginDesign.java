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
		super("log 프로젝트");
		
		//컴포넌트 생성
		lblID = new JLabel("아이디");
		lblPW = new JLabel("비밀번호");
		tfID = new JTextField(12);
		tfPW = new JPasswordField(12);
		btnLogin = new JButton("로그인"); 
		btnReset = new JButton("초기화");
		
		
		//map에 아이디와 비밀번호 put
		loginMap = new HashMap<String, String>();
		loginMap.put("admin","1234");
		loginMap.put("root","1111");
		
		//Panel 생성
		JPanel panel = new JPanel(); 
		JPanel panelTop = new JPanel(); // 아이디, 패스워드 배치 panel
		JPanel panelBottom = new JPanel(); // 버튼 배치 panel
		
		//panel의 layout 설정
		panelTop.setLayout(new GridLayout(2, 2));
		
		//컴포넌트 배치
		panelTop.add(lblID);
		panelTop.add(tfID);
		panelTop.add(lblPW);
		panelTop.add(tfPW);
		
		panelBottom.setLayout(new FlowLayout());
		
		panelBottom.add(btnLogin);
		panelBottom.add(btnReset);
		
		panel.add("North",panelTop);
		panel.add("South",panelBottom);
		
		//border설정 후 panel 배치
		panel.setBorder(new TitledBorder("로그인"));
		add(panel);
		
		//이벤트 처리
		tfID.addActionListener(this);
		tfPW.addActionListener(this);
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		
		//위치설정
		setBounds(100, 100, 450, 150);
		//사용자에게 보여주기
		setVisible(true);
		//크기 고정
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
		
		//로그인 버튼에서 이벤트 발생했을 때
		if(ae.getSource()==btnLogin){ 
			// textField에 입력한 값을 strID와 strPW에 저장.
			String strID = tfID.getText();
			String strPW = new String(tfPW.getPassword());
			
			if(loginMap.get(strID)!=null){ //입력받은 아이디와 같은 키의 값이 존재한다면
				if(loginMap.get(strID).equals(strPW)){ //키의 value(비밀번호)가 일치하는 경우
					new WorkDesign();
				}else{ //키의 value가 일치하지 않는경우
					JOptionPane.showMessageDialog(this, "아이디 비밀번호 다시 입력해주세요");
				}
			}else{ // 아이디가 존재하지 않는경우
				JOptionPane.showMessageDialog(this, "아이디 비밀번호 다시 입력해주세요");
			}

		}
		// 초기화
		if(ae.getSource()==btnReset){ 
			tfID.setText("");
			tfPW.setText("");
			
		}
	}

}

