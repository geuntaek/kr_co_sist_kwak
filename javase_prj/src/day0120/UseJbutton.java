package day0120;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 이미지가 들어간 JButton
 * @author user
 */
@SuppressWarnings("serial")
public class UseJbutton extends JFrame{
	
	JButton jbt1,jbt2,jbt3;
	
	
	public UseJbutton(){
		super("이미지가 들어간 버튼");
		
		//이미지를 사용하는 클래스
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj/src/day0120/img1.jpg");
		ImageIcon ii2 = new ImageIcon("C:/dev/workspace/javase_prj/src/day0120/img2.jpg");
		ImageIcon ii3 = new ImageIcon("C:/dev/workspace/javase_prj/src/day0120/img3.jpg");
		ImageIcon ii4 = new ImageIcon("C:/dev/workspace/javase_prj/src/day0120/img4.jpg");
		
		jbt1 = new JButton("이익희",ii1);
		jbt2 = new JButton("유호인",ii2);
		jbt3 = new JButton("민명선",ii3);
		
		jbt1.setToolTipText("이익희");
		jbt2.setToolTipText("유호인");
		jbt3.setToolTipText("민명선");
		
		//RollOver : 마우스가 올라가면 이미지를 변경하는것
		jbt1.setRolloverIcon(ii4);
//		jbt2.setRolloverIcon(ii4);
//		jbt3.setRolloverIcon(ii4);
		
		//글자위치변경
		jbt1.setVerticalTextPosition(JButton.TOP);
		jbt1.setHorizontalTextPosition(JButton.LEFT);
		jbt2.setHorizontalTextPosition(JButton.CENTER);
		jbt3.setVerticalTextPosition(JButton.BOTTOM);
		jbt3.setHorizontalTextPosition(JButton.CENTER);
		
		setLayout(new GridLayout(1, 3));
		add(jbt1);
		add(jbt2);
		add(jbt3);
		
		setBounds(100,100,700,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UseJbutton();
	}

}
