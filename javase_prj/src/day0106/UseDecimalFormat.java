package day0106;

import java.text.DecimalFormat;

public class UseDecimalFormat {
	
	public UseDecimalFormat(){
		int i = 2016;
		DecimalFormat df = new DecimalFormat("#,###,###"); 
		DecimalFormat df1 = new DecimalFormat("0,000,000"); 
		System.out.println(df.format(i));
		System.out.println(df1.format(i));
		i = Integer.MAX_VALUE;
		DecimalFormat df2 = new DecimalFormat("#,###"); 
		System.out.println(df2.format(i));
		
		double d = 3.1234567;
		DecimalFormat df3 = new DecimalFormat("#,###.###"); 
		System.out.println(df3.format(d));
		
	}// UseDecimalFormat
	public static void main(String[] args) {
		new UseDecimalFormat();
	}//main

}//class
