package day0121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UseURL {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.naver.com");
			System.out.println(url);
			System.out.println("��û �������� "+url.getProtocol());
			System.out.println("��û ������ "+url.getHost());
			System.out.println("��û ��Ʈ "+url.getPort());
			
			//�������� �����ϴ� html������ ���� ���
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:/dev/temp/index.html"));
			
			String line = "";
			while((line=br.readLine())!=null){
				bw.write(line);
			}//end while
			bw.flush();
			System.out.println("index ���� ����");
			bw.close();
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
