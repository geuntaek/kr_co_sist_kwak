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
		super("swing 연습");
		jtfName = new JTextField();
		jpfAddr = new JPasswordField();
		jbtAdd = new JButton("입력");
		
		jpfAddr.setEchoChar('*');
		
		JPanel panel = new JPanel();
		JPanel panelBtn = new JPanel();

		panel.setLayout(new GridLayout(3, 1));
		
		//Border설정
		panel.setBorder(new TitledBorder("정보입력"));
		jtfName.setBorder(new TitledBorder("이름"));
		jpfAddr.setBorder(new TitledBorder("주소"));

		panelBtn.add(jbtAdd);
		
		panel.add(jtfName);
		panel.add(jpfAddr);
		panel.add(panelBtn);
		
		add("Center",panel);
		
		//이벤트 등록
		jbtAdd.addActionListener(this);
		
		setBounds(500,500,250,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseSwing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String name = jtfName.getText();
		String addr = new String(jpfAddr.getPassword());
		
		JTextArea jta = new JTextArea(10,45); //10행이 있고, 한 행마다 보여주는 글자수는 45자 
		jta.setText("입력한 정보 \n이름 "+name+"\n주소 "+addr);
		//scrollBar가 필요한 컴포넌트를 위해서 JScrollPane이 제공
		JScrollPane jsp = new JScrollPane(jta); 
		
		if(ae.getSource()==jbtAdd){
			JOptionPane.showMessageDialog(this, jsp);
		}
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseSwing();
	}//main

}//class
