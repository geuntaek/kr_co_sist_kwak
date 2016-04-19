package day0111;

import java.io.File;
import java.util.Date;

/**
 * ������ ������ ��� File Ŭ������ ���<br>
 * 
 * @author user
 */
public class UseFile {
	
	public UseFile(){
		File file = new File("C:/dev/temp/java_read.txt");
		System.out.println(file);
		System.out.println("������ "+file.getAbsolutePath());
		System.out.println("��� "+file.getPath());
		System.out.println("�θ��� "+file.getParent());
		System.out.println("���ϸ� "+file.getName());
		System.out.println("����? ����? "+(file.isFile()?"����":"����"));
		System.out.println("����? ����? "+(file.isDirectory()?"����":"����"));
		System.out.println("���� �� �ֳ�? "+(file.canRead()?"�бⰡ��":"�б�Ұ���"));
		System.out.println("�� �� �ֳ�? "+(file.canWrite()?"���Ⱑ��":"����Ұ���"));
		System.out.println("���� ����? "+(file.canExecute()?"����":"�Ұ���"));
		System.out.println(file.isHidden()?"��������":"�Ϲ�����");
		System.out.println(file.length()+"byte");
		System.out.println("���������� ������ ���� "+new Date(file.lastModified())); // simpleDateFormat
	}// UseFile

	public static void main(String[] args) {
		
		new UseFile();
		
	} // main

}// class
