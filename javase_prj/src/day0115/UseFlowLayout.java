package day0115;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 흐름레이아웃의 사용 : 크기가 변경되면 컴포넌트의 위치가 변경될 수 있다.
 * @author user
 */
//1.Frame을 상속 받는다.
@SuppressWarnings("serial")
public class UseFlowLayout extends Frame{
	//2. 일반컴포넌트 선언
	// 인스턴스변수
	private Label lblName,lblAge;
	private TextField tfName,tfAge;
	private Button btnAdd;
	
	public UseFlowLayout(){
		super("FlowLayout 연습"); // 부모클래스의 생성자 호출
		
		//3. 일반 컴포넌트를 생성
		lblName = new Label("이름");
		tfName = new TextField(10); // 크기 설정
		
		lblAge = new Label("나이");
		tfAge = new TextField("0",3); // 기본값과 크기 설정
		
		btnAdd = new Button("입력");
		
		// 이름 Label의 바닥색 변경
		lblName.setBackground(Color.RED);
		// 이름 Label의 글자색 변경
		lblName.setForeground(Color.blue);
		
		// RGB Color로 변경
		tfName.setBackground(new Color(0x8041D9));// 0x를 붙이면 16진수가 된다.
		tfName.setForeground(new Color(0xFAED7D));// 0x를 붙이면 16진수가 된다.
		
		setBackground(new Color(0xD1E1F0));
		
		//4. Layout변경. BorderLayout -> FlowLayout
		setLayout(new FlowLayout()); // 선언하지 않으면 borderLayout이여서 제일 마지막것만 보인다.
		// add하는 순서대로 컴포넌트가 위치된다.
		// 컴포넌트는 고유크기를 가진다.
		// 윈도우의 크기가 변경되면 컴포넌트들의 위치가 변경이 된다.
		add(lblName);
		add(tfName);
		
		add(lblAge);
		add(tfAge);
		add(btnAdd);
		
		//5. 크기 설정
		setBounds(100,100,400,300);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//종료 이벤트 처리 (윈도우에 종료버튼이 눌렸을 때 이 윈도우를 종료하는 것)
		addWindowListener(new WindowAdapter() { // anonymous inner class

			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(Frame.ABORT);//실행중인 JVM의 모든 instance를 종료한다.
//				System.exit(0);//실행중인 JVM의 모든 instance를 종료한다.
				dispose(); // 실행중인 JVM의 현재객체만 종료한다.
			} 
		});
		
		
	}//UseFlowLayout
	
	public static void main(String[] args) {
		new UseFlowLayout(); // 인스턴스화
	}// main

}// class
