package day1229;

import java.awt.Dialog;
import java.awt.Frame;

public class Test extends Dialog{

	//dialog는 기본생성자가 없다. 그러므로 인자있는생성자를 부른다. 
	public Test(){
		super(new Frame(),"Dialog"); 
	}//Test
	
	
	
}
