package HomeWork;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame {
	private JComboBox<String> menu;
	private JButton btnOpen;
	private JTextArea jtaLogDisplay;
	private JPanel mfTop;
	private JPanel mfCenter;
	private JPanel mfBottom;

	public MainFrame(Event e) {
		super("숙제");
		mfTop = new JPanel();
		mfCenter = new JPanel();
		mfBottom = new JPanel();
		mfTop.setLayout(null);
		mfCenter.setLayout(null);
		mfBottom.setLayout(new FlowLayout());
		setLayout(null);
		mfCenter.setLayout(null);

		menu = new JComboBox<String>();
		menu.addItem("==================메뉴선택==================");
		menu.addItem("1번 : 최다사용 키의 이름과 횟수");
		menu.addItem("2번 : 브라우저별 접속횟수와 비율");
		menu.addItem("3번 : 서비스를 성공적으로 수행한횟수와 실패한 횟수 ");
		menu.addItem("4번 : 요청이 가장 많은 시간");
		menu.addItem("5번 : 비정상적인 요청이 발생한 횟수와 비율");
		menu.addItemListener(e);

		jtaLogDisplay = new JTextArea();
		jtaLogDisplay.setEditable(false);
		jtaLogDisplay.setFont(new Font("맑은 고딕", 1, 20));
		//////////////////////////이미지 파일//////////////////////////
		ImageIcon ii2=new ImageIcon(/*경로를 넣는다*/  "C:/dev/workspace/javase_prj/src/HomeWork/open1.jpg");
		btnOpen = new JButton(new ImageIcon("C:/dev/workspace/javase_prj/src/HomeWork/open.jpg"));
		btnOpen.setBorderPainted(false); // 버튼 테두리 설정
		btnOpen.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정
		btnOpen.setFocusPainted(false); // 포커스 표시 설정
		btnOpen.setRolloverIcon(ii2); //마우스 올리면 변경됨
	     //////////////////////////이미지 파일//////////////////////////
		btnOpen.addActionListener(e);
		menu.setBounds(125, 20, 330, 30);
		btnOpen.setBounds(470, 20, 90, 30);
		mfTop.add(menu);
		mfTop.add(btnOpen);
		mfTop.setBorder(new TitledBorder("로그파일, 메뉴 선택"));
		mfTop.setBounds(10, 10, 580, 63);

		mfCenter.setBorder(new TitledBorder("로그 결과"));
		jtaLogDisplay.setBounds(5, 15, 570, 330);
		mfCenter.add(jtaLogDisplay);
		mfCenter.setBounds(10, 80, 580, 350);

		// keyCountPanel = new JPanel();
		add(mfTop);
		add(mfCenter);
		setBounds(650, 320, 600, 500);
		setResizable(false);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}// MainFrame

	protected JTextArea getJtaLogDisplay() {
		return jtaLogDisplay;
	}

	protected JComboBox<String> getMenu() {
		return menu;
	}

	protected JButton getBtnOpen() {
		return btnOpen;
	}
	//
}// class
