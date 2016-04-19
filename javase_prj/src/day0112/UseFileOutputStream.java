package day0112;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * JVM에서 발생한 데이터를 파일로 출력
 * @author user
 */
public class UseFileOutputStream {
	
	public UseFileOutputStream(){
		File file = new File("c:/dev/temp/java_write.txt");
		try {
			// 출력 스트림 생성 : 생성하면 파일이 해당 위치에 생성이 된다.
//			FileOutputStream fos = new FileOutputStream(file);
//			int year = 2016;
//			fos.write(year); // IOException을 처리하지 않으면 에러가 발생
//			fos.flush();
//			fos.close();
			
			// 문자열 기록 : 8bit+16bit 스트림 사용
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))); // Has a 관계
//			String msg = "안녕?";
//			bw.write(msg);
//			bw.flush();
//			bw.close();
			
			FileWriter fw = new FileWriter(file); // 파일과 연결
			BufferedWriter bw = new BufferedWriter(fw);
			String msg = "안녕?b";
			bw.write(msg); // 스트림에 기록
			bw.flush(); // 스트림에 내용을 목적지로 분출
			bw.close(); // 끊기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UseFileOutputStream();
		
	}//main

}//class
