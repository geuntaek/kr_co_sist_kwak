package day1230;

/**
 * �߻�Ŭ������ �θ�� �ϴ� �ڽ� Ŭ����<br>
 * �ڽ�Ŭ������ �θ� �����ϴ� ��� abstract method�� �����ؾ��Ѵ�.<br>
 * �ڽ�Ŭ������ �߻�Ŭ������ �ȴٸ� �θ��� abstract method�� �������� �ʾƵ��ȴ�.
 * ������ �� ������ �ڽ�Ŭ������ �������� ���� �߻�޼��带 ��� �����ؾ��Ѵ�.
 * 
 * @author user
 */
public class AbstractChild extends AbstractParent {
	
	@Override
	public String msg(){
		return "�ȳ��ϼ���";
	}// msg
	
	@Override
	public int age(int year){
		// �߻� method�� super�� ȣ���� �� ����.
//		super.msg(); // ����ȣ���� �� ��� ������ �߻��Ѵ�.
		return 2015-year+1;
	}// age
	
	public static void main(String[]args){
		AbstractChild ac = new AbstractChild();
		System.out.println(ac.msg());
		System.out.println(ac.age(1993));
		ac.method();
	}
	
	
}//AbstractChild
