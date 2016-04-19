package day0115;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 경계레이아웃의 사용 : 하나의 영역에는 하나의 컴포넌트만 들어갈수있다.
 * @author user
 */
//1.Frame을 상속
@SuppressWarnings("serial")
public class UseBorderLayout extends Frame{
	
	//2. 컴포넌트의 선언
	private Button btn;
	private Label lbl;
	private List list;
	private Choice choice;
	private Checkbox cb;
	
	public UseBorderLayout(){
		super("BorderLayout 연습");
		
		//3. 컴포넌트 생성
		btn = new Button("North");
		lbl = new Label("East");
		choice = new Choice();
		//아이템 추가
		choice.add("---------지역선택--------");
		choice.add("South");
		
		list = new List();
		//list 아이템 추가
		list.add("Center1");
		list.add("Center2");
		list.add("Center3");
		list.add("Center4");
		
		cb = new Checkbox("West");
		
		//4. 레이아웃 설정
		setLayout(new BorderLayout());
		
		//5. 위치를 설정하여 부착 : 문자열상수와 constant를 쓰는 것 2가지가 있다.
		//문자열 상서는 첫글자만 대문자이다. 하나의 영역에는 하나의 컴포넌트만 부착
		
		
		add("North",btn);
		add("East",lbl);
		add("Center",list);
		add("West",cb);
		add("South",choice);
		
		//6. 윈도우의 크기설정
		setBounds(200, 100, 400, 400);
		setVisible(true);
		
		//윈도우 종료이벤트 처리
		addWindowListener(new WindowAdapter() { // anonymous inner class
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // 실행중인 JVM의 현재객체만 종료한다.
			} 
		});
		
	}
	
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}// main

}//class
