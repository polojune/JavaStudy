package javastudy;

import java.awt.Container;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TextFiled extends JFrame {
	private JLabel la;
	Calendar c;
	Thread th;

	public TextFiled() {
		th = new Thread();
		la = new JLabel("14:10:10");
		setTitle("시간 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(300, 200);
		setVisible(true);
		th.start();
	}
}

class Test1 implements Runnable {

	@Override
	public void run() {
		while (true) {
			Calendar c = Calendar.getInstance();
			System.out.println("a");
			System.out.println(
					c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

}

class TimeThreadTest {

	public void runTime() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					Calendar c = Calendar.getInstance();
					//System.out.println("a");
					System.out.println(
							c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
				}

			}
		}).start();
	}
}

public class Test {
	public static void main(String[] args) {
//		TimeThreadTest a = new TimeThreadTest();
//		a.runTime();
//	  new TextFiled();
		//new Test2().run();


	}
}
