package day0118;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 하나의 영역에 여러 컨테이너 컴포넌트 중 하나만 보여주는 CardLayout
 * @author user
 */
@SuppressWarnings("serial")
public class UseCardLayout extends Frame{

	TextArea ta;
	List list;
	Label lbl;
	
	public UseCardLayout(){
		super("카드레이아웃 연습");
		ta = new TextArea();
		list = new List();
		list.add("김정식");
		list.add("유호인");
		list.add("조근택");
		lbl = new Label("오늘은 월요일");
		
		// 생성된 컴포넌트를 Container Component에 배치
		Panel p1= new Panel();
		Panel p2= new Panel();
		Panel p3= new Panel();
		
		p1.add(ta);
		p2.add(list);
		p3.add(lbl);
		
		// CardLayout 생성
		CardLayout cl = new CardLayout();
		Panel main = new Panel();
		main.setLayout(cl);
		// CardLayout이 설정된 컴포넌트에 보여줄 컴포넌트 배치 후 식별 가능한 이름 설정
		main.add(p1,"p_ta");
		main.add(p2,"p_list");
		main.add(p3,"p_lbl");
		
		//CardLayout이 설정된 컴포넌트를 윈도우컴포넌트에 배치
		add("Center",main);
		
		// 컴포넌트 중 보여줄 컴포넌트를 설정
		cl.show(main, "p_lbl"); // 3가지 중에 어떤걸 보여줄지 설정한다.
		
		setSize(500,400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			// Alt+shift+s -> override method -> windowClosing 선택
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}
	public static void main(String[] args) {
		new UseCardLayout();
	}//main

}//class