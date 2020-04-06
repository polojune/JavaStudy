package ch05;

//추상클래스는 일반 메서드를 가질 수있다.
//추상클래스는 내가 구현할 수 없는 메서드를 오브젝트에게 미룰 수 있다.
//추상클래스는 abstract 를 붙인다.
//추상클래스를 통해서 순서를 정할 수 있다.
abstract class Food{
	abstract void standby();
		
	
	void eat() {
		System.out.println("음식을 먹었습니다.");
	}
     abstract void cook();

    void auto(){
    	standby();
    	cook();
    	eat();
    }
}

class 라면 extends Food{

	@Override
	void cook() {
		System.out.println("냄비에 끊인다.");
	}

	@Override
	void standby() {
		System.out.println("라면과 가스와 냄비를 준비합니다.");
		
	}
	
}

class 삼겹살 extends Food{

	@Override
	void cook() {
		System.out.println("불판에 굽는다.");
		
	}

	@Override
	void standby() {
	     System.out.println("불판과 삼겹살과 버섯을 준비한다.");
		
	}
	
}

public class FoodEx02 {
   static void start(Food f) {
	   f.standby();
	   f.cook();
	   f.eat();
   }
	public static void main(String[] args) {
	      start(new 라면());
 
	}

}
