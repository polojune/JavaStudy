package ch05;

//�߻�Ŭ������ �Ϲ� �޼��带 ���� ���ִ�.
//�߻�Ŭ������ ���� ������ �� ���� �޼��带 ������Ʈ���� �̷� �� �ִ�.
//�߻�Ŭ������ abstract �� ���δ�.
//�߻�Ŭ������ ���ؼ� ������ ���� �� �ִ�.
abstract class Food{
	abstract void standby();
		
	
	void eat() {
		System.out.println("������ �Ծ����ϴ�.");
	}
     abstract void cook();

    void auto(){
    	standby();
    	cook();
    	eat();
    }
}

class ��� extends Food{

	@Override
	void cook() {
		System.out.println("���� ���δ�.");
	}

	@Override
	void standby() {
		System.out.println("���� ������ ���� �غ��մϴ�.");
		
	}
	
}

class ���� extends Food{

	@Override
	void cook() {
		System.out.println("���ǿ� ���´�.");
		
	}

	@Override
	void standby() {
	     System.out.println("���ǰ� ����� ������ �غ��Ѵ�.");
		
	}
	
}

public class FoodEx02 {
   static void start(Food f) {
	   f.standby();
	   f.cook();
	   f.eat();
   }
	public static void main(String[] args) {
	      start(new ���());
 
	}

}
