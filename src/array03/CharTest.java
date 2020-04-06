package array03;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
           
		Scanner sc = new Scanner(System.in);
		System.out.println("A~Z 까지 대문자를 입력하세요.");
		int num = sc.nextInt();// 
        String input = "A";

        char c = input.charAt(0);
		System.out.println((int) c);

		System.out.println((int) 'A');
		System.out.println((int) 'Z');
	}

}
