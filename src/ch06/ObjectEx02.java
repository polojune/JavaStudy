package ch06;

class Person{
	String name ="ȫ�浿";
	int age = 15; 
	String job = "�л�";
	@Override
	public String toString() {// return Ÿ���� string �̱⶧���� �� ���� �ؼ� ����� �� �ִ�. 
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}

}

public class ObjectEx02 {

	public static void main(String[] args) {
	    Integer num = 10;
	    String s = Integer.toString(num);
	    System.out.println(s);
	    
	    Person p = new Person();
	    System.out.println(p.toString());
	    System.out.println(p);
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append("�ȳ�"); 
	    sb.append("�ݰ���"); 
	    
	    System.out.println(sb.toString());
	}

}
