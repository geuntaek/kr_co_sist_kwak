package day0118;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 격자 레이아웃
 * @author user
 */
//1. Frame을 상속받는다.
@SuppressWarnings("serial")
public class UseGridLayout extends Frame{
	
	//2. 컴포넌트 선언
	private Checkbox cb1,cb2 ,cb3,cb4,cb5,cb6 ; 
	
	public UseGridLayout(){
		super("그리드 레이아웃 연습"); // 타이틀 바 설정
		//3. 선언된 컴포넌트 생성
		//label만 넣어서 생성되면 여러개가 선택되는CheckBox
//		cb1 = new Checkbox("만화감상");
//		cb2 = new Checkbox("등산");
//		cb3 = new Checkbox("자바");
//		cb4 = new Checkbox("지각");
//		cb5 = new Checkbox("음악감상");
//		cb6 = new Checkbox("독서");
		//CheckboxGroup으로 묶여서 하나만 선택되는  RadioButton
		CheckboxGroup cg = new CheckboxGroup(); // 하나만 선택이 가능하다.
		cb1 = new Checkbox("만화감상",false,cg);
		cb2 = new Checkbox("등산",false,cg);
		cb3 = new Checkbox("자바",true,cg); // 자바가 선택되어 나온다.
		cb4 = new Checkbox("지각",false,cg);
		cb5 = new Checkbox("음악감상",false,cg);
		cb6 = new Checkbox("독서",false,cg);
		
		//4. 레이아웃변경
		setLayout(new GridLayout(3, 2));
		
		//5. 선언된 컴포넌트 배치
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		
		//6. 윈도우 크기설정
		setBounds(30, 80, 300, 150);
		
		//7. 사용자한테 보여주기
		setVisible(true);
		
		addWindowListener(new WindowAdapter() { // anonymous class
			@Override
			public void windowClosing(WindowEvent we){
				dispose();
			}//windowClosing
		});
	}
	public static void main(String[] args) {
		new UseGridLayout();
	}//main

}//class
