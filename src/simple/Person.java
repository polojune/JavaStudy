package simple;

// ���¿� �ൿ
public class Person {

	String name;
	String job;
	int age;
	char gender;
	String bloodType;

	// ����Ʈ ������(��� ȣ��� - �����Ϸ��� �ڵ����θ�����ش�) - �ʱ�ȭ �뵵
	// �����ڸ� �������� ����ٸ� ����Ʈ �����ڸ� ����� ���� �ʴ´�.
	// �Ű������� ����
	public Person() { // �Լ��� ����ϰ� �������� ù���ڰ� �빮�ڸ� Ŭ�����̸��� ����.

	}

	// �����ε�(�Լ����� ���Ƶ� �Ű������� �ٸ��� �ٸ� �Լ��� �ν��Ѵ�)
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}

}