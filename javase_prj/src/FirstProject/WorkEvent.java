package FirstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * WorkDesign���� �߻��� �̺�Ʈ�� ó���ϱ����� Ŭ����
 * @author user
 */
public class WorkEvent implements ActionListener {

	
	private WorkDesign wd;
	
	static String path;
	
	public WorkEvent (WorkDesign wd){ // �����ִ� ������, �Ķ���ʹ� WorkDesign�� ��ü. 
		this.wd = wd; // ��ü ����
	}//WorkEvent
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		//���� ���� ��ư�� ������ �� �߻��ϴ� �̺�Ʈ
		if(ae.getSource()==wd.getBtnFD()){
			wd.getTaWork().setText(""); //������ ������ �ʱ�ȭ �ϱ� ���Ͽ� ���(���û���)
			//LogFileDialog ��ü���� �� 
			LogFileDialog lfd = new LogFileDialog();
			//������ ������ ��θ� ��ȯ�ϴ� �޼ҵ� logFilePath�� ȣ���ؼ� ��θ�  path�� ����.
			path = lfd.logFilePath();
			
		}//end if
		
		//comboBox�� item�� �������� �� �߻��ϴ� �̺�Ʈ
		if(ae.getSource()==wd.getComboBox()){
			if(path!=null&&!path.equals("")){ // �α������� ������ ���
				//�޺��ڽ����� ������ �������� ���ڿ� ���� temp�� ���� 
				String temp = wd.getComboBox().getSelectedItem().toString();
				
				//������ �������� "�۾��� �����ϼ���."��� textArea�� �ʱ�ȭ.
				if(temp.equals(wd.getWork0())){
					wd.getTaWork().setText("");
				}
				
				//������ �����ۿ� ���� �� �޼ҵ带 ȣ���ؼ� TestArea�� �ѷ��ش�.
				if(temp.equals(wd.getWork1())){
					WorkFirst wo = new WorkFirst();
					wd.getTaWork().setText(wo.method1());
				}
				
				if(temp.equals(wd.getWork2())){
					WorkTwo wt = new WorkTwo();
					wd.getTaWork().setText(wt.method2());
				}
				
				if(temp.equals(wd.getWork3())){
					WorkThree wtt = new WorkThree();
					wd.getTaWork().setText(wtt.method3());
				}
				
				if(temp.equals(wd.getWork4())){
					WorkFour wf = new WorkFour();
					wd.getTaWork().setText(wf.method4());
				}
				if(temp.equals(wd.getWork5())){
					WorkFive wff = new WorkFive();
					wd.getTaWork().setText(wff.method5());
				}
				
			}else{ // �α������� �������� ���� ���
				wd.getComboBox().setSelectedItem(wd.getWork0());
				JOptionPane.showMessageDialog(wd,"������ �������ּ���.");
			}//end if
		}//end if
		
	}//actionPerformed

}//class
