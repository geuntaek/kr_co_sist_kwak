package day1210;

import java.util.Calendar;

class Hello{
	static int i;
	int j;
	
	
	//main method : �ܵ����� �����ϴ� ���α׷�(application)�� �ۼ��� �� ��
	public static void main(String[] args){
//		System.out.println("�ȳ��ڹ�");
		System.out.println(Math.round(2015.05F)+1);
		Calendar cal = Calendar.getInstance();
		String str = "chi189@naver.com";
		System.out.println(str);
		System.out.println(cal);
		System.out.println(cal.toString());
	}//main
}//class 









// 2. ���� : class��.java (Hello.java)-source file

// 3. compile : javac.exe (complier)
//		������
//		javac. source file ��
// (path)	javac Hello.java
//		���� : byte code �� ������ - ����
//		       class file (Hello.java)

// 4. run : java.exe
// ����     java byte code��
//	    java Hello