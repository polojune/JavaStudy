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
	// 프레임 생성을 위한 JFrame 상속
	// 키보드 이벤트 처리를 위한 KeyListener를 상속
	// 스레드를 돌리기 위한 Runnable 상속

	int f_width = 800;// 생성할 프레임의 넓이 값을 설정합니다.
	int f_height = 600;// 생설할 프레임의 높이 값을 설정합니다.

	int x, y;// 캐릭터의 좌표 변수

	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeySpace = false;// 미사일 발사를 위한 키보드 스페이스키 입력을 추가합니다.

	Thread th; // 스레드 생성

	Toolkit tk = Toolkit.getDefaultToolkit();
	Image me_img;
    Image Missile_img;//미사일 이미지 변수 
    
    ArrayList Missile_List = new ArrayList();
	
	Image buffImage; // 더블 버퍼링용
	Graphics buffg; // 더블 버퍼링용
    
	Missile ms;//미사일 클래스 접근 키
	
	game_Frame() {
		init(); // 나중을 위한 프레임에 들어갈 컴포넌트 세팅 메소등입니다.
		start();// 나중을 위한 기본적인 시작 명령 처리 부분입니다.

		setTitle("슈팅 게임 만들기");// 프레임의 이름을 설정합니다.
		setSize(f_width, f_height);// 프레임의 크기를 위에 값에서 가져와 설정

		Dimension screen = tk.getDefaultToolkit().getScreenSize();
		// 프레임이 윈도위 표시될때 위치를 세팅하기 위해
		// 현재 모니터의 해상도 값을 받아옵니다.

		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		// 프레임을 모니터 화명 정중앙에 배치시키기 위해 좌표 값을 계산합니다.
		setLocation(f_xpos, f_xpos);// 프레임을 화면에 배치
		setResizable(false);// 프레임의 크기를 임의로 변경못하게 설정
		setVisible(true);// 프레임을 눈에 보이게 띄웁니다.
	}

	public void init() { // 나중을 위한 프레임에 들어갈 컴포넌트 세팅 메소드입니다.
		x = 100; // 캐릭터의 최초 좌표.
		y = 100;
		f_width = 800; 
		f_height = 600; 
		
		me_img = tk.getImage("img/sh.png");
		
		Missile_img = tk.getImage("img/m.jpg");
		
	}

	public void start() {// 나중을 위한 기본적인 시작 명령 처리 부분입니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addKeyListener(this); // 키보드 이벤트 실행
		th = new Thread(this); // 스레드 생성
		th.start(); // 스레드 실행

	}

	public void run() { // 스레드가 무한 루프될 부분
		try { // 예외옵션 설정으로 에러 방지
			while (true) { // while 문으로 무한 루프 시키기
				KeyProcess();// 키보드 입력처리를 하여 x,y 갱신
				
				MissileProcess();
				
				repaint(); // 갱신된 x,y값으로 이미지 새로 그리기
				Thread.sleep(20);// 20milli sec로 스레드 돌리기
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
		// 더블버퍼링 버퍼 크기를 화면 크기와 같게 설정
		buffg = buffImage.getGraphics();// 버퍼의 그래픽 객체를 얻기

		update(g);
	}

	public void update(Graphics g) {
		Draw_Char();// 실제로 그려진 그림을 가져온다.

		Draw_Missile();
		
		g.drawImage(buffImage, 0, 0, this);
		// 화면에 버퍼에 그린 그림을 가져와 그리기
	}

	public void Draw_Char() {
		buffg.clearRect(0, 0, f_width, f_height);
		// 0,0에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
		buffg.drawImage(me_img, x, y, this);
		// 프레임에 img에 저장된 이미지를
		// x=100, y=100 좌료로 그려넣습니다.
	}
public void	Draw_Missile() {//미사일 그리는 메소드 
	for (int i = 0; i < Missile_List.size(); i++) {
		//미사일 존재 유무를 확인한다.
		
		ms =(Missile)(Missile_List.get(i));
		//미사일 위치값을 확인
		
		buffg.drawImage(Missile_img, ms.pos.x + 150,ms.pos.y + 30 , this);
		
		ms.move(); 
		
		if(ms.pos.x > f_width) {//미사일이 화면 밖으로 나가면
			Missile_List.remove(i);//미사일 지우기
		}
	}
}
	
	
	public void keyPressed(KeyEvent e) {
		// 키보드가 눌러졌을때 이벤트 처리하는 곳

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
			
		case KeyEvent.VK_SPACE : //스페이스키 입력 처리 
			KeySpace = true; 
			break;

		}

	}

	public void keyReleased(KeyEvent e) {
		// 키보드가 눌러졌다가 떼어졌을때 이벤트 처리하는곳

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
		// 키보드가 타이핑 될때 이벤트 처리하는 곳
	}

	public void KeyProcess() {
		// 실제로 캐릭처 움직임 실현을 위해
		// 위에서 받아들인 키값을 바탕으로
		// 키 입력시마다 5만큼의 이동을 시킨다.

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

class Missile{//미사일 위치 파악 및 이동을 위한 클래스 추가
	 Point pos; //미사일 좌표 변수
	 
	 Missile(int x, int y){//미사일 좌표를 입력 받는 메소드
		 pos = new Point(x,y);//미사일 좌표를 체크
	 }
	 public void move() {//미사일 이동을 위한 메소드
		 pos.x += 10; //x 좌표에 10만큼 미사일 이동
	 }
}

public class game {

	public static void main(String[] args) {
		game_Frame fms = new game_Frame();

	}

}
