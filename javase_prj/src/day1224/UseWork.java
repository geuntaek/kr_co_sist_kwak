package day1224;

/**
 * �ֹι�ȣ�� ó���ϴ� Ŭ������ ���
 * @author user
 */
public class UseWork {

	public static void main(String[] args) {
		Work w = new Work("151224-4235456");
		if (w.checkLength()) {
			if(w.checkHyphen()){
				if(w.birth().equals("ó���Ұ�")){
					System.out.println("�����θ� ó�������մϴ�.");
				}else{ // ��� ��ȿ�� ������ ��ģ���
					System.out.println("������ "+w.birth());
					System.out.println("���̴� "+w.age());
					System.out.println("������ "+w.gender());
					System.out.println("��� "+w.zodiac());
				}
			}else{
				System.out.println("��ȿ���� ���� �ֹι�ȣ����");
			}
			
		} else {
			System.out.println(w.getSssn()+"�� �ֹι�ȣ 14�ڸ� " + w.checkLength());
		}
	}

}
