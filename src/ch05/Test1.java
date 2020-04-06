package ch05;

class Num {
	private int num = 1;
	private int pw = 1234;

	public int getNum() {
		return num;
	}
	
	public void seeAccount(int password) {
		if(password == this.pw) {
			System.out.println("계좌공개");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}


}

public class Test1 {
	public static void main(String[] args) {
		Num n1 = new Num();
		System.out.println(n1.getNum());
		n1.seeAccount(1222);
		

		
	}
}
