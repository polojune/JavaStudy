package b;

import java.util.Scanner;

public class CoinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("금액을 입력하시오>>");
		int num = sc.nextInt();
		   System.out.println("오만원권"+num/50000+"매");  
		   num%=50000;
		   System.out.println("만원권"+num/10000+"매");
		   num%=10000;
		   System.out.println("천원권"+num/1000+"매");
		   num%=1000;
		   System.out.println("백원"+num/100+"개");
		   num%=100;
		   System.out.println("오십원"+num/50+"개");
		   num%=50; 
		   System.out.println("십원"+num/10+"개");
		   num%=10;
		   System.out.println("일원"+num+"개");
		   num%=1;
		
		sc.close();

	}

}
