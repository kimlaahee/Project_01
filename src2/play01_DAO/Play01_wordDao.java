package play01_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Vector;

import Play01_DBConn.Play01_conn;
import Play01_VO.Play01_words;

public class Play01_wordDao {


		
		private Connection con; //DB 연결 객체
		private PreparedStatement pstmt=null; //Query 작성 객체
		private ResultSet rs=null; //Query 결과 커서
		
		public Play01_wordDao() throws ClassNotFoundException, SQLException {
			con = new Play01_conn().getConnection();
		}
		public boolean insert_catewd(int id, String category, String word) {
			String sql="insert into tCateg values(?,?,?)";
			try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, category);
			pstmt.setString(3, word);
			
			pstmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("insertion error");
			return false;
		}
			return true;
}
		public boolean update_catewd(int id) {
			String sql="delete from tCateg where id=?";
			try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("delete error");
			return false;
		}
			return true;
		}
		public boolean update_catewd(String word, String word2) {
			String sql="update tCateg set word=? where word=?";
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1,word2);
				pstmt.setString(2,word);
				pstmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("update Exception");
			return false;
		}
			return true;
		}
		public ArrayList<Play01_words> getAllInfo() throws SQLException {
			ArrayList<Play01_words> wdarray = new ArrayList<Play01_words>();
			String sql = "SELECT * FROM tCateg ORDER BY id";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int id=rs.getInt("id");
				String word = rs.getString("word");
				String category = rs.getString("category");
				
				Play01_words wd=new Play01_words(id,category,word);
				
				wdarray.add(wd);
			}
			return wdarray;
		}
		public ArrayList<Play01_words> getCateg() {
			// TODO Auto-generated method stub
			return null;
		}
}
