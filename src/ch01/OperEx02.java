package ch01;

public class OperEx02 {

	public static void main(String[] args) {
	  int sum = 0; // 0이 들어가 있음
      int distance = 100;
      int move = 20;
      
      sum = sum + move;
      System.out.println(sum);
     
      sum = sum + move;
      System.out.println(sum);
     
      sum = sum + move;
      System.out.println(sum);

      sum = sum + move;
      System.out.println(sum);

      sum = sum + move;
      System.out.println("움직인 거리:"+sum);//결합(묵시적 형변환)
      System.out.println("도착지:"+distance);
	}

}
