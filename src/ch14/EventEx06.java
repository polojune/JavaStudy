package ch14;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventEx06 extends JFrame {

	int imgX = 280;
	int imgY = 10;

	public EventEx06() {
		setTitle("장풍예제");
		setSize(700, 300);
		setLocationRelativeTo(null);// 프레임이 화면 가운데 배치
		setContentPane(new MyPanel());

		setVisible(true);
	}

	// paintComponent 함수는 JFrame 안에서 작동 안함.
	class MyPanel extends JPanel {

		public MyPanel() {
			setFocusable(true); //포커스를 만들어 준다.
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("keycode:" + e.getKeyCode());
					System.out.println("keychar:" + e.getKeyChar());

					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT: // 0x25
						imgX = imgX - 10;
						break;
					case KeyEvent.VK_RIGHT: // 0x27
						imgX = imgX + 10;
						break;
					case KeyEvent.VK_SPACE: // 0x20
						new Thread(new Runnable() {

							@Override
							public void run() {
								int time = 5;
								while (time > 0) {
									imgX = imgX + 500;
									time--;
									try {
										Thread.sleep(100);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									repaint();
								}

							}
						}).start();
						break;

					}
					repaint();
				}

			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			ImageIcon imgRyu = new ImageIcon("img/ryu1.png");
			ImageIcon imgPa = new ImageIcon("img/pa1.png");

			// 이미지 추출
			Image ryu1 = imgRyu.getImage();
			Image pa1 = imgPa.getImage();

			g.drawImage(ryu1, 0, 0, null);
			g.drawImage(pa1, imgX, imgY, null);

		}
	}

	public static void main(String[] args) {
		new EventEx06();
	}

}
