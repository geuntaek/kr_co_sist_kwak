package day1215;
class Homework2 {
	public static void main(String[] args) {
		System.out.println("����1");
		//������� 0�� 1�� ����, 0�� �Ϲݰ� 1�� Ư����
		//���ǰ����� ������ �ְ� Ư������ 35%�� �������� ����
		//�Ϲݰ��� 10%�� �������� �����Ͽ� ���ǰ��� ����Ͽ� ������ ���� �� ���
		int grade=1;
		int real_cost=10000;
		System.out.println("���� ����� "+ ((grade == 0) ? "�Ϲݰ�":"Ư����"));
		System.out.println("���󰡴� "+real_cost);
		System.out.println("���ΰ��� "+ ((grade == 0) ? real_cost*0.9 : real_cost * 0.65));
		
		System.out.println("\n����2");
		//������ �Էµ� ���� Ȧ������ ¦������ ���
		int temp1 = 14;
		System.out.println(temp1 +"�� "+((temp1%2==1) ? "Ȧ��" : "¦��"));

		System.out.println("\n����3");
		//char ���� '��'�� �Է��ϰ� ����1����Ʈ�� ���� ���� 1����Ʈ�� ���� ���� ���
		char c = '��';
		//int c_num = c;
		//System.out.println(c+"�� ���ڷ� "+c);
		System.out.println("2���� = "+Integer.toBinaryString(c));
		System.out.println("16���� = "+Integer.toHexString(c));
		//System.out.println("���� 1byte = "+Integer.toBinaryString(c>>8));
		System.out.println("���� 1byte = "+Integer.toBinaryString((c&0xff00)>>8));
		System.out.println("���� 1byte = "+Integer.toBinaryString(c&0x00ff));
		System.out.println(Integer.toBinaryString(0x00ff));

		System.out.println("\n����4");
		// ������ ����� ���� ~�� �ٿ� ����ϴµ� ��ȣ�� ����ǰ� ���� �״�� ��µǵ��� �ۼ�(����)
		int temp2 = -7;
		System.out.println(~temp2<0 ? "~"+(-temp2): "~"+(-temp2));
	}
}
