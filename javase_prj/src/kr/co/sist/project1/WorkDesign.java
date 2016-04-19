package kr.co.sist.project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WorkDesign extends JFrame implements ActionListener{
	
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
		btnFD = new JButton("���� ����");
		
		taWork.setEditable(false); // TextArea�� ������ �� ����
		taWork.setBackground(Color.WHITE);
		taWork.setFont(new Font("Dialog",Font.BOLD,17) ); // ��Ʈ ����
		
		JPanel panelTop = new JPanel();
		setLayout(new FlowLayout());
		panelTop.add(comboBox);
		panelTop.add(btnFD);
		
		setLayout(new BorderLayout());
		add("North",panelTop);
		add("Center",taWork);
		
		comboBox.addActionListener(this);
		btnFD.addActionListener(this);
		
		setBounds(400, 200, 500, 250);
		setVisible(true);
		setResizable(false); // ũ�⺯�� �Ұ�
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}//WorkDesign
	
	static String path; 
	private boolean flag;
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//���� ���� ��ư�� ������ �� �߻��ϴ� �̺�Ʈ
		if(ae.getSource()==btnFD){
			taWork.setText(""); // �ʱ�ȭ
			
			//LogFileDialog ��ü���� �� 
			LogFileDialog lfd = new LogFileDialog();
			
			//������ ������ ��θ� ��ȯ�ϴ� �޼ҵ� logFilePath�� ȣ���Ѵ�.
			path = lfd.logFilePath();
			
			if(!path.equals("")){ // log������ ������ ���
				flag = true;
			}else{ // �������� ���� ���
				flag = false;
			}
			
		}// end if
		
		//comboBox�� item�� �������� �� �߻��ϴ� �̺�Ʈ
		if(ae.getSource()==comboBox){
			
			if(flag!=false){ // log������ ������ ���
				
				String temp = comboBox.getSelectedItem().toString(); 
				if(temp.equals(WORK0)){
					taWork.setText("");
				}
				
				if(temp.equals(WORK1)){
					WorkFirst wo = new WorkFirst();
					taWork.setText(wo.method1());
				}
				
				if(temp.equals(WORK2)){
					WorkTwo wt = new WorkTwo();
					taWork.setText(wt.method2());
				}
				
				if(temp.equals(WORK3)){
					WorkThree wtt = new WorkThree();
					taWork.setText(wtt.method3());
				}
				
				if(temp.equals(WORK4)){
					WorkFour wf = new WorkFour();
					taWork.setText(wf.method4());
				}
				
				if(temp.equals(WORK5)){
					WorkFive wff = new WorkFive();
					taWork.setText(wff.method5());
				}
				
			}else{ // log������ �������� ���� ���
				comboBox.setSelectedItem(WORK0);
				JOptionPane.showMessageDialog(null,"������ �������ּ���.");
			}
		}// end if
	
		
	}

}
