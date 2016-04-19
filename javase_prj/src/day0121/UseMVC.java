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
 * 이 클래스 자체가 이벤트를 처리하는 클래스
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVC extends JFrame implements ActionListener, ListSelectionListener {

	private JLabel lblName;
	private JTextField tfName;
	private JButton btnAdd;
	
	private JList listName; // 보여주기
	
	private JTextArea taName;
	
	private DefaultListModel<String> dlm;
	
	public UseMVC() { // 기본생성자
		super("MVC Pattern이 적용된 jList의 사용");
		lblName = new JLabel("이름") ;
		tfName = new JTextField(10); // size설정 
		btnAdd = new JButton("클릭");
		
		dlm = new DefaultListModel<String>();
		listName = new JList(dlm);
		
		taName = new JTextArea();
		
		JPanel panelNorth = new JPanel();
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.setBorder(new TitledBorder("이름 입력"));
		JScrollPane spList = new JScrollPane(listName);
		spList.setBorder(new TitledBorder("추가된 이름 리스트"));
		
		JScrollPane spName = new JScrollPane(taName);
		spName.setBorder(new TitledBorder("선택된 이름"));
		
		setLayout(null); // 수동배치하겠다. layout을 가지지 않겠다.
		
		//크기와 위치 설정
		panelNorth.setBounds(10, 15, 400, 60);
		spList.setBounds(10, 85, 400, 150);
		spName.setBounds(10, 245, 400, 100);
		
		add(panelNorth);
		add(spList);
		add(spName);
		
		//이벤트 추가
		btnAdd.addActionListener(this); // this -> 내 클래스 안에서 처리한다.
		tfName.addActionListener(this);
//		listName.addListSelectionListener(this);
		
		listName.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectName = (String) listName.getSelectedValue();
				taName.append(selectName); // 메소드 체인 불가능
				taName.append("\n");
				dlm.remove(listName.getSelectedIndex()); //데이터를 가지고있는 곳에서 지운다.
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
		//리스트에 선택된 값을 얻어와서 텍스트 에어리어에 추가
		if(flag){
			String selectName = (String) listName.getSelectedValue();
			taName.append(selectName); // 메소드 체인 불가능
			taName.append("\n");
			
			//리스트에서 선택된 값을 삭제
//			dlm.removeElementAt(listName.getSelectedIndex());
//			dlm.removeElement(selectName);
		}
		flag = !flag;
	}//valueChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		//텍스트 필드의 값을 가져와서
		String name = tfName.getText().trim(); // 앞뒤 공백을 잘라서 문자열 변수에 넣는다.
		
		if(name.equals("")){ // textfield에 값이 들어있지 않은 경우
			JOptionPane.showMessageDialog(this, "이름은 필수 입력");
			tfName.requestFocus();
			return;
		}
		
		//리스트에 가져온 이름을 추가 (Model을 사용해야한다.)
//		listName.add(name); // view에 대한 작업이라 불가능
		dlm.addElement(name);
		//텍스트필드의 값을 초기화
		tfName.setText("");

	}//actionPerformed

	public static void main(String[] args) {
		new UseMVC();
	}//main

}//class
