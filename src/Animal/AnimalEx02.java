package Animal;

interface Animal {
	void run();

	void sound();
}

class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("�������� �޸���.");

	}

	@Override
	public void sound() {
		System.out.println("�۸�");
	}

}

class Bird implements Animal {

	@Override
	public void run() {
		System.out.println("���� �޸���.");

	}

	@Override
	public void sound() {
		System.out.println("±±");

	}

	public void fly() {
		System.out.println("���� ����.");
	}
}

public class AnimalEx02 {

	static void start(Animal a) {
		a.run();
		a.sound();
		if (a instanceof Bird) {
			// fly �޼��带 �������̶�� �� Ȯ��
			((Bird) a).fly();
		}

	}

	public static void main(String[] args) {
		start(new Dog());
		start(new Bird());

	}

}
