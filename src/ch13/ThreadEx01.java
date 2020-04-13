package ch13;

//OS는 Runnable 타입의 힙 공간에 run메서드를 호출해야 된다는 걸 이미 알고 있음. 
class Sub implements Runnable { // OS에게 Runnable 타입의 힙을 찾아달라고 한다.

	@Override
	public void run() {// os에게 run만 실행시켜 달라고 서로 약속한다.
		for (int i = 1; i < 11; i++) {
			System.out.println("서브 쓰레드: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class ThreadEx01 {

	// 메인 쓰레드
	public static void main(String[] args) {
		Thread t1 = new Thread(new Sub());// (new Sub())target을 os에게 알려준다.
		t1.start();// 쓰레드를 하나 더만들어서 타겟을 실행 시켜줘 run을 os가 실행 해준다 .

		for (int i = 1; i < 6; i++) {
			System.out.println("메인 쓰레드: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

}
