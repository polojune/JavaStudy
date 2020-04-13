package ch13;

interface Callback {
	void printMoney(int money);
}

class MoneyChange {
	int money = 10000;

	public void accept(Callback callback) {
		// ���࿡ ���� ��û�� �ؼ� 20000���� ���� ���� 2��!!

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000;
					callback.printMoney(money);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();// =>main�� ���� �����ش�.

	}
}

public class ThreadEx03 {

	public static void main(String[] args) {

		MoneyChange mc = new MoneyChange();

		mc.accept(new Callback() {

			@Override
			public void printMoney(int money) {
				System.out.println("������ �ܾ���:" + money);

			}
		});
		for (int i = 1; i < 6; i++) {
			System.out.println("���ξ�����:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
