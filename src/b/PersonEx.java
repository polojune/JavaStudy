package b;
 
class Person{
  private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
} 
  
}
public class PersonEx {

	public static void main(String[] args) {
        Person a = new Person();
        a.setAge(17);
       System.out.println(a.getAge());
	}

}
