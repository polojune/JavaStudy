package b;

class Tv{ 
	private int size; 
	private String manufacturer; 
	public Tv() {
		 this(32,"LG");
	}
 public Tv(String manufacturer) {
	 this(32,manufacturer );
 }
 
 public Tv(int size, String manufacturer) {
	 this.size = size; 
	 this.manufacturer = manufacturer; 
	 System.out.println(size + "��ġ" + manufacturer);
 }
}


public class TvEx {
         public static void main(String[] args) {
			
        Tv t = new Tv(); 	 
        Tv t1 = new Tv("�Ｚ");
        Tv t2 = new Tv(65,"�Ｚ");
		}
}
