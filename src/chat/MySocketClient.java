package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//���� �����带 ���� Ű���� �Է´�� 
//�ٸ� ������� �б�
import java.net.Socket;

public class MySocketClient {

	Socket socket;

	public MySocketClient() throws Exception {
		socket = new Socket("192.168.0.19", 3000);
		ReadThread rt = new ReadThread();
		Thread newWorker = new Thread(rt);
		newWorker.start();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// ���� ������ ����

		BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in));

		String outputMsg = "";

		// ���ξ������ ���⼭ ���� ����
		while ((outputMsg = keyboardIn.readLine()) != null) {
			bw.write(outputMsg + "\n");
			bw.flush();

		}

	}

	class ReadThread implements Runnable {
		@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String inputMsg = "";
				while ((inputMsg = br.readLine()) != null) {
					System.out.println("����:" + inputMsg);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
