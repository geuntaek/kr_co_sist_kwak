package FirstProject;

import java.text.DecimalFormat;
import java.util.List;

public class WorkFive {
	
	/**
	 * 비정상적인 요청의 횟수와 비율을 반환하는 메소드
	 * @return
	 */
	public String method5(){
		 ReturnLogList rll = new ReturnLogList();
	     List<WorkVO> logList = rll.returnList();
	     WorkVO wv = null;
	     String temp = "";
	     int cnt = 0;
	     double percent=0;
	     String avg="";
	     for (int i = 0; i < logList.size(); i++) {
	        wv = logList.get(i);
	        temp = (wv.getResponse());
	        if (temp.equals("403")) {
	           cnt++;
	        } // if
	     } // for
	      

	     percent=(((double)cnt / logList.size()) * 100);
	      
	     DecimalFormat df=new DecimalFormat("#,###.##");
	     df.format(percent);
	     avg=df.format(percent);
	     
	     StringBuilder sb=new StringBuilder();
	     sb.append("비정상 요청이 발생한 횟수 : ").append(cnt).append("\n").append("비정상 요청이 발생한 비율 : ").append(avg).append("%");

	     return sb.toString();
	}
}
