package day0114;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.TextArea;

/**
 * ������� application�� �ۼ�
 * 1. Frame ��� (Window Component)
 * 2. �Ϲ� Component (Button) ����
 * 3. �Ϲ� Component�� ��ġ
 * 4. ������ component�� ������ ����
 * 5. ũ�Ⱑ ������ ������ ������Ʈ�� ����ڿ��� �����ش�.
 * @author user
 */
@SuppressWarnings("serial")
public class HelloAWT extends Frame{

	private Button btn;
	private TextArea ta;
	private Choice choice;
	public HelloAWT(){
		super("AWT����"); // ������ Ÿ��Ʋ�ٿ� �޼����� ����
		
		//2. �Ϲ�������Ʈ ����
		btn = new Button("�Ϲ�������Ʈ");
		ta = new TextArea();
		choice = new Choice();
		
		choice.add("������");
		choice.add("�Źο�");
		choice.add("���ֿ�");
		choice.add("�յ���");
		 
		//3. ��ġ
		add("South",btn);
		add("Center",ta);
		add("North",choice);
		//4. ������������Ʈ�� ũ�� ����
//		setSize(300, 200);
		setBounds(100, 300,400, 250);
		
		//5. ����ڿ��� �����ֱ�
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloAWT();
	}//main

}//class
