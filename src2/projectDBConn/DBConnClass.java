package projectDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnClass {
private Connection con; 
	
	public Connection getConnection() { 
		return con; 
	}
	
	public DBConnClass() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); 
		System.out.println("접속완료");
	}

	public PreparedStatement prepareStatement(String sql2) {
		// TODO Auto-generated method stub
		return null;
	}

}
