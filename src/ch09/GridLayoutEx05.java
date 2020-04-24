package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridLayoutEx05 extends JFrame {
    
	public GridLayoutEx05() {
		 setTitle("4x4 Color Frame");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 GridLayout grid = new GridLayout(4,4);
		 
		 Container c = getContentPane();
		 c.setLayout(grid);
	
		 
	}
	
	public static void main(String[] args) {
		

	}

}
