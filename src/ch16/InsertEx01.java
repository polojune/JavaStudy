package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "insert into users(id,name,email,password)values(?,?,?,?)";
			// OJDBC ������ �ش� ����̹��� �ε��ض�� �޴����� ����.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// thin�� �ڹٰ� ������ �ִ� �Լ��� ���� . OCI �� �ش� �ü���� ������ �ִ� �Լ��� ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// ���� �ޱ�(?�� ����ϰ� ���ش�)
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 4);
			pstmt.setString(2, "�̼���");
			pstmt.setString(3, "asdf@nate.com");
			pstmt.setString(4, "1234");
			// ���ۿ� ����(commit)
			pstmt.executeUpdate();
			System.out.println("�μ�Ʈ �Ϸ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
