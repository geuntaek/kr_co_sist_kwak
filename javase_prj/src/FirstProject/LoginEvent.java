package FirstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * LoginDesign클래스에서 발생한 이벤트를 처리하기 위한 클래스
 * @author user
 */
public class LoginEvent implements ActionListener{
	
	
	private LoginDesign ld; 
	
	
	public LoginEvent( LoginDesign ld) { // 인자있는 생성자, 파라미터는 LoginDesign의 객체. 
		 this.ld=ld; // 객체 저장
	}//LoginEvent

	@Override
	  public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==ld.getTfID()){
			ld.getTfPW().requestFocus();
		}//end if
		
		
		//로그인 버튼에서 이벤트 발생했을 때
		if(ae.getSource()==ld.getBtnLogin()){ 
			// textField에 입력한 값을 strID와 strPW에 저장.
			String strID = ld.getTfID().getText();
			String strPW = new String(ld.getTfPW().getPassword());
			
			if(ld.getLoginMap().get(strID)!=null){ //입력받은 아이디와 같은 키의 값이 존재한다면
				
				if(ld.getLoginMap().get(strID).equals(strPW)){ //키의 value(비밀번호)가 일치하는 경우
					new WorkDesign();
				}else{ //키의 value가 일치하지 않는경우
					JOptionPane.showMessageDialog(ld, "아이디 비밀번호 다시 입력해주세요");
				}
			}else{ // 아이디가 존재하지 않는경우
				JOptionPane.showMessageDialog(ld, "아이디 비밀번호 다시 입력해주세요");
			}

		}//end if
		// 초기화
		if(ae.getSource()==ld.getBtnReset()){
			ld.getTfID().setText("");
			ld.getTfPW().setText("");
			
		}//end if
	}//actionPerformed
}//class
