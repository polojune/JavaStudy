package ch05;

class Num {
	private int num = 1;
	private int pw = 1234;

	public int getNum() {
		return num;
	}
	
	public void seeAccount(int password) {
		if(password == this.pw) {
			System.out.println("���°���");
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
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
