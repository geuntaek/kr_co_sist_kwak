package FirstProject;

import java.text.DecimalFormat;
import java.util.List;

public class WorkFive {
	
	/**
	 * ���������� ��û�� Ƚ���� ������ ��ȯ�ϴ� �޼ҵ�
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
	     sb.append("������ ��û�� �߻��� Ƚ�� : ").append(cnt).append("\n").append("������ ��û�� �߻��� ���� : ").append(avg).append("%");

	     return sb.toString();
	}
}
