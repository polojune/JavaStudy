package ch14;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import simple.ThisTest;

public class EventEx5 extends JFrame {

	private JLabel la;
	int y = 100;

	public EventEx5() {
		la = new JLabel("Hello");
		setTitle("MouseEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
        
		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		// 마우스를 클릭하고 땠을 때...
		@Override
		public void mousePressed(MouseEvent e) {

			int x = e.getX();// x좌표
			int y = e.getY();// y좌표
			la.setLocation(x, y); // 라벨 위치 변경 = repaint();

		}

	}

	public static void main(String[] args) {
		new EventEx5();

	}

}
