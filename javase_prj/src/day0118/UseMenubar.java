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
		super("�޴��� ����");
		
		//����
		//�޴��� ����
		mb = new MenuBar();
		//�޴� ����
		menuFile = new Menu("����");
		menuEdit = new Menu("����");
		
		menuGroup = new Menu("��");
		menuGroup1 = new Menu("1��_�̼���");
		menuGroup2 = new Menu("2��_������");
		
		//�޴� ������ ����
		miNew = new MenuItem("����"); 
		miOpen= new MenuItem("����");
		miSave= new MenuItem("����");
		miExit= new MenuItem("����");
		miCut= new MenuItem("�ڸ���");
		miCopy= new MenuItem("����");
		miDelete= new MenuItem("����");
		
		miMember1 = new MenuItem("�θ�");
		miMember2 = new MenuItem("������");
		
		miMember3 = new MenuItem("������");
		miMember4 = new MenuItem("�Źο�");
		miMember5 = new MenuItem("�̿뼮");
		miMember6 = new MenuItem("ȫ����");
		
		
		//�޴� : �޴������� ��ġ
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
		
		//�޴��� �޴��� ��ġ�ϸ� �����޴��� �̵��� �� �ִ�.
		menuGroup.add(menuGroup1);
		menuGroup.add(menuGroup2);
		
		menuGroup1.add(miMember1);
		menuGroup1.add(miMember2);
		
		menuGroup2.add(miMember3);
		menuGroup2.add(miMember4);
		menuGroup2.add(miMember5);
		menuGroup2.add(miMember6);
		
		//�޴��� �޴��ٿ� ��ġ
		mb.add(menuFile);
		mb.add(menuEdit);
		mb.add(menuGroup);
		
		//�޴��ٸ� �����ӿ� ��ġ
		setMenuBar(mb);
		
		//ũ�⼳��
		setBounds(10, 10, 500, 400);
		
		//�����ֱ�
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
