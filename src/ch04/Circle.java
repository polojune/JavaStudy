package ch04;

public class Circle {
	private int radius;
	private String name;

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}

	
	public int getRadius() {
		return radius;
	}


	public String getName() {
		return name;
	}


	public Circle() {

	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
	    pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
        
		System.out.println(pizza.name + "�� ������" + area);

		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + area);

	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public void setName(String name) {
		this.name = name;
	}
}
