package ch14;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx3 extends JFrame {

	public EventEx3() {
		setTitle("�̺�Ʈ�����ʿ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(300, 300);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		c.add(btn1);
		c.add(btn2);

		MyButtonTarget mb = new MyButtonTarget();
		btn1.addActionListener(mb);
		btn2.addActionListener(mb);
		setVisible(true);
	}

	class MyButtonTarget implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("�ȳ�");

		}
	}

	public static void main(String[] args) {
		new EventEx3();

	}

}
