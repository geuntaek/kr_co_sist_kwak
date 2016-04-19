package day0107;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ScoreList {
	List<DataVO> list; // List 변수
	
	public static final String ADD = "1";
	public static final String CHECK = "2";
	public static final String CANCEL = "3";
	
	String data; // 입력값을 넣을 문자열
	
	// showMessageDialog로 보여줄 각 과목의 총점과 평균 변수
	int all_java;
	int all_oracle;
	int all_jsp;
	
	// 1등 점수와 이름 변수
	double max_avg;
	String max_name;
	
	public ScoreList(){ // 생성자 
		list= new ArrayList<DataVO>(); // is a 관계 객체화
		String choice = "";
		do{
			choice = JOptionPane.showInputDialog("메뉴선택 \n 1.추가 2.결과조회 3.종료");
			
			switch(choice){
			case ADD: // 데이터 추가
				data = JOptionPane.showInputDialog("데이터추가 \n 이름, 자바, 오라클, jsp의 점수");
				add(); break;
			case CHECK: // 결과 확인
				check(); break;
			case CANCEL: // 취소
				cancel();
			}
		}while(true);
		
	}
	
	public void add(){ // 입력된 데이터를 DataVO에 저장
		String[] dataArr = data.split(","); // 입력된 데이터 배열로 저장
		// 변수 초기화
		String name = dataArr[0];
		int java = Integer.parseInt(dataArr[1]);
		int oracle = Integer.parseInt(dataArr[2]);
		int jsp = Integer.parseInt(dataArr[3]);
		int total = 0;
		double avg = 0.0d;
		
		all_java += java;
		all_oracle += oracle;
		all_jsp  += jsp ;
		// 학생 1명의 총점과 평균 저장
		total = java+oracle+jsp;
		
		avg = (float)total/(dataArr.length-1); 
		
		// 1등 학생의 총점과 이름 저장
		if(max_avg<avg){
			max_avg= avg;
			max_name = name;
		}
		list.add(new DataVO(name,java,oracle,jsp,total,avg)); // list에 추가
	}
	
	public void check(){ // 결과 출력
		StringBuilder sb = new StringBuilder();
		DataVO dv = null;
		
		for (int i = 0; i < list.size(); i++) {
			dv = list.get(i);
			sb.append(dv.getName()).append("   ").append(dv.getJava()).append("   ").append(dv.getOracle()).append("   ").append(dv.getJsp())
			.append("   ").append(dv.getTotal()).append("   ").append(dv.getAvg()).append("\n");
		}
		double java_avg = (double)all_java/list.size();
		double oracle_avg = (double)all_oracle/list.size();
		double jsp_avg = (double)all_jsp/list.size();
		
		JOptionPane.showMessageDialog(null, "이름  자바  오라클  jsp   총점  평균\n-------------------------------------------------\n"
				+sb+"\n"+"각 과목의 총점    "+all_java+"    "+all_oracle+"    "+all_jsp+
				"\n각 과목의 평균    "+java_avg+"    "+oracle_avg+"    "+jsp_avg+
				"\n 1등의 평균점수는 "+max_avg+"점  이름은 "+max_name);
		
	}
	
	public void cancel(){
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new ScoreList();
	}

}

/*
		for (int i = 0; i < dataArr.length; i++) { // name(문자열),java(정수),oracle(정수),jsp(정수)
			switch(i){
			case 0:
				name = dataArr[i]; break;
			case 1:
				java = Integer.parseInt(dataArr[i]); 
				all_java += java; break;
			case 2:
				oracle = Integer.parseInt(dataArr[i]); 
				all_oracle += oracle; break;
			case 3:
				jsp = Integer.parseInt(dataArr[i]); 
				all_jsp  += jsp ; break;
			}
		}
 */