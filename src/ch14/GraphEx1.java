package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphEx1 extends JFrame {
   
	Mypanel panel = new Mypanel();

	
	public GraphEx1() {
		setTitle("그래프 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setLayout(null);
	
		
		 
		setSize(550,650);
		setVisible(true);
		setLocationRelativeTo(null);
	   
	}
	
	class Mypanel extends JPanel{
		 String name = "바다가재"; 
		 int height = 400;
		
		@Override
		public void paintComponent(Graphics g) {
			
			 
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillRect(10, 500, 50, 200);
		    
		
		}
		
		
	}
	
	public static void main(String[] args) {
	   new GraphEx1();

	}

}
