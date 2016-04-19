package day1221;

/**
 *	��ī���� ������� �Ͽ� �ۼ��ϴ� Ŭ���� <br>
 *	������� Ư¡�� �Ѳ�, ��ü, �� <br> 
 *	�������� Ư¡�� ����. <br>
 *	�Ϲ����� ��üȭ ������ ����Ͽ� ��ü�� �����Ѵ�.
 *  Marker m = new Marker();
 * @author user
 */
public class Marker {
	private String color; // �� ����� ����
	private int cap, body; // �Ѳ�, ��ü ����� ����
	
	/////// 12-22-2015 ������ �ڵ� �߰� ���� ///////
	/**
	 * �Ѳ��Ѱ�,��ü�Ѱ�,�������� ��ī���� ������ �� ����ϴ� ������
	 */
	public Marker(){
		/////// 12-23-2015 �����ڸ� ȣ���ϴ� this()�� �н��� �� �߰�
		this(1,1,"����"); // ���꼺�� ����Ŵ
		/*
		color = "����";
		cap = 1;
		body = 1;
		System.out.print("�⺻������   ");
		System.out.println("�Ѳ�"+cap+"��, ��ü�� "+body+"��, ������ "+color+"���� ��ī�� ����");
		*/
	}//Marker
	
	/**
	 * �Է¹޴� ���� ������ ��ī���� ������ ��
	 * �Ѳ�, ��ü�� ���� ���� 1~100�� ������ ������ �����ϴ�.<br>
	 * �ش� ������ �ƴ϶�� 1�� �����ȴ�.
	 * ���� ������,������,�Ķ����� �ƴ϶�� ���������� ������ �ȴ�.
	 * ��뿹) Marker ��ü�� = new Marker(�Ѳ�,��ü,��);
	 * @param cap ������ �Ѳ��� ��
	 * @param body ������ ��ü�� ��
	 * @param color ������ ����
	 */
	public Marker(int cap, int body, String color){
		
		if(cap!=body){ // �Ѳ��� ��ü�� ������ ���� �ʴٸ�
			cap=1;
			body=1;
		}//end if
		if(!(cap>0&&cap<101)){
			cap=1;
			body=1;
		}//end if
		if(!(color.equals("����")||color.equals("����")||color.equals("�Ķ�"))){
			color = "����";
		}//end if
		this.cap = cap;
		this.body = body;
		this.color = color;
		System.out.print("�����ִ»�����   ");
		System.out.println("�Ѳ�"+cap+"��, ��ü�� "+body+"��, ������ "+color+"���� ��ī�� ����");			
	}
	
	/////// 12-22-2015 ������ �ڵ� �߰� �� ///////
	
	//set�� �ν��Ͻ� ������ ���� ������ get�� ���� ��ȯ�ϴ°� 
	/**
	 * 	������ ��ī�� ��ü�� ���� �����ϴ���
	 * @param color : ������ ��
	 */
	public void setColor(String color){
		this.color = color; // �Է��� color�� private String color��� ������ �־�����ϴϱ� this�� ���ִ°Ǵ�.  
	}//setColor
	/**
	 * 	������ ��ī�� ��ü�� ������ �ִ� ���� ��ȯ�ϴ���
	 * @return ��ī�� ����
	 */
	public String getColor(){
		return color; // �ν��Ͻ� ������ ���� ��ȯ �� ���̴�.
	}//getColor
	
	/**
	 * 	������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ���
	 * @param cap : ������ �Ѳ��� ��
	 */
	public void setCap(int cap){
		this.cap = cap;
	}//setCap
	/**
	 * 	������ ��ī�� ��ü�� ������ �Ѳ��� ���� ��� ��
	 * @return �Ѳ��� ��
	 */
	public int getCap(){
		return cap;
	}//getCap
	
	/**
	 * 	������ ��ī���� ��ü�� ���� �����ϴ� ��
	 * @param body : ������ ��ü�� ��
	 */
	public void setBody(int body){
		this.body = body;
	}//setBody
	/**
	 * 	������ ��ī�� ��ü�� ������ ��ü�� ���� ��� ��
	 * @return
	 */
	public int getBody(){
		return body;
	}//getBody
	
	/**
	 * 	�Էµ� �޼����� ĥ�ǿ� ���� ��
	 * @param msg ĥ�ǿ� ����� �޼���
	 * @return
	 */
	public String write(String msg){
		return "ĥ�ǿ� "+color+"�� ��ī������\""+msg+"\" �� ����\n"; // �ԷµǴ� �޼����� ��ȯ. 
	}//write
	/**
	 * 	�� �����ڰ� �ƴ� �ٸ� ����� ��ī���� ����ϴ� ����� ó��
	 * @param msg ĥ�ǿ� ����� �޼���
	 * @param writer �ۼ���
	 * @return �ൿ
	 */
	public String write(String msg, String writer){
		return writer+ "��(��) ĥ�ǿ� "+color+"�� ��ī������\""+msg+"\" �� ����\n"; // �ԷµǴ� �޼����� ��ȯ. 
	}
}//class





