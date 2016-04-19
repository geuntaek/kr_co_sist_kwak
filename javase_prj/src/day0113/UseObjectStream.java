package day0113;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 객체를 직렬화하여 내보내고, 내보내진 객체를 역질렬화하여 읽어들어 사용하는 ObjectOutputStream, ObjectInputStream의 사용
 * @author user
 */
public class UseObjectStream {

	public UseObjectStream(){
		
	} // UseObjectStream
 	public void writeObject() throws FileNotFoundException, IOException{
		// 파일에 스트림 연결
 		File file = new File("c:/dev/temp/file_obj.txt");
 		ObjectOutputStream oos =null;
 		try{
	 		oos= new ObjectOutputStream(new FileOutputStream(file));
	 		
	 		// 스트림에 객체 쓰기 (직렬화)
	 		MyData md = new MyData("조근택",28,62.7);
	 		System.out.println("원본객체 "+md);
	 		oos.writeObject(md);
	 		oos.flush(); // 스트림에 남아 잇는 데이터를 분출
	 		System.out.println("객체가 JVM을 나가서 파일에 저장");
 		
 		}finally{ // 반드시 실행되어야하는 코드
 			if(oos != null){ //oos= new ObjectOutputStream(new FileOutputStream(file)); 여기에서 예외가 발생한다면 그냥 oos는 null이라 oos.close()하면 또 예외가 발생한다. 
 							 //그래서 oos가 null이 아닐때 close해줘야한다.  
 				oos.close(); // 스트림을 사용하면 끊는다
 			}
 		}
 		
	} // writeObject
 	
 	public void readObject() throws FileNotFoundException, IOException, ClassNotFoundException{
 		File file = new File("c:/dev/temp/file_obj.txt");
 		ObjectInputStream ois = null;
 		try{
 			ois= new ObjectInputStream(new FileInputStream(file));
 		
 			// 파일에 있는 직렬화 된 객체 읽기 (역직렬화)
 			MyData md = (MyData)ois.readObject();
 			System.out.println("읽어들인 객체 "+md);
	 		System.out.println("이름 "+md.getName());
	 		System.out.println("나이 "+md.getAge());
	 		System.out.println("몸무게 "+md.getWeight());
 		}finally{ // 반드시 실행되어야한다.
 			if(ois != null)
 				ois.close(); 
 		}
 		
 	} // readObject
	
	public static void main(String[] args) {
		UseObjectStream uos = new UseObjectStream();
		try {
			//uos.writeObject();
			uos.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}// main

}// class
