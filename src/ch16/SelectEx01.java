package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "select id,name,email,password from users where id = ?";
			// OJDBC 문서에 해당 드라이버를 로드해라는 메뉴얼이 있음.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// thin은 자바가 가지고 있는 함수로 연결 . OCI 는 해당 운영체제가 가지고 있는 함수로 연결
			// 스트림 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// 버퍼 달기(?를 사용하게 해준다) , 인젝션 방어,가독성 ,
			PreparedStatement pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, 3);

			// 버퍼에 쓰기(ResultSet을 리턴받음)
			ResultSet rs = pstmt.executeQuery(); // select 는 executeQuery를 사용한다. Resultset 커서를 리턴 받기위해
			
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

			System.out.println("선택 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
