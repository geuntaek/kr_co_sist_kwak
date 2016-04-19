package kr.co.sist.memo;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

//Frame�� ��ӹް� 
@SuppressWarnings("serial")
public class JavaMemo extends Frame {
	//����� ������Ʈ�� ����
	private Menu menuFile, menuHelp;
	private MenuItem miNew, miOpen, miSave, miEnd, miHelp;
	private TextArea taMemoDisplay;
	

	public JavaMemo(MemoEvent me){
		//������Ʈ ����
		super("�޸��� - [�������]"); // ó�� ���� �� Ÿ��Ʋ��
		menuFile = new Menu("����") ;
		menuHelp = new Menu("����");
		
		miNew = new MenuItem("����"); 
		miOpen = new MenuItem("����"); 
		miSave = new MenuItem("����"); 
		miEnd = new MenuItem("�ݱ�");
		miHelp = new MenuItem("�޸�������");
		
		taMemoDisplay = new TextArea();
		
		//������Ʈ ��ġ
		MenuBar mb = new MenuBar();
		
		mb.add(menuFile);
		mb.add(menuHelp);
		
		//�޴��� �޴������� ��ġ
		menuFile.add(miNew);
		menuFile.addSeparator();
		menuFile.add(miOpen);
		menuFile.add(miSave);
		menuFile.addSeparator();
		menuFile.add(miEnd);
		
		menuHelp.add(miHelp);
		
		setMenuBar(mb);
		add(taMemoDisplay);
		
		//�̺�Ʈ ���
		miNew.addActionListener(me); // �̺�Ʈ�� �߻��ϸ� me�� ó���Ѵ�.
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
