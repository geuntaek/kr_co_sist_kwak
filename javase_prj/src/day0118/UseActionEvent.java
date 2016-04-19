package day0118;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
// 현재 클래스에서 발생된 이벤트 처리하기 //
// E-1. 등록
// E-2. 현재 클래스가 이벤트를 처리할 수 있도록 xxxListener가 되어야한다.
// E-3. Override한 method안에서 이벤트가 발생되었을 때 제공할 코드 작성

// E-2
public class UseActionEvent extends Frame implements ActionListener {

	// 선언되는 Component들은 이벤트와 관련있는 것들만 선언
	private TextField tfName;
	private Button btnAdd,btnReset;
	private TextArea taDisplay;
	
	public UseActionEvent() {
		super("액션이벤트 처리");
		Label lblName = new Label("이름 : ",Label.CENTER); // 이벤트에 관여하지 않기 때문에 지역변수로 만들었다.
		tfName = new TextField(10);
		btnAdd = new Button("추가");
		btnReset = new Button("초기화");
		taDisplay = new TextArea();
		
		Panel panelNorth = new Panel();
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnReset);
		
		add(BorderLayout.NORTH,panelNorth);
		add(BorderLayout.CENTER,taDisplay);
		
		//E-1
		btnAdd.addActionListener(this);
		btnReset.addActionListener(this);
		tfName.addActionListener(this);
		
		setVisible(true);
		setBounds(700, 500, 400, 250);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}
	
	//E-3
	@Override
	public void actionPerformed(ActionEvent e) {
		//텍스트필드에서 인력된 이름을 가져와서  텍스트에어리어에 넣자
		if(e.getSource()==btnAdd||e.getSource()==tfName){
			String name = tfName.getText();
			taDisplay.append(name+"님\n");
			
			//텍스트필드에 입력값을 초기화
			tfName.setText("");
		}
		if(e.getSource()==btnReset){//초기화
			taDisplay.getText(); //객체를 한번더 인식을 시키고 setText해야한다. 버그때문에...(?)
			taDisplay.setText(null);
		}
	}
	
	public static void main(String[] args) {
		new UseActionEvent();
	}//main

}//class
