package day1228;

/**
 * Ư������(��)�� �߶� �迭�� ����� ���� �ϴ� method�� ���
 * @author user
 */
public class UseSplit {
	public UseSplit(){ // �⺻������
		String csv_data = "������.���ֿ�,�θ�,������,ȫ����";
		String[] csv_arr = csv_data.split("[.]");
		System.out.println("���� ��"+csv_arr.length);
		for (int i = 0; i < csv_arr.length; i++) {
			System.out.println(csv_arr[i]);
		}// end for
		
		String data = "����� ������ ����� ���۱� ����� ������ ����� ��������";
		String[] csv_arr2 = data.split("����� ");
		System.out.printf("\n���� ��"+csv_arr2.length);
		for(String addr : csv_arr2){
			System.out.println(addr);
		}
		
		int year = 1993;
		String[] zodiac = "������,��,��,����,��,��,ȣ����,�䳢,��,��,��,��".split(",");
		System.out.println("\n"+zodiac[year%12]);
		
		
	}
	public static void main(String[] args) {
		new UseSplit();
		
	}//main

}//class
