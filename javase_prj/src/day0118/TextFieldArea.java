package day0118;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextFieldArea extends Frame{
	
	private TextArea ta;
	private TextField tf;
	
	public TextFieldArea(){
		super("TextField¿Í TextArea");
		
		ta = new TextArea();
		tf = new TextField();
		
		setLayout(new BorderLayout());
		
		add("Center",ta);
		add("South",tf);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
		setBounds(100,100,400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldArea();
	}

}
