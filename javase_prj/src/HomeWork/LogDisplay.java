package HomeWork;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class LogDisplay extends JFrame{
	private JLabel id;
	private JLabel pass;
	private JTextField tfId;
	private JPasswordField tfPass;
	private JButton btnInput;
	private JButton btnReset;
	public LogDisplay(Event e){
		super("숙제");
		id = new JLabel("USERNAME",SwingConstants.CENTER);
		pass = new JLabel("PASSWORD ",SwingConstants.CENTER);
		tfId = new JTextField(10);
		tfPass = new JPasswordField(10);
		btnInput = new JButton("확인");
		btnReset = new JButton("초기화");
		id.setFont(new Font("맑은 고딕",1,12));
		pass.setFont(new Font("맑은 고딕",1,12));
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBorder(new TitledBorder("정보입력"));
		JPanel panelCenter = new JPanel(new GridLayout(2, 2));
		JPanel panelSouth = new JPanel();
		panelCenter.add(id);
		///////////////////////test////////
		///////////////////////test////////
		
		//////////////////////////////이미지/////////////
		ImageIcon ii2=new ImageIcon(/*경로를 넣는다*/  "C:/dev/workspace/javase_prj/src/HomeWork/input1.jpg");
	     btnInput = new JButton(new ImageIcon("C:/dev/workspace/javase_prj/src/HomeWork/input.jpg"));
	     btnInput.setBorderPainted(false); // 버튼 테두리 설정
	     btnInput.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정
	     btnInput.setFocusPainted(false); // 포커스 표시 설정
	     btnInput.setRolloverIcon(ii2); //마우스 올리면 변경됨
		
		 ImageIcon ii3=new ImageIcon(/*경로를 넣는다*/  "C:/dev/workspace/javase_prj/src/HomeWork/reset1.jpg");
		 btnReset = new JButton(new ImageIcon("C:/dev/workspace/javase_prj/src/HomeWork/reset.jpg"));
		 btnReset.setBorderPainted(false); // 버튼 테두리 설정
		 btnReset.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정
		 btnReset.setFocusPainted(false); // 포커스 표시 설정
		 btnReset.setRolloverIcon(ii3); //마우스 올리면 변경됨
	     
		//////////////////////////////이미지/////////////
		panelCenter.add(tfId);
		panelCenter.add(pass);
		panelCenter.add(tfPass);
		panelSouth.add(btnInput);
		panelSouth.add(btnReset);
		panel.add(panelCenter);
		panel.add(panelSouth);
		setResizable(false);
		btnInput.addActionListener(e);
		btnReset.addActionListener(e);
		tfId.addActionListener(e);
		tfPass.addActionListener(e);
		
		add("Center",panel);
		setBounds(700, 400, 300, 145);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}//LogDisplay
	
	
	protected JButton getBtnInput() {
		return btnInput;
	}


	protected JButton getBtnReset() {
		return btnReset;
	}


	protected JTextField getTfId() {
		return tfId;
	}


	protected JPasswordField getTfPass() {
		return tfPass;
	}


	public static void main(String[] args) {
		Event e = new Event();
		LogDisplay ld = new LogDisplay(e);
		e.setLogDisplay(ld);
	}
}