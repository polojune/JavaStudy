package simple;

class ���� {
	String name;

	public ����(String name) {
		this.name = name;
	}
}

class ���� {
	String name;

	public ����(String name) {
		this.name = name;
	}
}

class �ٱ��� {
	���� drink;
	���� snack;
	
	public �ٱ���(���� drink, ���� snack) {
		this.drink = drink;
		this.snack = snack;
	}
}

public class Compo {
	public static void main(String[] args) {
		
		���� d1 = new ����("���Ǵ�");
		���� s1 = new ����("ġ�佺");
		
		�ٱ��� a = new �ٱ���(d1,s1);
		
		System.out.println(a.drink.name);
	}
}
