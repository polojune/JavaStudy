package a;

class A{
	 int a; 
	public void set(int a) {
		this.a = a;
	}
}
class B extends A{
	protected int b,c;
}

class C extends B{
	public int d,e;
}
class D extends C{
	 public void f() {
		 a = 1; 
		 set(10);
		 b = 20; 
		 d = 30;
	 }
}

public class Ex4 {

	public static void main(String[] args) {
	
		
		  
	}

}
