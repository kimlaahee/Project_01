package project01_2_gui;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import java.io.File;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import Play01_DBConn.Play01_conn;
import Play01_VO.Play01_words;
import play01_DAO.Play01_wordDao;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

import java.awt.FontFormatException;
import java.io.IOException;
import java.awt.event.MouseMotionAdapter;
import Main.title;


public class Play01_gui extends JFrame {

	private JPanel contentPane;

	JLayeredPane layeredPane;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();

	JButton btnMom;
	JButton btnSister;

	JButton btnDonuts_1;
	JButton btnLion_1;

	JButton btnLemon;
	JButton btnBanana;

	JButton btnCar;
	JButton btnFlower;

	JButton btnPiano;
	JButton btnGuitar;

	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblWhichOneIs;
	JLabel lblWhichOneIs_1;
	JLabel lblWhichOneIs_1_1;
	JLabel lblNewLabel_25_1_1;

	int cnt1 = 0;
	int cnt2 = 0;
	int cnt3 = 0;
	int cnt4 = 0;

	int cnt5 = 0;
	int cnt6 = 0;
	int cnt7 = 0;
	int cnt8 = 0;

	int cnt9 = 0;
	int cnt10 = 0;
	int cnt11 = 0;
	int cnt12 = 0;

	int cnt13 = 0;
	int cnt14 = 0;
	int cnt15 = 0;
	int cnt16 = 0;

	int cnt17 = 0;
	int cnt18 = 0;
	int cnt19 = 0;
	int cnt20 = 0;

	Font pixelMplus;

	Play01_wordDao wddao;
	String wd;
	ArrayList<Play01_words> wdArray;

	/**
	 * Launch the application.
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageIcon p01_2_gui = null;
					Play01_gui frame = new Play01_gui(null);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);

					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected Play01_gui getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Create the frame.
	 * 
	 * @param imageIcon
	 */
	public Play01_gui(String name) { 

		
		Dimension frameSize = getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getSize().width) / 2 - 500;
		int y = (screenSize.height - getSize().height) / 2 - 352;
	
		
		
		
		try { // external free font
			pixelMplus = Font.createFont(Font.TRUETYPE_FONT, new File("./font/mala.ttf")).deriveFont(38f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("./font/mala.ttf")));
		} catch (IOException | FontFormatException e) {

		}

		try { // Bring DB information 
			wddao = new Play01_wordDao();
			wdArray = wddao.getAllInfo();

		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

//		Frame title & icon setting
		setTitle("Lesson 02");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Play01_gui.class.getResource("/grimbang/pencil.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, 1000, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, "name_1655843079642400");

		layeredPane.removeAll();

////	Panel: Quiz 01 /////////////////////////////////////////////////////
		panel = new JPanel();

		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 973, 655);
		layeredPane.add(panel);
		panel.setLayout(null);

//		btnMom Q 01. Btn 01
		btnMom = new JButton("mom");
		btnMom.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(0).getWord()); // 踰꾪듉	
				// when the button clicked, get 0 order from DB table.
//				System.out.println(wd); // check if DB information is extracted.
				
//			Q 01. quiz01. btn01. 
//			Use "if" to compare "btn word" and "DB word". 
				if (wd.equals("mom")) { 
					btnMom.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					// If the both words are the same, btn border color changes into Green.
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play(); 
					// If the both words are the same, 'correct tone' plays. 
					cnt1 = cnt1 + 1; // If click the btn, number increase. 
				} else { 
					btnMom.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					// If the both words are NOT the same, btn border color changes into Red. 
					File f2 = new File("./mp3/mistake_bell.mp3"); 
					MP3Player mp3 = new MP3Player(f2);
					mp3.play(); 
					// If the both words are NOT the same, 'mistake bell' plays. 
				}
			}
		});
		btnMom.setForeground(Color.BLACK);
		btnMom.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnMom.setBackground(new Color(255, 255, 0));
		btnMom.setBounds(77, 234, 130, 55);
		panel.add(btnMom);

