package ch02;

class ���� {
	String name = "����";
	String color = "���";
	int speed = 100;
	char gender = '��';
}

public class ValEx05 {
	static int num = 10;

	public static void main(String[] args) {
		System.out.println("���� ���� �غ�");
		System.out.println(ValEx05.num);

		���� a = new ����();
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.speed);
		System.out.println(a.gender);
	}

}
