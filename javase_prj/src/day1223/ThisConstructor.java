package day1223;

/**
 * this()�� ����� Overload�� ������ ȣ��<br>
 * ���ȣ��Ǹ� ���� �߻�
 * @author user
 */
public class ThisConstructor {

	//Overload, �����ڴ� �� new�� ���� �ҷ����Ѵ�.
	public ThisConstructor(){
//		this(23); // �����ִ� �������� ���� �ϰ� �⺻�������� ���� �Ѵ�. 
		System.out.println("default Constructor");
	}//ThisConstructor
	public ThisConstructor(int i){
		this(); // �⺻�����ڸ� �θ��� �⺻�������� ���� �� �ϰ� 
				// }�� ������ ȣ���� ������ �ٽ� ���ư� ������ ���� �Ѵ�.
		System.out.println("Constructor");
	}//ThisConstructor
	
	public static void main(String[] args) {
		ThisConstructor tc = new ThisConstructor(23);
		
	}//main

}//class
