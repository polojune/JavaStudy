package coffeeshop.test;

class ����� {
	
	private static ����� instance = new �����();
	
	public static ����� getinstance() {
		return instance;
	}
	
	public �����() {

	}
}

public class SingleTonEx01 {

	public static void main(String[] args) {
         ����� d1 = �����.getinstance();
         ����� d2 = �����.getinstance();
		
	}
}
