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
 * File�� �����ϰ� ����� ���� ���� �����͸� �������� File Stream�� ���
 * @author user
 */
public class UseFileStream {
	
	public UseFileStream(){
		//1.��� ������ ����
		File file = new File("c:/dev/temp/java_read.txt");
		if(file.exists()){
			try {
//				8bit ��Ʈ���� ����ϸ� �ѱ��� ������.
//				FileInputStream fis = new FileInputStream(file);
//				System.out.println((char)fis.read()); // ���� ������ �ѱ��ڸ� �о���δ�.
//				int temp = 0;
//				while ((temp=fis.read())!=-1) {
//					System.out.print((char)temp); // 1byte(8bit)�� �о�鿩�� ����� ���ڴ� �� �������� �ѱ��� ������ ���´�.
//				}// end while
//				fis.close(); // �ڿ��� ���� �ʰ� close���ش�. ����� ��Ʈ���� �ݵ�� �����ش�.
				
				
				// �ѱ��� ������ �ʵ��� �б� ���ؼ� 8bit+16bir ��Ʈ���� �����Ͽ� ���
//				FileInputStream fis = new FileInputStream(file); // ������ϰ� �����ϱ� ���� ��Ʈ��
//				InputStreamReader isr = new InputStreamReader(fis); // 8bit��Ʈ���� 16bit��Ʈ���� �����ϱ� ���� ��Ʈ��
//				BufferedReader br = new BufferedReader(isr); // ����(�ӵ��� �ø�������)�Ͽ� �ѹ��� ���پ� �о���̴� ����� �ִ� ��Ʈ���� ����
				
//				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file))); // ���ٷ� �ۼ�
//				String temp = ""; // empty // null�� empty�� ���� -> empty�� ���� ������ �⸧�� ���°�, null�� ���� ���� ��. 
//				while ((temp=br.readLine())!=null) { 
//					System.out.println(temp); // line�� �дٰ� /n�� ������ ������. �׷��� System.out.print(temp)�ϸ� ���ٿ� ���´�. 
//				}
//				br.close();
				
//				 16bit ��Ʈ���� ���
//				FileReader fr = new FileReader(file); // ���ϰ� �����ϴ� ���� �ϴ� ��Ʈ�� ����
//				BufferedReader br = new BufferedReader(fr); // ����(�ӵ��� �ø�������)�Ͽ� �ѹ��� ���پ� �о���̴� ����� �ִ� ��Ʈ���� ����
				BufferedReader br = new BufferedReader(new FileReader(file));
				String temp = "";
				while((temp=br.readLine())!=null){
					System.out.println(temp);
				}
				br.close();
				
				
				
			} catch (FileNotFoundException e) { // �ڽ�
				System.out.println("������ �������� �ʽ��ϴ�. ��θ� Ȯ���ϼ���.");
				e.printStackTrace();
			} 
			catch (IOException e) { // �θ�
				System.err.println("����� ����");
				e.printStackTrace();
			}
		}else{
			System.out.println("������ �������� �ʽ��ϴ�. ��θ� Ȯ���ϼ���.");
		}// end else
		
		
		
	} // UseFileStream
	
	public static void main(String[] args) {
		new UseFileStream();
		
	} // main

} // class
