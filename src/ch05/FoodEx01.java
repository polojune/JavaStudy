package ch05;

//�߻�Ŭ������ �߻� �޼��带 ���� �� ����.
abstract class Food1 {
	abstract void eat();

}

class ���1 extends Food1 {

	String name = "���";

	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");

	}

}

class �Ұ��1 extends Food1 {

	String name = "�Ұ��";

	@Override

	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");

	}

}

class ����1 extends Food1 {

	String name = "����";

	@Override
	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�.");

	}

}

public class FoodEx01 {

	static void start(Food1 f) {
		f.eat();
	}

	public static void main(String[] args) {
		start(new �Ұ��1());

	}

}
