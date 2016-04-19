package FirstProject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkTwo {
	/**
	 * �������� ����Ƚ��, ������ ��ȯ�ϴ� �޼ҵ�
	 * @return
	 */
	public String method2() {
		 StringBuilder sb= new StringBuilder();
		 Map<String, Integer> brMap = new HashMap<String,Integer>();
	      DecimalFormat fm=new DecimalFormat("##.##");
	      String result="";
	      int value=0;

	      List<WorkVO> list= new ArrayList<WorkVO>();// �ҷ��� VO�� ��ü ����
	      ReturnLogList lrr=new ReturnLogList();//�ҷ��� Ŭ������ ��ü ����
	      list=lrr.returnList();//������ VO�� Ŭ���� ����
	      
	      WorkVO browser=null;//�޼ҵ带 �ҷ��� ��ü ����
	      String temp="";
	      for(int i=0; i<list.size();i++){         
	         browser=list.get(i);//list�� ����
	         temp=browser.getRequestBrowser();//���� brMap�� ���� String.=>���� ���� ���ؿ� �����Ű�� ���� ����
	         if(brMap.get(temp)==null){//temp�� ��������� ...
	            brMap.put(temp,1);//1���� ��Ÿ��~.
	         }else{
	            brMap.put(temp, brMap.get(temp)+1);// ������� ������ 1�߰�
	         }//end else   
	      }//end for
	      
	      Set<String> keys=brMap.keySet();//brMap�� key���� ��Ƽ� Set���� ����.
	      Iterator<String> ita=keys.iterator();//
	      String itaTemp="";
	      double per=0.0;
	      while(ita.hasNext()){
	         itaTemp= ita.next();
	         value=brMap.get(itaTemp);
	         per= ((double)value/list.size())*100;
	         sb.append(itaTemp).append(" ����Ƚ��: ").append(value).append(" ȸ , ���� : ").append(fm.format(per)).append("%\n");
	      }//end while
	      
	      
	      
	      result=sb.toString();
	      return result;

	}
}
