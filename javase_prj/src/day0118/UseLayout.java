package day0118;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class UseLayout extends Frame{
	// 사용할 컴포넌트 선언
	private Label lblName,lblAge,lblAddr;
	private TextField tfName, tfAge, tfAddr;
	private TextArea taMemo;
	private Button btnAdd, btnRemove, btnEnd;
	private Panel paCenter, paLeft, paBottom;
	
	
	public UseLayout(){
		super("자동 배치 사용");
		// 컴포넌트 생성
		lblName = new Label("이름");
		lblAge = new Label("나이");
		lblAddr = new Label("주소");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAddr = new TextField();
		
		taMemo = new TextArea();
		
		btnAdd = new Button("추가"); 
		btnRemove = new Button("삭제");
		btnEnd = new Button("종료");
		
		paCenter = new Panel(); // 가운데 위치할 패널
		paLeft = new Panel(); // 가운데 위치할 패널에서 왼쪽에 들어갈 패널
		paBottom = new Panel(); // 아래쪽에 들어갈 패널
		
		// 패널에 레이아웃 설정
		paCenter.setLayout(new GridLayout(1, 2));
		paLeft.setLayout(new GridLayout(3, 2));
		
		//패널에 일반 컴포넌트를 배치
		
		//왼쪽에 들어갈 패널에 부착
		paLeft.add(lblName);
		paLeft.add(tfName);
		paLeft.add(lblAge);
		paLeft.add(tfAge);
		paLeft.add(lblAddr);
		paLeft.add(tfAddr);
		
		//가운데 들어갈 패널에 부착
		paCenter.add(paLeft);
		paCenter.add(taMemo);
		
		//아래쪽에 들어갈 패널에 컴포넌트를 부착
		paBottom.add(btnAdd);
		paBottom.add(btnRemove);
		paBottom.add(btnEnd);
		
		//컴포넌트 배치된 패널을 윈도우 컴포넌트의 배치
		add("Center",paCenter);
		add("South",paBottom);
		
		//크기설정
		setBounds(100,100,300,140);
		setVisible(true);
		
		//크기변경불가
		setResizable(false);
		
		//종료
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	public static void main(String[] args) {
		new UseLayout();
	}

}
