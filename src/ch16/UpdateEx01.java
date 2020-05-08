package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "update users set password = ? where id = ?";
			// OJDBC 문서에 해당 드라이버를 로드해라는 메뉴얼이 있음.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// thin은 자바가 가지고 있는 함수로 연결 . OCI 는 해당 운영체제가 가지고 있는 함수로 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// 버퍼 달기(?를 사용하게 해준다)
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "5678");
			pstmt.setInt(2, 2);
		
			// 버퍼에 쓰기(commit)
			pstmt.executeUpdate();
			System.out.println("업데이트 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
