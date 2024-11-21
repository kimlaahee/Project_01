package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import GAME_2.GAME_2;
import WordImagepckg.WordImageClass; 
import project01_2_gui.Play01_gui;
import project.earth_1;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class title extends JFrame {

	private JPanel contentPane;
	Font pixelMplus;
	private JTextField textField;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					title frame = new title(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param selname 
	 * @param name 
	 */
	public title(String name) {
		
		Dimension frameSize = getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getSize().width) / 2 - 500;
		int y = (screenSize.height - getSize().height) / 2 - 352;
			
		try {
			pixelMplus=Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")).deriveFont(40f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")));
		}
		catch(IOException | FontFormatException e) {
			
		}
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,1000,705);
		contentPane = new JPanel();
		
		JLabel StartButton = new JLabel("Click the Icon!");
		StartButton.setBounds(318, 433, 357, 59);
		contentPane.add(StartButton);
		StartButton.setFont(pixelMplus);
		StartButton.setHorizontalAlignment(JLabel.CENTER);
			
		JLabel START_ImageRoler = new JLabel("");
		START_ImageRoler.setBorder(BorderFactory.createLineBorder(Color.BLACK,3,true));
		START_ImageRoler.setIcon(new ImageIcon(title.class.getResource("/title/tut0.png")));
		START_ImageRoler.setBounds(269, 90, 450, 450);
		contentPane.add(START_ImageRoler);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				START_ImageRoler.setIcon(new ImageIcon(title.class.getResource("/title/tut0.png")));
				StartButton.setVisible(false);
			}
		});
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setForeground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JButton btnNewButton = new JButton("Nice to meets you!");
		btnNewButton.setFont(pixelMplus);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(44, 24, 394, 41);
		contentPane.add(btnNewButton);

	
		
		JButton GAME_1B = new JButton("");
		GAME_1B.setOpaque(false);
		GAME_1B.setBackground(new Color(204, 204, 255));
		GAME_1B.setBorder(null);
		GAME_1B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		GAME_1B.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				START_ImageRoler.setIcon(new ImageIcon(title.class.getResource("/title/tut1.png")));
				contentPane.setBackground(new Color(240, 255, 214));
				StartButton.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new GAME_2(name).setVisible(true);
			}
		});
		GAME_1B.setIcon(new ImageIcon(title.class.getResource("/title/button1.png")));
		GAME_1B.setBounds(44, 90, 180, 225);
		contentPane.add(GAME_1B);
		
	
		
		

		JButton GAME_2B = new JButton("");
		GAME_2B.setOpaque(false);
		GAME_2B.setBackground(new Color(204, 204, 255));
		GAME_2B.setBorder(null);
		GAME_2B.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				START_ImageRoler.setIcon(new ImageIcon(title.class.getResource("/title/tut2.png")));
				contentPane.setBackground(new Color(225, 245, 255));
				StartButton.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Play01_gui(name).setVisible(true);
			}
		});
		GAME_2B.setIcon(new ImageIcon(title.class.getResource("/title/button2.png")));
		GAME_2B.setBounds(763, 90, 180, 225);
		contentPane.add(GAME_2B);
	
		
		
		JButton GAME_3B = new JButton("");
		GAME_3B.setOpaque(false);
		GAME_3B.setBackground(new Color(204, 204, 255));
		GAME_3B.setBorder(null);
		GAME_3B.setIcon(new ImageIcon(title.class.getResource("/title/button3.png")));
		GAME_3B.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new earth_1(name).setVisible(true);
				contentPane.setBackground(new Color(255, 248, 255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				START_ImageRoler.setIcon(new ImageIcon(title.class.getResource("/title/tut3.png")));
				contentPane.setBackground(new Color(255, 236, 243));
				StartButton.setVisible(true);
				
			}
		});
		GAME_3B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GAME_3B.setBounds(44, 315, 180, 225);
		contentPane.add(GAME_3B);
		
		
		
		
		JButton GAME_4B = new JButton("");
		GAME_4B.setBackground(new Color(204, 204, 255));
		GAME_4B.setBorder(null);
		GAME_4B.setOpaque(false);
		GAME_4B.setIcon(new ImageIcon(title.class.getResource("/title/button4.png")));
		GAME_4B.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new WordImageClass(name).setVisible(true);
				new WordImageClass(name).setLocation(500,200);
//				contentPane.removeAll();
//				contentPane.add(panel);
//				contentPane.repaint();
//				contentPane.revalidate();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				START_ImageRoler.setIcon(new ImageIcon(title.class.getResource("/title/tut4.png")));
				contentPane.setBackground(new Color(255, 248, 225));
				StartButton.setVisible(true);
			}
		});
		GAME_4B.setBounds(763, 315, 180, 225);
		contentPane.add(GAME_4B);
		
		
		
		
		JButton EXIT = new JButton("\uB098\uAC00\uAE30");
		EXIT.setBackground(new Color(204, 204, 255));
		EXIT.setBorder(null);
		EXIT.setOpaque(false);
		EXIT.setFont(pixelMplus);
		EXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EXIT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(ABORT);
			}
		});
		EXIT.setBounds(704, 568, 268, 88);
		contentPane.add(EXIT);
		
		JButton btnNewButton_1 = new JButton((String) null);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(206, 24, 260, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(name);
		btnNewButton.setFont(pixelMplus);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(409, 24, 310, 41);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1.setFont(pixelMplus);
		btnNewButton_2.setFont(pixelMplus);

	}
}






