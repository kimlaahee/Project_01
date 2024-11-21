package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showConfirmDialog;
import java.awt.Button;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.python.modules.thread.thread;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.MutableComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.sql.Connection;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class User_DB_Insert {

	private Connection con;

	public User_DB_Insert() throws ClassNotFoundException, SQLException {
		con = new DBcon().getConnection();
	}

	public void InsertUserData(String NAME, int GSCORE_W, int GSCORE_L) throws SQLException {

		// ----- INSERT ���� -----
		String sql = " INSERT INTO USERINFO(NAME, GSCORE_W, GSCORE_L) " + " VALUES(?, ?, ?) ";

		// ----- sql �� �غ�� �������� �޴� DB insert ó��

		PreparedStatement psmt = null;
		int count = 0;
		int eccn = 0;
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, NAME);
			psmt.setInt(2, GSCORE_W);
			psmt.setInt(3, GSCORE_L);
			count = psmt.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			// --- ����Ŭ UNIQUE �ߺ� ���Ἲ ���ݽ�
			eccn = 1;
			showMessageDialog(null, "이미 존재하는 사용자입니다");
			con.close();
			
		} catch (SQLException e) {
			eccn = 1;
			showMessageDialog(null, "사용자명이 너무 깁니다 \\n(공백제외, 13자까지)");
			con.close();
		}finally {
		if (eccn==0) {
			showMessageDialog(null, "생성되었습니다");
			
			con.close();
			
		}
		}
		
	}
	
	public void DirectLogonInsert(String NAME, int GSCORE_W, int GSCORE_L) throws SQLException {

		// ----- INSERT ���� -----
		String sql = " INSERT INTO USERINFO(NAME, GSCORE_W, GSCORE_L) " + " VALUES(?, ?, ?) ";

		// ----- sql �� �غ�� �������� �޴� DB insert ó��

		PreparedStatement psmt = null;
		int count = 0;
		int eccn = 0;
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, NAME);
			psmt.setInt(2, GSCORE_W);
			psmt.setInt(3, GSCORE_L);
			count = psmt.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			// --- ����Ŭ UNIQUE �ߺ� ���Ἲ ���ݽ�
			eccn = 1;
			showMessageDialog(null, "이미 존재하는 사용자입니다");
			con.close();
			
		} catch (SQLException e) {
			eccn = 1;
			showMessageDialog(null, "사용자명이 너무 깁니다 \n(공백제외, 13자까지)");
//			dispose();
			con.close();
			
		}
	}
	
	
	public void DeleteUserData(String NAME) throws SQLException {

		// ----- INSERT ���� -----
		String sql2 = " DELETE FROM USERINFO WHERE NAME = ? ";

		// ----- sql �� �غ�� �������� �޴� DB insert ó��

		PreparedStatement psmt = null;
		int count = 0;
		int eccn = 0;
		psmt = con.prepareStatement(sql2);
		psmt.setString(1, NAME);
		count = psmt.executeUpdate();
		con.close();
	}
}
