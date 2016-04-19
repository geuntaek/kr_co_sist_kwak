package day1224;


/**
 * ������ �迭�� ���
 * @author user
 */
public class UseArray1 {
	public UseArray1(){
		// 1. ���� : ��������[] �迭�� = null;
//		int a1[],a2;// �迭 �ϳ�, ������ ���� �ϳ���. �ϰ����� ���� ������ �� ������� �ʴ´�.
		int[] arr; // �迭�� �������
		
		// 2. ���� : �迭�� = new ��������[���� ��];
		arr= new int[6]; // �ε����� 0~5����
		
		// 1+2 : ��������[] �迭�� = new ��������[���� ��];
		// ������ ���������� �ּҶ�� ���� ������ �ȴ�. 
		int[] arr1 = new int[3];
		
		System.out.println(arr+"/"+arr1);
		System.out.println("arr�� ���� �� : "+arr.length);
		System.out.println("arr1�� ���� �� : "+arr1.length);
		
		// ������ ���ÿ� �ʱ�ȭ �ȴ�.
//		System.out.println(arr1[2]);
		
		// 3. �� �Ҵ� : �迭��[���� ��ȣ] = ��;
		arr[0]=2015;
		arr[3]=12;
		arr[5]=24;
		
		// 4. �� ��� : �迭��[���� ��ȣ]
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		
		System.out.println("---------------------------------------------");
		// �ϰ� ó��
		// ���� for : �ε����� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"] = "+arr[i]+"\t");
		}// end for
		
		System.out.println("\n---------------------------------------------");
		// ������ for : �ε����� ������� ����
		// ó�� ����� ������� ��� ���� ���� ���������� ���
		for(int value : arr){
			System.out.print(value+"\t");
		}
	}//UseArray1
	
	public void processScore(){
		System.out.println("\n---------------------------------------------");
		// �⺻�� �������� ����
		int[] score = {90,55,48,67,97,70};
		int sum = 0;
		int maxScore = score[0];
		// Ư�� ������ ���� ������ �ʱⰪ�� 0���Ͱ����Ѵ�.
		// ó������ �������� ���� ������ 0�Ǵ� �迭��[0] �̷��� 2������ ����� �� �ִ�.
		
		int minScore = score[0];
		// Ư�� ������ ���� ������ �ʱⰪ�� 100���Ͱ����Ѵ�.
		// ó������ �������� ���� ������ 100�Ǵ� �迭��[0] �̷��� 2������ ����� �� �ִ�.
		
		String best = "";
		String worst = "";
		
		String[] names = {"�̼���","������","�̼���","�Խ���","�Կ���","�ηη�"};
		
		
		System.out.println("�����ο� : "+score.length);
		System.out.println("��ȣ\t�̸�\t�ڹ�");
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf(" %d\t%s\t %d\n",i+1,names[i],score[i]);
			sum +=score[i];
			if(maxScore<score[i]){ // �ְ����ϱ�
				maxScore = score[i];
				best = names[i];
			}//end if
			if(minScore>score[i]){ // ���������ϱ�
				minScore = score[i];
				worst = names[i];
			}//end if
		}//end for
		
		
		System.out.println("---------------------------------------------");
		System.out.printf("���� : %d\t��� : %.2f\n",sum,(float)sum/score.length);
		System.out.printf("�ְ����� : %d  �ְ������� �̸� : %s\n",maxScore,best);
		System.out.printf("�������� : %d  ���������� �̸� : %s\n",minScore,worst);
		
		System.out.println("---------------------------------------------");
		String[] addr={"����� ������","����� ���۱�","����� ��������","����� ������",
				"�Ȼ�� ��ϱ�","������ ���뱸","����� ���Ǳ�","�λ�� �ؿ�뱸","���ֽ� �ϻ걸",
				"�ϵ��� ����踮","���Ǳ� �ϻ���"};
		int cnt = 0;
		// ��� ����ÿ� ������� ���� ���
//		for (int i = 0; i < addr.length; i++) {
//			if(addr[i].startsWith("����")){
//				System.out.println(addr[i]);
//				cnt++;
//			}
//		}
		for(String temp : addr){
			if(temp.startsWith("����")){
				System.out.println(temp);
				cnt++;
			}
		}
		System.out.println("������� �� : "+cnt);
		System.out.println("---------------------------------------------");
		for(String temp : addr){
			if(temp.contains("��")){
				System.out.println(temp);
			}
		}
		/////////////////// 12-28-2015 ����///////////////////
		int temp = 0;
		for (int i = 0; i < score.length-1; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i]<score[j]){
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					System.out.print(temp);
				}
			}
		}
		System.out.println("\n���� ���� ��");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t",score[i]);
		}
		
		/////////////////// �� ���ϱ� ///////////////////
		int year = 2015;
		String[] zodiac = {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		System.out.println("\n"+zodiac[year%12]);
		
		
		
		
	}//processScore
	
	
	public static void main(String[] args) {
		// ��ü���� �ʿ���� �� ����ϴ� ��üȭ
		// �����ִ� �����ڵ� ���������̴�.
		// new ������(); 
		
		// ��ü ������ �������� method�� ȣ�� �� �� ����ϴ� ��üȭ
//		UseArray1 ua = new UseArray1();
//		ua.processScore();
		
		// ������ �� �ϳ��� method�� ȣ���� �� ����ϴ� ��üȭ
		// ��üȭ : new ������().ȣ����method��();
		new UseArray1().processScore();
		
		
	}//main

}//class