package chat;
//Ctrl + shift + o : 안쓰는 것 자동으로 지워줌

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MySocketServer {

	ServerSocket serverSocket;
	Vector<NewSocketThread> vt;// 만들어지는 소켓을 담기 위해

	public MySocketServer() throws Exception {
		serverSocket = new ServerSocket(3000);

		while (true) {// 가장 최근에 생성된 socket을 가리킨다
			vt = new Vector<>();
			Socket socket = serverSocket.accept(); // socket을 관리해야함
			System.out.println("요청이 들어옴");

			NewSocketThread nt = new NewSocketThread(socket);
			Thread newWorker = new Thread(nt);// 타겟을 지정해야함
			newWorker.start();// main 쓰레드는 요청이 들어오면 socket을 생성하고 채팅을 새로운 쓰레드를 생성하고 socket을 넘겨주며 os에게 run을 실행 요청하고 
								// socket accept에서 새로운 클라이언트를 대기한다.
			vt.add(nt);// 동시 접근을 막을때 사용 한다. 순차적으로 접근을 할 수 있다.
		}

	}

	// 새로운 쓰레드에게 버퍼를 연결할 수 있게 socket을 전달!!
	class NewSocketThread implements Runnable {

		Socket socket;
		BufferedReader br;
		BufferedWriter bw;

		public NewSocketThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				String msg = "";
				while ((msg = br.readLine()) != null) {
					System.out.println("클라이언트 :" + msg);
					for (NewSocketThread newSocketThread : vt) {
						
						if (newSocketThread != this) {
							newSocketThread.bw.write(msg + "\n");// 리드라인에서 읽어 지지 않아서 사용
							newSocketThread.bw.flush();// 버퍼를 비우기 위해
						}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
          try {
			new MySocketServer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
