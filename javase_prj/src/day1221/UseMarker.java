package day1221;

/**
 *	Marker���� ��ü�� ����� �������� class
 *	����ϴ� ��ü�̴�.
 * @author user
 */
public class UseMarker {
	/**
	 * 	������ �� ����ϴ� method
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* �����ڸ� �������� �ʾ��� �� 
		// ��ü ���� : ��üȭ�� Ŭ������ ������ = new Ŭ������();
		Marker black = new Marker();
		//setter�� ����Ͽ� ������ ��ī�濡 ���� �����Ѵ�.
		black.setColor("����");
		black.setCap(1);
		black.setBody(1);
		// methodȣ���Ͽ� ������ ��
//		black.write("�ȳ��ϼ���") // ��ȯ�ϴ� ���� �ִ� �޼ҵ�� �� �״�� ��. 
											// ���꿡 ������ų �� �ִ�.
		System.out.println(black.write("�ȳ��ϼ���"));
		Marker blue = new Marker();
		blue.setColor("�Ķ�"); 
		System.out.println(blue.write("Be awesome","�̼���"));
		*/
		
		
		/////// 12-22-2015 ������ ���� �� �ڵ� �߰� ���� ///////
		// �⺻ ������ ��� - ������ ��ī�� ����
		Marker black = new Marker();
		System.out.println(black.write("�ȳ��ϼ���"));
		
		// �����ִ� ������ ��� - �������� �ƴϰų�, �������� �Ѳ��� ��ü�� ���� ��ī���� ������ ��
		Marker blue = new Marker(101,101,"���");
		System.out.println(blue.getColor()+"��, �Ѳ��� "+blue.getCap()+"�� ��ü�� "+blue.getBody()+"��");
		/////// 12-22-2015 ������ ���� �� �ڵ� �߰� �� ///////
		
	}//main
}//class
