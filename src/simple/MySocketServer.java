package simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {

	ServerSocket serverSocket; // ���������� �����û�� ����ϴٰ� ������ �Ǹ� ������ �����ϰ� �������Ͽ� ����� ���� ���´�
	Socket socket; // ���������� ������ ������ �޴� ����
	BufferedReader br; // ��Ʈ���� ����Ǹ� BufferedReader�� �����͸� �޴´�

	// throws�� �Լ��� ��� ������ try catch�� �ʿ��� ��� ����ϸ� �ȴ�
	public MySocketServer() throws Exception { // throws �� �Լ��� ȣ���� ��(���⼭�� main)���� ������ ���̴�

		serverSocket = new ServerSocket(15000); // ���� ���� ���� (������ �޴�)
		socket = serverSocket.accept(); // ��û�� ��� - ������ �Ǹ� ������ �����ϰ� �������Ͽ� ����� ���� ���´�
		System.out.println("��û�� ����");
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String msg = "";
		while ((msg = br.readLine()) != null) { // br�� �����͸� �ް� msg�� ���� �� null������ Ȯ���Ѵ�
			System.out.println("���� : " + msg); // ���� �޽����� ����Ѵ�
		}

		// ����� ���� �ν��Ͻ��� �ݴ´�
		br.close();
		socket.close();
		serverSocket.close();
	}

	public static void main(String[] args) {
		
		try { // main�� �Լ��� ȣ�� �߱� ������ ���⼭ Ʈ����ĳġ�� ���
			new MySocketServer(); // ���ϼ��� ���� �޼��� ����;
		} catch (Exception e) {}
	}
}
