package day1229;

public class Sohee extends Person {
	
	private int rageFigure;
	
	public Sohee(){
		rageFigure = 5;
	}
	
	public String hateFruit (String fruit){
		String result = "";
		if(fruit.equals("배")){
			result = "세상에서 제일 싫어함";
			rageFigure++;
			rageFigure++;
			rageFigure++;
			
		}else if(fruit.equals("포도")){
			result = "짜증날 정도로 싫어함";
			rageFigure++;
			rageFigure++;
		}else if(fruit.equals("복숭아")||fruit.equals("용과")||fruit.equals("오렌지")||fruit.equals("귤")){
			result = "좋아함";
			rageFigure--;
			rageFigure--;
		}else{
			result = "그다지 좋아하지 않음";
			rageFigure++;
		}
		return result;
	}
}
