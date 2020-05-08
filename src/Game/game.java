package Game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

class game_Frame extends JFrame implements KeyListener, Runnable {
	// ������ ������ ���� JFrame ���
	// Ű���� �̺�Ʈ ó���� ���� KeyListener�� ���
	// �����带 ������ ���� Runnable ���

	int f_width = 800;// ������ �������� ���� ���� �����մϴ�.
	int f_height = 600;// ������ �������� ���� ���� �����մϴ�.

	int x, y;// ĳ������ ��ǥ ����

	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeySpace = false;// �̻��� �߻縦 ���� Ű���� �����̽�Ű �Է��� �߰��մϴ�.

	Thread th; // ������ ����

	Toolkit tk = Toolkit.getDefaultToolkit();
	Image me_img;
    Image Missile_img;//�̻��� �̹��� ���� 
    
    ArrayList Missile_List = new ArrayList();
	
	Image buffImage; // ���� ���۸���
	Graphics buffg; // ���� ���۸���
    
	Missile ms;//�̻��� Ŭ���� ���� Ű
	
	game_Frame() {
		init(); // ������ ���� �����ӿ� �� ������Ʈ ���� �޼ҵ��Դϴ�.
		start();// ������ ���� �⺻���� ���� ��� ó�� �κ��Դϴ�.

		setTitle("���� ���� �����");// �������� �̸��� �����մϴ�.
		setSize(f_width, f_height);// �������� ũ�⸦ ���� ������ ������ ����

		Dimension screen = tk.getDefaultToolkit().getScreenSize();
		// �������� ������ ǥ�õɶ� ��ġ�� �����ϱ� ����
		// ���� ������� �ػ� ���� �޾ƿɴϴ�.

		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		// �������� ����� ȭ�� ���߾ӿ� ��ġ��Ű�� ���� ��ǥ ���� ����մϴ�.
		setLocation(f_xpos, f_xpos);// �������� ȭ�鿡 ��ġ
		setResizable(false);// �������� ũ�⸦ ���Ƿ� ������ϰ� ����
		setVisible(true);// �������� ���� ���̰� ���ϴ�.
	}

	public void init() { // ������ ���� �����ӿ� �� ������Ʈ ���� �޼ҵ��Դϴ�.
		x = 100; // ĳ������ ���� ��ǥ.
		y = 100;
		f_width = 800; 
		f_height = 600; 
		
		me_img = tk.getImage("img/sh.png");
		
		Missile_img = tk.getImage("img/m.jpg");
		
	}

	public void start() {// ������ ���� �⺻���� ���� ��� ó�� �κ��Դϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addKeyListener(this); // Ű���� �̺�Ʈ ����
		th = new Thread(this); // ������ ����
		th.start(); // ������ ����

	}

	public void run() { // �����尡 ���� ������ �κ�
		try { // ���ܿɼ� �������� ���� ����
			while (true) { // while ������ ���� ���� ��Ű��
				KeyProcess();// Ű���� �Է�ó���� �Ͽ� x,y ����
				
				MissileProcess();
				
				repaint(); // ���ŵ� x,y������ �̹��� ���� �׸���
				Thread.sleep(20);// 20milli sec�� ������ ������
			}

		} catch (Exception e) {

		}


	}//run
	
	public void MissileProcess() {
		if(KeySpace) { 
			    ms = new Missile(x,y); 
			    Missile_List.add(ms);
		}
	}

	public void paint(Graphics g) {
		buffImage = createImage(f_width, f_height);
		// ������۸� ���� ũ�⸦ ȭ�� ũ��� ���� ����
		buffg = buffImage.getGraphics();// ������ �׷��� ��ü�� ���

		update(g);
	}

	public void update(Graphics g) {
		Draw_Char();// ������ �׷��� �׸��� �����´�.

		Draw_Missile();
		
		g.drawImage(buffImage, 0, 0, this);
		// ȭ�鿡 ���ۿ� �׸� �׸��� ������ �׸���
	}

	public void Draw_Char() {
		buffg.clearRect(0, 0, f_width, f_height);
		// 0,0���� ������ ���� �ػ� ũ�⸸ŭ ȭ���� ����ϴ�.
		buffg.drawImage(me_img, x, y, this);
		// �����ӿ� img�� ����� �̹�����
		// x=100, y=100 �·�� �׷��ֽ��ϴ�.
	}
public void	Draw_Missile() {//�̻��� �׸��� �޼ҵ� 
	for (int i = 0; i < Missile_List.size(); i++) {
		//�̻��� ���� ������ Ȯ���Ѵ�.
		
		ms =(Missile)(Missile_List.get(i));
		//�̻��� ��ġ���� Ȯ��
		
		buffg.drawImage(Missile_img, ms.pos.x + 150,ms.pos.y + 30 , this);
		
		ms.move(); 
		
		if(ms.pos.x > f_width) {//�̻����� ȭ�� ������ ������
			Missile_List.remove(i);//�̻��� �����
		}
	}
}
	
	
	public void keyPressed(KeyEvent e) {
		// Ű���尡 ���������� �̺�Ʈ ó���ϴ� ��

		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			KeyUp = true;
			break;

		case KeyEvent.VK_DOWN:
			KeyDown = true;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = true;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = true;
			break;
			
		case KeyEvent.VK_SPACE : //�����̽�Ű �Է� ó�� 
			KeySpace = true; 
			break;

		}

	}

	public void keyReleased(KeyEvent e) {
		// Ű���尡 �������ٰ� ���������� �̺�Ʈ ó���ϴ°�

		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			KeyUp = false;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = false;
		case KeyEvent.VK_LEFT:
			KeyLeft = false;
		case KeyEvent.VK_RIGHT:
			KeyRight = false;
			break;
		case KeyEvent.VK_SPACE:
			KeySpace = false;
			break;

		}
	}

	public void keyTyped(KeyEvent e) {
		// Ű���尡 Ÿ���� �ɶ� �̺�Ʈ ó���ϴ� ��
	}

	public void KeyProcess() {
		// ������ ĳ��ó ������ ������ ����
		// ������ �޾Ƶ��� Ű���� ��������
		// Ű �Է½ø��� 5��ŭ�� �̵��� ��Ų��.

		if (KeyUp == true)
			y -= 5;
		if (KeyDown == true)
			y += 5;
		if (KeyLeft == true)
			x -= 5;
		if (KeyRight == true)
			x += 5;
	}
}

class Missile{//�̻��� ��ġ �ľ� �� �̵��� ���� Ŭ���� �߰�
	 Point pos; //�̻��� ��ǥ ����
	 
	 Missile(int x, int y){//�̻��� ��ǥ�� �Է� �޴� �޼ҵ�
		 pos = new Point(x,y);//�̻��� ��ǥ�� üũ
	 }
	 public void move() {//�̻��� �̵��� ���� �޼ҵ�
		 pos.x += 10; //x ��ǥ�� 10��ŭ �̻��� �̵�
	 }
}

public class game {

	public static void main(String[] args) {
		game_Frame fms = new game_Frame();

	}

}
