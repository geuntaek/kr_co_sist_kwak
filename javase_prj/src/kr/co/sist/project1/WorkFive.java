package kr.co.sist.project1;

import java.text.DecimalFormat;
import java.util.List;

public class WorkFive {
	
	/**
	 * 비정상적인 요청의 횟수와 비율을 반환하는 메소드
	 * @return
	 */
	public String method5(){
		 ReturnLogList rll = new ReturnLogList(); // ReturnLogList클래스를 객체화
		 List<WorkVO> logList = rll.returnList(); // ReturnLogList의 리스트를 반환하는 returnList메소드를 호출하여 List에 저장
	     WorkVO wv = null; // WorkVO 객체 생성
	     String temp = "";
	     int cnt = 0;
	     double percent=0;
	     String avg="";
	     
	     for (int i = 0; i < logList.size(); i++) {
	        wv = logList.get(i); // logList의 i번째 인덱스를 wv에 저장
	        temp = (wv.getResponse()); // 응답결과를 get해서 temp에 저장
	        if (temp.equals("403")) { // temp가 403일 때
	           cnt++; // cnt를 증가 -> cnt는 403의 개수
	        } // if
	     } // for

	     percent=(((double)cnt / logList.size()) * 100); 
	      
	     DecimalFormat df=new DecimalFormat("#,###.##"); // 출력 포맷
	     avg = df.format(percent);
	     
	     StringBuilder sb=new StringBuilder();
	     sb.append("비정상 요청이 발생한 횟수 : ").append(cnt).append("\n").append("비정상 요청이 발생한 비율 : ").append(avg).append("%");

	     return sb.toString(); // 반환
	}
}
