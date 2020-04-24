package a;

class Rect{
	   protected int x = 5;
	   public void f() {
		  x++;
		  System.out.println(x);
	  }
}
class SpecialRect extends Rect { 
	 public void f() {
		 System.out.println(super.x);
	 }
}


public class Ex3 {

	public static void main(String[] args) {
	

	}

}
