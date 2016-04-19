package day1222;

/**
 * ����� �߻�ȭ(����Ư¡ ����)�Ͽ� ����Ŭ����.<br>
 * ������� Ư¡ : ��, ��, ��, �̸�<br>
 * �������� Ư¡ : �Դ���(Overload)<br>
 * ����� �Ϲ� Ŭ������ ��üȭ�� �Ͽ� ����Ѵ�.<br>
 * ex> Person ��ü�� = new Person();<br>
 * 
 * @author user
 */
public class Person {
	private String name; // �̸�
	private int nose, eye, mouth; // ��, ��, �� ����
	
	/**
	 * �����ü�� ���� �� �� ����ϴ� �⺻������<br>
	 * �� �ΰ�, �� �ϳ�, �� �ϳ��� �����ü�� ���� 
	 */
	public Person(){
		/////// 12-23-2015 �ڵ� ����
		this(2,1,1);
		
		/*eye = 2;
		nose = 1;
		mouth = 1;
		System.out.println("��"+eye+"��, �� "+nose+"��, ��"+mouth+"�� �� ����¾");*/
	}
	
	/**
	 * �� �ΰ�, �� �ϳ�, �� �ϳ��� �ƴ� �����ü�� ������ �� ����ϴ� ������
	 * @param eye ���� ��
	 * @param nose ���� ��
	 * @param mouth ���� ��
	 */
	public Person(int eye, int nose, int mouth){
		
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
		System.out.println("\n���� �ִ� ������   ��"+eye+"��, �� "+nose+"��, ��"+mouth+"�� �� ����¾");
	}
	
	/**
	 *	������ ��� ��ü�� �̸��� �����ϴ� ��
	 * @param name ������ �̸�
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	/**
	 * 	������ �����ü�� ����� �̸��� ��ȯ�ϴ� ��
	 * @return ������ �̸�
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * ������ ��� ��ü ���� ���� �����ϴ� ��
	 * @param eye ������ ���� ��
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye
	/**
	 * 	������ ��� ��ü�� ����� ���� ���� ��ȯ�ϴ� ��
	 * @return ������ ���� ��
	 */
	public int getEye() {
		return eye;
	}//getEye
	/**
	 * 	������ ��� ��ü�� ���� ���� �����ϴ� ��
	 * @param nose ������ ���� ��
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose
	/**
	 * ������ �����ü�� ������ ���� ���� ��ȯ�ϴ� ��
	 * @return ������ ���� ��
	 */
	public int getNose() {
		return nose;
	}//getNose
	/**
	 * 	������ ��� ��ü ���� ���� �����ϴ� ��
	 * @param mouth ������ ���� ��
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouth
	/**
	 * 	������ ��� ��ü�� ������ ���� ���� ��ȯ�ϴ� ��
	 * @return ������ ���� ��
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	////////////////// �������� Ư¡ ���� //////////////////
	/**
	 * 	������ ��� ��ü�� ������ ���� �Դ� ��
	 * @return �ൿ
	 */
	public String eat(){
		return name+"��(��) ������ ���� �Դ´�.";
	}//eat
	/**
	 * 	������ ��� ��ü�� �Ĵ翡�� ���� ��Դ� ��
	 * @param menu ����� ������ ����
	 * @param price �ش� ������ å���� ����
	 * @return �ൿ
	 */
	public String eat(String menu, int price){
		return name+"��(��) �Ĵ翡�� "+menu+"��� ������ "+price+"�� ���� ��Դ´�.";
	}//eat
}//class
