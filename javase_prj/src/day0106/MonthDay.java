package day0106;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * ����1<br>
 * 1���� ��� ���� ����ϰ� 1���� ������̸� ���� �����ϰ� 1�� ������ ������ ���<br>
 * �޷�ó�� ����϶�� ��.<br>
 * ----------------------------------------<br>
 * ����ϼ� : ����ϰ� �Ͽ����� ������ �� �ϼ�<br><br>
 * 
 * ����2<br>
 * ���α׷��� ���۵Ǹ� 1~50���� ���߿��� ������ �� �ϳ��� ������ �ȴ�. <br>
 * ������ ���� �Է��϶�� dialog�� �߰� �����Է��� �� Ȯ���� ������ ������ ������ ���� ������
 * �˷��ִ� dialog�� ���. ������ ������ �Է��� ���� ũ�ٸ� �������� �Է��϶�°� â�̶߰� Ȯ�� 
 * ������ ���� dialog�� ����
 * �����Ǽ����� ũ�� ū���� �Է��϶�� â�� �߰� Ȯ���� ������ ���� dialog�� ����
 * �Է��� ���� ������ ���� ���ٸ� ������� �����ߴ��� Ȯ�����ִ� ���ڿ��� �Բ� ����Ͻðڽ��ϱ�? �ϸ� 
 * �� �ƴϿ� ��� �� ����. ���� ������ ������ ���� �ٽ� ������ �� �ƴϿ� Ȥ�� ��Ҵ� ����. 
 * @author user
 */
public class MonthDay {

	public MonthDay(){
		System.out.println("����1");
		
		Calendar cal = new GregorianCalendar(); 
		cal.set(Calendar.DATE, 1); // day�� 1�Ϸ� ����
		int dayNum = cal.get(Calendar.DAY_OF_WEEK); // ����(1��)�� ������ ���ڷ�. ��~�� -> 1~7
		int workDay = 0;
		
		for (int i = 1; i < dayNum; i++) { // ����
			System.out.printf("\t");
		}//end for
		
		for (int i = 1; i < cal.getActualMaximum(Calendar.DATE)+1; i++) { // ��¥
			System.out.print(i+"\t");
			
			// ������̶�� dayNum�� 7�� ���
			if(dayNum%7==0){
				System.out.println();
			}
			// �ϼ� ���
			if(dayNum%7!=0&&dayNum%7!=1){ // ����ϰ� �Ͽ����� �ƴ� ���
				workDay++;
			}
			dayNum++;
		}//end for
		System.out.println("\n------------------------------------------------------");
		System.out.printf("����ϼ� : %d\n\n",workDay);
		
//		System.out.println(secret);
		
		
	}//Homeworj10
	
	public static void main(String[] args) {
		new MonthDay();
	}//main

}//class

/*
    public String createCalendar(int setMonth){
      int cnt=0;
      StringBuilder returnCal=new StringBuilder();
      //1~12���� ��쿡�� ����
      if(setMonth >0 && setMonth <13){
         returnCal.append("--------------------").append(setMonth+"��-----------\n");
         Calendar cal=Calendar.getInstance();
         cal.set(Calendar.MONTH, setMonth-1);
         
         int lastDate=cal.getActualMaximum(Calendar.DATE)+1;
         for(int tempDate=1; tempDate<lastDate;tempDate++){
            //�����ϴ� �ӽ� ���ڷ� Calendar ����
            cal.set(Calendar.DAY_OF_MONTH, tempDate);
            //1�� �϶���
            if(tempDate == 1){
               //1���� ���ϼ���ŭ ������ �����
               for(int blank=1;blank<cal.get(Calendar.DAY_OF_WEEK);blank++){
                  returnCal.append("\t ");
               }//for
            
            }//if
            
            returnCal.append(tempDate).append("\t");
            
            switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SATURDAY:
               returnCal.append("\n");
               break;
            case Calendar.SUNDAY:
               
               break;
               default: cnt++;
            }//switch
         }
         returnCal.append("\n------------------------------").append("\n��� ����[").append(cnt).append("]��");
      }//if
      
      
      return returnCal.toString();
   }//method
 
 
 
  WorkCalendar wc=new WorkCalendar();
      int inputMonth=0;
      String tempMonth=JOptionPane.showInputDialog("�� �Է�");
      if(tempMonth == null){//��� ������ null���ϱ�
         tempMonth="1";//�׷��� �⺻������ 1���� ����
      }//end if
      
      inputMonth=Integer.parseInt(tempMonth);
      String viewCal=wc.createCalendar(inputMonth);
      System.out.println(viewCal);
 */






