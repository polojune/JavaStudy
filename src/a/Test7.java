package a;

import java.util.Scanner;

//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s;
		char c;

		System.out.print("소문자 알파벳 하나를 입력하시오>>");
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
