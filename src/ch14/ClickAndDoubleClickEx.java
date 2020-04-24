package ch14;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {
   
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());  
		setSize(300, 200);
		setVisible(true);
	}
	
	//MouseAdapter를 상속받아 Mouse 리스너 구현
	class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
		  if(e.getClickCount()==2) { //더블 클릭의 경우
			  //[0,225] 사이의 랜덤한 r,g,b 정수 값 얻기
			  int r =(int)(Math.random()*256);
			  int g =(int)(Math.random()*256);
			  int b =(int)(Math.random()*256);
			  
			  Component c =(Component)e.getSource();
			  c.setBackground(new Color(r,b,g));
			  
		  }
		}
		
	}
	
	public static void main(String[] args) {
		new ClickAndDoubleClickEx();

	}

}
