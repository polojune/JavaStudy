package chatv4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class SocketServer {

	ServerSocket serverSocket;
	Vector<SocketThread> vc;

	public SocketServer() {
		try {
			// 서버 소켓 생성 65536번 중에 0~1023(well known port)를 제외
			serverSocket = new ServerSocket(20000);
			vc = new Vector<>();

			while (true) {
				System.out.println("요청대기");
				Socket socket = serverSocket.accept(); // 클라이언트 요청을 받음.
				System.out.println("요청받음");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 소켓정보 + 타겟(run) + 식별자(id)
	class SocketThread extends Thread {

		Socket socket;
		String id;
		BufferedReader reader;
		PrintWriter writer;

		public SocketThread(Socket socket) {
			this.socket = socket;
		}

		// List:
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				writer = new PrintWriter(socket.getOutputStream(), true);

				writer.println("please Sign in");
				id = reader.readLine();
				System.out.println("요거 실행됨");
				System.out.println(id);
				String line = null;
				while ((line = reader.readLine()) != null) {
					router(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void router(String line) {
			String[] gubun = line.split(":"); // ALL:안녕 , MSG:white:안녕
			String protocol = gubun[0];
			if (protocol.equals(ChatProtocol.ALL)) {
				String msg = gubun[1];
				allChat(msg);

			} else if (protocol.equals(ChatProtocol.MSG)) {
				String otherId = gubun[1];
				String msg = gubun[2];
				privateChat(otherId, msg);

			}
		}

		public void allChat(String msg) {
			System.out.println(id + ":" + "msg" + "ip:" + socket.getInetAddress());
			for (SocketThread socketThread : vc) {
				socketThread.writer.println(id + ":" + msg);
			}
		}

		public void privateChat(String otherId, String msg) {
			System.out.println(id + ":" + msg + "ip:" + socket.getInetAddress());
			for (SocketThread socketThread : vc) {
				if (socketThread.id.equals(otherId)) {
					socketThread.writer.println(id + ":" + msg);
				} else {
					writer.println("아이디를 찾을 수 없습니다.");
				}
			}

		}

	}

	public static void main(String[] args) {
		new SocketServer();
	}

}
