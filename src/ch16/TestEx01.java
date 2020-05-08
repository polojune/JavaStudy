package ch16;

class MyConnection{
	
}

class MyJDBC extends MyConnection {
	
	static MyConnection conn;
	
	public MyJDBC() {
		System.out.println("생성자 호출");
	}

	// new 할때 static 내부가 호출 됨
	static {
		conn = new MyJDBC();
		System.out.println("static 초기화 호출");
	}
}

public class TestEx01 {

	public static void main(String[] args) {
		// MyJDBC mj = new MyJDBC();
      try {
		Class.forName("ch16.MyJDBC");
		MyConnection conn = MyJDBC.conn;
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
