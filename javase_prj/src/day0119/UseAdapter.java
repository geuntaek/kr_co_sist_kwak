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
		super("Adapter Ŭ���� ���");
		setSize(300,300);
		setVisible(true);
		//adapter�� ��ӹ��� ��� �ʿ��� method�� Override
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
		
		/// implements�� ���
		//Listener�� ������ ��� : �ʿ���� method�� ���  Override
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
		}); // �̺�Ʈ�� �� �ȿ��� ó���ϰڴ�.
		*/
	}
	
	public static void main(String[] args) {
		new UseAdapter();
	}//main
}//class
