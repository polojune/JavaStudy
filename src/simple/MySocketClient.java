package simple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MySocketClient {
	
	Socket socket; // ���� ����
	BufferedReader br; // Ű����� ���� �Է��� �޽����� �ޱ����� br
	BufferedWriter bw; // ���� �Է��� �޽����� �������� ������ ���� bw 
	
	public MySocketClient() throws Exception {
		
		//��Ʈ��
		//"localhost" �Ǵ� 127.0.0.1 �� ��ӵ� ���� - �� ��ǻ���� ���� �ּ�
		socket = new Socket("192.168.0.115", 15000); // ���������� accept() �Լ��� ȣ��
		
		// ���� - ���۵������ ����
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		// Ű���� - ���۵帮�� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String msg = "";
		
		// Ű����� �Է��� �޽����� Ȯ���Ͽ� null�� �ƴϸ� bw�� ���� flush
		while ((msg = br.readLine()) != null) {
			bw.write(msg + "\n"); // "\n"�� ���� ���Ͽ��� �о���̱� ���ؼ� �ʿ��� ���̶� ���� ��
			System.out.println("�� �޽��� : " + msg);
			bw.flush(); // ���۴� ������ ������ �÷��� ���� �ʱ� ������ �������� �÷��� �����ش�
		}
		
		// �ν��Ͻ� �ݱ�
		bw.close();
		br.close();
		socket.close();
		
	}
	
	public static void main(String[] args) {
		try {
			new MySocketClient(); // Ŭ���̾�Ʈ �޼��� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
