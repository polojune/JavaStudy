package composite;

import lombok.Data;

@Data
public class FrenchFried {
	private int price;
	private String desc;

	public FrenchFried() {
		this(2000, "감자칩");
	}

	public FrenchFried(int price, String desc) {

		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어 졌습니다.");
	}

	
}// end of class

