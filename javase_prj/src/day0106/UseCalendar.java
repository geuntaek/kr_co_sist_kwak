package day0106;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * ������ ��¥������ ���� �� ����ϴ� Calendar
 * @author user
 */
public class UseCalendar {
	
	public UseCalendar(){
		// �߻�Ŭ�����̹Ƿ� ��üȭ�� �ȵǴ� Calendar
		// ��ü�� �����Ǹ� �ý������κ��� ��¥������ ���ͼ� ��ü�� �����Ѵ�.
		
		// is a ������ ��üȭ�� ������Ѵ�.
		Calendar cal = new GregorianCalendar(); 
		// instance�� ���� method�� ����ϴ� ���
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(Calendar.MONTH);
		
		
		///// ���� ���� ��¥ ������ ���� /////
		cal.set(Calendar.YEAR, 2017); // 2016->2017
		cal.set(Calendar.MONTH, 7-1); // 1->7 (7���� �����Ϸ��� 6�� �־���Ѵ�.)
		cal.set(Calendar.DAY_OF_MONTH, 16); // 6->16 
		
		
		
//		int year = cal.get(1); // �������� ��������.
		int year = cal.get(Calendar.YEAR); //cal�̵� cal1�� �ȴ�.
		int month = cal.get(Calendar.MONTH)+1; 
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR); // ������ ���° ������?
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK); // �������� ���° ��? 
		
//		String week = "��,��,ȭ,��,��,��,��".split(",")[day_of_week-1];
		String[] weekArr = {"��","��","ȭ","��","��","��","��"};
		String week = weekArr[day_of_week-1];
		
		/*
		String week = "";
		switch (day_of_week) {
		case Calendar.SUNDAY: // �������� ���� �ʵ� ���
			week = "��";break;
		case 2:
			week = "��";break;
		case 3:
			week = "ȭ";break;
		case 4:
			week = "��";break;
		case 5:
			week = "��";break;
		case 6:
			week = "��";break;
		case 7:
			week = "��";break;
		}
		*/
		
		int am_pm = cal1.get(Calendar.AM_PM);
		String am=am_pm==Calendar.AM_PM?"����":"����"; // ���׿�����
		
		int hour = cal1.get(Calendar.HOUR);	//12�ð�
		int hour_of_day = cal1.get(Calendar.HOUR_OF_DAY); //24�ð�
		
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+" "+day_of_year+" "+day_of_week+week+"����"+am_pm+am);
		System.out.println(hour+"("+ hour_of_day+")��" +min+"��"+sec+"��");
		
		int max = cal1.getActualMaximum(Calendar.DATE); // ������ ��¥
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
