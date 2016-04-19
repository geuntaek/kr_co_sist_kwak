package day0114;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.TextArea;

/**
 * 윈도우용 application을 작성
 * 1. Frame 상속 (Window Component)
 * 2. 일반 Component (Button) 생성
 * 3. 일반 Component를 배치
 * 4. 윈도우 component의 사이즈 설정
 * 5. 크기가 설정된 윈도우 컴포넌트를 사용자에게 보여준다.
 * @author user
 */
@SuppressWarnings("serial")
public class HelloAWT extends Frame{

	private Button btn;
	private TextArea ta;
	private Choice choice;
	public HelloAWT(){
		super("AWT연습"); // 윈도우 타이틀바에 메세지를 설정
		
		//2. 일반컴포넌트 생성
		btn = new Button("일반컴포넌트");
		ta = new TextArea();
		choice = new Choice();
		
		choice.add("이익희");
		choice.add("신민우");
		choice.add("진주용");
		choice.add("손두한");
		 
		//3. 배치
		add("South",btn);
		add("Center",ta);
		add("North",choice);
		//4. 원도우컴포넌트의 크기 설정
//		setSize(300, 200);
		setBounds(100, 300,400, 250);
		
		//5. 사용자에게 보여주기
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloAWT();
	}//main

}//class
