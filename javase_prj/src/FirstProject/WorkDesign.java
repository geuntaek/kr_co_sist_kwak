package FirstProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * �۾��� ������ ����� �����ִ� â�� ������ Ŭ����
 * @author user
 */
@SuppressWarnings("serial")
public class WorkDesign extends JFrame{
	
	//������Ʈ ����
	private JComboBox<String> comboBox;
	private TextArea taWork;
	private JButton btnFD;
	//�޺��ڽ��� item
	private final String WORK0 = "�۾��� �����ϼ���.";
	private final String WORK1 = "�ִٻ�� Ű�� �̸��� Ƚ��";
	private final String WORK2 = "�������� ����Ƚ��, ����";
	private final String WORK3 = "���񽺸� ���������� ������ Ƚ���� ������ Ƚ��";
	private final String WORK4 = "��û�� ���� ���� �ð�";
	private final String WORK5 = "���������� ��û(403)�� �߻��� Ƚ��, ����";
	
	public WorkDesign(){ 
		super("log �м�");
		// comboBox�� ������ 
		String[] workArr = {WORK0,WORK1,WORK2,WORK3,WORK4,WORK5};
		comboBox = new JComboBox<String>(workArr);
		taWork = new TextArea();
		btnFD = new JButton("����");
		
		taWork.setText("�۾��� �����ϼ���");
		taWork.setEditable(false); // TextArea�� ������ �� ����
		taWork.setBackground(Color.WHITE);
		taWork.setFont(new Font("Dialog",Font.BOLD,17) ); // TextArea�� ��Ʈ ����
		
		// �г� ����
		JPanel panelTop = new JPanel();
		setLayout(new FlowLayout());
		// �гο� ������Ʈ ��ġ
		panelTop.add(comboBox);
		panelTop.add(btnFD);
		// �г��� �����ӿ� ��ġ
		setLayout(new BorderLayout());
		add("North",panelTop);
		add("Center",taWork);
		
		// WorkEvent��� �̺�Ʈó��Ŭ�������� �޺��ڽ��� ��ư�� ������ �� �߻��� �̺�Ʈ�� ó��
		WorkEvent ea=new WorkEvent( this );
		comboBox.addActionListener(ea);
		btnFD.addActionListener(ea);
		
		// ũ�⼳��
		setBounds(400, 200, 500, 250);
		setVisible(true);
		setResizable(false);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}//WorkDesign
	
	
	// �̺�Ʈó�� Ŭ�������� ������ �� �ְ� �ν��Ͻ������� ���� ��ȯ get�޼ҵ� �ۼ�.
	public JComboBox<String> getComboBox() {
		return comboBox;
	}
	public TextArea getTaWork() {
		return taWork;
	}
	public JButton getBtnFD() {
		return btnFD;
	}
	public String getWork0() {
		return WORK0;
	}
	public String getWork1() {
		return WORK1;
	}
	public String getWork2() {
		return WORK2;
	}
	public String getWork3() {
		return WORK3;
	}
	public String getWork4() {
		return WORK4;
	}
	public String getWork5() {
		return WORK5;
	}


	

}
