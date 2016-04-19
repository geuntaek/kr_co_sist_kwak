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
	
	//컴포넌트 선언
	private JComboBox<String> comboBox;
	private TextArea taWork;
	private JButton btnFD;
	
	//콤보박스의 item
	private final String WORK0 = "작업을 선택하세요.";
	private final String WORK1 = "최다사용 키의 이름과 횟수";
	private final String WORK2 = "브라우저별 접속횟수, 비율";
	private final String WORK3 = "서비스를 성공적으로 수행한 횟수와 실패한 횟수";
	private final String WORK4 = "요청이 가장 많은 시간";
	private final String WORK5 = "비정상적인 요청(403)이 발생한 횟수, 비율";
	
	public WorkDesign(){
		super("log 분석");
		// comboBox의 아이템 
		String[] workArr = {WORK0,WORK1,WORK2,WORK3,WORK4,WORK5};
		comboBox = new JComboBox<String>(workArr);
		taWork = new TextArea();
		btnFD = new JButton("파일 선택");
		
		taWork.setEditable(false); // TextArea를 수정할 수 없음
		taWork.setBackground(Color.WHITE);
		taWork.setFont(new Font("Dialog",Font.BOLD,17) ); // 폰트 설정
		
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
		setResizable(false); // 크기변경 불가
		
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
		
		//파일 선택 버튼을 눌렀을 때 발생하는 이벤트
		if(ae.getSource()==btnFD){
			taWork.setText(""); // 초기화
			
			//LogFileDialog 객체생성 후 
			LogFileDialog lfd = new LogFileDialog();
			
			//선택한 파일의 경로를 반환하는 메소드 logFilePath를 호출한다.
			path = lfd.logFilePath();
			
			if(!path.equals("")){ // log파일을 선택한 경우
				flag = true;
			}else{ // 선택하지 않은 경우
				flag = false;
			}
			
		}// end if
		
		//comboBox의 item을 선택했을 때 발생하는 이벤트
		if(ae.getSource()==comboBox){
			
			if(flag!=false){ // log파일을 선택한 경우
				
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
				
			}else{ // log파일을 선택하지 않은 경우
				comboBox.setSelectedItem(WORK0);
				JOptionPane.showMessageDialog(null,"파일을 선택해주세요.");
			}
		}// end if
	
		
	}

}
