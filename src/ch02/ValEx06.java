package ch02;

class Person {
	String name = "È«±æµ¿";
	int age = 30;
	char gender = '³²';
	String email = "qwer@naver.com";
	String phone = "01012345678";

}

public class ValEx06 {

	public static void main(String[] args) {
		Person a = new Person();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.gender);
		System.out.println(a.email);
		System.out.println(a.phone);
	}

}
