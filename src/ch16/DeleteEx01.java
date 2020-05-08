package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "delete from users where id = ? ";
			// OJDBC ������ �ش� ����̹��� �ε��ض�� �޴����� ����.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// thin�� �ڹٰ� ������ �ִ� �Լ��� ���� . OCI �� �ش� �ü���� ������ �ִ� �Լ��� ����
			// ��Ʈ�� ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// ���� �ޱ�(?�� ����ϰ� ���ش�)
			PreparedStatement pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, 1);

			// ���ۿ� ����(commit)
			pstmt.executeUpdate();
			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
