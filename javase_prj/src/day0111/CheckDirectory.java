package day0111;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class CheckDirectory {
	private static final String format = "yyyy-MM-dd a hh:mm";

	public CheckDirectory() throws IOException {
		System.out.println("경로를 입력하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File(br.readLine());
		File[] list =  f.listFiles();;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		StringBuilder sb = new StringBuilder();
		
		if (f.exists() && f.isDirectory()) {
			System.out.println("이름\t\t 종류\t 크기\t\t 마지막 수정일");
			for (int i = 0; i < list.length; i++) {
				sb.append(list[i].getName()).append("\t\t").append(list[i].isDirectory()?"폴더":"파일").append("\t").append(list[i].isFile() ? list[i].length() + "byte" : " ")
				.append("\t\t").append(sdf.format(list[i].lastModified())).append("\n");
			} // end for
			System.out.println(sb);
		} else {
			System.out.println("잘못입력했습니다.");
		} // end if
		
	}//CheckDirectory

	public static void main(String[] args) {
		try {
			new CheckDirectory();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
