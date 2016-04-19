package day1229;

/**
 * ��� Ŭ������ ��ӹ޾� ����� Ŭ����<br>
 * ����� ����Ư¡�� Person���� ������ ����ϰ� ȫ�浿�� Ư¡�� �ο����ϴ� �ڵ常 ���� �� Ŭ����
 * @author user
 */
public class HongGilDong extends Person{
	
	private int level; // �ο� ���� 
	
	/**
	 * ȫ�浿�� �¾ �� ����ϴ� �⺻������<br>
	 * ȫ�浿�� �ο� level�� 6�̴�.<br> 
	 * ��, �ο� level�� 10�� �����̴�.
	 */
	public HongGilDong(){
		level=6; 
	}//HongGilDong
	
	/**
	 * �ο�� ���� �ϴ� method
	 * @param yourLevel ������ ����
	 * @return �ο��� ���
	 */
	public String Fight(int yourLevel){ // ������ ������ ���´�.
		String result = "";
		if(level<yourLevel){ // ȫ�浿�� ���� ���
			result = "����.OTL";
			level--;
		}else if(level>yourLevel){ // ȫ�浿�� �̱�� ���
			result = "�̰��.s('.^)V";
			level++;
		}else{ // ��� ���
			result = "����.(�Ѥ�^)";
		}// end else
		return result;
	}
	
	///////////////////////// 12-30-2015 �ڵ��߰� /////////////////////////
	//Person���� �����ϴ� eat method �� �ܺο��� ��Դ� ���� �ϴ� method�� ���� ��ü�� ���� �ʴ´�
	@Override
	public String eat(String menu,int price){
		return getName()+"��(��) �ָ����� "+menu+"(��)��� ������ "+price+"�� ���� ��Դ´�.";
	}
	
	
	
}











