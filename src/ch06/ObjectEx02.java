package ch06;

class Person{
	String name ="홍길동";
	int age = 15; 
	String job = "학생";
	@Override
	public String toString() {// return 타입이 string 이기때문에 재 정의 해서 사용할 수 있다. 
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
	    sb.append("안녕"); 
	    sb.append("반가워"); 
	    
	    System.out.println(sb.toString());
	}

}
