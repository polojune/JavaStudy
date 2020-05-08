package c;

import java.util.Scanner;

interface Stack {
	int length();// ���� ���ÿ� ���ӵ� ���� ����

	int capacity(); // ������ ��ü ���� ������ ���� ����

	String pop(); // ������ ��(top)�� �Ǽ� ����

	boolean push(String val);// ������ ��(top)�� ����� �Ǽ� ����
}

class StringStack implements Stack {
	private int num; // ���� ������ ����
	private int set; // ���� �ε���
	private String[] stack;

	public StringStack(int num) {
		this.num = num;
		this.set = 0;
		stack = new String[num];
	}

	public int length() {
		return set;
	}

	public int capacity() {
		return stack.length;
	}

	public String pop() {
		if (set - 1 < 0)// stack�� �ƹ��͵� ���� ������
			return null;
		set--;// stack�� ��ĭ�� ������(stack[set]�� ������� ����Ű�� �����ϱ�)
		String s = stack[set];// ������ ��
		return s;
	}

	public boolean push(String val) {
		if (set < num) {
			stack[set] = val; // ������ ���ڿ��� �־���
			set++;// stack ��ĭ�� �÷���
			return true;
		} else
			return false;
	}
}

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);
		while (true) {
			System.out.print("���ڿ��Է�>>");
			String val = sc.next();
			if (val.equals("�׸�"))
				break;
			if (!stack.push(val)) {
				System.out.println("������ ������ Ǫ�� �Ұ�");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� ��:");
		int len = stack.length();
		for (int i = 0; i < len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");

		}
		sc.close();
	}

}
