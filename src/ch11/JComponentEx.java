package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {
	private JButton b1, b2, b3;

	public JComponentEx() {
		setTitle("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disable Button ");
		JButton b3 = new JButton("getX(),  getY()");

		b1.setBackground(Color.YELLOW);
		b2.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {

			// Ÿ��(�ݹ�Ǵ�)
			@Override
			public void actionPerformed(ActionEvent e) {
				//JButton b =(JButton)e.getSource(); //Object�� �����ϱ� ������ �ٿ� ĳ����
				b3.setText("Hello");
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(260, 220);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();

	}

}
