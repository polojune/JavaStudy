package ch05;

class A {
	void run() {
		System.out.println("A �޸���.");
	}
}

class B extends A {

	void run() {
		System.out.println("B �޸���.");
	}
}

class C extends B {
    String name = "C";
	@Override
	void run() {
		System.out.println(name + "�޸���.");
	}
}

public class OverrideEx01 {

	public static void main(String[] args) {
        A a1 = new C();
	    a1.run();
	}

}
