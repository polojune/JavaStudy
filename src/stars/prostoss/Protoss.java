package stars.prostoss;

import stars.Behavior;

public abstract class Protoss implements Behavior {
	@Override
	public void move() {
		System.out.println("�̵�");

	}

	@Override
	public void repair() {
		System.out.println("�ǵ� ġ��");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("�����佺   ���׷��̵� �Ϸ�");
	}
}
