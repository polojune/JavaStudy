package project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalTime;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

class GameStart extends JFrame /* implements Runnable */ {
	private CharStatus status;
	JFrame loginView = this;
	private JButton b1, b2, b3, b4;
	JScrollPane scrollPane;
	ImageIcon backIcon = null;
	ImageIcon backIcon1 = null;
	ImageIcon characterIcon = null;
	ImageIcon characterIcon1 = null;
	ImageIcon characterIcon2 = null;
	ImageIcon food[];
	ImageIcon zzz[];
	// JLabel lbCharacter;
	private CharacterPanel panel;
	Thread th;
	Calendar c;
	int x, y;
	int foodX, foodY;
	Timer timer;
	Timer zzzTimer;
	Timer foodTimer;
	// 기본상태 0, 밥먹기 1, 운동하기 2, 잠자기 3

	public GameStart() {
		status = new CharStatus();

		foodX = 0;
		foodY = 0;
		x = 150;
		y = 150;
		// th = new Thread(this);
		backIcon = new ImageIcon("img/a.jpg");
		backIcon1 = new ImageIcon("img/night.jpg");
		characterIcon = new ImageIcon("img/k1.png");
		characterIcon1 = new ImageIcon("img/k3.png");
		characterIcon2 = new ImageIcon("img/sleep.png");
		// food = new ImageIcon("img/rice1.png");

//		lbCharacter = new JLabel(characterIcon);
//		lbCharacter.setSize(200, 200);
//		lbCharacter.setLocation(x, y);
		// panel = new CharacterPanel(characterIcon, backIcon, x, y);
		panel = new CharacterPanel(characterIcon, backIcon, status);

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
		// scrollPane = new JScrollPane(panel);
		// setContentPane(scrollPane);

		setTitle("다마고치 만들기");
		// Container c = getContentPane();
		panel.setLayout(null);
		b1 = new JButton("밥먹기");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// panel.setImage(foodIcon);
				if (status.getHungry() < 60) {

					timer.stop();
					foodTimer.start();
					panel.setStatus(1);
					panel.setImage(characterIcon);
					panel.setBackImage(backIcon);
				}
			}
		});

		b2 = new JButton("운동하기");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.start();
				foodTimer.stop();
				panel.setStatus(2);
				panel.setImage(characterIcon1);
				panel.setBackImage(backIcon);
			}
		});
		// b2.addActionListener(new MyActionListener());
		b3 = new JButton("잠자기");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				zzzTimer.start();
				timer.stop();
				panel.setStatus(3);
				panel.setImage(characterIcon2);
				panel.setBackImage(backIcon1);
			}
		});
		b4 = new JButton("14:04:05");

		b1.setBounds(0, 302, 168, 35);
		b2.setBounds(170, 302, 160, 35);
		b3.setBounds(331, 302, 145, 35);
		b4.setBounds(12, 10, 97, 35);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);

		setContentPane(panel);

		setSize(500, 376);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// th.start();
		setVisible(true);

		new CurrentTime(status).runTime(b4);

//		b2.addMouseListener(new MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if (a) {
//					a = false;
//				} else {
//					a = true;
//				}
//				repaint();
//			}
//		});

		timer = new Timer(20, new ActionListener() {
			int delta = 3;

			@Override
			public void actionPerformed(ActionEvent e) {
				// if (chrStatus == 2) {
				if (x > 300) {
					delta = (-1 * delta);
				} else if (x < 0) {
					delta = (-1 * delta);
				}
				x = x + delta;
				// }

				panel.setPos(x, y);
				// panel.foodPos(x, y);
                
			}
		});

		zzzTimer = new Timer(600, new ActionListener() {
			int index = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 2) {
					index = 0;
					status.setSleep(100);

				}
				panel.setZzzIndex(index);
				index++;
				repaint();
			}
		});

		//zzzTimer.start();

		foodTimer = new Timer(1500, new ActionListener() {
			int index = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 2) {
					index = 0;
					foodTimer.stop();
					status.setHungry(100);
					panel.setStatus(0);
				}
				panel.setFoodIndex(index);

				index++;
				repaint();
			}
		});

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

class CharacterPanel extends JPanel {
	private ImageIcon characterImage;
	private ImageIcon backImage;
	private ImageIcon food[];
	private ImageIcon zzz[];
	private int x = 150;
	private int y = 150;
	private int foodX;
	private int foodY;
	private int zzzX;
	private int zzzY;

	private int panelStatus;
	private int zzzIndex;
	private int foodIndex;

	Font font;

	CharStatus status;
//	public CharacterPanel() {
//
//	}

//	public CharacterPanel(ImageIcon icon) {
//		this.characterImage = icon;
//	}

//	public CharacterPanel(ImageIcon icon, ImageIcon backImage, int x, int y) {
//		//super();
//		this.characterImage = icon;
//		this.backImage = backImage;
//		this.x = x;
//		this.y = y;
//	}

	public CharacterPanel(ImageIcon icon, ImageIcon backImage, CharStatus status) {
		// super();
		font = new Font("Gothic", Font.ITALIC, 30);
		int panelStatus = 1;
		this.status = status;
		this.characterImage = icon;
		this.backImage = backImage;

		zzz = new ImageIcon[3];
		for (int i = 0; i < zzz.length; i++) {
			zzz[i] = new ImageIcon("img/z" + i + ".png");

		}
		food = new ImageIcon[3];
		for (int i = 0; i < food.length; i++) {
			food[i] = new ImageIcon("img/rice" + i + ".png");

		}
	}

	public void setStatus(int status) {
		this.panelStatus = status;
	}

	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
		repaint();
	}

	public void foodPos(int x, int y) {
		this.foodX = x;
		this.foodY = y;
		repaint();
	}

	public void setImage(ImageIcon icon) {
		this.characterImage = icon;
		repaint();
	}

	public void setBackImage(ImageIcon icon) {
		this.backImage = icon;
		repaint();
	}

	public void setZzzIndex(int zzzIndex) {
		this.zzzIndex = zzzIndex;
	}

	public void setFoodIndex(int foodIndex) {
		this.foodIndex = foodIndex;
	}

	public void paintComponent(Graphics g) {
		// super.paintComponent(g);
		// System.out.println("x, y :" + this.x + " " + this.y);
		setFont(font);

		g.drawImage(backImage.getImage(), 0, 0, null);
		g.drawImage(characterImage.getImage(), x, y, 150, 150, null);
		g.drawString("체력 : " + status.getHungry(), 350, 30);
		g.drawString("운동 : " + status.getFun() + "", 350, 60);
		g.drawString("수면 : " + status.getSleep() + "", 340, 90);

		if (panelStatus == 1) {
			g.drawImage(food[foodIndex].getImage(), 20, 60, 100, 100, null);
		}
		if (panelStatus == 3) {
			g.drawImage(zzz[zzzIndex].getImage(), x + 100, y - 100, 150, 150, null);
		}

//		if(a) {
//			 g.drawImage(characterIcon.getImage(), 150, 150, 150, 150, null); }else {
//			 g.drawImage(characterIcon1.getImage(), 150, 150, 150, 150, null); }
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
		new GameStart();

	}

}
