package day0106;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * 숙제1<br>
 * 1월의 모든 날을 출력하고 1일을 토요일이면 줄을 변경하고 1일 전에는 공백을 출력<br>
 * 달력처럼 출력하라는 뜻.<br>
 * ----------------------------------------<br>
 * 출근일수 : 토요일과 일요일을 제외한 날 일수<br><br>
 * 
 * 숙제2<br>
 * 프로그램이 시작되면 1~50까지 수중에서 임의의 수 하나가 저장이 된다. <br>
 * 생각한 수를 입력하라는 dialog가 뜨고 수를입력한 뒤 확인을 누르면 임의의 수보다 높고 낮음을
 * 알려주는 dialog를 띄움. 임의의 수보다 입력한 수가 크다면 작은수를 입력하라는게 창이뜨고 확인 
 * 누르면 원래 dialog로 들어옴
 * 임의의수보다 크면 큰수를 입력하라는 창이 뜨고 확인을 누르면 원래 dialog로 들어옴
 * 입력한 수가 임의의 수와 같다면 몇번만에 성공했는지 확인해주는 문자열과 함께 계속하시겠습니까? 하면 
 * 예 아니오 취소 가 나옴. 예를 누르면 임의의 수를 다시 설정한 후 아니오 혹은 취소는 종료. 
 * @author user
 */
public class MonthDay {

	public MonthDay(){
		System.out.println("숙제1");
		
		Calendar cal = new GregorianCalendar(); 
		cal.set(Calendar.DATE, 1); // day를 1일로 변경
		int dayNum = cal.get(Calendar.DAY_OF_WEEK); // 오늘(1일)의 요일을 숫자로. 일~토 -> 1~7
		int workDay = 0;
		
		for (int i = 1; i < dayNum; i++) { // 공백
			System.out.printf("\t");
		}//end for
		
		for (int i = 1; i < cal.getActualMaximum(Calendar.DATE)+1; i++) { // 날짜
			System.out.print(i+"\t");
			
			// 토요일이라면 dayNum이 7의 배수
			if(dayNum%7==0){
				System.out.println();
			}
			// 일수 출력
			if(dayNum%7!=0&&dayNum%7!=1){ // 토요일과 일요일이 아닌 경우
				workDay++;
			}
			dayNum++;
		}//end for
		System.out.println("\n------------------------------------------------------");
		System.out.printf("출근일수 : %d\n\n",workDay);
		
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
      //1~12월인 경우에만 실행
      if(setMonth >0 && setMonth <13){
         returnCal.append("--------------------").append(setMonth+"월-----------\n");
         Calendar cal=Calendar.getInstance();
         cal.set(Calendar.MONTH, setMonth-1);
         
         int lastDate=cal.getActualMaximum(Calendar.DATE)+1;
         for(int tempDate=1; tempDate<lastDate;tempDate++){
            //증가하는 임시 일자로 Calendar 설정
            cal.set(Calendar.DAY_OF_MONTH, tempDate);
            //1일 일때만
            if(tempDate == 1){
               //1일의 요일수만큼 공백을 만든다
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
         returnCal.append("\n------------------------------").append("\n출근 일자[").append(cnt).append("]일");
      }//if
      
      
      return returnCal.toString();
   }//method
 
 
 
  WorkCalendar wc=new WorkCalendar();
      int inputMonth=0;
      String tempMonth=JOptionPane.showInputDialog("월 입력");
      if(tempMonth == null){//취소 누르면 null들어가니까
         tempMonth="1";//그러면 기본값으로 1월을 설정
      }//end if
      
      inputMonth=Integer.parseInt(tempMonth);
      String viewCal=wc.createCalendar(inputMonth);
      System.out.println(viewCal);
 */






