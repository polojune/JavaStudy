package a;

import java.util.Scanner;

//1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s;
		char c;

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		s = sc.next();

		c = s.charAt(0);
		
		for (int i = 0; i <= c - 97; i++) {
			for (char j = 97; j <= c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
