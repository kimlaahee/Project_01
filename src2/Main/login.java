package Main;

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
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.sql.Connection;
//import PROJECT.*;

import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.ImageIcon;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel Register_pane;
	private JTextField RegisterNameTextField;
	private JComboBox user_list;
	private JLabel Registered_list;
	private JButton RegisterButton;
	private JButton StartButton;
	Font pixelMplus;
	Font pixelMplus2;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					login frame = new login();
//					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @return
	 * @return
	 */
	int chknum = 1;
	int Wscore = 0;
	int Lscore = 0;

	public login() {

		Dimension frameSize = getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getSize().width) / 2 - 226;
		int y = (screenSize.height - getSize().height) / 2 - 200;

		try {
			pixelMplus = Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")));
		} catch (IOException | FontFormatException e) {
		}

		try {
			pixelMplus2 = Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")).deriveFont(25f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")));
		} catch (IOException | FontFormatException e) {
		}

		getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setBounds(152, 127, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, 418, 481);
		contentPane = new JPanel();
		contentPane.addFocusListener(new FocusAdapter() {

		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Register_pane = new JPanel();
		Register_pane.setBackground(new Color(255, 255, 204));
		Register_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Register_pane.setBounds(0, 0, 400, 440);
		contentPane.add(Register_pane);
		Register_pane.setLayout(null);

		JLabel WSCORELABEL = new JLabel("정답");
		WSCORELABEL.setFont(pixelMplus);
		WSCORELABEL.setBounds(61, 324, 92, 45);
		Register_pane.add(WSCORELABEL);
		WSCORELABEL.setHorizontalAlignment(JLabel.CENTER);

		JLabel LSCORELABEL = new JLabel("오답");
		LSCORELABEL.setBounds(197, 325, 92, 42);
		Register_pane.add(LSCORELABEL);
		LSCORELABEL.setFont(pixelMplus);
		LSCORELABEL.setHorizontalAlignment(JLabel.CENTER);

		JLabel LSCORE = new JLabel("0");
		LSCORE.setBounds(263, 324, 72, 45);
		Register_pane.add(LSCORE);
		LSCORE.setFont(pixelMplus2);
		LSCORE.setHorizontalAlignment(JLabel.CENTER);

		JLabel WSCORE = new JLabel("0");
		WSCORE.setBounds(124, 325, 72, 44);
		Register_pane.add(WSCORE);
		WSCORE.setFont(pixelMplus2);

		WSCORE.setHorizontalAlignment(JLabel.CENTER);

		WSCORELABEL.setVisible(false);
		LSCORELABEL.setVisible(false);
		WSCORE.setVisible(false);
		LSCORE.setVisible(false);

		JButton DeleteUserID = new JButton("\uC0AC\uC6A9\uC790 \uC0AD\uC81C");
		DeleteUserID.setBorder(null);
		DeleteUserID.setBackground(new Color(255, 204, 153));
		DeleteUserID.setForeground(Color.BLACK);
		DeleteUserID.setBounds(33, 383, 150, 45);
		Register_pane.add(DeleteUserID);
		DeleteUserID.setFont(pixelMplus);
		DeleteUserID.setVisible(false);

		DeleteUserID.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "사용자 삭제", JOptionPane.YES_NO_OPTION);
				if (answer == 0) {
					User_DB_Insert DB;
					try {
						String selname = user_list.getSelectedItem().toString();
						DB = new User_DB_Insert();
						DB.DeleteUserData(selname);
						user_list.removeItem(selname);
						showMessageDialog(null, "삭제되었습니다");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
					} catch (NullPointerException e1) {
						showMessageDialog(null, "삭제할 사용자를 선택하세요");
					}
				}
			}
		});
		DeleteUserID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		RegisterNameTextField = new JTextField();
		RegisterNameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
		RegisterNameTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chknum = 1;
				RegisterNameTextField.setEnabled(true);
				user_list.setEnabled(false);
				DeleteUserID.setVisible(false);
				WSCORELABEL.setVisible(false);
				LSCORELABEL.setVisible(false);
				WSCORE.setVisible(false);
				LSCORE.setVisible(false);
				StartButton.setVisible(false);
			}
		});
		RegisterNameTextField.setBounds(197, 192, 172, 33);
		RegisterNameTextField.setColumns(10);
		Register_pane.add(RegisterNameTextField);

		JLabel lblNewLabel = new JLabel("\uC2E0\uADDC \uC0AC\uC6A9\uC790\uBA85 :");
		lblNewLabel.setFont(pixelMplus);
		lblNewLabel.setBounds(33, 192, 158, 33);
		Register_pane.add(lblNewLabel);

		user_list = new JComboBox();
		user_list.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
		user_list.setModel(new DefaultComboBoxModel(new String[] { "\uC0AC\uC6A9\uC790 \uC120\uD0DD" }));
		user_list.setFont(new Font("援대┝", Font.PLAIN, 15));
		user_list.setBackground(new Color(255, 255, 255));
		user_list.setMaximumRowCount(5);
		user_list.setEnabled(false);
		user_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chknum = 2;
				RegisterNameTextField.setEnabled(false);
				DeleteUserID.setVisible(true);
				WSCORELABEL.setVisible(true);
				LSCORELABEL.setVisible(true);
				WSCORE.setVisible(true);
				LSCORE.setVisible(true);
				StartButton.setVisible(true);
				StartButton.setEnabled(true);
				User_DB_Select list;
				try {
					String selname = user_list.getSelectedItem().toString();
					list = new User_DB_Select();
					ArrayList<VOClass> SDB = list.getAllInfo();
					String name_list[] = new String[SDB.size()];
					user_list.removeAllItems();
					for (int i = 0; i < SDB.size(); i++) {
						name_list[i] = SDB.get(i).getName();
						user_list.insertItemAt(name_list[i], i);
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
				} catch (NullPointerException e1) {
				}
				user_list.setEnabled(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				User_DB_Select list;
				try {
					list = new User_DB_Select();
					ArrayList<VOClass> SDB = list.getAllInfo();
					String name_list[] = new String[SDB.size()];
					user_list.removeAllItems();
					for (int i = 0; i < SDB.size(); i++) {
						name_list[i] = SDB.get(i).getName();
						user_list.insertItemAt(name_list[i], i);
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
				} catch (NullPointerException e1) {
				}
			}
		});
		user_list.setBounds(197, 288, 172, 33);
		Register_pane.add(user_list);

		Registered_list = new JLabel("\uB4F1\uB85D\uB41C \uC0AC\uC6A9\uC790 :");
		Registered_list.setFont(pixelMplus);
		Registered_list.setBounds(33, 288, 158, 33);
		Register_pane.add(Registered_list);

		RegisterButton = new JButton("\uC0AC\uC6A9\uC790 \uC0DD\uC131");
		RegisterButton.setBackground(new Color(255, 204, 153));
		RegisterButton.setBorder(null);
		RegisterButton.setFont(pixelMplus);
		RegisterButton.setBounds(219, 235, 150, 43);
		Register_pane.add(RegisterButton);

		JLabel TESTAREA = new JLabel("");
		TESTAREA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				User_DB_Select list;
				try {
					String selname = user_list.getSelectedItem().toString();
					list = new User_DB_Select();
					ArrayList<VOClass> SDB = list.getAllInfo();
					String name_list[] = new String[SDB.size()];
					int score_list[] = new int[2];

					for (int i = 0; i < SDB.size(); i++) {
						name_list[i] = SDB.get(i).getName();
						if (name_list[i].equals(selname)) {
							score_list[0] = SDB.get(i).getWscore();
							score_list[1] = SDB.get(i).getLscore();
							Wscore = score_list[0];
							Lscore = score_list[1];
							String WS = Integer.toString(Wscore);
							String LS = Integer.toString(Lscore);
							WSCORE.setText(WS);
							LSCORE.setText(LS);
						}
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
				} catch (NullPointerException e1) {
				}
			}
		});

		StartButton = new JButton("\uC2DC\uC791\uD558\uAE30");
		StartButton.setBackground(new Color(255, 204, 153));
		StartButton.setBorder(null);
		StartButton.setForeground(Color.BLACK);
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		StartButton.setBounds(219, 382, 150, 45);
		Register_pane.add(StartButton);
		StartButton.setFont(pixelMplus);
		StartButton.setVisible(false);

		StartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chknum == 1) {
					DeleteUserID.setVisible(false);
					String name = RegisterNameTextField.getText().replaceAll(" ", "");
					if (!name.equals("")) {
						User_DB_Insert DB;
						try {
							DB = new User_DB_Insert();
							DB.DirectLogonInsert(name, 0, 0);

						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
						}
					} else {
						showMessageDialog(null, "");
					}
				} else if (chknum == 2) {
					User_DB_Select list;
					try {
						String selname = user_list.getSelectedItem().toString();
						list = new User_DB_Select();
						ArrayList<VOClass> SDB = list.getAllInfo();
						String name_list[] = new String[SDB.size()];
						int answer = JOptionPane.showConfirmDialog(null, "해당 사용자로 시작하시겠습니까?", "사용자 선택",
								JOptionPane.YES_NO_OPTION);
						if (answer == 0) {
							dispose();
							new title(selname).setVisible(true);
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (NullPointerException e1) {
						showMessageDialog(null, "사용자를 선택하세요");
					}
				}

			}
		});
		TESTAREA.setBounds(197, 288, 172, 131);
		Register_pane.add(TESTAREA);
		TESTAREA.setVisible(true);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/title/login.png")));
		lblNewLabel_1.setBounds(0, -97, 400, 400);
		Register_pane.add(lblNewLabel_1);
		RegisterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user_list.setEnabled(true);
				DeleteUserID.setVisible(false);
				String name = RegisterNameTextField.getText().replaceAll(" ", "");
				if (!name.equals("")) {
					User_DB_Insert DB;
					try {
						DB = new User_DB_Insert();
						DB.InsertUserData(name, 0, 0);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
					}
				} else {
					showMessageDialog(null, "사용자명을 입력하세요");
				}
			}
		});
		RegisterButton.addKeyListener(new KeyAdapter() {

		});
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	public void insertItemAt(Object obj, int index) throws ClassNotFoundException, SQLException {
	}

	public void removeItem(Object obj) {
	}

	void removeAllItems() {
	}
}
