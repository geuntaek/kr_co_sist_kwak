package day1229;

/**
 * ��� Ŭ������ �θ�� �Ͽ� ������ Clark Ŭ����<br>
 * ���� ���� (�ְ��� 10)
 * 
 * // 12-30-2015 ����� ���ϰ� ���� (�ڽ�Ŭ������ ���� �� ����) Ŭ������ ��ȯ�ϴ� �ڵ� �߰�
 *	  Ŭ������ ���������ڿ� final�� �߰��Ѵ�. 
 * 
 * @author user
 */
public final class Clark extends Person{ // �밡 ���� clark Ŭ����. �ڽ��� ������ ���Ѵ�.
	public int power; // �ۿ��� ���� ������ �� �ִ�.
	
	public Clark(){
		power = 10; 
	}//Clark()
	
	/**
	 * ���� �ԷµǴ� ���� ���ؼ� ��ȭ�ȴ�.
	 * @param stone ���� ����
	 * @return �Էµ� ���� ���� ���
	 */
	public String power (String stone){
		String result="";
		
		if (stone.equals("���̾Ƹ��")) {
			result = "Thank You";
			power=10;
		} else if(stone.equals("ũ���䳪��Ʈ")) {
			result = "OMG";
			power=0;
		}else{
			result = "���޴´�.";
			power=11;
		}
		
		return result;
	}
	///////////////////////// 12-30-2015 �ڵ��߰� /////////////////////////
	// �Դ� ���� �ϴ� method�� �ڽĿ��� ���ɶ� �����ʱ� ������ �ڽĿ� �µ��� Override�Ѵ�.
	@Override
	public String eat(){
		return getName()+"��(��) ������ ���� �Դ´�.";
	}
	@Override
	public String eat(String menu,int price){
		return getName()+"��(��) ����������� "+menu+"(��)��� ������ "+price+"$ ���� ��Դ´�.";
	}
	
}