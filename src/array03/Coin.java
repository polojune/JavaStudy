package array03;

//���� ������ ������ ���ϴ� ���α׷�(500,100,50,10)
//2680
public class Coin {
	public static void main(String[] args) {
		int money = 5555;
		int count = 0;
		int coin[] = { 500, 100, 50, 10,1 };

		System.out.println("���۱ݾ�:" + money);

		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			money = money % coin[i];

			System.out.println(coin[i]+"�� ���� : " + count);
			System.out.println("���� �ݾ�:" + money);
		}

		
	}

}
