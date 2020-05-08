package javastudy;

import javax.swing.*;//JFrame
import java.awt.*;
import java.util.Calendar;

public class TimerTest extends JFrame { // 창만드는JFrame상속
	JTextField tf1, tf2; // 텍스트 입력위한객체(JFrame에 포함된 클래스)

	public TimerTest() {
		super("스윙을 이용한 스레드");// JFrame생성
		// JFrame의 메소드들 상속받았기 때문에 내것처럼 사용
		setSize(300, 200);// 창크기 가로 300 세로 200픽셀
		setLocation(100, 100);// 창위치
		setVisible(true);// 창을 보여라 라는 메소드

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 누르면 창닫기가능하게
		setLayout(null);// 데이터를 어떻게 붙일지 방향을 결정

		tf1 = new JTextField(20);// 텍스트 입력창의 저장공간 20
		tf2 = new JTextField(20);

		tf1.setLocation(70, 100);// 창안에서 tf1의 위치설정
		tf1.setSize(150, 20);// tf1의 크기
		tf2.setLocation(70, 120);// 창안에서 tf2의 위치설정
		tf2.setSize(150, 20);// tf2의 크기

		this.add(tf1);// 만든 텍스트입력 창객체를 만든 윈도우창에 붙임
		this.add(tf2);

		new ThreadCount(tf1).start();// 멀티스레드로 카운트출력
		new ThreadClock(tf2).start();// 멀티스레드로 시간 출력

	}

	public static void main(String[] args) {
		TimerTest st = new TimerTest();
	}

}

class ThreadCount extends Thread {// 윈도우창에 카운트출력위함
	JTextField target;

	// 퍼블릭 클래스SwingThread에서 상속했으므로 바로받기가능?
	public ThreadCount(JTextField t) {
		target = t;
	}

	public void run() {
		int n = 0;
		while (true) {
			try {
				sleep(0);
			} catch (InterruptedException e) {
			}

			target.setText(Integer.toString(++n));
		}

	}

}

class ThreadClock extends Thread {// 윈도우창에 시간출력위함
	JTextField target;

	public ThreadClock(JTextField t) {
		target = t;
	}

	public void run() {
		Calendar c = null;
		String time = null;
		while (true) {
			c = Calendar.getInstance();// Calendar객체 생성안하고 시간읽을때
			time = c.get(Calendar.HOUR) + "시" + c.get(Calendar.MINUTE) + "분" + c.get(Calendar.SECOND) + "초";
			target.setText(time);
			try {
				sleep(1000);// 보기좋게 시간출력 위해1초 쉬게함
			} catch (InterruptedException e) {
			}
		}

	}

}