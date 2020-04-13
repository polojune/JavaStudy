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
		System.out.println("금액 다운로드 종료");
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {
         System.out.println("프로그램 시작");
         System.out.println("-------------");
        
         DownLoadThread dt = new DownLoadThread();
         Thread t1 = new Thread(dt);
         t1.start();
         
         System.out.println("금액은:" + dt.data);
	}

}
