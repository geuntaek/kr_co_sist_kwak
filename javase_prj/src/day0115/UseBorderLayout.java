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
 * ��跹�̾ƿ��� ��� : �ϳ��� �������� �ϳ��� ������Ʈ�� �����ִ�.
 * @author user
 */
//1.Frame�� ���
@SuppressWarnings("serial")
public class UseBorderLayout extends Frame{
	
	//2. ������Ʈ�� ����
	private Button btn;
	private Label lbl;
	private List list;
	private Choice choice;
	private Checkbox cb;
	
	public UseBorderLayout(){
		super("BorderLayout ����");
		
		//3. ������Ʈ ����
		btn = new Button("North");
		lbl = new Label("East");
		choice = new Choice();
		//������ �߰�
		choice.add("---------��������--------");
		choice.add("South");
		
		list = new List();
		//list ������ �߰�
		list.add("Center1");
		list.add("Center2");
		list.add("Center3");
		list.add("Center4");
		
		cb = new Checkbox("West");
		
		//4. ���̾ƿ� ����
		setLayout(new BorderLayout());
		
		//5. ��ġ�� �����Ͽ� ���� : ���ڿ������ constant�� ���� �� 2������ �ִ�.
		//���ڿ� �󼭴� ù���ڸ� �빮���̴�. �ϳ��� �������� �ϳ��� ������Ʈ�� ����
		
		
		add("North",btn);
		add("East",lbl);
		add("Center",list);
		add("West",cb);
		add("South",choice);
		
		//6. �������� ũ�⼳��
		setBounds(200, 100, 400, 400);
		setVisible(true);
		
		//������ �����̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { // anonymous inner class
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // �������� JVM�� ���簴ü�� �����Ѵ�.
			} 
		});
		
	}
	
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}// main

}//class
