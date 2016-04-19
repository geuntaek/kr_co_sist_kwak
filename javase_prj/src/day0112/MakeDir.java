package day0112;

import java.io.File;

/**
 * 디렉토리 생성, 파일 삭제
 * @author user
 */
public class MakeDir {

	public MakeDir(){
		// 디렉토리 생성
		// 존재하는 디렉토리 내에 새로운 디렉토리를 생성
//		File file = new File("c:/dev/geunteak");
//		
//		if(file.mkdir()){ // return이 boolean
//			System.out.println(file+"이 생성되었습니다.");
//		}else{ // 부모디렉토리가 잘못 된 경우
//			System.out.println(file+"이 생성되지 않았습니다. 부모디렉토리를 확인하세요");
//		}
		
		// 부모디렉토리부터 생성
//		File file = new File("c:/geunteack/juyong");
//		if(file.mkdirs()){
//			System.out.println(file+"이 생성되었습니다.");
//		}else{
//			System.out.println(file+"이 생성되지 않았습니다. 드라이브를 확인하세요");
//		}
		
		// 파일 삭제
		File file = new File("C:/dev/temp/java_read.txt");
		System.out.println( file.exists() );
		if(file.delete()){
			System.out.println(file+"파일이 삭제되었습니다.");
		}else{ // 파일이 없는경우
			System.out.println(file+"의 경로를 확인하세요.");
		}
	}
	public static void main(String[] args) {
		new MakeDir();
	}

}
