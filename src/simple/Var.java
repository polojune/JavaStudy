package simple;


public class Var {
	int num = 1;
	
	public Var() {
		
	}

	// ������ �ڷḦ ��� ���̴�

	public static void main(String[] args) {

		// �⺻ �ڷ��� ������ int, char ���� �ڷḦ ��´�
		
		int one = 0;
		
		
		// �⺻�ڷ����� �޼��尡 ����
		
		// one.
		
		
		// String�� �⺻�ڷ����� Ŭ����Ÿ���� �Ӽ��� ��� ������ �ִ�
		// new�� ���� �ʾƵ� ������, �ν��Ͻ������� �����͸� ������ ���ִ�
		
		String root; //����
		
		root = "����"; // �ʱ�ȭ
		
		root = "����"; // ������ ����
		
		
		// String�� �޼��带 �������ִ�
		System.out.println(root.substring(0,1));
		
		
		
		// �⺻���� �ν��Ͻ� �������
		
		Var test0 = new Var();
		
		test0.num = 2;
		
		
		
		
		// final�� ������ '�ʱ�ȭ' ���� ���� ������ �� ����
		
		final String fruit;
		
		fruit = "���";
		
		//fruit = "������";
		
		
		// �� ���ο� �ΰ��� ������ ���� �� �� �ִ�.
		int n1, n2;

		int ����1 = 1;

		char ����1 = '��';

		
		
	
		// ���� �ڷ��� ���� String, ArrayList, Ŭ����Ÿ��, Integer, Character

		// ���۷��� ����

		// ���� �ڷ��� ������ �ּҸ� ��´�. �ּҸ� ã�ư��� ���� ���� �ִ�
		
		

		Var test = new Var();
		
		Var test1 = test; // test �� �ּҸ� test1 �� �޴´�
		
		
		System.out.println(����1);

		System.out.println(����1);

		System.out.println(test + " <- test��� ���۷��� ����, �ּҰ� ��µȴ� ");
		
		System.out.println(test1 + " <- test�� ���� �ּҰ� ��µȴ�");
		
		System.out.println(new Var() + " <- ���� ������� �ν��Ͻ�");
		
		System.out.println(new Var() + " <- �ڵ忡�� 1ȸ�� ����� ��� �̷��� ����");
		
		System.out.println(test.num);
		
		System.out.println(new Var().num); 
		
		// new �� ������� �Ǿ��ִٰ� ��ü�� �ƴ϶�� ���� �� �� ������
		// new Var() ��ü�� ��ü(�ν��Ͻ�)��
		
		
		// 2 > 1 �� ����������� �ᱹ �ѵ��, true�� �ȴ�
		System.out.println(true);
		
		System.out.println(2 > 1);
		
		
		

		
		
		
		
//		1. class - �߻����� ���赵, �Ǵ� ��ü���� ���赵
//
//		�߻� Ŭ���� - ���� - ����� ����ؼ� �� ������ Ư���� ���ø� �� ������ ������ ���� �� ���°�
//
//				ex) ������ ������ ��ü�������� ���� ��ü�� �ƴϴ�
//
//		��ü Ŭ���� - ���� - ����� ����� �� �ְ� �������� ��Ȯ�ϴ�
//
//
//
//		2. Object - ������ ������ �� �ִ� ���� ��� - ������� ���ڸ� �Ӹ� ������ ���(��ü Ŭ����)
//
//
//
//		3. Instance - Ŭ������ ���� Object�� ��üȭ �� �� - ������� ���� (new)
		
		
		//https://npcore.tistory.com/18

	}

}






























