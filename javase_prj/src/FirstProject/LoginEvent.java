package FirstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * LoginDesignŬ�������� �߻��� �̺�Ʈ�� ó���ϱ� ���� Ŭ����
 * @author user
 */
public class LoginEvent implements ActionListener{
	
	
	private LoginDesign ld; 
	
	
	public LoginEvent( LoginDesign ld) { // �����ִ� ������, �Ķ���ʹ� LoginDesign�� ��ü. 
		 this.ld=ld; // ��ü ����
	}//LoginEvent

	@Override
	  public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==ld.getTfID()){
			ld.getTfPW().requestFocus();
		}//end if
		
		
		//�α��� ��ư���� �̺�Ʈ �߻����� ��
		if(ae.getSource()==ld.getBtnLogin()){ 
			// textField�� �Է��� ���� strID�� strPW�� ����.
			String strID = ld.getTfID().getText();
			String strPW = new String(ld.getTfPW().getPassword());
			
			if(ld.getLoginMap().get(strID)!=null){ //�Է¹��� ���̵�� ���� Ű�� ���� �����Ѵٸ�
				
				if(ld.getLoginMap().get(strID).equals(strPW)){ //Ű�� value(��й�ȣ)�� ��ġ�ϴ� ���
					new WorkDesign();
				}else{ //Ű�� value�� ��ġ���� �ʴ°��
					JOptionPane.showMessageDialog(ld, "���̵� ��й�ȣ �ٽ� �Է����ּ���");
				}
			}else{ // ���̵� �������� �ʴ°��
				JOptionPane.showMessageDialog(ld, "���̵� ��й�ȣ �ٽ� �Է����ּ���");
			}

		}//end if
		// �ʱ�ȭ
		if(ae.getSource()==ld.getBtnReset()){
			ld.getTfID().setText("");
			ld.getTfPW().setText("");
			
		}//end if
	}//actionPerformed
}//class
