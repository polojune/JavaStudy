package simple;

class Car {

	void run() {
		System.out.println("�⺻ ������");
	}

}

class Sonata extends Car {

	// �������̵� : �θ� Ŭ������ �޼��带 ��ȿȭ ��Ű�� �� (������� �ٸ��ٴ� ���� ����)
	// [�����!!]�� �θ� �޼��带 �����Ѵ�!
	// ���� ���ε� (C������ ���� �ε� �̶�� �Ѵ�)
	@Override // ������̼�
	void run() {
		super.run(); // super�� �θ��� heap
		System.out.println("�ҳ�Ÿ���� ������");
	}
}

public class CarEx01 {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.run();

		System.out.println("----------");

		Car s1 = new Sonata();
		s1.run();

	}

}
