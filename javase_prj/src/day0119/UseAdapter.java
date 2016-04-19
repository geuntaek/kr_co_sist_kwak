package day0119;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class UseAdapter extends Frame{

	public UseAdapter(){
		super("Adapter 클래스 사용");
		setSize(300,300);
		setVisible(true);
		//adapter를 상속받은 경우 필요한 method만 Override
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
		
		/// implements한 경우
		//Listener를 구현한 경우 : 필요없는 method도 모두  Override
		/*addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				dispose();
//				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated");
			}
		}); // 이벤트를 내 안에서 처리하겠다.
		*/
	}
	
	public static void main(String[] args) {
		new UseAdapter();
	}//main
}//class
