package ch16;

class MyConnection{
	
}

class MyJDBC extends MyConnection {
	
	static MyConnection conn;
	
	public MyJDBC() {
		System.out.println("������ ȣ��");
	}

	// new �Ҷ� static ���ΰ� ȣ�� ��
	static {
		conn = new MyJDBC();
		System.out.println("static �ʱ�ȭ ȣ��");
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
