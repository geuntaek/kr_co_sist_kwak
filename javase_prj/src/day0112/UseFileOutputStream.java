package day0112;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * JVM���� �߻��� �����͸� ���Ϸ� ���
 * @author user
 */
public class UseFileOutputStream {
	
	public UseFileOutputStream(){
		File file = new File("c:/dev/temp/java_write.txt");
		try {
			// ��� ��Ʈ�� ���� : �����ϸ� ������ �ش� ��ġ�� ������ �ȴ�.
//			FileOutputStream fos = new FileOutputStream(file);
//			int year = 2016;
//			fos.write(year); // IOException�� ó������ ������ ������ �߻�
//			fos.flush();
//			fos.close();
			
			// ���ڿ� ��� : 8bit+16bit ��Ʈ�� ���
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))); // Has a ����
//			String msg = "�ȳ�?";
//			bw.write(msg);
//			bw.flush();
//			bw.close();
			
			FileWriter fw = new FileWriter(file); // ���ϰ� ����
			BufferedWriter bw = new BufferedWriter(fw);
			String msg = "�ȳ�?b";
			bw.write(msg); // ��Ʈ���� ���
			bw.flush(); // ��Ʈ���� ������ �������� ����
			bw.close(); // ����
			
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
