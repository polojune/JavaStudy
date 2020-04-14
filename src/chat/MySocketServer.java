package chat;
//Ctrl + shift + o : �Ⱦ��� �� �ڵ����� ������

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MySocketServer {

	ServerSocket serverSocket;
	Vector<NewSocketThread> vt;// ��������� ������ ��� ����

	public MySocketServer() throws Exception {
		serverSocket = new ServerSocket(3000);

		while (true) {// ���� �ֱٿ� ������ socket�� ����Ų��
			vt = new Vector<>();
			Socket socket = serverSocket.accept(); // socket�� �����ؾ���
			System.out.println("��û�� ����");

			NewSocketThread nt = new NewSocketThread(socket);
			Thread newWorker = new Thread(nt);// Ÿ���� �����ؾ���
			newWorker.start();// main ������� ��û�� ������ socket�� �����ϰ� ä���� ���ο� �����带 �����ϰ� socket�� �Ѱ��ָ� os���� run�� ���� ��û�ϰ� 
								// socket accept���� ���ο� Ŭ���̾�Ʈ�� ����Ѵ�.
			vt.add(nt);// ���� ������ ������ ��� �Ѵ�. ���������� ������ �� �� �ִ�.
		}

	}

	// ���ο� �����忡�� ���۸� ������ �� �ְ� socket�� ����!!
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
					System.out.println("Ŭ���̾�Ʈ :" + msg);
					for (NewSocketThread newSocketThread : vt) {
						
						if (newSocketThread != this) {
							newSocketThread.bw.write(msg + "\n");// ������ο��� �о� ���� �ʾƼ� ���
							newSocketThread.bw.flush();// ���۸� ���� ����
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
