package day1230;

/**
 * �θ�Ŭ�������� �����ϴ� method�� �ڽ�Ŭ�������� ���� �� �ڽ�Ŭ������ ��Ȳ��
 * �����ʴ´ٸ� �ڽ�Ŭ�������� �θ�Ŭ������ method�� �����ϰ� ����� ����ϴ� override�� ���� <br>
 * ���������ڴ� �޶� �ǰ�, ��ȯ��, method��, �Ű������� ���ƾ��Ѵ�.<br>
 * �� �� ������ �ߵǴ� ���� ���������ڷ� �ٲ۴�. default -> protected -> public 
 * @author user
 */
public class OverrideSuper {
	
	int i;
	
	public void pMethod(){
		System.out.println("�θ��� method");
	}//pMethod
	protected void pMethod1(){
		System.out.println("�θ��� method1 "+i);
	}//pMethod1
	
}
