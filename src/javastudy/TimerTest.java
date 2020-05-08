package javastudy;

import javax.swing.*;//JFrame
import java.awt.*;
import java.util.Calendar;

public class TimerTest extends JFrame { // â�����JFrame���
	JTextField tf1, tf2; // �ؽ�Ʈ �Է����Ѱ�ü(JFrame�� ���Ե� Ŭ����)

	public TimerTest() {
		super("������ �̿��� ������");// JFrame����
		// JFrame�� �޼ҵ�� ��ӹ޾ұ� ������ ����ó�� ���
		setSize(300, 200);// âũ�� ���� 300 ���� 200�ȼ�
		setLocation(100, 100);// â��ġ
		setVisible(true);// â�� ������ ��� �޼ҵ�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x��ư ������ â�ݱⰡ���ϰ�
		setLayout(null);// �����͸� ��� ������ ������ ����

		tf1 = new JTextField(20);// �ؽ�Ʈ �Է�â�� ������� 20
		tf2 = new JTextField(20);

		tf1.setLocation(70, 100);// â�ȿ��� tf1�� ��ġ����
		tf1.setSize(150, 20);// tf1�� ũ��
		tf2.setLocation(70, 120);// â�ȿ��� tf2�� ��ġ����
		tf2.setSize(150, 20);// tf2�� ũ��

		this.add(tf1);// ���� �ؽ�Ʈ�Է� â��ü�� ���� ������â�� ����
		this.add(tf2);

		new ThreadCount(tf1).start();// ��Ƽ������� ī��Ʈ���
		new ThreadClock(tf2).start();// ��Ƽ������� �ð� ���

	}

	public static void main(String[] args) {
		TimerTest st = new TimerTest();
	}

}

class ThreadCount extends Thread {// ������â�� ī��Ʈ�������
	JTextField target;

	// �ۺ� Ŭ����SwingThread���� ��������Ƿ� �ٷιޱⰡ��?
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

class ThreadClock extends Thread {// ������â�� �ð��������
	JTextField target;

	public ThreadClock(JTextField t) {
		target = t;
	}

	public void run() {
		Calendar c = null;
		String time = null;
		while (true) {
			c = Calendar.getInstance();// Calendar��ü �������ϰ� �ð�������
			time = c.get(Calendar.HOUR) + "��" + c.get(Calendar.MINUTE) + "��" + c.get(Calendar.SECOND) + "��";
			target.setText(time);
			try {
				sleep(1000);// �������� �ð���� ����1�� ������
			} catch (InterruptedException e) {
			}
		}

	}

}