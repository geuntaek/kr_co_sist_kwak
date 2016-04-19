package day0112;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePreview {

	public FilePreview(){
		
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "선택한 파일 열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		if(path != null){ // 취소가 아닌경우
			try {
				BufferedReader br = new BufferedReader(new FileReader(path+name));
				int cnt = 0;
				String temp = "";
				StringBuilder output = new StringBuilder();
				while((temp=br.readLine())!=null){
					output.append(temp).append("\n");
					if(cnt==4){
						break;
					}
					cnt++;
				}
				System.out.println(output);
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		fdOpen.dispose();
	}
	public static void main(String[] args) {
		new FilePreview();
	}

}
