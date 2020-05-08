package a;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(156) + 100);
			System.out.println(" ");

		}
	}
}
