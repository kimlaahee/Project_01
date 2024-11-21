package projectDAO_erd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projectDBConn.DBConnClass;
import projectVO_image.VOClass_image;

public class ERDClass {
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public ERDClass() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}
	
	public boolean send_score (String name) {
		
	String sql=" update USERINFO set GSCORE_W=GSCORE_W+FW where name=? delete from RESULT1; "
			+ " update USERINFO set GSCORE_L=GSCORE_L+FL where name=? delete from RESULT2; ";

			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1,name);
				pstmt.setString(2,name);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("insertion error");
				return false;
			}	
		return true;
	}
}
