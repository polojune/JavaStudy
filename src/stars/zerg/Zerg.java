package stars.zerg;

import stars.Behavior;

public abstract class Zerg implements Behavior {
	public void move() {
		System.out.println("�̵�");
	}

	public void repair() {
		System.out.println("�ڿ� ġ��");

	}

	//public abstract void attack();
	
	public static void upgrade() {
		Ultra.attack++;
		Hydra.attack++;
		System.out.println("���� ���׷��̵� �Ϸ�");
	}
}
