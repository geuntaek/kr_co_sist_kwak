package day0119;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Inner Class로 이벤트 처리
 * -이벤트가 디자인을 가진 클래스 안에서만 한정적으로 처리될 때
 * @author user
 */
@SuppressWarnings("serial")
public class EventProcess extends Frame {
	
	private Button btn;
	
	
	public EventProcess(){ // 생성자
		super("Inner Class를 사용한 이벤트 처리");
		//내부클래스 생성
		EventProcess.CloseEvent ce = this.new CloseEvent();
		
		btn = new Button("종료");
		//이벤트 등록
		btn.addActionListener(ce);
		
		add("South",btn);
		setSize(300, 300);
		setVisible(true);
		
	}//EventProcess
	
	/////////////////////////// Inner Class 시작///////////////////////////////
	public class CloseEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*EventProcess ep = getInstance();
			JOptionPane.showConfirmDialog(ep, "");
			if(e.getSource()==ep.btn){ // = if(e.getSource()==btn){
				
			}*/
			
			int flag = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
			switch(flag){
			case JOptionPane.OK_OPTION:
				dispose(); //바깥클래스의 부모클래스가 가진  method
 			}
			
		}//actionPerformed
		
	}//CloseEvent
	/////////////////////////// Inner Class 끝///////////////////////////////
	
	public EventProcess getInstance(){ // 인스턴스를 내보내기 위한 메소드
		return this;
	}
	
	public static void main(String[] args) {
		new EventProcess();
	}//main

}//class
