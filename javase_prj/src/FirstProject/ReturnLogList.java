package FirstProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class ReturnLogList {
	
	/**
	 * list를 반환하는 메소드
	 * @return
	 */
	public List<WorkVO> returnList(){ 
		File file = new File(WorkEvent.path); // 선택한 파일의 경로를 가져오기
		
		List<WorkVO> logList = new ArrayList<WorkVO>();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String temp1 = "";
			StringBuilder sb= new StringBuilder();
			
			while((temp1=br.readLine())!=null){ // 로그파일을 한줄씩 읽어서
				sb.append(temp1.replace("[", "")); // [ 를  모두 ""로 대체 
			}//end while

			StringTokenizer stk = new StringTokenizer(sb.toString(),"]"); 
			while(stk.hasMoreTokens()){ // 토큰이 존재하는지
				 //토큰이 존재한다면 토큰을 얻어온 후 포인터를 이동
				logList.add(new WorkVO(stk.nextToken(),stk.nextToken(), stk.nextToken(), stk.nextToken()));
			 }//end while
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return logList;
	}//returnList
	

}//class
