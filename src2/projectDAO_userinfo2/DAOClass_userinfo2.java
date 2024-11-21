package projectDAO_userinfo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projectDBConn.DBConnClass;
import projectVO_image.VOClass_image;


public class DAOClass_userinfo2 {
	
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public DAOClass_userinfo2() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}
	
	public boolean userinfo_score1 (int incorrect, String name) {
		
		String sql=" update USERINFO set FL=? where name=?";


		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,incorrect);
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
	
	public ArrayList <VOClass_image> getAllInfo() throws SQLException {
		ArrayList<VOClass_image> proarray = new ArrayList<VOClass_image>(); 
		String sql = "SELECT * FROM WORD_4";
		pstmt = con.prepareStatement(sql);
		rs=pstmt.executeQuery(); 
	
	while(rs.next()) { 
		int num = rs.getInt("num");
		String word = rs.getString("word");
		
		VOClass_image pv=new VOClass_image(num, word);
		
		proarray.add(pv); 
		}
	return proarray; 
	}
}
