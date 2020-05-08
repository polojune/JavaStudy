package javastudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class TamagochiEx {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TamagochiEx window = new TamagochiEx();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TamagochiEx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("¹ä¸Ô±â");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 302, 168, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿îµ¿ÇÏ±â");
		btnNewButton_1.setBounds(170, 302, 160, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ÀáÀÚ±â");
		btnNewButton_2.setBounds(331, 302, 145, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("14:04");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(12, 10, 97, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		Dimension d = panel.getSize();
		ImageIcon image = new ImageIcon(""); 
		//g.drawImage(image.getImage(),0,0,d.width,d.height,null);
		panel.setBounds(121, 77, 230, 226);
		frame.getContentPane().add(panel);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 476, 303);
		frame.getContentPane().add(panel_1);
		frame.setBounds(100, 100, 492, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
