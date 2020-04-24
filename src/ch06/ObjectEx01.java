package ch06;

class Animal {
	@Override
	public int hashCode() { //�ּҰ� ���� ������ �Ϸ��� ������ �ϸ� ��

		return super.hashCode();
	}
}

public class ObjectEx01 {

	public static void main(String[] args) {
		String d1 = "��";
		String d2 = "��";

		System.out.println(d1.equals(d2));
		System.out.println(d1 == d2);

		String d3 = new String("��");
		String d4 = new String("��");

		System.out.println(d3.equals(d4));
		System.out.println(d3 == d4);

		System.out.println(d3.getClass());
		System.out.println(new ObjectEx01().getClass());

		// �ؽ��ڵ� ->�ؽ� �˰��� = ������ ������ ���ڷ� ����
		System.out.println(d3.hashCode());// String�� �ؽ��ڵ� ���� ���̸� ���� �ڵ尡 ������ ����� ����
		System.out.println(d4.hashCode());

		Animal a1 = new Animal();
		Animal a2 = new Animal();

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	
	    System.out.println(a1 instanceof Animal);
	    System.out.println(a2 instanceof Animal);
	}

}
