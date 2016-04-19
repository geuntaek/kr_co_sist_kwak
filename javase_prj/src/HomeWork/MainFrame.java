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
		super("����");
		mfTop = new JPanel();
		mfCenter = new JPanel();
		mfBottom = new JPanel();
		mfTop.setLayout(null);
		mfCenter.setLayout(null);
		mfBottom.setLayout(new FlowLayout());
		setLayout(null);
		mfCenter.setLayout(null);

		menu = new JComboBox<String>();
		menu.addItem("==================�޴�����==================");
		menu.addItem("1�� : �ִٻ�� Ű�� �̸��� Ƚ��");
		menu.addItem("2�� : �������� ����Ƚ���� ����");
		menu.addItem("3�� : ���񽺸� ���������� ������Ƚ���� ������ Ƚ�� ");
		menu.addItem("4�� : ��û�� ���� ���� �ð�");
		menu.addItem("5�� : ���������� ��û�� �߻��� Ƚ���� ����");
		menu.addItemListener(e);

		jtaLogDisplay = new JTextArea();
		jtaLogDisplay.setEditable(false);
		jtaLogDisplay.setFont(new Font("���� ���", 1, 20));
		//////////////////////////�̹��� ����//////////////////////////
		ImageIcon ii2=new ImageIcon(/*��θ� �ִ´�*/  "C:/dev/workspace/javase_prj/src/HomeWork/open1.jpg");
		btnOpen = new JButton(new ImageIcon("C:/dev/workspace/javase_prj/src/HomeWork/open.jpg"));
		btnOpen.setBorderPainted(false); // ��ư �׵θ� ����
		btnOpen.setContentAreaFilled(false); // ��ư ���� ��� ǥ�� ����
		btnOpen.setFocusPainted(false); // ��Ŀ�� ǥ�� ����
		btnOpen.setRolloverIcon(ii2); //���콺 �ø��� �����
	     //////////////////////////�̹��� ����//////////////////////////
		btnOpen.addActionListener(e);
		menu.setBounds(125, 20, 330, 30);
		btnOpen.setBounds(470, 20, 90, 30);
		mfTop.add(menu);
		mfTop.add(btnOpen);
		mfTop.setBorder(new TitledBorder("�α�����, �޴� ����"));
		mfTop.setBounds(10, 10, 580, 63);

		mfCenter.setBorder(new TitledBorder("�α� ���"));
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
