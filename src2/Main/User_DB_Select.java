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

		// ----- SELECT ���� -----

		String sql3 = " SELECT * FROM USERINFO ";

		// ----- sql2 �� �غ�� �������� �޴� DB Select ó��

		pstmt = con.prepareStatement(sql3);
		ResultSet rs = pstmt.executeQuery();
		rs = pstmt.executeQuery();

		// ResultSet�� ��� ����� ArrayList�� ��� 
		while (rs.next()) {
			String name = rs.getString("NAME");
			int Wscore = rs.getInt("GSCORE_W");
			int Lscore = rs.getInt("GSCORE_L");
			// ----- java 2���� �迭 list �� ����

			// ----- DB �� ��û�� ������ selectedDB�� ��üȭ
			VOClass SelectedDB = new VOClass(name, Wscore, Lscore);
			list.add(SelectedDB);
		}
		con.close();
//		 ----- �� return���� �ش� �迭 ��ȯ
		return list;
	}
	public ArrayList<VOClass> getPickInfo(String sname) throws SQLException {
		ArrayList<VOClass> list2 = new ArrayList<VOClass>();

		// ----- SELECT ���� -----

		String sql4 = " SELECT NAME, GSCORE_W, GSCORE_L FROM USERINFO WHERE NAME = ? ";


		// ----- sql3 �� �غ�� �������� �޴� DB Select ó��


		pstmt = con.prepareStatement(sql4);
		ResultSet rs = pstmt.executeQuery();
		rs = pstmt.executeQuery();
		pstmt.setString(1, sname);

		// ResultSet�� ��� ����� ArrayList�� ��� 
		while (rs.next()) {
			String name = rs.getString("NAME");
			int Wscore = rs.getInt("GSCORE_W");
			int Lscore = rs.getInt("GSCORE_L");
			// ----- java 2���� �迭 list �� ����

			// ----- DB �� ��û�� ������ selectedDB�� ��üȭ
			VOClass SelectedDB2 = new VOClass(name, Wscore, Lscore);
			list2.add(SelectedDB2);
		}
		con.close();
//		 ----- �� return���� �ش� �迭 ��ȯ
		return list2;
	}

}
