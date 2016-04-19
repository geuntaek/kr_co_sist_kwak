package FirstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * WorkDesign에서 발생한 이벤트를 처리하기위한 클래스
 * @author user
 */
public class WorkEvent implements ActionListener {

	
	private WorkDesign wd;
	
	static String path;
	
	public WorkEvent (WorkDesign wd){ // 인자있는 생성자, 파라미터는 WorkDesign의 객체. 
		this.wd = wd; // 객체 저장
	}//WorkEvent
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		//파일 선택 버튼을 눌렀을 때 발생하는 이벤트
		if(ae.getSource()==wd.getBtnFD()){
			wd.getTaWork().setText(""); //기존의 내용을 초기화 하기 위하여 사용(선택사항)
			//LogFileDialog 객체생성 후 
			LogFileDialog lfd = new LogFileDialog();
			//선택한 파일의 경로를 반환하는 메소드 logFilePath를 호출해서 경로를  path에 저장.
			path = lfd.logFilePath();
			
		}//end if
		
		//comboBox의 item을 선택했을 때 발생하는 이벤트
		if(ae.getSource()==wd.getComboBox()){
			if(path!=null&&!path.equals("")){ // 로그파일을 선택한 경우
				//콤보박스에서 선택한 아이템을 문자열 변수 temp에 저장 
				String temp = wd.getComboBox().getSelectedItem().toString();
				
				//선택한 아이템이 "작업을 선택하세요."라면 textArea를 초기화.
				if(temp.equals(wd.getWork0())){
					wd.getTaWork().setText("");
				}
				
				//선택한 아이템에 따라 각 메소드를 호출해서 TestArea에 뿌려준다.
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
				
			}else{ // 로그파일을 선택하지 않은 경우
				wd.getComboBox().setSelectedItem(wd.getWork0());
				JOptionPane.showMessageDialog(wd,"파일을 선택해주세요.");
			}//end if
		}//end if
		
	}//actionPerformed

}//class
