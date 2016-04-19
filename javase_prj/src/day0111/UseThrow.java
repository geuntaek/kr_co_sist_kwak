package day0111;

import java.util.Random;

/**
 * ���ܰ��� �߻� : throw
 * throw new ����ó��Ŭ����(); �� ����ϰ� �� �ڵ尡 �ۼ��Ǹ� try~catch�� ó���ϵ�, throws�� ������ ȣ���ϴ� ������ ó���ϵ� �ؾ��Ѵ�.
 * @author user
 */
public class UseThrow {
//	�߻��� ���ܸ� �ֻ����� ������ � ���ܰ� �߻��ߴ��� �𸥴�.
//	public String tobacco() throws Exception{
	
//	�߻��� ���ܸ� �����ָ�(throws)�ϸ� ȣ���ϴ� ������ � ������ ���ܰ� �߻��ߴ��� ��Ȯ�ϰ� �� �� �ִ�.
	public String tobacco() throws TobaccoException{
		StringBuilder result = new StringBuilder();
		
		// 0 - �ʵ��л� , 1 - �ߵ��л�, 2 - ����л� , 3 - �Ϲ���
		Random random = new Random();
		int grade = random.nextInt(3); // 0~3���� Ƣ��´�.
		String[] title = "�ʵ�,�ߵ�,���,������".split(",");
		
		// 0 �϶� ���ܸ� �߻���Ű��.
		if(grade == 0){
			// ���ܰ� �߻��ǰ� throws�� ������  �߻��� ���� �������� ������� �ʴ´�.
			// 1. �ֻ��� ���ܷ� ó���� ��� : � ���ܰ� �߻��ϴ��� �𸥴�.
			//throw new Exception("��迹��") ; // ���� ó���ϰ���� ���ܰ� runtimeException�̶�� throw new RuntimeException()�̶�� �ϸ� �ȴ�.
			
			// 2. ����� ���� ���ܷ� ó���� ���
			throw new TobaccoException(title[grade]+"��. ���� �ǰ��� �طο���"); // ���� ���� ���ܰ� ������ �� �� �ִ�.
		}
		
		result.append(title[grade]).append("�� ���� ��ô ��������");
		
		return result.toString(); // �߰��� ���ܰ� �߻��ϸ� return�� �ȵɰ��̴�. // ���ڿ��� ��ȯ�ϱ� ���� toString()�� ����Ѵ�.
		
	}// tobacco
	
	
	public static void main(String[] args) {
		UseThrow ut = new UseThrow(); 
//		ut.tobacco(); // try~catch�� ó������ �ʾƼ� ������ �߻�
		try {
			String str = ut.tobacco(); // tobacco()�� String�� return�ϹǷ� �޾ƾ��Ѵ�.
			System.out.println(str);
//		} catch (Exception e) {
		} catch (TobaccoException e) { // ����ó��Ŭ������ ����ְ� , �θ𿹿ܸ� ó���Ѵ�.
			System.err.println(e.getMessage());
			System.err.println(e);
			e.printStackTrace();
		} finally{ // �ݵ�� ����Ǿ�� �Ҷ�
			System.out.println("�����ұ�������.");
		}
		
		
	} // main

} // class
