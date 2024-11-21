package GAME_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
	
private Connection con; 
	
	public Connection getConnection() { 
		return con; 
	}
	public DBcon() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); 
	}
}

