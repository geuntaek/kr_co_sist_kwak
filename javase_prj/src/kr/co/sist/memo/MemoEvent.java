package kr.co.sist.memo;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MemoEvent extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String tempMemo; // ���� ���� �񱳿�
	
	public MemoEvent() {
		
	}
	
	public void setJm(JavaMemo jm){
		this.jm = jm;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		//�̺�Ʈ ��
		
		//���ۿ��� �̺�Ʈ�� �߻��� ���
		if(ae.getSource()==jm.getMiNew()){
		
			newMemo();
		}//end if
		
		//���⿡�� �̺�Ʈ�� �߻��� ���
		if(ae.getSource()==jm.getMiOpen()){
			try {
				openMemo();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "������ Ȯ�����ּ���");
				e.printStackTrace();
			}// end catch
		}//end if
		
		//���忡�� �̺�Ʈ�� �߻��� ���
		if(ae.getSource()==jm.getMiSave()){
			try {
				saveMemo();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "���� ���� ���� �߻�");
				e.printStackTrace();
			}
		}//end if
		
		//�ݱ⿡�� �̺�Ʈ�� �߻��� ���
		if(ae.getSource()==jm.getMiEnd()){
			jm.dispose();
		}//end if
		
		//�޸��� �������� �̺�Ʈ�� �߻��� ���
		if(ae.getSource()==jm.getMiHelp()){
			openDialog();
		}//end if
		
	}//actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		//jm�� �����ؾ��Ѵ�.
		jm.dispose();
	}//windowClosing

	private void newMemo(){ 
		
		String data = jm.getTaMemoDisplay().getText();
		boolean saveFlag =false;
		
		if(!data.equals("")){ // TextArea�� ������ �ִ� ���
			if(!data.equals(tempMemo)){ //TextArea�� ������ �ִٸ� ���� ����� �ٸ��� ��
				saveFlag = true;
			}
		}//end if
		
		if(saveFlag){
			int flag = JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?");
			switch (flag) {
			case JOptionPane.OK_OPTION:
				try {
					saveMemo();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			default:
				//TextArea�� ������ �ʱ�ȭ
				saveFlag = false;
			}//end switch
		}//end if
		
		System.out.println("�۾�"+saveFlag);
		if(!saveFlag){
			jm.getTaMemoDisplay().setText("");
		}//end if
		jm.setTitle("�޸���-[����]"); //Ÿ��Ʋ �� ����
	}//newMemo
	
	private void openMemo() throws IOException{
		FileDialog fdOpen = new FileDialog(jm, "�޸���-����", FileDialog.LOAD);
		fdOpen.setVisible(true);
		//����ڰ� ������ ������ ��ο� ���ϸ��� ��´�.
		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		
		if (path!=null) { //���� ������ �ߴٸ�
			File file = new File(path+name);
			BufferedReader br = null; //��ü �ʱ�ȭ�� null
			try {
				//������ ���Ͽ� ��Ʈ���� ����
				br = new BufferedReader(new FileReader(file));
				//������ ������ �о� TextArea�� ���̱�
				TextArea tempTa = jm.getTaMemoDisplay();
				StringBuilder data = new StringBuilder();
				String temp = "";
				
				while((temp = br.readLine())!=null){
					data.append(temp).append("\n");
				}
				if(data.length()>1){
					data.delete(data.length()-1, data.length());
				}
				//�ٴ����� �о� �鿩 ������ ������ TextArea�� �����ϰ� 
				tempTa.setText(data.toString()); //������ ������ ������� data�� ����.
				
				//���Ͽ��� �о���� ���ڿ� ������ �����Ѵ�.
				tempMemo = data.toString(); 
				
				
				//Ÿ��Ʋ�ٸ� �����Ѵ�.
				jm.setTitle("�޸���-���� ["+name+"]");
			} finally {
				if(br != null){
					br.close();
				}
			}
			
			
			
		}
		
	}//openMemo
	
	private void saveMemo() throws IOException{
		FileDialog fdSave = new FileDialog(jm, "�޸���-����", FileDialog.SAVE);
		fdSave.setVisible(true); 
		String path = fdSave.getDirectory();
		String name = fdSave.getFile();
		
		if(path!=null){
			File file = new File(path+name);
			//������ ���Ͽ� ���� ��Ʈ�� ����
			BufferedWriter bw =null;
			try{
				bw = new BufferedWriter(new FileWriter(file));
				//TextArea�� ������ �о�ͼ� ����� ���Ͽ� ����
				String data = jm.getTaMemoDisplay().getText();
				bw.write(data);
				bw.flush();
				
				jm.setTitle("�޸���-����["+name+"]");
			}finally{
				if(bw!=null){
					bw.close();
				}
			}
			
			
		}
		
		
	}//saveMemo

	private void openDialog(){
		new MemoDialog(jm);
	}//openDialog
	
}//class







