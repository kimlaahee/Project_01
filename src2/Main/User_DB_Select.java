package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User_DB_Select  {

	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public User_DB_Select() throws ClassNotFoundException, SQLException {
		con = new DBcon().getConnection();
	}

	public ArrayList<VOClass> getAllInfo() throws SQLException {
		ArrayList<VOClass> list = new ArrayList<VOClass>();

		// ----- SELECT 예문 -----

		String sql3 = " SELECT * FROM USERINFO ";

		// ----- sql2 을 준비된 지문으로 받는 DB Select 처리

		pstmt = con.prepareStatement(sql3);
		ResultSet rs = pstmt.executeQuery();
		rs = pstmt.executeQuery();

		// ResultSet에 담긴 결과를 ArrayList에 담기 
		while (rs.next()) {
			String name = rs.getString("NAME");
			int Wscore = rs.getInt("GSCORE_W");
			int Lscore = rs.getInt("GSCORE_L");
			// ----- java 2차원 배열 list 에 저장

			// ----- DB 에 요청한 데이터 selectedDB를 객체화
			VOClass SelectedDB = new VOClass(name, Wscore, Lscore);
			list.add(SelectedDB);
		}
		con.close();
//		 ----- 후 return으로 해당 배열 반환
		return list;
	}
	public ArrayList<VOClass> getPickInfo(String sname) throws SQLException {
		ArrayList<VOClass> list2 = new ArrayList<VOClass>();

		// ----- SELECT 예문 -----

		String sql4 = " SELECT NAME, GSCORE_W, GSCORE_L FROM USERINFO WHERE NAME = ? ";


		// ----- sql3 을 준비된 지문으로 받는 DB Select 처리


		pstmt = con.prepareStatement(sql4);
		ResultSet rs = pstmt.executeQuery();
		rs = pstmt.executeQuery();
		pstmt.setString(1, sname);

		// ResultSet에 담긴 결과를 ArrayList에 담기 
		while (rs.next()) {
			String name = rs.getString("NAME");
			int Wscore = rs.getInt("GSCORE_W");
			int Lscore = rs.getInt("GSCORE_L");
			// ----- java 2차원 배열 list 에 저장

			// ----- DB 에 요청한 데이터 selectedDB를 객체화
			VOClass SelectedDB2 = new VOClass(name, Wscore, Lscore);
			list2.add(SelectedDB2);
		}
		con.close();
//		 ----- 후 return으로 해당 배열 반환
		return list2;
	}

}
