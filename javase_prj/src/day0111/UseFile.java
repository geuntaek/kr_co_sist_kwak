package day0111;

import java.io.File;
import java.util.Date;

/**
 * 파일의 정보를 얻는 File 클래스의 사용<br>
 * 
 * @author user
 */
public class UseFile {
	
	public UseFile(){
		File file = new File("C:/dev/temp/java_read.txt");
		System.out.println(file);
		System.out.println("절대경로 "+file.getAbsolutePath());
		System.out.println("경로 "+file.getPath());
		System.out.println("부모경로 "+file.getParent());
		System.out.println("파일명 "+file.getName());
		System.out.println("파일? 폴더? "+(file.isFile()?"파일":"폴더"));
		System.out.println("파일? 폴더? "+(file.isDirectory()?"폴더":"파일"));
		System.out.println("읽을 수 있나? "+(file.canRead()?"읽기가능":"읽기불가능"));
		System.out.println("쓸 수 있나? "+(file.canWrite()?"쓰기가능":"쓰기불가능"));
		System.out.println("실행 가능? "+(file.canExecute()?"가능":"불가능"));
		System.out.println(file.isHidden()?"숨김파일":"일반파일");
		System.out.println(file.length()+"byte");
		System.out.println("마지막으로 수정한 일자 "+new Date(file.lastModified())); // simpleDateFormat
	}// UseFile

	public static void main(String[] args) {
		
		new UseFile();
		
	} // main

}// class
