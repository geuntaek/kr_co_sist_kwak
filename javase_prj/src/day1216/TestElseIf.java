package day1216;
/****************************************************************************
	�����ִ� ������ ��� �� ����ϴ� ���� if (else if)�� ���
****************************************************************************/
class TestElseIf {
	public static void main(String[] args) {
		// �Էµ� ���� ���� üũ, ���� 0�� 100���̿�����
		int num = Integer.parseInt(args[0]);
		System.out.print(num);
		if(num<0){
			System.out.println("�� 0���� ���� �� ����");
		}
		else if(num>100){
			System.out.println("�� 100���� Ŭ �� ����");
		}
		else{
			System.out.println("�� 0~100������ �����̴�! �Է� ����");
		}
		
		int year = Integer.parseInt(args[1]);
		int flag = year%12;
		System.out.print("\n"+year);
		if(flag==0){
			System.out.println("����� �����̶�");
		}
		else if(flag==1){
			System.out.println("����� �߶�");
		}
		else if(flag==2){
			System.out.println("����� ����");
		}
		else if(flag==3){
			System.out.println("����� ������");
		}
		else if(flag==4){
			System.out.println("����� ���");
		}
		else if(flag==5){
			System.out.println("����� �Ҷ�");
		}
		else if(flag==6){
			System.out.println("����� ȣ���̶�");
		}
		else if(flag==7){
			System.out.println("����� �䳢��");
		}
		else if(flag==8){
			System.out.println("����� ���");
		}
		else if(flag==9){
			System.out.println("����� ���");
		}
		else if(flag==10){
			System.out.println("����� ����");
		}
		else{
			System.out.println("����� ���");
		}
	}//main
}//class
