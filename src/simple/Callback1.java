package simple;

interface Callback { // �Լ��� �Ű������� �ѱ�� ���� ��¿�� ���� ���� �������̽�
	void printmoney(int money);
}

class MoneyChange {
	int money = 10000;

	public void accept(Callback callback) {
		// ���࿡ �����û���ؼ� 2������ ���� ���� 2��
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000;
					callback.printmoney(money);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}

public class Callback1 {
	public static void main(String[] args) {
		
		MoneyChange mc = new MoneyChange();
		
		Callback cb1 = new Callback() {
			
			@Override
			public void printmoney(int money) {
				System.out.println("���� �ܾ� : " + money);
				
			}
		};
		
		// �ٸ� �����忡 �Լ��� �ѱ��
		mc.accept(cb1);
		
		for (int i = 1; i < 6; i++) {
			System.out.println("���ξ����� : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
