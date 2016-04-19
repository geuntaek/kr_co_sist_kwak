package day0112;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopy {
	
	public FileCopy(){
		// ������ ������ ����
		Frame frame = new Frame();
		FileDialog fdOpen = new FileDialog(frame, "����� ������ ����", FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		if(path != null){ //������ ������ ������ ���� ����
			int flag = JOptionPane.showConfirmDialog(frame, "������ ��� �Ͻðڽ��ϱ�?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				// ����ϴ� �ڵ带 �ۼ�
				
				File file = new File(path+name);// ���������� ���� File
				
				StringBuilder backup_name = new StringBuilder(file.getAbsolutePath()); // ��� ���ϸ��� �����ϱ� ���� StringBuilder
				backup_name.insert(backup_name.lastIndexOf("."), "_"+System.currentTimeMillis()); // ������� �� ���̿� �ð����� ����
				
				File backup_file = new File(backup_name.toString()); // �ð������� �� �̸����� File ����
				try {
					FileInputStream fis = new FileInputStream(file); // fileNotFoundException�� ó��������Ѵ�. ����� ������ �б� ���� ��Ʈ��
					FileOutputStream fos = new FileOutputStream(backup_file); // �о���� �������� ��������� ���� ���� ��Ʈ��
					int read = 0;
					long start_time = 0, end_time=0; // ���� �ð����� ���۽ð��� ���� ����ð��� �� �� �ִ�.
					start_time = System.currentTimeMillis();
					
//					while((read=fis.read())!=-1){
//						fos.write(read); // ��Ʈ���� ��� : ���߿� ��ϵǴ� �����Ͱ� ������ ��ϵ� �����͸� �ڵ����� �����Ѵ�. ���� �������� ���� �����͸� flush���ش�.
//					}// 44487
					
					// ȿ�����̱�
					byte[] readData = new byte[512];
					while((read=fis.read(readData))!=-1){
						fos.write(readData, 0, read);
					} // 125
					fos.flush();
					fos.close();
					fis.close();
					end_time = System.currentTimeMillis();
					
					JOptionPane.showMessageDialog(frame, backup_name+"�� ��������� �����Ǿ����ϴ�."+"����ð� : "+(end_time-start_time));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		}
		frame.dispose();
		
	}// FileCopy
	
	public static void main(String[] args) {
		
		new FileCopy();
		
	}// main

}// class
