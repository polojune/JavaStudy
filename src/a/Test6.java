package a;
// 10미만의 자연수에서 3,5의 배수의 총합을 구하라.

// 

//3+5+6+9 = 23  
//
public class Test6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
		
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i; 
			
			}
			
		}
       System.out.println(sum);
	}

}
