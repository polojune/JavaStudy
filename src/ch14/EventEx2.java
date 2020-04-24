package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx2 extends JFrame implements ActionListener{
       
	 EventEx2 ex02;
	
	public EventEx2() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �̺�Ʈ �й� ������ ����

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		// ������ �ۼ�
		btn.addActionListener(this);

		c.add(btn);
		setSize(350, 150);
		setVisible(true);

	}// end of ������

	public static void main(String[] args) {
		        EventEx2  ex02 = new EventEx2();

	}
    // Ÿ��(EventEx02�� ������ ����)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư Ŭ����");
		
	}

}
