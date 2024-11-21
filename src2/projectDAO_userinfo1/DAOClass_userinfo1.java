package projectDAO_userinfo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projectDBConn.DBConnClass;
import projectVO_image.VOClass_image;


public class DAOClass_userinfo1 {
	
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public DAOClass_userinfo1() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}
	
	public boolean userinfo_score (int correct, String name) {
		
	String sql=" update USERINFO set FW=? where name=?";


		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,correct);
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
