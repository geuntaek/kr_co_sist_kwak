package day0112;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * File과 연결하고 연결된 파일 내의 데이터를 가져오는 File Stream의 사용
 * @author user
 */
public class UseFileStream {
	
	public UseFileStream(){
		//1.대상 파일을 설정
		File file = new File("c:/dev/temp/java_read.txt");
		if(file.exists()){
			try {
//				8bit 스트림을 사용하면 한글은 깨진다.
//				FileInputStream fis = new FileInputStream(file);
//				System.out.println((char)fis.read()); // 읽을 파일의 한글자만 읽어들인다.
//				int temp = 0;
//				while ((temp=fis.read())!=-1) {
//					System.out.print((char)temp); // 1byte(8bit)로 읽어들여서 영어와 숫자는 잘 나오지만 한글은 깨져서 나온다.
//				}// end while
//				fis.close(); // 자원이 새지 않게 close해준다. 사용한 스트림은 반드시 끊어준다.
				
				
				// 한글이 깨지지 않도록 읽기 위해서 8bit+16bir 스트림을 결합하여 사용
//				FileInputStream fis = new FileInputStream(file); // 대상파일과 연결하기 위한 스트림
//				InputStreamReader isr = new InputStreamReader(fis); // 8bit스트림과 16bit스트림을 연결하기 위한 스트림
//				BufferedReader br = new BufferedReader(isr); // 적재(속도를 올리기위해)하여 한번에 한줄씩 읽어들이는 기능이 있는 스트림을 연결
				
//				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file))); // 한줄로 작성
//				String temp = ""; // empty // null과 empty의 차이 -> empty는 차가 있으나 기름이 없는거, null은 차도 없는 것. 
//				while ((temp=br.readLine())!=null) { 
//					System.out.println(temp); // line을 읽다가 /n을 만나면 보낸다. 그래서 System.out.print(temp)하면 한줄에 나온다. 
//				}
//				br.close();
				
//				 16bit 스트림만 사용
//				FileReader fr = new FileReader(file); // 파일과 연결하는 일을 하는 스트림 생성
//				BufferedReader br = new BufferedReader(fr); // 적재(속도를 올리기위해)하여 한번에 한줄씩 읽어들이는 기능이 있는 스트림을 연결
				BufferedReader br = new BufferedReader(new FileReader(file));
				String temp = "";
				while((temp=br.readLine())!=null){
					System.out.println(temp);
				}
				br.close();
				
				
				
			} catch (FileNotFoundException e) { // 자식
				System.out.println("파일이 존재하지 않습니다. 경로를 확인하세요.");
				e.printStackTrace();
			} 
			catch (IOException e) { // 부모
				System.err.println("입출력 예외");
				e.printStackTrace();
			}
		}else{
			System.out.println("파일이 존재하지 않습니다. 경로를 확인하세요.");
		}// end else
		
		
		
	} // UseFileStream
	
	public static void main(String[] args) {
		new UseFileStream();
		
	} // main

} // class
