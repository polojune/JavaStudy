package javastudy;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame {
	public Clock() {
		setTitle("시계보기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new Lbi());
		setSize(500, 500);
		setVisible(true);
	}

	class Lbi extends JLabel implements Runnable {
		Thread timeThread = null;

		public Lbi() {
			setText(setClockText());
			setFont(new Font("fname", Font.ITALIC, 70));
			setHorizontalAlignment(JLabel.CENTER);
			timeThread = new Thread(Lbi.this);
			timeThread.start();
		}

		public String setClockText() {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);

			String clockTxt = Integer.toString(hour);
			clockTxt = clockTxt.concat(":");
			clockTxt = clockTxt.concat(Integer.toString(min));
			clockTxt = clockTxt.concat(":");
			clockTxt = clockTxt.concat(Integer.toString(second));
			return clockTxt;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					return;
				}
				setText(setClockText());
			}

		}
	}
	public static void main(String[] args) {
		 new Clock();
	}
}
