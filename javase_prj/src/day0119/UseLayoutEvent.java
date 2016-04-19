package day0119;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class UseLayoutEvent extends Frame implements ActionListener, ItemListener{
	// 사용할 컴포넌트 선언
	private Label lblName,lblAge,lblAddr;
	private TextField tfName, tfAge, tfAddr;
	private List listView;
	private Button btnAdd, btnRemove, btnEnd;
	private Panel paCenter, paLeft, paBottom;
	
	private int removeFlag;
	
	public UseLayoutEvent(){
		super("자동 배치와 이벤트 사용");
		
		removeFlag = -1;
		// 컴포넌트 생성
		lblName = new Label("이름");
		lblAge = new Label("나이");
		lblAddr = new Label("주소");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAddr = new TextField();
		
		listView = new List();
		
		btnAdd = new Button("추가"); 
		btnRemove = new Button("삭제");
		btnEnd = new Button("종료");
		
		paCenter = new Panel(); // 가운데 위치할 패널
		paLeft = new Panel(); // 가운데 위치할 패널에서 왼쪽에 들어갈 패널
		paBottom = new Panel(); // 아래쪽에 들어갈 패널
		
		// 패널에 레이아웃 설정
		paCenter.setLayout(new GridLayout(1, 2));
		paLeft.setLayout(new GridLayout(3, 2));
		
		//패널에 일반 컴포넌트를 배치
		
		//왼쪽에 들어갈 패널에 부착
		paLeft.add(lblName);
		paLeft.add(tfName);
		paLeft.add(lblAge);
		paLeft.add(tfAge);
		paLeft.add(lblAddr);
		paLeft.add(tfAddr);
		
		//가운데 들어갈 패널에 부착
		paCenter.add(paLeft);
		paCenter.add(listView);
		
		//아래쪽에 들어갈 패널에 컴포넌트를 부착
		paBottom.add(btnAdd);
		paBottom.add(btnRemove);
		paBottom.add(btnEnd);
		
		//컴포넌트 배치된 패널을 윈도우 컴포넌트의 배치
		add("Center",paCenter);
		add("South",paBottom);
		
		
		//컴포넌트에서 발생된 이벤트를 감지할 수 있도록 이벤트 리스너에 등록(add)
		//actionPerformed가 호출되어 처리
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		btnEnd.addActionListener(this);
		
		tfName.addActionListener(this);
		tfAge.addActionListener(this);
		tfAddr.addActionListener(this);
		
		
		//등록된 이벤트가 발생되면 itemStateChaned가 호출되어 처리
		listView.addItemListener(this);
		
		
		//크기설정
		setBounds(100,100,350,140);
		setVisible(true);
		
		//크기변경불가
		setResizable(false);
		
		
		//종료
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	public static void main(String[] args) {
		new UseLayoutEvent();
	}
	
	@Override
	public void itemStateChanged(ItemEvent ie) { // 리스트를 클릭했을 때 동작, 선택한 아이템의 인덱스를 얻는다.
		removeFlag = listView.getSelectedIndex();
		
		
//		listView.remove(listView.getSelectedIndex()); //클릭하자마자 삭제
		//선택한 아이템을 얻는다.
//		System.out.println(listView.getSelectedItem());
		String[] data = listView.getSelectedItem().split(",");
		if(data != null){
			//텍스트 필드에 값넣기
			tfName.setText(data[0]);
			tfAge.setText(data[1]);
			tfAddr.setText(data[2]);
		}
		
	}
	
	private void addItem(){
		//리스트에 입력값을 추가한다.
		//텍스트 필드의 값 가져오기
		String name = tfName.getText();
		String age = tfAge.getText();
		String addr = tfAddr.getText();
		
		if(name.equals("")||age.equals("")||addr.equals("")){
			JOptionPane.showMessageDialog(this, "데이터를 입력해주세요");
			return; //반환형이 void일 때 return은 아랫줄의 코드를 실행하지 말고 addItem을 호출한 곳으로 되돌아가라는 의미이다. 
		}
		
		// 이름을 입력하지 않았을 때 이름을 입력하라는 dialog를 보여주고 포커스를 tfName으로 이동.
//		if(name.equals("")){
//			JOptionPane.showMessageDialog(this, "이름을 입력해주세요");
//			tfName.requestFocus();
//			return; //반환형이 void일 때 return은 아랫줄의 코드를 실행하지 말고 addItem을 호출한 곳으로 되돌아가라는 의미이다. 
//		}
		
		StringBuilder addItem = new StringBuilder();
		addItem.append(name).append(",").append(age).append(",").append(addr);
		
		//리스트에 추가
		listView.add(addItem.toString());
		
		//텍스트필드의 초기화
		tfName.setText("");
		tfAge.setText("");
		tfAddr.setText("");
		
		//커서를 이름에 위치
		tfName.requestFocus(); 
	}
	
	public void removeItem(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==tfName){
			tfAge.requestFocus();
		}
		if(ae.getSource()==tfAge){
			tfAddr.requestFocus();
		}
		if(ae.getSource()==tfAddr||ae.getSource()==btnAdd){
			addItem();
		}
		
		if(ae.getSource()==btnRemove){
			//리스트에 입력값을 비교하여 해당 항복만 삭제한다.
			if(removeFlag == -1){ // 삭제할 아이템을 삭제하지 않은 경우
				JOptionPane.showMessageDialog(this, "삭제할 아이템을 클릭해주세요");
				return;
			}
			
			//삭제
			listView.remove(removeFlag);
			
			//삭제된 후 동일 아이템이 삭제될 수 있으므로 flag값을 초기화 시켜준다.
			removeFlag = -1;
			
			//텍스트필드 초기화
			tfName.setText("");
			tfAge.setText("");
			tfAddr.setText("");
			
		}
		if(ae.getSource()==btnEnd){
			dispose();
		}
		
		
	}

}











//		if(ae.getSource()==btnAdd){
//			addItem();
//		}