package day0113;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * ���ܰ� �߻��Ǹ� �߻��� ���ܸ� ���Ͽ� ����Ͽ� �����ϰ� �����ϴ� ���
 * @author user
 */
public class UsePrintStackTrace {
	
	public UsePrintStackTrace() throws IOException{
		try {
			Class.forName("day0113.MyData"+(new Random().nextBoolean()?"":"1"));
			System.out.println("�ε����� ");
		} catch (ClassNotFoundException e) {
			File file = new File("c:/dev/temp/"+System.currentTimeMillis()+".log");
			PrintWriter pw = null;
			
			try {
				pw = new PrintWriter(new FileWriter(file));
				e.printStackTrace(pw);
				pw.flush();
			} finally {
				if(pw!=null){
					pw.close();
				}
			}
		}
		
	}// UsePrintStackTrace()
	
	public static void main(String[] args) {
		try {
			new UsePrintStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
