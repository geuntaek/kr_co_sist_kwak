package day0113;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ��ü�� ����ȭ�Ͽ� ��������, �������� ��ü�� ������ȭ�Ͽ� �о��� ����ϴ� ObjectOutputStream, ObjectInputStream�� ���
 * @author user
 */
public class UseObjectStream {

	public UseObjectStream(){
		
	} // UseObjectStream
 	public void writeObject() throws FileNotFoundException, IOException{
		// ���Ͽ� ��Ʈ�� ����
 		File file = new File("c:/dev/temp/file_obj.txt");
 		ObjectOutputStream oos =null;
 		try{
	 		oos= new ObjectOutputStream(new FileOutputStream(file));
	 		
	 		// ��Ʈ���� ��ü ���� (����ȭ)
	 		MyData md = new MyData("������",28,62.7);
	 		System.out.println("������ü "+md);
	 		oos.writeObject(md);
	 		oos.flush(); // ��Ʈ���� ���� �մ� �����͸� ����
	 		System.out.println("��ü�� JVM�� ������ ���Ͽ� ����");
 		
 		}finally{ // �ݵ�� ����Ǿ���ϴ� �ڵ�
 			if(oos != null){ //oos= new ObjectOutputStream(new FileOutputStream(file)); ���⿡�� ���ܰ� �߻��Ѵٸ� �׳� oos�� null�̶� oos.close()�ϸ� �� ���ܰ� �߻��Ѵ�. 
 							 //�׷��� oos�� null�� �ƴҶ� close������Ѵ�.  
 				oos.close(); // ��Ʈ���� ����ϸ� ���´�
 			}
 		}
 		
	} // writeObject
 	
 	public void readObject() throws FileNotFoundException, IOException, ClassNotFoundException{
 		File file = new File("c:/dev/temp/file_obj.txt");
 		ObjectInputStream ois = null;
 		try{
 			ois= new ObjectInputStream(new FileInputStream(file));
 		
 			// ���Ͽ� �ִ� ����ȭ �� ��ü �б� (������ȭ)
 			MyData md = (MyData)ois.readObject();
 			System.out.println("�о���� ��ü "+md);
	 		System.out.println("�̸� "+md.getName());
	 		System.out.println("���� "+md.getAge());
	 		System.out.println("������ "+md.getWeight());
 		}finally{ // �ݵ�� ����Ǿ���Ѵ�.
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
