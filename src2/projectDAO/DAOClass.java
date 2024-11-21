package projectDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projectDBConn.DBConnClass;
import projectVO_image.VOClass_image;


public class DAOClass {
	
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public DAOClass() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}
	
	public boolean insert_score1 (int correct) {
		
	String sql="insert into RESULT1 values(?)";
//	String sql2="insert into RESULT2 values(?)";
//	String sql2="update USERINFO set GSCORE_W=GSCORE_W+FW_SCORE where name=? delete from RESULT";

		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,correct);
//			pstmt=con.prepareStatement(sql2);
//			pstmt2.setInt(1,incorrect);

			
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
