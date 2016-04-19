package day0107;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ScoreList {
	List<DataVO> list; // List ����
	
	public static final String ADD = "1";
	public static final String CHECK = "2";
	public static final String CANCEL = "3";
	
	String data; // �Է°��� ���� ���ڿ�
	
	// showMessageDialog�� ������ �� ������ ������ ��� ����
	int all_java;
	int all_oracle;
	int all_jsp;
	
	// 1�� ������ �̸� ����
	double max_avg;
	String max_name;
	
	public ScoreList(){ // ������ 
		list= new ArrayList<DataVO>(); // is a ���� ��üȭ
		String choice = "";
		do{
			choice = JOptionPane.showInputDialog("�޴����� \n 1.�߰� 2.�����ȸ 3.����");
			
			switch(choice){
			case ADD: // ������ �߰�
				data = JOptionPane.showInputDialog("�������߰� \n �̸�, �ڹ�, ����Ŭ, jsp�� ����");
				add(); break;
			case CHECK: // ��� Ȯ��
				check(); break;
			case CANCEL: // ���
				cancel();
			}
		}while(true);
		
	}
	
	public void add(){ // �Էµ� �����͸� DataVO�� ����
		String[] dataArr = data.split(","); // �Էµ� ������ �迭�� ����
		// ���� �ʱ�ȭ
		String name = dataArr[0];
		int java = Integer.parseInt(dataArr[1]);
		int oracle = Integer.parseInt(dataArr[2]);
		int jsp = Integer.parseInt(dataArr[3]);
		int total = 0;
		double avg = 0.0d;
		
		all_java += java;
		all_oracle += oracle;
		all_jsp  += jsp ;
		// �л� 1���� ������ ��� ����
		total = java+oracle+jsp;
		
		avg = (float)total/(dataArr.length-1); 
		
		// 1�� �л��� ������ �̸� ����
		if(max_avg<avg){
			max_avg= avg;
			max_name = name;
		}
		list.add(new DataVO(name,java,oracle,jsp,total,avg)); // list�� �߰�
	}
	
	public void check(){ // ��� ���
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
		
		JOptionPane.showMessageDialog(null, "�̸�  �ڹ�  ����Ŭ  jsp   ����  ���\n-------------------------------------------------\n"
				+sb+"\n"+"�� ������ ����    "+all_java+"    "+all_oracle+"    "+all_jsp+
				"\n�� ������ ���    "+java_avg+"    "+oracle_avg+"    "+jsp_avg+
				"\n 1���� ��������� "+max_avg+"��  �̸��� "+max_name);
		
	}
	
	public void cancel(){
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new ScoreList();
	}

}

/*
		for (int i = 0; i < dataArr.length; i++) { // name(���ڿ�),java(����),oracle(����),jsp(����)
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