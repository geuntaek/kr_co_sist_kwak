package day0105;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Homework9 {
	private static final String format = "yyyy-MM-dd a hh:mm:ss EEEE";

	public Homework9() { // ������
		System.out.println("����1");

		String[] data = this.cut();
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("\n����2");
		String worldTime = this.worldDate(2);
		System.out.println(worldTime);
	}

	public String[] cut() { // ���ڿ� �ڸ��� method

		// ��������
		String str = "�ּ���,ȫ�ر�.������~�Źο�^�θ� ����ȯ"; // data
		int num = 0; // �ε��� number
		int i = 0; // while������ ����� ���� i
		String temp = null; // nextToken()���� ��ȯ�� ���ڿ��� ������ ��

		StringTokenizer st = new StringTokenizer(str, ",.~ ^");
		num = st.countTokens(); // TokenCount
		String[] dataArr = new String[st.countTokens()];

		while (st.hasMoreTokens() && i < num) {
			temp = st.nextToken();
			dataArr[i] = temp;
			if (temp.equals("�Źο�")) {
				dataArr[i] = "���� " + temp + " ^0^b";
			} // end if
			i++;
		} // end while
		
		return dataArr;
	}// cut


	public String worldDate(int world) {
		
		Date date = new Date();
		Locale[] loc={Locale.KOREA,Locale.US,Locale.CHINA}; // ��� ���������� �迭�� ������ �����ϴ�!!!!!
		SimpleDateFormat sdf = new SimpleDateFormat(format, loc[world]);
		
		return sdf.format(date);

	}// worldDate

	public static void main(String[] args) {
		new Homework9(); // ��üȭ

	}// main
}// class




//	private static final String zero = "0";
//	private static final String one = "1";
//	private static final String two = "2";


//public String worldDate(String world) {
//		String date = null;
//		switch (world) {
//		case zero:
//			sdf = new SimpleDateFormat(format, Locale.KOREA);
//			date = sdf.format(d); break;
//		case one:
//			sdf = new SimpleDateFormat(format, Locale.US);
//			date = sdf.format(d); break;
//		case two:
//			sdf = new SimpleDateFormat(format, Locale.CHINA);
//			date = sdf.format(d); break;
//		default:
//			date = "�Է��� ���� 0,1,2 �� �ƴϹǷ� �ٽ� �Է��ϼ���.";
//			break;
//		}// end switch

/*
 * if(world.equals("0")){ sdf = new
 * SimpleDateFormat(format,Locale.KOREA); }else if(world.equals("1")){
 * sdf = new SimpleDateFormat(format,Locale.US); }else
 * if(world.equals("2")){ sdf = new
 * SimpleDateFormat(format,Locale.CHINA); }else{ date =
 * "0,1,2 �� �ϳ��� �Է��ϼ���."; }
 * 
 * date = sdf.format(d);
 */



//		System.out.println("����1");

//		String[] data = hw.cut();
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}

//		System.out.println("\n����2");

//		String worldTime = hw.worldDate(args[0]);
//		String worldTime = hw.worldDate(2);
//		System.out.println(worldTime);