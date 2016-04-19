package FirstProject;

import java.awt.FileDialog;
import java.awt.Frame;

import javax.swing.JOptionPane;

public class LogFileDialog {
	
	/**
	 * ���� ���̾�α׷� ������ ������ ��θ� ��ȯ�ϴ� �޼ҵ�
	 * @return filePath
	 */
	public String logFilePath(){
		
		String filePath = "";
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "������ ���� ����", FileDialog.LOAD); // ���ϴ��̾�α� ����
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory(); // ��ġ
		String name = fdOpen.getFile(); // �̸�
		
		if(name!=null){ // ������ ������ �ִ� ���
			String[] fileArr = name.split("[.]"); //.�� �������� �迭�� �����Ѵ�.
			
			if(fileArr[fileArr.length-1].toLowerCase().equals("log")){  // �迭�� ������ ���� ���� log -> log������ ������ ���
				filePath = path+name;
			}else{ // �α������� �ƴ� ���
				JOptionPane.showMessageDialog(frame, "log������ �������ּ���.");
				filePath = "";
			}
		}else{ // ������ ������ ���� ���
			filePath = "";
		}
		
		//filePath��ȯ
		return filePath;
	}//logFilePath

}//class
