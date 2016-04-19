package day0111;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class CheckDirectory {
	private static final String format = "yyyy-MM-dd a hh:mm";

	public CheckDirectory() throws IOException {
		System.out.println("��θ� �Է��ϼ���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File(br.readLine());
		File[] list =  f.listFiles();;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		StringBuilder sb = new StringBuilder();
		
		if (f.exists() && f.isDirectory()) {
			System.out.println("�̸�\t\t ����\t ũ��\t\t ������ ������");
			for (int i = 0; i < list.length; i++) {
				sb.append(list[i].getName()).append("\t\t").append(list[i].isDirectory()?"����":"����").append("\t").append(list[i].isFile() ? list[i].length() + "byte" : " ")
				.append("\t\t").append(sdf.format(list[i].lastModified())).append("\n");
			} // end for
			System.out.println(sb);
		} else {
			System.out.println("�߸��Է��߽��ϴ�.");
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
