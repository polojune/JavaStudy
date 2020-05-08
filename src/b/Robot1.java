package b;

class Power {
	private int kick;
	private int punch;

	public void set(int kick, int punch) {
          this.kick = kick; 
          this.punch = punch;
	}
}

public class Robot1 {

	public static void main(String[] args) {
		Power robot = new Power();
	     robot.set(10, 20);
	     System.out.println();
	
	}

}