//		btnDad Q 01. btn 02.
		JButton btnDad = new JButton("dad");
		btnDad.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(1).getWord()); 
//					System.out.println(wd);
				if (wd.equals("dad")) {
					btnDad.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt2 = cnt2 + 1;
				} else {
					btnDad.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnDad.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDad.setBackground(new Color(255, 255, 0));
		btnDad.setBounds(308, 234, 130, 55);
		panel.add(btnDad);

//		btnDoctor Q 01. btn03.
		JButton btnDoctor = new JButton("doctor");
		btnDoctor.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(2).getWord());// DB�떒�뼱 �닚�꽌(2)
//					System.out.println(wd);
				if (wd.equals("doctor")) {
					btnDoctor.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt3 = cnt3 + 1;
				} else {
					btnDoctor.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});

		btnDoctor.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDoctor.setBackground(new Color(255, 255, 0));
		btnDoctor.setBounds(536, 234, 130, 55);
		panel.add(btnDoctor);

//		btnSister Q 01. btn04.
		btnSister = new JButton("sister");
		btnSister.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(3).getWord()); 
//					System.out.println(wd);
				if (wd.equals("sister")) {
					btnSister.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt4 = cnt4 + 1;
				} else {
					btnSister.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnSister.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnSister.setBackground(new Color(255, 255, 0));
		btnSister.setBounds(769, 234, 130, 55);
		panel.add(btnSister);

//		Q 01. label: question: who is family? 
		lblNewLabel = new JLabel("1. Who is family?");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				File f2 = new File("./mp3/whofam.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		// lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 40));
		lblNewLabel.setFont(pixelMplus);// Applying external font.
		lblNewLabel.setBounds(152, 352, 665, 112);
		panel.add(lblNewLabel);

//	    Q 01. Exit btn
		JButton btnExit = new JButton("EXIT");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnExit.setBackground(new Color(123, 104, 238));
		btnExit.setBounds(830, 555, 107, 55);
		panel.add(btnExit);

//		Q 01. Next btn
		JButton btnNext_1 = new JButton("NEXT");
		btnNext_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 

				// If the user doesn't click any "word" buttons, it doesn't go to next page.
				// By using "if", it goes to the next page only if three correct answers(buttons) were clicked. 
				if (cnt1>=1 && cnt2>=1 && cnt4 >= 1) { 
					layeredPane.removeAll();
					layeredPane.add(panel_1);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		btnNext_1.setForeground(Color.WHITE);
		btnNext_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnNext_1.setBackground(new Color(255, 160, 122));
		btnNext_1.setBounds(433, 555, 107, 55);
		panel.add(btnNext_1);

//		Q 01. Label: dad tts
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // dad洹몃┝�쓣 �겢由��븯硫� dad�쓬�꽦 異쒕젰
				File f2 = new File("./mp3/dad.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
//		Q 01. Label: dad img
		lblNewLabel_2.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/dad2.png")));
		lblNewLabel_2.setBounds(294, 51, 149, 150);
		panel.add(lblNewLabel_2);

//		Q 01. Label: mom tts
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // mom洹몃┝�쓣 �겢由��븯硫� mom�쓬�꽦 異쒕젰
				File f2 = new File("./mp3/mom.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 01. Label: mom img
		lblNewLabel_6.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/mom1.png")));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(49, 51, 180, 150);
		panel.add(lblNewLabel_6);
		
//		Q 01. Label: doctor tts
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // doctor 洹몃┝�쓣 �겢由��븯硫� doctor�쓬�꽦 異쒕젰
				File f2 = new File("./mp3/doctor.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 01. Label: doctor img
		lblNewLabel_7.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/doctor.png")));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(511, 51, 180, 150);
		panel.add(lblNewLabel_7);

//		Q 01. Label: sister tts 
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // sister 洹몃┝�쓣 �겢由��븯硫� sister�쓬�꽦 異쒕젰
				File f2 = new File("./mp3/sister.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 01. Label: sister img
		lblNewLabel_8.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/sister.png")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(739, 51, 180, 150);
		panel.add(lblNewLabel_8);

//		Q 01. background img
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/panel.png")));
		lblNewLabel_21.setBounds(0, 0, 973, 655);
		panel.add(lblNewLabel_21);

////	panel_1: Q 02  ////////////////////////////////////////////////////////////////////////
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 0, 973, 655);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);

//		btnDonuts_1 Q 02. btn 01. 
		btnDonuts_1 = new JButton("donuts");
		btnDonuts_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(4).getWord()); // DB�떒�뼱 �닚�꽌(4)
//					System.out.println(wd);
				if (wd.equals("donuts")) {
					btnDonuts_1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt5 = cnt5 + 1;
				} else {
					btnDonuts_1.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnDonuts_1.setForeground(Color.BLACK);
		btnDonuts_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDonuts_1.setBackground(Color.YELLOW);
		btnDonuts_1.setBounds(77, 234, 130, 55);
		panel_1.add(btnDonuts_1);

//		btnPig_1 Q 02. btn 02. 
		JButton btnPig_1 = new JButton("pig");
		btnPig_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(5).getWord()); // DB�떒�뼱 �닚�꽌(5)
//					System.out.println(wd);
				if (wd.equals("pig")) {
					btnPig_1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt6 = cnt6 + 1;
				} else {
					btnPig_1.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnPig_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnPig_1.setBackground(Color.YELLOW);
		btnPig_1.setBounds(308, 234, 130, 55);
		panel_1.add(btnPig_1);

//		btnDog_1 Q 02. btn 03. 
		JButton btnDog_1 = new JButton("dog");
		btnDog_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(6).getWord()); // DB�떒�뼱 �닚�꽌(6)
//					System.out.println(wd);
				if (wd.equals("dog")) {
					btnDog_1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt7 = cnt7 + 1;
				} else {
					btnDog_1.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnDog_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDog_1.setBackground(Color.YELLOW);
		btnDog_1.setBounds(536, 234, 130, 55);
		panel_1.add(btnDog_1);

//		btnLion_1 02. btn04. 
		btnLion_1 = new JButton("lion");
		btnLion_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(7).getWord()); // DB�떒�뼱 �닚�꽌(7)
//					System.out.println(wd);
				if (wd.equals("lion")) {
					btnLion_1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt8 = cnt8 + 1;
				} else {
					btnLion_1.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnLion_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnLion_1.setBackground(Color.YELLOW);
		btnLion_1.setBounds(769, 234, 130, 55);
		panel_1.add(btnLion_1);

//		Q 02. Label: which one is an animal?
		lblWhichOneIs = new JLabel("2. Which one is an animal?");
		lblWhichOneIs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // �겢由��븯硫� which one is an animal? �쓬�꽦異쒕젰
				File f2 = new File("./mp3/whichani.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
		lblWhichOneIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhichOneIs.setForeground(Color.BLACK);
		// lblWhichOneIs.setFont(new Font("Courier New", Font.BOLD, 40));
		lblWhichOneIs.setFont(pixelMplus);
		lblWhichOneIs.setBounds(152, 352, 665, 112);
		panel_1.add(lblWhichOneIs);

//		Q 02. Exit btn
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnExit_1.setForeground(Color.WHITE);
		btnExit_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnExit_1.setBackground(new Color(123, 104, 238));
		btnExit_1.setBounds(830, 555, 107, 55);
		panel_1.add(btnExit_1);

//		Q 02. Next btn
		JButton btnNext = new JButton("NEXT");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ( cnt6>=1 && cnt7>=1 && cnt8 >= 1) {
					layeredPane.removeAll();
					layeredPane.add(panel_2);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnNext.setBackground(new Color(255, 160, 122));
		btnNext.setBounds(433, 555, 107, 55);
		panel_1.add(btnNext);

//		Q 02. Label: pig tts 
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // 洹몃┝ �겢由��떆 pig�떒�뼱 諛쒖쓬 異쒕젰
				File f2 = new File("./mp3/pig.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
		
//		Q 02. Label: pig img
		lblNewLabel_3.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/pig.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(294, 51, 162, 150);
		panel_1.add(lblNewLabel_3);

//		Q 02. Label: donuts tts 
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {// 洹몃┝ �겢由��떆 donuts�떒�뼱 諛쒖쓬 異쒕젰
				File f2 = new File("./mp3/donuts.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 02. Label: donuts img
		lblNewLabel_9.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/donut.png")));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(49, 51, 180, 150);
		panel_1.add(lblNewLabel_9);

//		Q 02. Label: dog tts img
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {// 洹몃┝ �겢由��떆 dog�떒�뼱 諛쒖쓬 異쒕젰
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/dog.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 02. Label: dog img
		lblNewLabel_10.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/dog.png")));
		lblNewLabel_10.setBounds(511, 51, 180, 150);
		panel_1.add(lblNewLabel_10);

//		Q 02. Label: lion tts 
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.addMouseListener(new MouseAdapter() {// 洹몃┝ �겢由��떆 lion�떒�뼱 諛쒖쓬 異쒕젰
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/lion.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 02. Label: lion img
		lblNewLabel_11.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/lion.png")));
		lblNewLabel_11.setBounds(739, 51, 180, 150);
		panel_1.add(lblNewLabel_11);

//		Q 02. Label: background img
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/panel_1.png")));
		lblNewLabel_22.setBounds(0, 0, 973, 655);
		panel_1.add(lblNewLabel_22);

////	panel_2: Quiz 03 /////////////////////////////////////////////////
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(216, 191, 216));
		panel_2.setBounds(0, 0, 973, 655);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);

//		btnLemon Q 03. btn 01. 
		btnLemon = new JButton("lemon");
		btnLemon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(8).getWord());
//					System.out.println(wd);
				if (wd.equals("lemon")) {
					btnLemon.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt9 = cnt9 + 1;
				} else {
					btnLemon.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnLemon.setForeground(Color.BLACK);
		btnLemon.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnLemon.setBackground(Color.YELLOW);
		btnLemon.setBounds(77, 234, 130, 55);
		panel_2.add(btnLemon);

//		btnBook Q 03. btn 02. 
		JButton btnBook = new JButton("book");
		btnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(9).getWord());
//					System.out.println(wd);
				if (wd.equals("book")) {
					btnBook.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt10 = cnt10 + 1;
				} else {
					btnBook.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnBook.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnBook.setBackground(Color.YELLOW);
		btnBook.setBounds(308, 234, 130, 55);
		panel_2.add(btnBook);

//		btnGrapes Q 03. btn 03.
		JButton btnGrapes = new JButton("grapes");
		btnGrapes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(10).getWord());
//					System.out.println(wd);
				if (wd.equals("grapes")) {
					btnGrapes.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt11 = cnt11 + 1;
				} else {
					btnGrapes.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnGrapes.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnGrapes.setBackground(Color.YELLOW);
		btnGrapes.setBounds(536, 234, 130, 55);
		panel_2.add(btnGrapes);

//		btnBanana Q 03. btn 04.
		btnBanana = new JButton("banana");
		btnBanana.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(11).getWord());
//					System.out.println(wd);
				if (wd.equals("banana")) {
					btnBanana.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt12 = cnt12 + 1;
				} else {
					btnBanana.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnBanana.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnBanana.setBackground(Color.YELLOW);
		btnBanana.setBounds(769, 234, 130, 55);
		panel_2.add(btnBanana);

//		Q 03. Label: which one is fruit?
		lblWhichOneIs_1 = new JLabel("3. Which one is fruit?");
		lblWhichOneIs_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/whichfruit.mp3"); // �겢由��븯硫� �쓬�꽦異쒕젰
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
		lblWhichOneIs_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhichOneIs_1.setForeground(Color.BLACK);
		// lblWhichOneIs_1.setFont(new Font("Courier New", Font.BOLD, 40));
		lblWhichOneIs_1.setFont(pixelMplus);
		lblWhichOneIs_1.setBounds(152, 352, 665, 112);
		panel_2.add(lblWhichOneIs_1);

//		Q 03. Exit btn
		JButton btnExit_2 = new JButton("EXIT");
		btnExit_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnExit_2.setForeground(Color.WHITE);
		btnExit_2.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnExit_2.setBackground(new Color(153, 102, 255));
		btnExit_2.setBounds(830, 555, 107, 55);
		panel_2.add(btnExit_2);

//		Q 03. Next btn
		JButton btnNext_1_1 = new JButton("NEXT");
		btnNext_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cnt9>=1 &&  cnt11>=1 && cnt12 >=1) {
					layeredPane.removeAll();
					layeredPane.add(panel_3);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		btnNext_1_1.setForeground(Color.WHITE);
		btnNext_1_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnNext_1_1.setBackground(new Color(255, 153, 102));
		btnNext_1_1.setBounds(433, 555, 107, 55);
		panel_2.add(btnNext_1_1);

//		Q 03. Label: book tts 
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/book.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		03. Label: book 
		lblNewLabel_4.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/book1.png")));
		lblNewLabel_4.setBounds(277, 51, 180, 150);
		panel_2.add(lblNewLabel_4);

//		Q 03. Label: lemon tts
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/lemon.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 03. Label: lemon img
		lblNewLabel_12.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/lemon.png")));
		lblNewLabel_12.setBounds(49, 51, 180, 150);
		panel_2.add(lblNewLabel_12);

//		Q 03. Label: grapes tts
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/grapes.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 03. Label : grapes img
		lblNewLabel_13.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/grapes1.png")));
		lblNewLabel_13.setBounds(511, 51, 180, 150);
		panel_2.add(lblNewLabel_13);

//		Q 03. Label: banana tts
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/banana.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 03. Label: banana img
		lblNewLabel_14.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/bananas.png")));
		lblNewLabel_14.setBounds(739, 51, 180, 150);
		panel_2.add(lblNewLabel_14);

//		Q 03. Label: background img
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/panel_2.png")));
		lblNewLabel_23.setBounds(0, 0, 973, 655);
		panel_2.add(lblNewLabel_23);

////	Q 04. Quiz 04 /////////////////////////////////////////////////////////////////
		panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 974, 655);
		layeredPane.add(panel_3);
		panel_3.setLayout(null);

//		btnPiano Q 04. btn 01.
		btnPiano = new JButton("piano");
		btnPiano.setBackground(new Color(255, 102, 102));
		btnPiano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(16).getWord());
//				System.out.println(wd);
				if (wd.equals("piano")) {
					btnPiano.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt17 = cnt17 + 1;
				} else {
					btnPiano.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnPiano.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnPiano.setBounds(77, 234, 130, 55);
		panel_3.add(btnPiano);

//		btnKettle Q 04. btn 02.
		JButton btnKettle = new JButton("kettle");
		btnKettle.setBackground(new Color(255, 102, 102));
		btnKettle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(17).getWord());
//				System.out.println(wd);
				if (wd.equals("kettle")) {
					btnKettle.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt18 = cnt18 + 1;
				} else {
					btnKettle.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnKettle.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnKettle.setBounds(308, 234, 130, 55);
		panel_3.add(btnKettle);

//		btnDrum Q 04. btn 03.
		JButton btnDrum = new JButton("drum");
		btnDrum.setBackground(new Color(255, 102, 102));
		btnDrum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(18).getWord());
//				System.out.println(wd);
				if (wd.equals("drum")) {
					btnDrum.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt19 = cnt19 + 1;
				} else {
					btnDrum.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnDrum.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDrum.setBounds(536, 234, 130, 55);
		panel_3.add(btnDrum);

//		btnGuitar Q 04. btn 04.
		btnGuitar = new JButton("guitar");
		btnGuitar.setBackground(new Color(255, 102, 102));
		btnGuitar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(19).getWord());
//				System.out.println(wd);
				if (wd.equals("guitar")) {
					btnGuitar.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt20 = cnt20 + 1;
				} else {
					btnGuitar.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnGuitar.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnGuitar.setBounds(769, 234, 130, 55);
		panel_3.add(btnGuitar);
		
//		Q 04. Label: Which one is an instrument?
		lblNewLabel_25_1_1 = new JLabel("4. Which one is an instrument?");
		lblNewLabel_25_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/whichinstrument.mp3"); // �쓬�꽦異쒕젰
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
		// lblNewLabel_25_1_1.setFont(new Font("Courier New", Font.BOLD, 40));
		lblNewLabel_25_1_1.setFont(pixelMplus);
		lblNewLabel_25_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25_1_1.setBounds(117, 325, 744, 126);
		panel_3.add(lblNewLabel_25_1_1);
		
//		Q 04. Exit btn
		JButton btnNewButton_1_1_1_1 = new JButton("EXIT");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_1_1_1_1.setBackground(new Color(153, 102, 255));
		btnNewButton_1_1_1_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnNewButton_1_1_1_1.setBounds(830, 555, 107, 55);
		panel_3.add(btnNewButton_1_1_1_1);

//		Q 04. Next btn
		JButton btnNewButton_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1.setBackground(new Color(255, 153, 102));
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cnt17>=1 && cnt19>=1 && cnt20>=1) {
					layeredPane.removeAll();
					layeredPane.add(panel_4);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnNewButton_1_1_1.setBounds(433, 555, 107, 55);
		panel_3.add(btnNewButton_1_1_1);

//		Q 04. Label: piano tts 
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/piano.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 04. Label: piano img
		lblNewLabel_25.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/piano.png")));
		lblNewLabel_25.setBounds(49, 51, 180, 150);
		panel_3.add(lblNewLabel_25);

//		Q 04. Label: kettle tts 
		JLabel lblNewLabel_25_1 = new JLabel("");
		lblNewLabel_25_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/kettle.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 04. Label: kettle img
		lblNewLabel_25_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25_1.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/kettle(1).png")));
		lblNewLabel_25_1.setBounds(277, 51, 180, 150);
		panel_3.add(lblNewLabel_25_1);
		
//		Q 04. Label: drum tts 
		JLabel lblNewLabel_25_2 = new JLabel("");
		lblNewLabel_25_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/drum.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 04. Label: drum img		
		lblNewLabel_25_2.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/drum.png")));
		lblNewLabel_25_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25_2.setBounds(511, 51, 180, 150);
		panel_3.add(lblNewLabel_25_2);
		
//		Q 04. Label: guitar tts
		JLabel lblNewLabel_25_3 = new JLabel("");
		lblNewLabel_25_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/guitar.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
		
//		Q 04. Label: guitar img
		lblNewLabel_25_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25_3.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/guitar.png")));
		lblNewLabel_25_3.setBounds(739, 51, 180, 150);
		panel_3.add(lblNewLabel_25_3);
		
//		Q 04. Label: background img
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/panel_1.png")));
		lblNewLabel_26.setBounds(0, 0, 974, 655);
		panel_3.add(lblNewLabel_26);

////	panel_4. Quiz 05(last one)////////////////////////////////////////////////////////////
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 153));
		panel_4.setBounds(0, 0, 973, 655);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);

//		btnCar. Q 05. btn 01.
		btnCar = new JButton("car");
		btnCar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(12).getWord());
//					System.out.println(wd);
				if (wd.equals("car")) {
					btnCar.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt13 = cnt13 + 1;
				} else {
					btnCar.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnCar.setForeground(Color.BLACK);
		btnCar.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnCar.setBackground(new Color(153, 204, 255));
		btnCar.setBounds(77, 234, 130, 55);
		panel_4.add(btnCar);

//		btnPlane. Q 05. btn 02.
		JButton btnPlane = new JButton("plane");
		btnPlane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(14).getWord());
//					System.out.println(wd);
				if (wd.equals("plane")) {
					btnPlane.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt14 = cnt14 + 1;
				} else {
					btnPlane.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnPlane.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnPlane.setBackground(new Color(153, 204, 255));
		btnPlane.setBounds(308, 234, 130, 55);
		panel_4.add(btnPlane);

//		btnTrain. Q 05. btn 03.
		JButton btnTrain = new JButton("train");
		btnTrain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(15).getWord());
//					System.out.println(wd);
				if (wd.equals("train")) {
					btnTrain.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt15 = cnt15 + 1;
				} else {
					btnTrain.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnTrain.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnTrain.setBackground(new Color(153, 204, 255));
		btnTrain.setBounds(536, 234, 130, 55);
		panel_4.add(btnTrain);

//		btnFlower. Q 05. btn 04.
		btnFlower = new JButton("flower");
		btnFlower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wd = (wdArray.get(13).getWord());
//					System.out.println(wd);
				if (wd.equals("flower")) {
					btnFlower.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
					File f2 = new File("./mp3/correct tone.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
					cnt16 = cnt16 + 1;
				} else {
					btnFlower.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
					File f2 = new File("./mp3/mistake_bell.mp3");
					MP3Player mp3 = new MP3Player(f2);
					mp3.play();
				}
			}
		});
		btnFlower.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnFlower.setBackground(new Color(153, 204, 255));
		btnFlower.setBounds(769, 234, 130, 55);
		panel_4.add(btnFlower);

//		Q 05. Label: which one is transport?
		lblWhichOneIs_1_1 = new JLabel("5. Which one is transport?");
		lblWhichOneIs_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/whichtransport.mp3"); // �쓬�꽦 異쒕젰
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});
		lblWhichOneIs_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhichOneIs_1_1.setForeground(Color.BLACK);
		// lblWhichOneIs_1_1.setFont(new Font("Courier New", Font.BOLD, 40));
		lblWhichOneIs_1_1.setFont(pixelMplus);
		lblWhichOneIs_1_1.setBounds(145, 348, 693, 112);
		panel_4.add(lblWhichOneIs_1_1);

//		Q 05. Exit btn
		JButton btnExit_2_1 = new JButton("EXIT");
		btnExit_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cnt13>=1 && cnt14>= 1 && cnt15 >= 1) {
//					lblNewLabel_1.setVisible(true);
//					panel_3_1.add(lblNewLabel_1);
//					layeredPane.removeAll();
//					layeredPane.add(panel_3_1);
//					layeredPane.repaint();
//					layeredPane.revalidate();
				}
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnExit_2_1.setForeground(Color.WHITE);
		btnExit_2_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		btnExit_2_1.setBackground(new Color(153, 102, 255));
		btnExit_2_1.setBounds(830, 555, 107, 55);
		panel_4.add(btnExit_2_1);

//		Q 05. Label: The end
		lblNewLabel_1 = new JLabel("The end.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(102, 102, 153));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1.setBounds(370, 555, 218, 55);
		panel_4.add(lblNewLabel_1);

//		Q 05. Label: plane tts 
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/plane.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 05. Label: plane img
		lblNewLabel_5.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/airplane.png")));
		lblNewLabel_5.setBounds(277, 51, 180, 150);
		panel_4.add(lblNewLabel_5);

//		Q 05. Label: car tts 
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/car.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 05. Label: car img
		lblNewLabel_15.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/car.png")));
		lblNewLabel_15.setBounds(49, 51, 180, 150);
		panel_4.add(lblNewLabel_15);

//		Q 05. Label: train tts 
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/train.mp3");
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 05. Label: train img
		lblNewLabel_16.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/Train.png")));
		lblNewLabel_16.setBounds(511, 51, 180, 150);
		panel_4.add(lblNewLabel_16);

//		Q 05. Label: flower tts 
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File f2 = new File("./mp3/flower.mp3"); // �쓬�꽦 異쒕젰
				MP3Player mp3 = new MP3Player(f2);
				mp3.play();
			}
		});

//		Q 05. Label: flower img
		lblNewLabel_17.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/flower1.png")));
		lblNewLabel_17.setBounds(739, 51, 180, 150);
		panel_4.add(lblNewLabel_17);

//		Q 05. Label: background
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon(Play01_gui.class.getResource("/grimbang/pn_3(1).png")));
		lblNewLabel_24.setBounds(0, 0, 973, 655);
		panel_4.add(lblNewLabel_24);

	}
}
