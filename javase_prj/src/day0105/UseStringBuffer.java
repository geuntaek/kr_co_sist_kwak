package day0105;

/**
 * �乮�ڿ��� �ٷ� �� ����ϴ� StringBuffer�� StringBuilder
 * @author user
 */
public class UseStringBuffer {
	
	private void useStringBuffer(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(2016);
		sb.append(" �������� ������");
		
		//�߰�
		sb.insert(9, "�ڶ�");
		sb.delete(8, 11);
		sb.reverse().reverse().append("¥��");
		
//		String str = sb; // ���� �ٸ��⶧���� str�� ���� ����.
//		String str = sb.toString(); 
		
		System.out.println(sb); //�ּҰ� ������ ����. ��? StringBuffer���� toString()�޼��带 Override�ؼ�
	}//useStringBuffer
	
	private void useStringBuilder(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(2016);
		sb.append(" �������� ������");

		sb.insert(9, "�ڶ�");
		sb.delete(8, 11);
		sb.reverse().reverse().append("¥��");

//		String str = sb.toString(); 
		
		System.out.println(sb); 
	}//useStringBilder
	
	
	public static void main(String[] args) {
		UseStringBuffer usb = new UseStringBuffer();
		usb.useStringBuffer();
		System.out.println("----------------------------------------");
		usb.useStringBuilder();
	}//main

}//class
