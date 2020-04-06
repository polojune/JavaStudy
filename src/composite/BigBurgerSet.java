package composite;

import lombok.Data;

@Data
//자바 다중 상속이 안됨 
public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFried frenchFried;

	public BigBurgerSet() {
		this(new BigBurger(), new Coke(), new FrenchFried());

	}

	public BigBurgerSet(BigBurger bigBurger) {
		this(bigBurger, new Coke(), new FrenchFried());
	}

	public BigBurgerSet(BigBurger bigBurger, Coke coke, FrenchFried frenchFried) {

		this.bigBurger = bigBurger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}

}// end of class
