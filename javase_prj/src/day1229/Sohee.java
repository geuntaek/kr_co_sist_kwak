package day1229;

public class Sohee extends Person {
	
	private int rageFigure;
	
	public Sohee(){
		rageFigure = 5;
	}
	
	public String hateFruit (String fruit){
		String result = "";
		if(fruit.equals("��")){
			result = "���󿡼� ���� �Ⱦ���";
			rageFigure++;
			rageFigure++;
			rageFigure++;
			
		}else if(fruit.equals("����")){
			result = "¥���� ������ �Ⱦ���";
			rageFigure++;
			rageFigure++;
		}else if(fruit.equals("������")||fruit.equals("���")||fruit.equals("������")||fruit.equals("��")){
			result = "������";
			rageFigure--;
			rageFigure--;
		}else{
			result = "�״��� �������� ����";
			rageFigure++;
		}
		return result;
	}
}
