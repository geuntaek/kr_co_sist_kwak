package kr.co.sist.memo;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MemoEvent extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String tempMemo; // 원본 저장 비교용
	
	public MemoEvent() {
		
	}
	
	public void setJm(JavaMemo jm){
		this.jm = jm;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트 비교
		
		//새글에서 이벤트가 발생한 경우
		if(ae.getSource()==jm.getMiNew()){
		
			newMemo();
		}//end if
		
		//열기에서 이벤트가 발생한 경우
		if(ae.getSource()==jm.getMiOpen()){
			try {
				openMemo();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "파일을 확인해주세요");
				e.printStackTrace();
			}// end catch
		}//end if
		
		//저장에서 이벤트가 발생한 경우
		if(ae.getSource()==jm.getMiSave()){
			try {
				saveMemo();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "파일 쓰기 문제 발생");
				e.printStackTrace();
			}
		}//end if
		
		//닫기에서 이벤트가 발생한 경우
		if(ae.getSource()==jm.getMiEnd()){
			jm.dispose();
		}//end if
		
		//메모장 정보에서 이벤트가 발생한 경우
		if(ae.getSource()==jm.getMiHelp()){
			openDialog();
		}//end if
		
	}//actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		//jm을 종료해야한다.
		jm.dispose();
	}//windowClosing

	private void newMemo(){ 
		
		String data = jm.getTaMemoDisplay().getText();
		boolean saveFlag =false;
		
		if(!data.equals("")){ // TextArea에 내용이 있는 경우
			if(!data.equals(tempMemo)){ //TextArea에 내용이 있다면 읽은 내용과 다른지 비교
				saveFlag = true;
			}
		}//end if
		
		if(saveFlag){
			int flag = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				try {
					saveMemo();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			default:
				//TextArea의 내용을 초기화
				saveFlag = false;
			}//end switch
		}//end if
		
		System.out.println("작업"+saveFlag);
		if(!saveFlag){
			jm.getTaMemoDisplay().setText("");
		}//end if
		jm.setTitle("메모장-[새글]"); //타이틀 바 설정
	}//newMemo
	
	private void openMemo() throws IOException{
		FileDialog fdOpen = new FileDialog(jm, "메모장-열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		//상용자가 선택한 파일의 경로와 파일명을 얻는다.
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		if (path!=null) { //파일 선택을 했다면
			File file = new File(path+name);
			BufferedReader br = null; //객체 초기화는 null
			try {
				//선택한 파일에 스트림을 연결
				br = new BufferedReader(new FileReader(file));
				//파일의 내용을 읽어 TextArea에 붙이기
				TextArea tempTa = jm.getTaMemoDisplay();
				StringBuilder data = new StringBuilder();
				String temp = "";
				
				while((temp = br.readLine())!=null){
					data.append(temp).append("\n");
				}
				if(data.length()>1){
					data.delete(data.length()-1, data.length());
				}
				//줄단위로 읽어 들여 저장한 내용을 TextArea에 설정하고 
				tempTa.setText(data.toString()); //기존의 내용이 사라지고 data를 쓴다.
				
				//파일에서 읽어들인 문자열 정보를 저장한다.
				tempMemo = data.toString(); 
				
				
				//타이틀바를 변경한다.
				jm.setTitle("메모장-열기 ["+name+"]");
			} finally {
				if(br != null){
					br.close();
				}
			}
			
			
			
		}
		
	}//openMemo
	
	private void saveMemo() throws IOException{
		FileDialog fdSave = new FileDialog(jm, "메모장-저장", FileDialog.SAVE);
		fdSave.setVisible(true); 
		String path = fdSave.getDirectory();
		String name = fdSave.getFile();
		
		if(path!=null){
			File file = new File(path+name);
			//선택한 파일에 쓰기 스트림 연결
			BufferedWriter bw =null;
			try{
				bw = new BufferedWriter(new FileWriter(file));
				//TextArea에 내용을 읽어와서 연결된 파일에 쓰기
				String data = jm.getTaMemoDisplay().getText();
				bw.write(data);
				bw.flush();
				
				jm.setTitle("메모장-저장["+name+"]");
			}finally{
				if(bw!=null){
					bw.close();
				}
			}
			
			
		}
		
		
	}//saveMemo

	private void openDialog(){
		new MemoDialog(jm);
	}//openDialog
	
}//class







