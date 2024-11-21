package Play01_DBConn;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Play01_conn {
	
		private Connection con;//con 이 접속객체 // 속성

		// 메소드
		public Connection getConnection() {//접속객체를 꺼내는 메소드 getter // getConnection을 호출하면 아래 con이 나옴
			
			return con; // 반환이 Connection형이다. (int, String 아니고 Connection형이다)
		}
		// 디폴트 생성자: 무조건 시작하자마자 실행시키기 위해서
		public Play01_conn()
				throws ClassNotFoundException, SQLException {
		 	Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
//			System.out.println("접속 추카추카 !!!!!!");
	}
}




