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
 * 작업을 선택해 결과를 보여주는 창의 디자인 클래스
 * @author user
 */
@SuppressWarnings("serial")
public class WorkDesign extends JFrame{
	
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
		btnFD = new JButton("선택");
		
		taWork.setText("작업을 선택하세요");
		taWork.setEditable(false); // TextArea를 수정할 수 없음
		taWork.setBackground(Color.WHITE);
		taWork.setFont(new Font("Dialog",Font.BOLD,17) ); // TextArea의 폰트 설정
		
		// 패널 생성
		JPanel panelTop = new JPanel();
		setLayout(new FlowLayout());
		// 패널에 컴포넌트 배치
		panelTop.add(comboBox);
		panelTop.add(btnFD);
		// 패널을 프레임에 배치
		setLayout(new BorderLayout());
		add("North",panelTop);
		add("Center",taWork);
		
		// WorkEvent라는 이벤트처리클래스에서 콤보박스와 버튼을 눌렀을 때 발생한 이벤트를 처리
		WorkEvent ea=new WorkEvent( this );
		comboBox.addActionListener(ea);
		btnFD.addActionListener(ea);
		
		// 크기설정
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
	
	
	// 이벤트처리 클래스에서 가져올 수 있게 인스턴스변수의 값을 반환 get메소드 작성.
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
