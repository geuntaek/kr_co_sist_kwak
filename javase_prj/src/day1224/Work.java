package day1224;

/**
 * �Էµ� �ֹε�Ϲ�ȣ�� ����Ͽ� ����
 * @author user
 */
public class Work {
	private String ssn; // �ۿ��� ������ ���ϰ� �ֹι�ȣ�� �����.
	
	/**
	 * �ӽ� �ֹι�ȣ�� 930927-2222222�� ������ ������ ������ �� ���  
	 */
	public Work(){//�⺻������
		this("151515-5151515");
	}//Work
	
	/**
	 * �Է¹��� �ֹι�ȣ�� ��ȿ�� ������ ����
	 * @param ssn
	 */
	public Work(String ssn){
		this.ssn = ssn; // ���������� �ν��Ͻ������� �����ϱ� ���� this�� ��
	}//Work
	
	public String getSssn(){//�ν��Ͻ������� ���� ��ȯ�ϴ� getter
		return ssn;
	}
	
	
	
	/**
	 * �ֹι�ȣ�� �����κ�(-�ٷ� ���ڸ�)�� ���ϴ� ��
	 * @return ���� �κ��� ��
	 */
	private int genderFlag(){ // �ۿ��� �� �� ����.
		int temp = ssn.charAt(7)-48; // '1'�� �ڵ尪�� 49 '2'�� �ڵ尪�� 50
		return temp; // ������ ���� ���ڰ� ��ȯ
	}//genderFlag
	
	/**
	 * �ֹι�ȣ�� ��ü���̰� 14�ڸ����� Ȯ��
	 * @return true-14�ڸ�, false-14�ڸ��� �ƴѰ��
	 */
	public boolean checkLength(){
		boolean flag = false;
		if(ssn.length() == 14){
			flag = true;
		}//end if
		return flag;
	}//checkLength
	
	/**
	 * �ֹι�ȣ�� 6��°�ڸ��� "-"�� �ִ� Ȯ���ϴ���
	 * @return true-�ùٸ��ڸ��� ��ġ false-���ų� �ٸ���ġ
	 */
	public boolean checkHyphen(){
		boolean flag = false;
		if(ssn.indexOf("-")==6){
			flag = true;
		}
		return flag;
	}//checkHyphen
	
	
	/**
	 * �Էµ� �ֹι�ȣ���� ��������� ��ȯ�ϴ� ��
	 * ��ȯ���� xxxx�� xx�� xx��<br>
	 * ������ 1,2,3,4�� ���ؼ��� ó���ϰ� �� �ܿ��� "ó���Ұ�"�� ��ȯ�ȴ�.
	 * @return ó���� ��
	 */
	public String birth(){
		String result = "ó���Ұ�";
		String tempYear = ssn.substring(0,2);
		String tempMonth = ssn.substring(2,4);
		String tempDay = ssn.substring(4,6);
		if(genderFlag()<3){ // 1,2 : 1900
			result = "19"+tempYear+"�� "+tempMonth+"�� "+tempDay+"��";
		}else if(genderFlag()<5){ // 3,4 : 2000
			result = "20"+tempYear+"�� "+tempMonth+"�� "+tempDay+"��";
		}
		return result;
	}//birth
	
	/**
	 * �Էµ� �ֹι�ȣ�� ���̸� ����ϴ� ��
	 * @return
	 */
	public int age(){
		int age = (genderFlag()<3?1900:2000)+Integer.parseInt((ssn.substring(0,2)));
		age = 2015-age+1;
		return age;
	}//age
	
	/**
	 * �Էµ� �ֹι�ȣ�� ������ ������ ó���ϴ� ��
	 * @return ����
	 */
	public String gender(){
		String gender = "����";
		if(genderFlag()%2==1){
			gender = "����";
		}
		return gender;
	}//gender
	
	/**
	 * �Էµ� �ֹι�ȣ�� ��������� ����Ͽ� �츦 ���ϴ� ��
	 * @return ��
	 */
	public String zodiac(){
		String tempZodiac="";
		int birthYear = Integer.parseInt(birth().substring(0, 4));
		
		switch ( birthYear % 12) {
		case 0:
			tempZodiac = "�����̶�";
			break;
		case 1:
			tempZodiac = "�߶�";
			break;
		case 2:
			tempZodiac = "����";
			break;
		case 3:
			tempZodiac = "������";
			break;
		case 4:
			tempZodiac = "���";
			break;
		case 5:
			tempZodiac = "�Ҷ�";
			break;
		case 6:
			tempZodiac = "ȣ���̶�";
			break;
		case 7:
			tempZodiac = "�䳢��";
			break;
		case 8:
			tempZodiac = "���";
			break;
		case 9:
			tempZodiac = "���";
			break;
		case 10:
			tempZodiac = "����";
			break;
		case 11:
			tempZodiac = "���";
			break;
		}
		return tempZodiac; 
	}
	
	

}//class

















