package kr.co.sist.memo;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

//Frame을 상속받고 
@SuppressWarnings("serial")
public class JavaMemo extends Frame {
	//사용할 컴포넌트를 선언
	private Menu menuFile, menuHelp;
	private MenuItem miNew, miOpen, miSave, miEnd, miHelp;
	private TextArea taMemoDisplay;
	

	public JavaMemo(MemoEvent me){
		//컴포넌트 생성
		super("메모장 - [제목없음]"); // 처음 떴을 때 타이틀바
		menuFile = new Menu("파일") ;
		menuHelp = new Menu("도움말");
		
		miNew = new MenuItem("새글"); 
		miOpen = new MenuItem("열기"); 
		miSave = new MenuItem("저장"); 
		miEnd = new MenuItem("닫기");
		miHelp = new MenuItem("메모장정보");
		
		taMemoDisplay = new TextArea();
		
		//컴포넌트 배치
		MenuBar mb = new MenuBar();
		
		mb.add(menuFile);
		mb.add(menuHelp);
		
		//메뉴에 메뉴아이템 배치
		menuFile.add(miNew);
		menuFile.addSeparator();
		menuFile.add(miOpen);
		menuFile.add(miSave);
		menuFile.addSeparator();
		menuFile.add(miEnd);
		
		menuHelp.add(miHelp);
		
		setMenuBar(mb);
		add(taMemoDisplay);
		
		//이벤트 등록
		miNew.addActionListener(me); // 이벤트가 발생하면 me가 처리한다.
		miOpen.addActionListener(me); 
		miSave.addActionListener(me); 
		miEnd.addActionListener(me); 
		miHelp.addActionListener(me);
		
		addWindowListener(me);
		
		
		setBounds(10,10,700,600);
		setVisible(true);
		
		
		
	}//JavaMemo

	public MenuItem getMiNew() {
		return miNew;
	}



	public MenuItem getMiOpen() {
		return miOpen;
	}



	public MenuItem getMiSave() {
		return miSave;
	}



	public MenuItem getMiEnd() {
		return miEnd;
	}



	public MenuItem getMiHelp() {
		return miHelp;
	}
	
	public TextArea getTaMemoDisplay() {
		return taMemoDisplay;
	}
	
}
