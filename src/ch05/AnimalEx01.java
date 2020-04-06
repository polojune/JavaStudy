package ch05;

abstract class Animal {

	abstract String getName();

}

class Lion extends Animal {
	final String NAME = "사자";

	@Override
	String getName() {

		return NAME;
	}

}

class Dog extends Animal {
	final String NAME = "강아지";

	@Override
	String getName() {

		return NAME;

	}
}

class Cat extends Animal {
	final String NAME = "고양이";

	@Override
	String getName() {

		return NAME;
	}

}

class Bird extends Animal {
	final String NAME = "새";

	@Override
	String getName() {

		return NAME;
	}
}

public class AnimalEx01 {

	static void attack(Animal u1, Animal u2) {
		System.out.println(u2.getName() + "가 " + u1.getName() + "에게 공격당했습니다.");

	}

	public static void main(String[] args) {
		Lion l1 = new Lion();
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();

		System.out.println(l1.NAME + " 탄생");
		System.out.println(d1.NAME + " 탄생");
		System.out.println(c1.NAME + " 탄생");
		System.out.println(b1.NAME + " 탄생");

		// 강아지 vs 고양이
		attack(d1, c1);

		// 강아지 vs 새
		attack(d1, b1);
		// 고양이 vs 새
		attack(c1, b1);

		attack(l1, d1);
	}

}
