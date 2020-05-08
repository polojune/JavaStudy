package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "select id,name,email,password from users where id = ?";
			// OJDBC ������ �ش� ����̹��� �ε��ض�� �޴����� ����.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// thin�� �ڹٰ� ������ �ִ� �Լ��� ���� . OCI �� �ش� �ü���� ������ �ִ� �Լ��� ����
			// ��Ʈ�� ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// ���� �ޱ�(?�� ����ϰ� ���ش�) , ������ ���,������ ,
			PreparedStatement pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, 3);

			// ���ۿ� ����(ResultSet�� ���Ϲ���)
			ResultSet rs = pstmt.executeQuery(); // select �� executeQuery�� ����Ѵ�. Resultset Ŀ���� ���� �ޱ�����
			
			Users users;
			
			if(rs.next()) {
				users = new Users(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("password"));
				System.out.println(users.getEmail());
				//System.out.println(users.get);
				System.out.println();
				System.out.println();
			}		

			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
