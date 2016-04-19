package day0118;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���� ���̾ƿ�
 * @author user
 */
//1. Frame�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseGridLayout extends Frame{
	
	//2. ������Ʈ ����
	private Checkbox cb1,cb2 ,cb3,cb4,cb5,cb6 ; 
	
	public UseGridLayout(){
		super("�׸��� ���̾ƿ� ����"); // Ÿ��Ʋ �� ����
		//3. ����� ������Ʈ ����
		//label�� �־ �����Ǹ� �������� ���õǴ�CheckBox
//		cb1 = new Checkbox("��ȭ����");
//		cb2 = new Checkbox("���");
//		cb3 = new Checkbox("�ڹ�");
//		cb4 = new Checkbox("����");
//		cb5 = new Checkbox("���ǰ���");
//		cb6 = new Checkbox("����");
		//CheckboxGroup���� ������ �ϳ��� ���õǴ�  RadioButton
		CheckboxGroup cg = new CheckboxGroup(); // �ϳ��� ������ �����ϴ�.
		cb1 = new Checkbox("��ȭ����",false,cg);
		cb2 = new Checkbox("���",false,cg);
		cb3 = new Checkbox("�ڹ�",true,cg); // �ڹٰ� ���õǾ� ���´�.
		cb4 = new Checkbox("����",false,cg);
		cb5 = new Checkbox("���ǰ���",false,cg);
		cb6 = new Checkbox("����",false,cg);
		
		//4. ���̾ƿ�����
		setLayout(new GridLayout(3, 2));
		
		//5. ����� ������Ʈ ��ġ
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		
		//6. ������ ũ�⼳��
		setBounds(30, 80, 300, 150);
		
		//7. ��������� �����ֱ�
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
