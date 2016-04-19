package day0118;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class UseMenubar extends Frame{

	private MenuBar mb;
	private Menu menuFile, menuEdit, menuGroup, menuGroup1, menuGroup2;
	private MenuItem miNew, miOpen, miSave, miExit, miCut, miCopy,  miDelete;
	
	private MenuItem miMember1,miMember2,miMember3,miMember4,miMember5,miMember6;
	
	
	public UseMenubar(){
		super("메뉴바 연습");
		
		//생성
		//메뉴바 생성
		mb = new MenuBar();
		//메뉴 생성
		menuFile = new Menu("파일");
		menuEdit = new Menu("편집");
		
		menuGroup = new Menu("조");
		menuGroup1 = new Menu("1조_이소희");
		menuGroup2 = new Menu("2조_오윤상");
		
		//메뉴 아이템 생성
		miNew = new MenuItem("새글"); 
		miOpen= new MenuItem("열기");
		miSave= new MenuItem("저장");
		miExit= new MenuItem("종료");
		miCut= new MenuItem("자르기");
		miCopy= new MenuItem("복사");
		miDelete= new MenuItem("삭제");
		
		miMember1 = new MenuItem("민명선");
		miMember2 = new MenuItem("이익희");
		
		miMember3 = new MenuItem("손은영");
		miMember4 = new MenuItem("신민우");
		miMember5 = new MenuItem("이용석");
		miMember6 = new MenuItem("홍가현");
		
		
		//메뉴 : 메뉴아이템 배치
		menuFile.add(miNew);
		menuFile.addSeparator();
		menuFile.add(miOpen);
		menuFile.addSeparator();
		menuFile.add(miSave);
		menuFile.add("-"); // separator
		menuFile.add(miExit);
		
		menuEdit.add(miCut);
		menuEdit.add(miCopy);
		menuEdit.addSeparator();
		menuEdit.add(miDelete);
		
		//메뉴에 메뉴를 배치하면 하위메뉴로 이동할 수 있다.
		menuGroup.add(menuGroup1);
		menuGroup.add(menuGroup2);
		
		menuGroup1.add(miMember1);
		menuGroup1.add(miMember2);
		
		menuGroup2.add(miMember3);
		menuGroup2.add(miMember4);
		menuGroup2.add(miMember5);
		menuGroup2.add(miMember6);
		
		//메뉴를 메뉴바에 배치
		mb.add(menuFile);
		mb.add(menuEdit);
		mb.add(menuGroup);
		
		//메뉴바를 프레임에 배치
		setMenuBar(mb);
		
		//크기설정
		setBounds(10, 10, 500, 400);
		
		//보여주기
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}//UseMenubar
	public static void main(String[] args) {
		new UseMenubar();
	}//main

}//class
