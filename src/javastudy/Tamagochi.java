package javastudy;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



class loginView extends JFrame {
	private JButton b1, b2, b3, b4;
	JScrollPane scrollPane;
	ImageIcon b = null;
	ImageIcon c = null;
 
	
	public loginView() {
		b = new ImageIcon("img/a.jpg");
		// c = new ImageIcon("img/c.gif");

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(b.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);

			}
		};

//      JPanel panel1 = new JPanel() { 
//    	  public void paintComponent(Graphics g) {
//				g.drawImage(c.getImage(), 0, 0, null);
//				setOpaque(false);
//				super.paintComponent(g);
//
//			}
//    	  
//      };

		scrollPane = new JScrollPane(panel);
		setContentPane(scrollPane);

		setTitle("다마고치 만들기");
		// Container c = getContentPane();
		panel.setLayout(null);
		JButton b1 = new JButton("밥먹기");
		JButton b2 = new JButton("운동하기");
		JButton b3 = new JButton("잠자기");
		JButton b4 = new JButton("14:04:05");
        
		
		b1.setBounds(0, 302, 168, 35);
		b2.setBounds(170, 302, 160, 35);
		b3.setBounds(331, 302, 145, 35);
		b4.setBounds(12, 10, 97, 35);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
      
      
		setSize(492, 376);
		// setLocationRelativeTo(null);
		setVisible(true);
	}

}




public class Tamagochi {

	public static void main(String[] args) {
		new loginView();
		
	}

}
