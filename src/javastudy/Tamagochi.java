package javastudy;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

class LoginView extends JFrame /* implements Runnable */ {
	JFrame loginView = this;
	private JButton b1, b2, b3, b4;
	JScrollPane scrollPane;
	ImageIcon backIcon = null;
	ImageIcon characterIcon = null;
	ImageIcon characterIcon1 = null;
	JLabel lbCharacter;
	private CharacterPanel panel;
	Thread th;
	Calendar c;
	int x, y;
	boolean a = true;

	public LoginView() {
		x = 150;
		y = 150;
		// th = new Thread(this);
		backIcon = new ImageIcon("img/a.jpg");
		characterIcon = new ImageIcon("img/k1.png");
		characterIcon1 = new ImageIcon("img/k2.png");

		lbCharacter = new JLabel(characterIcon);
		lbCharacter.setSize(200, 200);
		lbCharacter.setLocation(x, y);
		panel = new CharacterPanel(characterIcon, backIcon, x, y);

		/*
		 * panel = new JPanel() { public void paintComponent(Graphics g) {
		 * super.paintComponent(g); g.drawImage(backIcon.getImage(), 0, 0, null);
		 * 
		 * //g.drawImage(lbCharacter, x, y, 150, 150); if(a) {
		 * //g.drawImage(characterIcon.getImage(), 150, 150, 150, 150, null); }else {
		 * g.drawImage(characterIcon1.getImage(), 150, 150, 150, 150, null); }
		 * 
		 * } };
		 */
		// panel.add(lbCharacter);
		scrollPane = new JScrollPane(panel);
		setContentPane(scrollPane);

		setTitle("다마고치 만들기");
		// Container c = getContentPane();
		panel.setLayout(null);
		b1 = new JButton("밥먹기");
		b2 = new JButton("운동하기");
		// b2.addActionListener(new MyActionListener());
		b3 = new JButton("잠자기");
		b4 = new JButton("14:04:05");

		b1.setBounds(0, 302, 168, 35);
		b2.setBounds(170, 302, 160, 35);
		b3.setBounds(331, 302, 145, 35);
		b4.setBounds(12, 10, 97, 35);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);

		// panel.add(panel);

		setSize(500, 376);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// th.start();
		setVisible(true);

		new CurrentTime().runTime(b4);

		b2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (a) {
					a = false;
				} else {
					a = true;
				}
				repaint();
			}
		});

		Timer timer = new Timer(20, new ActionListener() {
			int delta = 3;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (x > 300) {
					delta = (-1 * delta);
				} else if (x < 0) {
					delta = (-1 * delta);
				}

				x = x + delta;

				panel.setPos(x, y);

			}
		});
		timer.start();
	}

//	class MyActionListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton) e.getSource(); // 이벤트 소스 버튼 알아내기
//			if (b.getText().equals("운동하기")) {
//				a = true;
//				System.out.println("test");
//			} else
//				a = false;
//		}
//	}

	class CharacterPanel extends JPanel {
		private ImageIcon characterImage;
		private ImageIcon backImage;
		private int x;
		private int y;

		public CharacterPanel() {

		}

		public CharacterPanel(ImageIcon icon) {
			this.characterImage = icon;
		}

		public CharacterPanel(ImageIcon icon, ImageIcon backImage, int x, int y) {
			//super();
			this.characterImage = icon;
			this.backImage = backImage;
			this.x = x;
			this.y = y;
		}

		public void setPos(int x, int y) {
			this.x = x;
			this.y = y;
			repaint();
		}

		public void setImage(ImageIcon icon) {
			this.characterImage = icon;
		}

		public void paintComponent(Graphics g) {
			// System.out.println("paintComponent 실행");
			g.drawImage(backImage.getImage(), 0, 0, null);
			g.drawImage(characterImage.getImage(), x, y, 150, 150, null);
			if(a) {
				 g.drawImage(characterIcon.getImage(), 150, 150, 150, 150, null); }else {
				 g.drawImage(characterIcon1.getImage(), 150, 150, 150, 150, null); }
		}
	}
//	@Override
//	public void run() {
//		while (true) {
//
//	        c = Calendar.getInstance();
//			b4.setText(c.get(Calendar.HOUR) + ":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
//			repaint();
//
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//
//			}
//
//		}
//
//	}

}

class CurrentTime {

	public void runTime(JButton button) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					Calendar c = Calendar.getInstance();
					button.setText(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
				}

			}
		}).start();
	}

}

//class MovingThread {
//
//	MovingThread(ImageIcon characterIcon) {
//
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				while (true) {
//
//				}
//
//			}
//		}).start();
//	}
//}

public class Tamagochi {

	public static void main(String[] args) {
		new LoginView();

	}

}
