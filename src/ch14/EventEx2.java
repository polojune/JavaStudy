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
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이벤트 분배 쓰레드 종료

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		// 리스너 작성
		btn.addActionListener(this);

		c.add(btn);
		setSize(350, 150);
		setVisible(true);

	}// end of 생성자

	public static void main(String[] args) {
		        EventEx2  ex02 = new EventEx2();

	}
    // 타겟(EventEx02가 가지고 있음)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭됨");
		
	}

}
