package day0112;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CopyJava {

	public CopyJava() {
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "선택한 파일 열기", FileDialog.LOAD);
		fdOpen.setVisible(true); // dialog를 보여준다.
		String name = fdOpen.getFile(); // 선택한 파일의 이름
		String path = fdOpen.getDirectory(); // 선택한 파일의 경로
		String[] fileArr = name.split("[.]"); // 파일의 이름을 .을 기준으로 나눠서 배열에 저장.

		if (fileArr[fileArr.length - 1].toLowerCase().equals("java")) { // 배열의 마지막 방의 값이 java라면
			try {
				BufferedReader br = new BufferedReader(new FileReader(path + name));
				String temp = "";
				int cnt = 0;
				StringBuilder output = new StringBuilder();
				boolean flag = false;

				// public class가 들어간 line을 포함해 6줄을 output에 붙이고 showConfirmDialog를 통해 보여준다.
				while ((temp = br.readLine()) != null) {
					if (temp.contains("class")) { // 읽은 line에 public class가 포함되어있다면
						output.append(temp);
					}
					while (temp.contains("class")) {
						output.append(br.readLine()).append("\n");
						if (cnt == 5) {
							flag = true;
							break;
						}
						cnt++;
					}
					if (flag) {
						break;
					}
				}

				output.append("복사하시겠습니까?");
				int option = JOptionPane.showConfirmDialog(frame, output);
				switch (option) {
				case JOptionPane.OK_OPTION: // 예를 선택했을 경우
					StringBuilder copy_name = new StringBuilder(name); // java파일이름.java을 copy_name에 저장.

					// copy_name의 뒤에서부터 찾은 . 앞에[ 현재 날짜]를 붙임.
//					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//					String now = format.format(new Date(System.currentTimeMillis()));
					copy_name.insert(copy_name.lastIndexOf("."), "[" + System.currentTimeMillis() + "]");

					File file = new File("C:/dev/copy");
					StringBuilder copy_sb = new StringBuilder();
					copy_sb.append(file.toString()).append("/").append(copy_name.toString()); // copy_sb : path/원본[날짜].java
					
					File copy_file = new File(copy_sb.toString()); 

					if (file.mkdirs()) { // copyDir를 만듬
						System.out.println("copy 디렉토리를 생성했습니다.");
					} else { // 이미 copyDir가 존재하는 경우
						System.out.println("copy 디렉토리가 이미 생성되었습니다.");
					}

					FileInputStream fis = new FileInputStream(path + name); // copy하기 위한 stream
					FileOutputStream fos = new FileOutputStream(copy_file); // copy한걸 저장하기 위한 stream
					
					int read = 0;
					while ((read = fis.read()) != -1) { // 읽을 line이 없을 때까지
						fos.write(read); // 스트림에 기록 : 나중에 기록되는 데이터가 이전에 기록된 데이터를 자동으로 분출한다. 제일 마지막에 남은 데이터를 flush해준다.
					}
					fos.flush();
					fos.close();
					fis.close();
					JOptionPane.showMessageDialog(frame, "복사가 완료되었습니다.");
					break;
				default: // 아니오 혹은 취소를 선택했을 경우
					JOptionPane.showMessageDialog(frame, "복사를 취소했습니다.");
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(frame, "복사는 java만 됩니다.");
		}
		frame.dispose();
	}
	public static void main(String[] args) {
		new CopyJava();
	}

}
