package HomeWork;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Event implements ActionListener, ItemListener {
	private List<VO> al;
	private HashMap<String, Integer> map;
	private LogDisplay ld;
	private MainFrame mf;
	private HashMap<String, String> login;
	private File file;
	private boolean flag = false;

	public Event() {
		login = new HashMap<String, String>();
		login.put("admin", "1234");
		login.put("root", "1111");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		////// LogDisplay/////
		if (e.getSource() == ld.getBtnInput()) {
			logCheck();
		} // if BtnInput

		if (e.getSource() == ld.getBtnReset()) {
			ld.getTfId().setText("");
			ld.getTfPass().setText("");
		}

		if (e.getSource() == ld.getTfId()) {
			ld.getTfPass().requestFocus();
		}

		if (e.getSource() == ld.getTfPass()) {
			logCheck();
		}
		if (mf != null) {
			if (e.getSource() == mf.getBtnOpen()) {
				openFile();
			}
		}
		////// LogDisplay/////
	}// actionPerformed

	public void setLogDisplay(LogDisplay ld) {
		this.ld = ld;
	}

	public void setMainFrame(MainFrame mf) {
		this.mf = mf;
	}

	public void logCheck() {
		String tempId = ld.getTfId().getText();
		String tempPass = new String(ld.getTfPass().getPassword());

		if (tempId.equals("") || tempPass.equals("")) {
			JOptionPane.showMessageDialog(ld, "���̵�� ��й�ȣ�� �Է����ּ���");
		} else {
			if (login.get(tempId) == null) {
				JOptionPane.showMessageDialog(ld, "�ش� ���̵� �����ϴ�.");
				ld.getTfId().setText("");
				ld.getTfPass().setText("");
				ld.getTfId().requestFocus();
			} else {
				if (login.get(tempId).equals(tempPass)) {
					JOptionPane.showMessageDialog(ld, "�α��� ����");
					ld.dispose();
					setMainFrame(new MainFrame(this));
				} else {
					JOptionPane.showMessageDialog(ld, "��й�ȣ�� Ʋ���ϴ�.");
					ld.getTfPass().setText("");
					ld.getTfPass().requestFocus();
				}
			}
		} // if else
	}// logCheck

	@Override
	public void itemStateChanged(ItemEvent e) {
		String data;
		if(file != null){
			String fileName = file.getName();
		}
		if (flag) {
			int menuIndex = mf.getMenu().getSelectedIndex();
			switch (menuIndex) {
			case 1:
				keyCount();
				break;
			case 2:
				browerCount();
				break;
			case 3:
				successCount();
				break;
			case 4:
				timeCount();
				break;
			case 5:
				errorCount();
				break;
			}// switch
		} // if
		flag = !flag;
	}// itemStateChanged

	public void openFile() {
		String response = "";
		String key = "";
		String browser = "";
		String time = "";
		String[] browserTemp = null;
		String[] timeTemp = null;
		FileDialog fd = new FileDialog(mf, "����ã��", FileDialog.LOAD);
		fd.setVisible(true);
		String path = fd.getDirectory();
		String name = fd.getFile();
		String ext = "";
		if(path!=null){
			ext = name.substring(name.lastIndexOf(".") + 1);			
			if (ext.equals("log")) {
				file = new File(path, name);
				String temp = "";
				al = new ArrayList<>();
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					while ((temp = br.readLine()) != null) {
						response = temp.substring(1, 4);
						if (temp.contains("key=")) {
							key = temp.substring(temp.lastIndexOf("key=") + 4, temp.lastIndexOf('&'));
						} else {
							key = "������";
						}
						timeTemp = temp.substring(temp.lastIndexOf('['), temp.length() - 1).split(" ");
						timeTemp = timeTemp[1].split(":");
						browserTemp = temp.split("]");
						browser = browserTemp[2].substring(1);
						time = timeTemp[0];
						al.add(new VO(response, key, browser, time));
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(mf, "log���ϸ� �о� �ü� �ֽ��ϴ�.");
				al=null;
			}
		}else{
			JOptionPane.showMessageDialog(mf, "������ ���õ��� �ʾҽ��ϴ�. �ٽ� �������ּ���");
		}
	}// openFile

//	protected File getFile() {
//		return file;
//	}

	public void keyCount() {
		if(al==null){
			JOptionPane.showMessageDialog(null, "log������ �������ּ���");
			return;
		}		
		      map=new HashMap<>();
		      VO vo = null;
		      Integer count=0;
		      String keyTemp="";
		      String result = "";
		      String maxKey = "";
		      int maxCount = 0;
		      for(int i=0; i<al.size(); i++){
		         vo=al.get(i);
		         keyTemp=vo.getKey();
		         
		         
		         if(map.get(keyTemp)==null){
		            map.put(keyTemp, 1);
		         }else{
		            count = map.get(keyTemp);
		               map.put(keyTemp, count.intValue()+1);
		         }
		      }
		      
		      Iterator<String> it = map.keySet().iterator();
		      
		      while(it.hasNext()){
		         keyTemp=it.next();
		         count=map.get(keyTemp);
		            if(maxCount < count.intValue()){
		               maxCount = count.intValue();
		               maxKey = keyTemp;
		            }
		      }
		      result = "�ִ�Ű�� : " + maxKey + "�̰� , Ƚ���� : " + maxCount + "�Դϴ�.";
		      mf.getJtaLogDisplay().setText(file.getName()+"�� �α� ����Դϴ�.\n" + result);
		      map=null;
	}// keyCount();

	public void browerCount() {
		if(al==null){
			JOptionPane.showMessageDialog(null, "log������ �������ּ���");
			return;
		}		
		 map = new HashMap<>();
	      StringBuilder sb = new StringBuilder();
	      String result = "";
	      Integer count = null;
	      VO voTemp = null;
	      String temp = "";
	      for (int i = 0; i < al.size(); i++) {
	    	  voTemp = al.get(i);
	         temp = voTemp.getBrowser();
	         if (map.get(temp) == null) {
	            map.put(temp, 1);
	         } else {
	            count = map.get(temp);
	            map.put(temp, count + 1);
	         }
	      }
	      
	      Iterator<String> it = map.keySet().iterator();
	      while(it.hasNext()) {
	         temp=it.next();
	         count = map.get(temp);
	         sb.append(temp+" �������� Ƚ���� : "+count.intValue()+" ���� : "+(int)((double)count.intValue()/al.size()*1000)/10d+"%\n");
	         
	      }
	      result = sb.toString();
	      mf.getJtaLogDisplay().setText(file.getName()+"�� �α� ����Դϴ�.\n" +result);
	      map = null;
	}// browerCount

	public void successCount() {
		if(al==null){
			JOptionPane.showMessageDialog(null, "log������ �������ּ���");
			return;
		}		
		String result = "";
		map = new HashMap<>();
	      String response = null;
	      Integer count;
	      VO voTemp = null;
	      for (int i = 0; i < al.size(); i++) {
	    	  voTemp = al.get(i);
	         response = voTemp.getResponse();
	         if (map.get(response) == null) {
	            map.put(response, 1);
	         } else {
	            count = map.get(response);
	            map.put(response, count.intValue() + 1);
	         }//end if
	      }//end for      �ʿ��ٰ� ���� �������ִ� for��
//	       System.out.println(map);
	      Iterator<String> it = map.keySet().iterator();
	      
	      int n200=0;
	      int n403=0;
	      int n404=0;
	      
	      while (it.hasNext()) {
	         response = it.next();
	         count = map.get(response);
	         if(response.equals("200")){
	            count = map.get(response);
	            n200=count;
	         }// end if
	         if(response.equals("403")){
	            count = map.get(response);
	            n403=count;
	         }//end if
	         if(response.equals("404")){
	            count = map.get(response);
	            n404=count;
	         }//end if
	      }// end while
	      result = "����Ƚ�� : "+n200+"ȸ   ����Ƚ�� : "+(n403+n404)+"ȸ   �������� : "+(n200*100)/(n200+n403+n404)+"%";
	      mf.getJtaLogDisplay().setText(file.getName()+"�� �α� ����Դϴ�.\n" + result);
	      map = null;
	}// successCount

	public void timeCount() {
		if(al==null){
			JOptionPane.showMessageDialog(null, "log������ �������ּ���");
			return;
		}		
		  String result = "";
	      Integer cnt=0;
	      String temp="";
	      int MaxCnt=0;
	      String MaxKey="";
	      VO voTemp = null;
	      StringBuilder sb = new StringBuilder();
	      map = new HashMap<String, Integer>();
	      
	      for(int i=0; i<al.size();i++){
	    	  voTemp=al.get(i);
	         temp = voTemp.getTime();
	         if(map.get(temp)==null){
	        	 map.put(temp, 1);
	         }else {
	            cnt = map.get(temp);//value��
	            map.put(temp, cnt.intValue()+1);
	         }//end else 
	      }//end for
	      
	      Iterator<String> it =map.keySet().iterator();
	      
	      while(it.hasNext()){
	          temp = it.next();
	          cnt = map.get(temp);
	          if(MaxCnt<cnt){
	            MaxCnt=cnt;
	            MaxKey=temp;
	         }//end if
	      }//end while
	      
	      result = sb.append("��û�� ���� ���� �ð��� : ").append(MaxKey).append("��")
	    		        .append("�̰�, Ƚ���� : ").append(MaxCnt).append("ȸ �Դϴ�.").toString();
	      mf.getJtaLogDisplay().setText(file.getName()+"�� �α� ����Դϴ�.\n" + result);
	      map = null;
	}// timeCount

	public void errorCount() {
		if(al==null){
			JOptionPane.showMessageDialog(null, "log������ �������ּ���");
			return;
		}
		DecimalFormat df = new DecimalFormat("###.#");
		String result = "";
		int errorCount = 0;
		double rate = 0;
		VO voTemp = null;
		String errorTemp = "";			
		int totalCount = 0;
		for(int i=0;i<al.size();i++){
			voTemp=al.get(i);
			errorTemp=voTemp.getResponse();
			if(errorTemp.equals("403")){
				errorCount++;
			}
			totalCount++;
		}
		rate=Double.parseDouble(df.format(((double)errorCount*100/totalCount)));
		
		result =  "���������� ��û(403)�� �߻��� Ƚ���� "+errorCount+"�� �̸�, \n��ü��û�� "+rate+"% �Դϴ�.";
		mf.getJtaLogDisplay().setText(file.getName()+"�� �α� ����Դϴ�.\n"+result);
	}//errorCount
}// class