package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {

	private JTextField tf;
	private JTextArea ta;
	private ScrollPane sp;

	public TextFieldEx() {
		init();
		setTitle("�ؽ�Ʈ ������, �ؽ�Ʈ �ڽ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		
		// �ؽ�Ʈ �ʵ� ������
		tf.setFont(new Font("Arial",Font.BOLD,30));
		tf.setPreferredSize(new Dimension(100, 100)); // x,y
        
		
		
		
		ta.setBackground(Color.ORANGE);
	
		ta.setFont(new Font("Arial",Font.BOLD,30));
		ta.setForeground(Color.BLACK);

		sp.add(ta);
		
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String value = tf.getText();
					ta.append(value +"\n");
					tf.setText("");
				}
				

			}
		});

		c.add(tf, BorderLayout.NORTH);
		c.add(sp, BorderLayout.CENTER);

		setSize(400, 500);
		setVisible(true);

	}
	private void init() {
		sp = new ScrollPane();
		ta = new JTextArea("", 5, 20);
		tf = new JTextField("",20);
	}

	public static void main(String[] args) {
		new TextFieldEx();

	}

}
