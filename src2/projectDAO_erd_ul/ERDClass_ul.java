package projectDAO_erd_ul;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projectDBConn.DBConnClass;
import projectVO_image.VOClass_image;
import projectVO_name.VOClass_name;

public class ERDClass_ul {
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public ERDClass_ul() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}

	public boolean send_score1 (String name) {
		
		String sql=" update USERINFO set GSCORE_L=GSCORE_L+FL where name=? ";

			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1,name);
				
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
