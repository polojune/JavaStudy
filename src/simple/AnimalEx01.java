package simple;

abstract class Animal {  // abstract �� �߻� Ŭ����, new�� ȣ������ ����
	
	// �������̵� �Ϸ��� ���� �޼��尡 �ʿ��ϴ�.
	abstract String getName(); // �߻� �޼���, ���� ���ε� �뵵
}


class Mouse extends Animal {

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Dog extends Animal {
	final String NAME = "������";
	
	// �������̵�
	String getName() {
		return NAME;
	}
}

class Cat extends Animal {
	final String NAME = "�����";
	
	// �������̵�
	String getName() {
		return NAME;
	}
}

class Bird extends Animal {
	final String NAME = "��";

	// �������̵�
	String getName() {
		return NAME;
	}
}

public class AnimalEx01 {
	
	
	// �Ű������� Animal Ÿ������ ������ Dog Cat Bird�� ������ ��ĳ������ �ȴ�.
	// Animal���� NAME�� ������ �������� ���. 
	// �װ��� �ذ� �Ϸ��� �������̵��� ����Ѵ�.
	// ���� ȣ���� �ڷ��� �����̴�.
	// �Լ�(�޼���)ȣ���� ������ �����̴�.(�������̵�)
	// �ڽ��� �������̵��� ã�� �������� ���� ���� ���ε��̶�� �Ѵ�.
	static void attack(Animal u1, Animal u2) {
		System.out.println(u2.getName() + "�� " + u1.getName() + "���� ���� ���߽��ϴ�.");
	}

	public static void main(String[] args) {

		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();

		System.out.println(d1.NAME + "ź��");
		System.out.println(c1.NAME + "ź��");
		System.out.println(b1.NAME + "ź��");

		// ������ vs �����
		attack(d1, c1);

		// ������ vs ��
		attack(d1, b1);

		// ����� vs ��
		attack(c1, b1);

	}

}
