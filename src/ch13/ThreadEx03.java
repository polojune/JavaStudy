package ch13;

interface Callback {
	void printMoney(int money);
}

class MoneyChange {
	int money = 10000;

	public void accept(Callback callback) {
		// 은행에 인출 요청을 해서 20000원을 받을 예정 2초!!

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000;
					callback.printMoney(money); // =>여기서 callback 함수를 실행 시킴
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();// =>main이 실행 시켜준다.

	}
}

public class ThreadEx03 {

	public static void main(String[] args) {

		MoneyChange mc = new MoneyChange();

		mc.accept(new Callback() { // callback 함수는 main에서 제어를 하지만 실행은 다른 쓰레드에서 한다.
			@Override
			public void printMoney(int money) {
				System.out.println("통장의 잔액은:" + money);

			}
		});
		for (int i = 1; i < 6; i++) {
			System.out.println("메인쓰레드:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
