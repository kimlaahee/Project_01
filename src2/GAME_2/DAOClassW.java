package GAME_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DAOClassW {
	
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public DAOClassW() throws ClassNotFoundException, SQLException {
	con = new DBcon().getConnection();
	}
	
	public ArrayList <VOClassW> getAllInfo() throws SQLException {
		ArrayList<VOClassW> proarrayW = new ArrayList<VOClassW>(); 
		String sql = " SELECT * FROM GAME2 ";
		pstmt = con.prepareStatement(sql);
		rs=pstmt.executeQuery(); 
	
	while(rs.next()) { 
		int num=rs.getInt("num");
		String word = rs.getString("word");
		
		VOClassW pv3=new VOClassW(num, word);
		
		proarrayW.add(pv3); 
		}
	System.out.println("DONE");
	return proarrayW; 
	
	}
	
}

