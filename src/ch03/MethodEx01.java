package ch03;

public class MethodEx01 {

	static int add(int n1, int n2) {
		int result = n1 + n2;
		// System.out.println("result:" + result);
		return result;// return ���� ��������!!
	}

	// minus(�Ű������� int�� �ΰ�)(return�� int��)

	static int minus(int n1, int n2) {
		int result = n1 - n2;

		return result;
	}

	// multi
	static int multi(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	// divide
	static int divide(int n1, int n2) {
		int result = n1 / n2;

		return result;
	}

	public static void main(String[] args) {
		int num = MethodEx01.add(5, 3);
		System.out.println("���ϱ�:" + num);

		int num2 = MethodEx01.minus(5, 3);
		System.out.println("����:" + num2);

		int num3 = MethodEx01.multi(5, 3);
		System.out.println("���ϱ�:" + num3);

		int num4 = MethodEx01.divide(5, 3);
		System.out.println("������:" + num4);
	}

}
