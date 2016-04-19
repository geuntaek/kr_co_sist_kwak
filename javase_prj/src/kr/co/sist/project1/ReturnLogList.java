package kr.co.sist.project1;

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
	 * list�� ��ȯ�ϴ� �޼ҵ�
	 * @return logList
	 */
	public List<WorkVO> returnList(){ 
		File file = new File(WorkDesign.path); // ���� ���̾�α׷� ������ ���� ��������
		List<WorkVO> logList = new ArrayList<WorkVO>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file)); // ���� �б�
			String temp1 = "";
			
			StringBuilder sb= new StringBuilder();
			
			while((temp1=br.readLine())!=null){ // �α������� ���پ� �о
				sb.append(temp1.replaceAll("\\[", "")); // [ ��  ��� ""�� ��ü 
			}
			
			
			StringTokenizer stk = new StringTokenizer(sb.toString(),"]"); 
			while(stk.hasMoreTokens()){ // ��ū�� �����ϴ���
				 //��ū�� �����Ѵٸ� ��ū�� ���� �� �����͸� �̵�
				logList.add(new WorkVO(stk.nextToken(),stk.nextToken(), stk.nextToken(), stk.nextToken()));
			 }
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return logList;
	}//returnList
	

}

