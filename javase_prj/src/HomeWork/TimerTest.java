package HomeWork;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TimerTest extends JFrame implements ActionListener {
	JPanel panel1 = new JPanel(new FlowLayout());
	JButton upBtn, downBtn, rightBtn, leftBtn;
	String direct = "";
	int saucerXpos = 200, saucerYpos = 200, saucerMoveIncrement = 50;

	public TimerTest() {
		upBtn = new JButton("up");
		upBtn.addActionListener(this);
		downBtn = new JButton("down");
		downBtn.addActionListener(this);
		rightBtn = new JButton("right");
		rightBtn.addActionListener(this);
		leftBtn = new JButton("left");
		leftBtn.addActionListener(this);
		panel1.add(upBtn);
		panel1.add(downBtn);
		panel1.add(rightBtn);
		panel1.add(leftBtn);
		add(panel1, BorderLayout.NORTH);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (direct.equals("up")) {
					saucerYpos -= saucerMoveIncrement;
				} else if (direct.equals("down")) {
					saucerYpos += saucerMoveIncrement;
				} else if (direct.equals("right")) {
					saucerXpos += saucerMoveIncrement;
				} else if (direct.equals("left")) {
					saucerXpos -= saucerMoveIncrement;
				}
				repaint();
			}
		}, 0, 500);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(saucerXpos, saucerYpos, 50, 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		direct = e.getActionCommand();
	}

	public static void main(String[] args) {
		new TimerTest();
	}
}