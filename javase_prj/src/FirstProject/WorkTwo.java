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
	 * 브라우저별 접속횟수, 비율을 반환하는 메소드
	 * @return
	 */
	public String method2() {
		 StringBuilder sb= new StringBuilder();
		 Map<String, Integer> brMap = new HashMap<String,Integer>();
	      DecimalFormat fm=new DecimalFormat("##.##");
	      String result="";
	      int value=0;

	      List<WorkVO> list= new ArrayList<WorkVO>();// 불러올 VO의 객체 생성
	      ReturnLogList lrr=new ReturnLogList();//불러올 클래스의 객체 생성
	      list=lrr.returnList();//생성한 VO에 클래스 적용
	      
	      WorkVO browser=null;//메소드를 불러올 객체 생성
	      String temp="";
	      for(int i=0; i<list.size();i++){         
	         browser=list.get(i);//list에 저장
	         temp=browser.getRequestBrowser();//만든 brMap에 넣을 String.=>내가 만든 기준에 적용시키기 위해 생성
	         if(brMap.get(temp)==null){//temp가 비어있으면 ...
	            brMap.put(temp,1);//1에서 스타투~.
	         }else{
	            brMap.put(temp, brMap.get(temp)+1);// 비어있지 않으면 1추가
	         }//end else   
	      }//end for
	      
	      Set<String> keys=brMap.keySet();//brMap의 key들을 모아서 Set으로 묶음.
	      Iterator<String> ita=keys.iterator();//
	      String itaTemp="";
	      double per=0.0;
	      while(ita.hasNext()){
	         itaTemp= ita.next();
	         value=brMap.get(itaTemp);
	         per= ((double)value/list.size())*100;
	         sb.append(itaTemp).append(" 접속횟수: ").append(value).append(" 회 , 비율 : ").append(fm.format(per)).append("%\n");
	      }//end while
	      
	      
	      
	      result=sb.toString();
	      return result;

	}
}
