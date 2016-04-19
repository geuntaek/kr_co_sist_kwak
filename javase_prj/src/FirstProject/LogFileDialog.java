package FirstProject;

import java.awt.FileDialog;
import java.awt.Frame;

import javax.swing.JOptionPane;

public class LogFileDialog {
	
	/**
	 * 파일 다이얼로그로 선택한 파일의 경로를 반환하는 메소드
	 * @return filePath
	 */
	public String logFilePath(){
		
		String filePath = "";
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "선택한 파일 열기", FileDialog.LOAD); // 파일다이얼로그 생성
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory(); // 위치
		String name = fdOpen.getFile(); // 이름
		
		if(name!=null){ // 선택한 파일이 있는 경우
			String[] fileArr = name.split("[.]"); //.을 기준으로 배열을 생성한다.
			
			if(fileArr[fileArr.length-1].toLowerCase().equals("log")){  // 배열의 마지막 방의 값이 log -> log파일을 선택한 경우
				filePath = path+name;
			}else{ // 로그파일이 아닌 경우
				JOptionPane.showMessageDialog(frame, "log파일을 선택해주세요.");
				filePath = "";
			}
		}else{ // 선택한 파일이 없는 경우
			filePath = "";
		}
		
		//filePath반환
		return filePath;
	}//logFilePath

}//class
