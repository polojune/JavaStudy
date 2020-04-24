package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx01 extends JFrame {

	public EventEx01() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �̺�Ʈ �й� ������ ����

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		// ������ �ۼ�
		btn.addActionListener(new MyActionListener());// Action �̺�Ʈ ������ �ޱ�

		c.add(btn);
		setSize(350, 150);
		setVisible(true);

	}// end of ������

	// ������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��Ѵ�.
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
			if (b.getText().equals("Action")) // ��ư�� ���ڿ��� "Action"���� ��
				b.setText("�׼�"); // ��ư�� ���ڿ��� "�׼�"���� ����
			else
				b.setText("Action"); // ��ư�� ���ڿ��� "Action"���� ����
		}
	}

	public static void main(String[] args) {
		new EventEx01();

	}

}
