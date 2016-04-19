package day1223;

/**
 * ª�� ���ڿ��� �ٷ�� String class�� ���
 * java���� �����ϴ� Ŭ������ �̸��� ������ �̸����� Ŭ�������ۼ��ϸ� 
 * �ش� ��Ű���� �ٸ� Ŭ������ �ۼ��� Ŭ������ ����ڰ� ���� Ŭ������ 
 * ���� ���� �����Ͽ� ����ϰ� �ȴ�. java���� �����ϴ� Ŭ������ �ĺ��Ͽ� 
 * ����ϰ� �ʹٸ� ��Ű����.Ŭ������ �� ���·� �ۼ��ؾ��Ѵ�.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		// �⺻���� ��� (new�� ������� �ʴ´�.)
		String str = "ABC"; 
		// �������� ��� (new ���)
		String str1 = new String("ABC");
		System.out.println("�⺻�� == �� "+(str=="ABC"));
		System.out.println("������ == �� "+(str1=="ABC"));
		
		// ���ڿ��� �񱳴� equals�� ����Ѵ�.
		System.out.println("�⺻�� equals �� "+str.equals("ABC"));
		System.out.println("������ equals �� "+str1.equals("ABC"));
		
		String mail = new String("chi189@naver.com"); // ������
		String temp = "abcdEFgHi"; // �⺻��
		System.out.println(mail+"�� ���� "+mail.length());
		System.out.println(temp+"�� ���� "+temp.length());
		
		System.out.println(temp+"�� ��� �빮�ڷ� "+temp.toUpperCase());
		System.out.println(temp+"�� ��� �ҹ��ڷ� "+temp.toLowerCase());
		
		// �ε����� ������ 0�������̴�.
		System.out.println(mail+"���� @�� �ε����� "+mail.indexOf("@"));
		
		temp = "abcabcabc";
		// indexOf�� ���ʿ��� �������� �������� �����ϸ鼭 ���� ó�� �߰ߵ� ������ �ε����� ��´�.
		System.out.println(temp+"���� ó�� b�� �ε����� "+temp.indexOf("b"));
		System.out.println(temp+"���� �� b�� �ε����� "+temp.lastIndexOf("b"));
		
		// ���� ���ڰ� ã������ �Ѵٸ� ���� -1�� ���´�.
		System.out.println(temp+"���� d�� �ε����� "+temp.indexOf("d"));
		
		// Ư���ε����� �ش��ϴ� ���ھ��
		System.out.println(mail+"���� 6��° �ε����� ���� "+mail.charAt(6));
		
		// �ڽĹ��ڿ� �ڸ���
		temp = "abCdEfg";
		//      0123456 <- String index
		System.out.println(temp+"���� 2~4��° �ε����� �ش��ϴ� �ڽ� ���ڿ�"+temp.substring(2, 4+1));
		
		System.out.println();
		// �� ���ڿ��� �����ߴ���
		temp = "����� ������";
		System.out.println(temp.startsWith("����"));
		System.out.println(temp.startsWith("����"));
		System.out.println(temp.endsWith("��"));
		System.out.println(temp.endsWith("��"));
		
		//temp = "����";
		temp = "�������";
		if(temp.startsWith("����")){
			System.out.println("���� ����Ͻ� �� �����ϴ�.");
		}else{
			System.out.println(temp);
		}
		
		temp = "�� ���� �Ǿ����ε� �� ���� �� �����?";
		// ������ ���� �޼ҵ���� ��ȯ���� ���� . ���� ��� �����Ͽ� ����� �� �ִ�.
		System.out.println(temp.replaceAll("��", "*").replaceAll("��", "*" ));// �޼ҵ� ü��
		
		temp = "   A BC   ";
		System.out.println("["+temp+"] -> ["+temp.trim()+"]"); // temp�� �յ� ������ ����. ��, �߰��� �ִ� ������ ���źҰ�
		System.out.println("["+temp+"] -> ["+temp.replaceAll(" ", "")+"]"); // ��� ������ ����
		
		int i = 12;
//		temp = i; // �׳� �Ҵ絵 �ȵǰ� ����ȯ�� �ȵȴ�.
		temp = i +""; // ���ڿ��� + �� ����Ͽ� ó��
		System.out.println(temp);
		temp = String.valueOf(i); // temp.valueOf() �ص� �������� ��� ���.
		System.out.println(temp);
		
	}//main

}//class











