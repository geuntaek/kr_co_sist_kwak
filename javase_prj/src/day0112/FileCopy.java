package day0112;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopy {
	
	public FileCopy(){
		// 복사할 파일을 선택
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "백업할 파일을 선택", FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		if(path != null){ //선택한 파일이 존재할 때만 실행
			int flag = JOptionPane.showConfirmDialog(frame, "파일을 백업 하시겠습니까?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				// 백업하는 코드를 작성
				
				File file = new File(path+name);// 원본파일을 가진 File
				
				StringBuilder backup_name = new StringBuilder(file.getAbsolutePath()); // 백업 파일명을 설정하기 위한 StringBuilder
				backup_name.insert(backup_name.lastIndexOf("."), "_"+System.currentTimeMillis()); // 백업파일 명 사이에 시간정보 삽입
				
				File backup_file = new File(backup_name.toString()); // 시간정보가 들어간 이름으로 File 생성
				try {
					FileInputStream fis = new FileInputStream(file); // fileNotFoundException을 처리해줘야한다. 백업할 파일을 읽기 위한 스트림
					FileOutputStream fos = new FileOutputStream(backup_file); // 읽어들인 내용으로 백업파일을 쓰기 위한 스트림
					int read = 0;
					long start_time = 0, end_time=0; // 끝난 시간에서 시작시간을 빼면 실행시간을 알 수 있다.
					start_time = System.currentTimeMillis();
					
//					while((read=fis.read())!=-1){
//						fos.write(read); // 스트림에 기록 : 나중에 기록되는 데이터가 이전에 기록된 데이터를 자동으로 분출한다. 제일 마지막에 남은 데이터를 flush해준다.
//					}// 44487
					
					// 효율높이기
					byte[] readData = new byte[512];
					while((read=fis.read(readData))!=-1){
						fos.write(readData, 0, read);
					} // 125
					fos.flush();
					fos.close();
					fis.close();
					end_time = System.currentTimeMillis();
					
					JOptionPane.showMessageDialog(frame, backup_name+"로 백업파일이 생성되었습니다."+"수행시간 : "+(end_time-start_time));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		}
		frame.dispose();
		
	}// FileCopy
	
	public static void main(String[] args) {
		
		new FileCopy();
		
	}// main

}// class
