package ch13;

class DownLoadThread implements Runnable {

	int data = 10000;

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data = data + 20000;
		System.out.println("�ݾ� �ٿ�ε� ����");
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {
         System.out.println("���α׷� ����");
         System.out.println("-------------");
        
         DownLoadThread dt = new DownLoadThread();
         Thread t1 = new Thread(dt);
         t1.start();
         
         System.out.println("�ݾ���:" + dt.data);
	}

}
