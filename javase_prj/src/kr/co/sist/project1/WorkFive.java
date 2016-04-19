package kr.co.sist.project1;

import java.text.DecimalFormat;
import java.util.List;

public class WorkFive {
	
	/**
	 * ���������� ��û�� Ƚ���� ������ ��ȯ�ϴ� �޼ҵ�
	 * @return
	 */
	public String method5(){
		 ReturnLogList rll = new ReturnLogList(); // ReturnLogListŬ������ ��üȭ
		 List<WorkVO> logList = rll.returnList(); // ReturnLogList�� ����Ʈ�� ��ȯ�ϴ� returnList�޼ҵ带 ȣ���Ͽ� List�� ����
	     WorkVO wv = null; // WorkVO ��ü ����
	     String temp = "";
	     int cnt = 0;
	     double percent=0;
	     String avg="";
	     
	     for (int i = 0; i < logList.size(); i++) {
	        wv = logList.get(i); // logList�� i��° �ε����� wv�� ����
	        temp = (wv.getResponse()); // �������� get�ؼ� temp�� ����
	        if (temp.equals("403")) { // temp�� 403�� ��
	           cnt++; // cnt�� ���� -> cnt�� 403�� ����
	        } // if
	     } // for

	     percent=(((double)cnt / logList.size()) * 100); 
	      
	     DecimalFormat df=new DecimalFormat("#,###.##"); // ��� ����
	     avg = df.format(percent);
	     
	     StringBuilder sb=new StringBuilder();
	     sb.append("������ ��û�� �߻��� Ƚ�� : ").append(cnt).append("\n").append("������ ��û�� �߻��� ���� : ").append(avg).append("%");

	     return sb.toString(); // ��ȯ
	}
}
