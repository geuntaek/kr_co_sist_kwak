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
			System.out.println("요청 프로토콜 "+url.getProtocol());
			System.out.println("요청 서버명 "+url.getHost());
			System.out.println("요청 포트 "+url.getPort());
			
			//서버에서 제공하는 html파일의 내용 얻기
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:/dev/temp/index.html"));
			
			String line = "";
			while((line=br.readLine())!=null){
				bw.write(line);
			}//end while
			bw.flush();
			System.out.println("index 파일 생성");
			bw.close();
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
