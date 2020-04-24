package a;

public class Book {
    String title;
    String author; 
    
    void show() {System.out.println(title + " " + author);}
    
    public Book() {
	   this("","");
	   System.out.println("생성자 호출");
	}
	
    public Book(String title) {
    	this(title,"작자미상");
    }
  public Book(String title, String author) {
	  this.title = title; 
	  
  }
	public static void main(String[] args) {
		

	}

}
