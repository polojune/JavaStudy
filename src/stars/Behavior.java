package stars;

//추상클래스와 유사
//추상메서드만 존재가능
public interface Behavior {

	public void move();

	public void repair();

	public void attack(Behavior unit);

}
