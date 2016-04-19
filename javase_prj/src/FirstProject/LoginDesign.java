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
 * 로그인 창 디자인
 * @author user
 */
@SuppressWarnings("serial")
public class LoginDesign extends JFrame {
	
	
	public JLabel lblID, lblPW; //아이디 비밀번호 
	public JTextField tfID; //아이디 입력창
	public JPasswordField tfPW; //비밀번호 입력창
	public JButton btnLogin, btnReset; //로그인버튼, 초기화버튼
	public Map<String, String> loginMap; //지정된 아이디와 비밀번호와의 비교
	
	public LoginDesign(){
		super("log 프로젝트");//창의 이름
		//컴포넌트 생성
		lblID = new JLabel("아이디");
		lblPW = new JLabel("비밀번호");
		tfID = new JTextField(12);//입력창의 크기
		tfPW = new JPasswordField(12);//입력창의 크기
		btnLogin = new JButton("로그인"); //
		btnReset = new JButton("초기화");
		
		
		//map에 아이디와 비밀번호 put
		loginMap = new HashMap<String, String>();//지정된 아이디와 비밀번호를 
		loginMap.put("admin","1234");
		loginMap.put("root","1111");
		
		//Panel 생성
		JPanel panel = new JPanel(); 
		JPanel panelTop = new JPanel(); // 아이디, 패스워드 배치 panel
		JPanel panelBottom = new JPanel(); // 버튼 배치 panel
		
		//panel의 layout 설정
		panelTop.setLayout(new GridLayout(2, 2));
		panelBottom.setLayout(new FlowLayout());
		
		//컴포넌트 배치
		panelTop.add(lblID);
		panelTop.add(tfID);
		panelTop.add(lblPW);
		panelTop.add(tfPW);
		
		panelBottom.add(btnLogin);
		panelBottom.add(btnReset);
		
		panel.add(panelTop);
		panel.add(panelBottom);

		//border설정 후 panel을 프레임에 배치
		panel.setBorder(new TitledBorder("로그인"));
		add(panel);
		
		
		//LoginEvent라는 이벤트처리클래스에서 버튼을 눌렀을 때 발생한 이벤트를 처리
		LoginEvent ea=new LoginEvent( this );
		tfID.addActionListener(ea);   
		tfPW.addActionListener(ea);
		btnLogin.addActionListener(ea);
		btnReset.addActionListener(ea);
		
		//위치설정
		setBounds(100, 100, 450, 150);
		//사용자에게 보여주기
		setVisible(true);
		//크기 고정
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 이벤트처리 클래스에서 가져올 수 있게 인스턴스변수의 값을 반환 get메소드 작성.
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