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
 * �ϳ��� ������ ���� �����̳� ������Ʈ �� �ϳ��� �����ִ� CardLayout
 * @author user
 */
@SuppressWarnings("serial")
public class UseCardLayout extends Frame{

	TextArea ta;
	List list;
	Label lbl;
	
	public UseCardLayout(){
		super("ī�巹�̾ƿ� ����");
		ta = new TextArea();
		list = new List();
		list.add("������");
		list.add("��ȣ��");
		list.add("������");
		lbl = new Label("������ ������");
		
		// ������ ������Ʈ�� Container Component�� ��ġ
		Panel p1= new Panel();
		Panel p2= new Panel();
		Panel p3= new Panel();
		
		p1.add(ta);
		p2.add(list);
		p3.add(lbl);
		
		// CardLayout ����
		CardLayout cl = new CardLayout();
		Panel main = new Panel();
		main.setLayout(cl);
		// CardLayout�� ������ ������Ʈ�� ������ ������Ʈ ��ġ �� �ĺ� ������ �̸� ����
		main.add(p1,"p_ta");
		main.add(p2,"p_list");
		main.add(p3,"p_lbl");
		
		//CardLayout�� ������ ������Ʈ�� ������������Ʈ�� ��ġ
		add("Center",main);
		
		// ������Ʈ �� ������ ������Ʈ�� ����
		cl.show(main, "p_lbl"); // 3���� �߿� ��� �������� �����Ѵ�.
		
		setSize(500,400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			// Alt+shift+s -> override method -> windowClosing ����
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