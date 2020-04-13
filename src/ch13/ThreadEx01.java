package ch13;

//OS�� Runnable Ÿ���� �� ������ run�޼��带 ȣ���ؾ� �ȴٴ� �� �̹� �˰� ����. 
class Sub implements Runnable { // OS���� Runnable Ÿ���� ���� ã�ƴ޶�� �Ѵ�.

	@Override
	public void run() {// os���� run�� ������� �޶�� ���� ����Ѵ�.
		for (int i = 1; i < 11; i++) {
			System.out.println("���� ������: " + i);
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

	// ���� ������
	public static void main(String[] args) {
		Thread t1 = new Thread(new Sub());// (new Sub())target�� os���� �˷��ش�.
		t1.start();// �����带 �ϳ� ������ Ÿ���� ���� ������ run�� os�� ���� ���ش� .

		for (int i = 1; i < 6; i++) {
			System.out.println("���� ������: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

}
