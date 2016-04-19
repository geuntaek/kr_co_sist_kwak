package HomeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class HomeWork2 {
	private List<VO> vo;
	private HashMap<String, Integer> map;
	public HomeWork2(){
		openFile();
		keyCount();
		browerCount();
		successCount();
		timeCount();
		errorCount();
	}
	public void keyCount(){
		if(vo == null){
			JOptionPane.showMessageDialog(null, "파일을 선택해주세요");
			return;
		}
		map = new HashMap<>();
		VO voTemp = null;
		String keyTemp = "";
		Integer count= null;
		String maxKey = "";
		int maxCount = 0;
		for(int i = 0 ; i < vo.size() ; i++){
			voTemp = vo.get(i);
			keyTemp = voTemp.getKey();
			if(map.get(keyTemp) == null){
				map.put(keyTemp, 1);
			}else{
				count = map.get(keyTemp);
				map.put(keyTemp, count.intValue()+1);
			}
		}
		System.out.println(map);
		
		Iterator<String> it= map.keySet().iterator();
		while(it.hasNext()){
			keyTemp = it.next();
			count = map.get(keyTemp);
			if(maxCount < count){
				maxCount = count;
				maxKey = keyTemp;
			}
		}
		System.out.println("제일 많이 사용한 키는 : " + maxKey + " 횟수는 : " + maxCount);
		map =null;
	}
	
	public void browerCount(){
		if(vo == null){
			JOptionPane.showConfirmDialog(null, "log파일을 선택해주세요");
			return;
		}
		VO voTemp = null;
		String browserTemp = "";
		Integer count = null;
		map = new HashMap<>();
		for(int i =0 ; i < vo.size() ; i++){
			voTemp = vo.get(i);
			browserTemp = voTemp.getBrowser();
			if(map.get(browserTemp)==null){
				map.put(browserTemp, 1);				
			}else{
				count = map.get(browserTemp);
				map.put(browserTemp, count.intValue()+1);
			}
		}
		System.out.println(map);
		Iterator<String> it =map.keySet().iterator();
		while(it.hasNext()){
			browserTemp = it.next();
			count = map.get(browserTemp);
			System.out.println(browserTemp + " - " + count + "회(" + (int)(((double)count/vo.size()*1000))/10d + "%)");
		}
		map=null;
	}
	
	public void successCount(){
		if(vo==null){
			JOptionPane.showMessageDialog(null, "log파일을 선택해주세요");
			return;
		}
		map = new HashMap<>();
		VO voTemp = null;
		String successTemp = "";
		Integer count = null;
		for(int i = 0 ; i < vo.size() ; i++){
			voTemp = vo.get(i);
			successTemp = voTemp.getResponse();
			if(successTemp.equals("200") || successTemp.equals("404")){
				if(map.get(successTemp)==null){
					map.put(successTemp, 1);
				}else{
					count = map.get(successTemp);
					map.put(successTemp, count.intValue()+1);
				}
			}
		}//end for
		System.out.println(map);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			successTemp = it.next();
			count = map.get(successTemp);
			System.out.println("(" + successTemp + ") : " + count.intValue());
		}
		map=null;
	}//successCount
	
	public void timeCount(){
		if(vo == null){
			JOptionPane.showMessageDialog(null, "log파일을 선택해주세요");
			return ;
		}
		map = new HashMap<>();
		VO voTemp = null;
		String timeTemp = "";
		Integer count = null;
		String timeResult = "";
		int maxTime = 0;
		for(int i = 0 ; i < vo.size() ; i++){
			voTemp = vo.get(i);
			timeTemp = voTemp.getTime();
			if(map.get(timeTemp)==null){
				map.put(timeTemp, 1);
			}else{
				count = map.get(timeTemp);
				map.put(timeTemp,count.intValue()+1);
			}
		}		
		System.out.println(map);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			timeTemp = it.next();
			count = map.get(timeTemp);
			if(maxTime < count.intValue()){
				maxTime = count.intValue();
				timeResult = timeTemp;
			}
		}
		System.out.println("요청이 제일 많은 시간[" + timeResult + "]");
		map=null;
	}
	
	public void errorCount(){
		if(vo == null){
			JOptionPane.showMessageDialog(null, "log파일을 선택해주세요");
		}
		map = new HashMap<>();
		VO voTemp = null;
		String errorTemp = "";
		Integer count = null;
		
		for(int i = 0 ; i < vo.size() ; i++){
			voTemp = vo.get(i);
			errorTemp = voTemp.getResponse();
			if(errorTemp.equals("403")){
				if(map.get(errorTemp)==null){
					map.put(errorTemp, 1);
				}else{
					count = map.get(errorTemp);
					map.put(errorTemp, count.intValue()+1);
				}
			}
		}
		System.out.println(map);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			errorTemp = it.next();
			count = map.get(errorTemp);
			System.out.println("비정상적인 요청("+ errorTemp + ") : " + count.intValue() + "회("
						+ (int)((double)count.intValue()/vo.size()*1000)/10d+"%)");
		}
	}
	public void openFile(){
		vo = new ArrayList<>();
		String response = "";
		String key = "";
		String browser = "";
		String time = "";
		String[] browserTemp=null;
		String[] timeTemp = null;
		try {
			String temp = "";
			BufferedReader br = new BufferedReader(new FileReader("c:/dev/temp/sist_input.log"));
			while((temp = br.readLine()) != null){
				response = temp.substring(1, 4);
				if(temp.contains("key=")){
					key = temp.substring(temp.lastIndexOf("key=")+4, temp.lastIndexOf('&'));
				}else{
					key ="사용안함";
				}
				timeTemp = temp.substring(temp.lastIndexOf('['), temp.length()-1).split(" ");
				timeTemp = timeTemp[1].split(":");
				browserTemp = temp.split("]");
				browser = browserTemp[2].substring(1);
				time = timeTemp[0];
				vo.add(new VO(response, key, browser, time));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		new HomeWork2();
	}
}