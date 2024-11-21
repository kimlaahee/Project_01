package WordImagepckg;

import java.awt.EventQueue;

import projectDAO.DAOClass;
import projectDAO1.DAOClass1;
import projectDAO_erd_dr1.ERDClass_dr1;
import projectDAO_erd_dr2.ERDClass_dr2;
import projectDAO_erd_ul.ERDClass_ul;
import projectDAO_erd_uw.ERDClass_uw;
import projectDAO_userinfo1.DAOClass_userinfo1;
import projectDAO_userinfo2.DAOClass_userinfo2;
import projectVO_image.VOClass_image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import Main.title;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import java.awt.FontFormatException;
import java.io.IOException;

public class WordImageClass extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	DAOClass dao_i;
	ArrayList <VOClass_image> proArray;
	
	int sum=0;
	
	JLayeredPane layeredPane;
	JPanel panel;
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;
	JPanel panel_4;
	JPanel panel_5;
	JPanel panel_6;
	JPanel panel_7;
	JPanel panel_8;
	JPanel panel_9;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	JLabel lblNewLabel;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_2_1;
	JLabel lblNewLabel_2_1_1;
	JLabel lblNewLabel_2_1_1_1;
	JLabel lblNewLabel_2_1_1_1_1;
	JLabel lblNewLabel_2_1_1_1_1_1;
	JLabel lblNewLabel_2_1_1_1_1_1_1;
	JLabel lblNewLabel_2_1_1_1_1_1_1_1;
	JLabel lblNewLabel_2_1_1_1_1_1_1_1_1;
	
	JButton btnNewButton;
	JButton btnNewButton_2;
	JButton btnNewButton_2_1;
	JButton btnNewButton_2_1_1;
	JButton btnNewButton_2_1_1_1;
	JButton btnNewButton_2_1_1_1_1;
	JButton btnNewButton_2_1_1_1_1_1;
	JButton btnNewButton_2_1_1_1_1_1_1;
	JButton btnNewButton_2_1_1_1_1_1_1_1;
	JButton btnNewButton_2_1_1_1_1_1_1_1_1;
	
	
	JButton btnNewButton_1;
	JButton btnNewButton_1_1;
	JButton btnNewButton_1_1_1;
	JButton btnNewButton_1_1_1_1;
	JButton btnNewButton_1_1_1_1_1;
	JButton btnNewButton_1_1_1_1_1_1;
	JButton btnNewButton_1_1_1_1_1_1_1;
	JButton btnNewButton_1_1_1_1_1_1_1_1;
	JButton btnNewButton_1_1_1_1_1_1_1_1_1;
	JButton btnNewButton_1_1_1_1_1_1_1_1_1_1;
	
	JButton btnNewButton_3;
	
	
	Font pixelMplus;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordImageClass frame = new WordImageClass(null);
					frame.setVisible(true);
					frame.setLocation(500,200);
					frame.setResizable(false);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public WordImageClass(String name) {
		
		Dimension frameSize = getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getSize().width) / 2 - 500;
		int y = (screenSize.height - getSize().height) / 2 - 352;
		
		try {
			dao_i = new DAOClass();
			proArray=dao_i.getAllInfo();
			} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
			} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
			}
		
		try {
			pixelMplus=Font.createFont(Font.TRUETYPE_FONT, new File("DUNGGEUNMO.TTF")).deriveFont(40f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("DUNGGEUNMO.TTF")));
		}
		catch(IOException | FontFormatException e) {
			
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,1000,705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, "name_256506431689300");
		
		panel = new JPanel();
		panel.setBounds(0, 0, 974, 656);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_3.setForeground(new Color(51, 153, 0));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(255, 204, 153));
		btnNewButton_3.setFont(pixelMplus);
		btnNewButton_3.setBounds(845, 570, 103, 51);
		panel.add(btnNewButton_3);
		
		lblNewLabel = new JLabel("Q1. What is he doing?");
		lblNewLabel.setFont(pixelMplus);
		//lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel.setBounds(151, 42, 556, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/jump.jpg")));
		lblNewLabel_1.setBounds(215, 144, 537, 318);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField.setBounds(253, 472, 464, 51);
		textField.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("CHECK");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setForeground(new Color(51, 153, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				if (btnNewButton.isEnabled()) {
				String answer=textField.getText();	
				if (answer.equals(proArray.get(0).getWord())) {
					textField.setForeground(Color.GREEN);
					textField.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(0).getWord()) && (textField.getForeground().equals(Color.RED))) {
					textField.setForeground(Color.GREEN);
					textField.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));	
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(0).getWord()) && (textField.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField.setForeground(Color.RED);
					textField.setText(proArray.get(0).getWord());
					textField.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
				}
				btnNewButton.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton.setEnabled(true);
				} else if (!answer.equals(proArray.get(0).getWord()) && (!textField.getForeground().equals(Color.RED))) {
					textField.setForeground(Color.RED);
					textField.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField.setFont(new Font("Arial", Font.PLAIN, 30));
					textField.setText("Try again!");
					btnNewButton.setEnabled(true);
				}
			}
			}
		});
		//btnNewButton.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton.setFont(pixelMplus);
		btnNewButton.setBounds(405, 570, 181, 51);
		//btnNewButton.setBorder(BorderFactory.createLineBorder(Color.PINK, 3, true));
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1.setFont(pixelMplus);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_1);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField.getText().equals(proArray.get(0).getWord())) && (textField.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_1);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1.setBounds(845, 503, 103, 51);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 =  new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_5.setBounds(55, 70, 817, 526);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_4.setBounds(0, 0, 974, 656);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_3.setBounds(0, 0, 974, 656);
		panel.add(lblNewLabel_3);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_4.setForeground(new Color(51, 153, 0));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(255, 204, 153));
		btnNewButton_4.setFont(pixelMplus);
		btnNewButton_4.setBounds(845, 570, 103, 51);
		panel_1.add(btnNewButton_4);
		
		lblNewLabel_2 = new JLabel("Q2. What is he doing?");
		lblNewLabel_2.setFont(pixelMplus);
		//lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2.setBounds(151, 42, 556, 61);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/study.jpg")));
		lblNewLabel_1_1.setBounds(215, 144, 537, 318);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 40));
		textField_1.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_1.setColumns(10);
		textField_1.setBounds(253, 472, 464, 51);
		panel_1.add(textField_1);
		
		btnNewButton_2 = new JButton("CHECK");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setForeground(new Color(51, 153, 0));
		btnNewButton_2.setBackground(new Color(255, 204, 153));
		btnNewButton_2.setFont(pixelMplus);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2.isEnabled()) {
				String answer=textField_1.getText();
				if (answer.equals(proArray.get(1).getWord())) {
					textField_1.setForeground(Color.GREEN);
					textField_1.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(1).getWord()) && (textField_1.getForeground().equals(Color.RED))) {
					textField_1.setForeground(Color.GREEN);
					textField_1.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(1).getWord()) && (textField_1.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_1.setForeground(Color.RED);
					textField_1.setText(proArray.get(1).getWord());
					textField_1.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2.setEnabled(true);
				} else if (!answer.equals(proArray.get(1).getWord()) && (!textField_1.getForeground().equals(Color.RED))) {
					textField_1.setForeground(Color.RED);
					textField_1.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_1.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_1.setText("Try again!");
					btnNewButton_2.setEnabled(true);
				}
			}
			}
		});
		//btnNewButton_2.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2.setBounds(405, 570, 181, 51);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_1_1 = new JButton("NEXT");
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1.setFont(pixelMplus);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_1.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_2);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_1.getText().equals(proArray.get(1).getWord())) && (textField_1.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_2);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_1);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(845, 503, 103, 51);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_8.setBounds(55, 70, 817, 526);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_7.setBounds(0, 0, 974, 656);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_6.setBounds(0, 0, 974, 656);
		panel_1.add(lblNewLabel_6);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_5 = new JButton("EXIT");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(255, 204, 153));
		btnNewButton_5.setForeground(new Color(51, 153, 0));
		btnNewButton_5.setFont(pixelMplus);
		btnNewButton_5.setBounds(845, 570, 103, 51);
		panel_2.add(btnNewButton_5);
		
		lblNewLabel_2_1 = new JLabel("Q3. What is it?");
		lblNewLabel_2_1.setFont(pixelMplus);
		//lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1.setBounds(151, 42, 556, 61);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/school.jpg")));
		lblNewLabel_1_1_1.setBounds(215, 144, 537, 318);
		panel_2.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.BOLD, 40));
		textField_2.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_2.setColumns(10);
		textField_2.setBounds(253, 472, 464, 51);
		panel_2.add(textField_2);
		
		btnNewButton_2_1 = new JButton("CHECK");
		btnNewButton_2_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1.setFont(pixelMplus);
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2_1.isEnabled()) {
				String answer=textField_2.getText();
				if (answer.equals(proArray.get(2).getWord())) {
					textField_2.setForeground(Color.GREEN);
					textField_2.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(2).getWord()) && (textField_2.getForeground().equals(Color.RED))) {
					textField_2.setForeground(Color.GREEN);
					textField_2.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(2).getWord()) && (textField_2.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_2.setForeground(Color.RED);
					textField_2.setText(proArray.get(2).getWord());
					textField_2.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(2).getWord()) && (!textField_2.getForeground().equals(Color.RED))) {
					textField_2.setForeground(Color.RED);
					textField_2.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_2.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_2.setText("Try again!");
					btnNewButton_2_1.setEnabled(true);
			  }
				}
			}
		});
		//btnNewButton_2_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1.setBounds(405, 570, 181, 51);
		panel_2.add(btnNewButton_2_1);
		
		btnNewButton_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_2.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_3);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_2.getText().equals(proArray.get(2).getWord())) && (textField_2.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_3);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_2);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1.setBounds(845, 503, 103, 51);
		panel_2.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_11.setBounds(55, 70, 817, 526);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_10.setBounds(0, 0, 974, 656);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_9.setBounds(0, 0, 974, 656);
		panel_2.add(lblNewLabel_9);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_3);
		panel_3.setLayout(null);
		
		btnNewButton_6 = new JButton("EXIT");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(new Color(255, 204, 153));
		btnNewButton_6.setForeground(new Color(51, 153, 0));
		btnNewButton_6.setFont(pixelMplus);
		btnNewButton_6.setBounds(845, 570, 103, 51);
		panel_3.add(btnNewButton_6);
		
		lblNewLabel_2_1_1 = new JLabel("Q4. Who is she?");
		lblNewLabel_2_1_1.setFont(pixelMplus);
		//lblNewLabel_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1.setBounds(151, 42, 556, 61);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/teacher.png")));
		lblNewLabel_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_3.setFont(new Font("Arial", Font.BOLD, 40));
		textField_3.setColumns(10);
		textField_3.setBounds(253, 472, 464, 51);
		panel_3.add(textField_3);
		
		btnNewButton_2_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1.setBorder(null);
		btnNewButton_2_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2_1_1.isEnabled()) {
				String answer=textField_3.getText();
				if (answer.equals(proArray.get(3).getWord())) {
					textField_3.setForeground(Color.GREEN);
					textField_3.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(3).getWord()) && (textField_3.getForeground().equals(Color.RED))) {
					textField_3.setForeground(Color.GREEN);
					textField_3.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(3).getWord()) && (textField_3.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_3.setForeground(Color.RED);
					textField_3.setText(proArray.get(3).getWord());
					textField_3.setBorder(BorderFactory.createLineBorder(Color.RED,5,true));	
				}
				btnNewButton_2_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(3).getWord()) && (!textField_3.getForeground().equals(Color.RED))) {
					textField_3.setForeground(Color.RED);
					textField_3.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_3.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_3.setText("Try again!");
					btnNewButton_2_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1.setBounds(405, 570, 181, 51);
		panel_3.add(btnNewButton_2_1_1);
		
		btnNewButton_1_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				if (textField_3.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_4);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_3.getText().equals(proArray.get(3).getWord())) && (textField_3.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_4);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_3);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1.setBounds(845, 503, 103, 51);
		panel_3.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_14.setBounds(55, 70, 817, 526);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_13.setBounds(0, 0, 974, 656);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_12.setBounds(0, 0, 974, 656);
		panel_3.add(lblNewLabel_12);
		
		panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		
		btnNewButton_7 = new JButton("EXIT");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(new Color(255, 204, 153));
		btnNewButton_7.setForeground(new Color(51, 153, 0));
		btnNewButton_7.setFont(pixelMplus);
		btnNewButton_7.setBounds(845, 570, 103, 51);
		panel_4.add(btnNewButton_7);
		
		lblNewLabel_2_1_1_1 = new JLabel("Q5. What are these?");
		//lblNewLabel_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1_1.setFont(pixelMplus);
		lblNewLabel_2_1_1_1.setBounds(151, 42, 556, 61);
		panel_4.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/shoes.jpg")));
		lblNewLabel_1_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_4.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.BOLD, 40));
		textField_4.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_4.setColumns(10);
		textField_4.setBounds(253, 472, 464, 51);
		panel_4.add(textField_4);
		
		btnNewButton_2_1_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1_1.setBorder(null);
		btnNewButton_2_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2_1_1_1.isEnabled()) {
				String answer=textField_4.getText();
				if (answer.equals(proArray.get(4).getWord())) {
					textField_4.setForeground(Color.GREEN);
					textField_4.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(4).getWord()) && (textField_4.getForeground().equals(Color.RED))) {
					textField_4.setForeground(Color.GREEN);
					textField_4.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(4).getWord()) && (textField_4.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_4.setForeground(Color.RED);
					textField_4.setText(proArray.get(4).getWord());
					textField_4.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(4).getWord()) && (!textField_4.getForeground().equals(Color.RED))) {
					textField_4.setForeground(Color.RED);
					textField_4.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_4.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_4.setText("Try again!");
					btnNewButton_2_1_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1_1.setBounds(405, 570, 181, 51);
		panel_4.add(btnNewButton_2_1_1_1);
		
		btnNewButton_1_1_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_4.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_5);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_4.getText().equals(proArray.get(4).getWord())) && (textField_4.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_5);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_4);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1.setBounds(845, 503, 103, 51);
		panel_4.add(btnNewButton_1_1_1_1_1);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_17.setBounds(55, 70, 817, 526);
		panel_4.add(lblNewLabel_17);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_16.setBounds(0, 0, 974, 656);
		panel_4.add(lblNewLabel_16);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_15.setBounds(0, 0, 974, 656);
		panel_4.add(lblNewLabel_15);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_5);
		panel_5.setLayout(null);
		
		btnNewButton_8 = new JButton("EXIT");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setBackground(new Color(255, 204, 153));
		btnNewButton_8.setForeground(new Color(51, 153, 0));
		btnNewButton_8.setFont(pixelMplus);
		btnNewButton_8.setBounds(845, 570, 103, 51);
		panel_5.add(btnNewButton_8);
		
		lblNewLabel_2_1_1_1_1 = new JLabel("Q6. What is it?");
		lblNewLabel_2_1_1_1_1.setFont(pixelMplus);
		//lblNewLabel_2_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1_1_1.setBounds(151, 42, 556, 61);
		panel_5.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/carrot.jpg")));
		lblNewLabel_1_1_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_5.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.BOLD, 40));
		textField_5.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_5.setColumns(10);
		textField_5.setBounds(253, 472, 464, 51);
		panel_5.add(textField_5);
		
		btnNewButton_2_1_1_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1_1_1.setBorder(null);
		btnNewButton_2_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2_1_1_1_1.isEnabled()) {
				String answer=textField_5.getText();
				if (answer.equals(proArray.get(5).getWord())) {
					textField_5.setForeground(Color.GREEN);
					textField_5.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(5).getWord()) && (textField_5.getForeground().equals(Color.RED))) {
					textField_5.setForeground(Color.GREEN);
					textField_5.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(5).getWord()) && (textField_5.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_5.setForeground(Color.RED);
					textField_5.setText(proArray.get(5).getWord());
					textField_5.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1_1_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(5).getWord()) && (!textField_5.getForeground().equals(Color.RED))) {
					textField_5.setForeground(Color.RED);
					textField_5.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_5.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_5.setText("Try again!");
					btnNewButton_2_1_1_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1_1_1.setBounds(405, 570, 181, 51);
		panel_5.add(btnNewButton_2_1_1_1_1);
		
		btnNewButton_1_1_1_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				if (textField_5.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_6);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_5.getText().equals(proArray.get(5).getWord())) && (textField_5.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_6);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_5);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1_1.setBounds(845, 503, 103, 51);
		panel_5.add(btnNewButton_1_1_1_1_1_1);
		
		lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_20.setBounds(55, 70, 817, 526);
		panel_5.add(lblNewLabel_20);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_19.setBounds(0, 0, 974, 656);
		panel_5.add(lblNewLabel_19);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_18.setBounds(0, 0, 974, 656);
		panel_5.add(lblNewLabel_18);
		
		panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_6);
		panel_6.setLayout(null);
		
		btnNewButton_9 = new JButton("EXIT");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(new Color(255, 204, 153));
		btnNewButton_9.setForeground(new Color(51, 153, 0));
		btnNewButton_9.setFont(pixelMplus);
		btnNewButton_9.setBounds(845, 570, 103, 51);
		panel_6.add(btnNewButton_9);
		
		lblNewLabel_2_1_1_1_1_1 = new JLabel("Q7. What is it?");
		lblNewLabel_2_1_1_1_1_1.setFont(pixelMplus);
		//lblNewLabel_2_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1_1_1_1.setBounds(151, 42, 556, 61);
		panel_6.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/clock.jpg")));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_6.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.BOLD, 40));
		textField_6.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_6.setColumns(10);
		textField_6.setBounds(253, 472, 464, 51);
		panel_6.add(textField_6);
		
		btnNewButton_2_1_1_1_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1_1_1_1.setBorder(null);
		btnNewButton_2_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				if (btnNewButton_2_1_1_1_1_1.isEnabled()) {
				String answer=textField_6.getText();
				if (answer.equals(proArray.get(6).getWord())) {
					textField_6.setForeground(Color.GREEN);
					textField_6.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(6).getWord()) && (textField_6.getForeground().equals(Color.RED))) {
					textField_6.setForeground(Color.GREEN);
					textField_6.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(6).getWord()) && (textField_6.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_6.setForeground(Color.RED);
					textField_6.setText(proArray.get(6).getWord());
					textField_6.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1_1_1_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1_1_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(6).getWord()) && (!textField_6.getForeground().equals(Color.RED))) {
					textField_6.setForeground(Color.RED);
					textField_6.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_6.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_6.setText("Try again!");
					btnNewButton_2_1_1_1_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1_1_1_1.setBounds(405, 570, 181, 51);
		panel_6.add(btnNewButton_2_1_1_1_1_1);
		
		btnNewButton_1_1_1_1_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_6.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_7);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_6.getText().equals(proArray.get(6).getWord())) && (textField_6.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_7);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_6);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1_1_1.setBounds(845, 503, 103, 51);
		panel_6.add(btnNewButton_1_1_1_1_1_1_1);
		
		lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_23.setBounds(55, 70, 817, 526);
		panel_6.add(lblNewLabel_23);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_22.setBounds(0, 0, 974, 656);
		panel_6.add(lblNewLabel_22);
		
		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_21.setBounds(0, 0, 974, 656);
		panel_6.add(lblNewLabel_21);
		
		panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_7);
		panel_7.setLayout(null);
		
		btnNewButton_10 = new JButton("EXIT");
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_10.setFont(pixelMplus);
		btnNewButton_10.setBorder(null);
		btnNewButton_10.setForeground(new Color(51, 153, 0));
		btnNewButton_10.setBackground(new Color(255, 204, 153));
		btnNewButton_10.setBounds(845, 570, 103, 51);
		panel_7.add(btnNewButton_10);
		
		lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Q8. What is it?");
		//lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1_1_1_1_1.setFont(pixelMplus);
		lblNewLabel_2_1_1_1_1_1_1.setBounds(151, 42, 556, 61);
		panel_7.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/pencil.jpg")));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_7.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.BOLD, 40));
		textField_7.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_7.setColumns(10);
		textField_7.setBounds(253, 472, 464, 51);
		panel_7.add(textField_7);
		
		btnNewButton_2_1_1_1_1_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1_1_1_1_1.setBorder(null);
		btnNewButton_2_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				if (btnNewButton_2_1_1_1_1_1_1.isEnabled()) {
				String answer=textField_7.getText();
				if (answer.equals(proArray.get(7).getWord())) {
					textField_7.setForeground(Color.GREEN);
					textField_7.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(7).getWord()) && (textField_7.getForeground().equals(Color.RED))) {
					textField_7.setForeground(Color.GREEN);
					textField_7.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(7).getWord()) && (textField_7.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_7.setForeground(Color.RED);
					textField_7.setText(proArray.get(7).getWord());
					textField_7.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1_1_1_1_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1_1_1_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(7).getWord()) && (!textField_7.getForeground().equals(Color.RED))) {
					textField_7.setForeground(Color.RED);
					textField_7.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_7.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_7.setText("Try again");
					btnNewButton_2_1_1_1_1_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1_1_1_1_1.setBounds(405, 570, 181, 51);
		panel_7.add(btnNewButton_2_1_1_1_1_1_1);
		
		btnNewButton_1_1_1_1_1_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_7.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_8);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_7.getText().equals(proArray.get(7).getWord())) && (textField_7.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_8);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_7);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
			}
		});
		//btnNewButton_1_1_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1_1_1_1.setBounds(845, 503, 103, 51);
		panel_7.add(btnNewButton_1_1_1_1_1_1_1_1);
		
		lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_26.setBounds(55, 70, 817, 526);
		panel_7.add(lblNewLabel_26);
		
		lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_25.setBounds(0, 0, 974, 656);
		panel_7.add(lblNewLabel_25);
		
		lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_24.setBounds(0, 0, 974, 656);
		panel_7.add(lblNewLabel_24);
		
		panel_8 = new JPanel();
		panel_8.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_8);
		panel_8.setLayout(null);
		
		btnNewButton_11 = new JButton("EXIT");
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_11.setFont(pixelMplus);
		btnNewButton_11.setBorder(null);
		btnNewButton_11.setBackground(new Color(255, 204, 153));
		btnNewButton_11.setForeground(new Color(51, 153, 0));
		btnNewButton_11.setBounds(845, 570, 103, 51);
		panel_8.add(btnNewButton_11);
		
		lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Q9. What is she doing?");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(pixelMplus);
		//lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(151, 42, 556, 61);
		panel_8.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/sleep.jpg")));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_8.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.BOLD, 40));
		textField_8.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_8.setColumns(10);
		textField_8.setBounds(253, 472, 464, 51);
		panel_8.add(textField_8);
		
		btnNewButton_2_1_1_1_1_1_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1_1_1_1_1_1.setBorder(null);
		btnNewButton_2_1_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2_1_1_1_1_1_1_1.isEnabled()) {
				String answer=textField_8.getText();
				if (answer.equals(proArray.get(8).getWord())) {
					textField_8.setForeground(Color.GREEN);
					textField_8.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(8).getWord()) && (textField_8.getForeground().equals(Color.RED))) {
					textField_8.setForeground(Color.GREEN);
					textField_8.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(8).getWord()) && (textField_8.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_8.setForeground(Color.RED);
					textField_8.setText(proArray.get(8).getWord());
					textField_8.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1_1_1_1_1_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1_1_1_1_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(8).getWord()) && (!textField_8.getForeground().equals(Color.RED))) {
					textField_8.setForeground(Color.RED);
					textField_8.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_8.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_8.setText("Try again!");
					btnNewButton_2_1_1_1_1_1_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1_1_1_1_1_1.setBounds(405, 570, 181, 51);
		panel_8.add(btnNewButton_2_1_1_1_1_1_1_1);
		
		btnNewButton_1_1_1_1_1_1_1_1_1 = new JButton("NEXT");
		btnNewButton_1_1_1_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_8.getForeground().equals(Color.GREEN)) {			
					layeredPane.removeAll();
					layeredPane.add(panel_9);
					layeredPane.repaint();
					layeredPane.revalidate();				
				} else if ((textField_8.getText().equals(proArray.get(8).getWord())) && (textField_8.getForeground().equals(Color.RED))) {
					layeredPane.removeAll();
					layeredPane.add(panel_9);
					layeredPane.repaint();
					layeredPane.revalidate();
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_8);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
				btnNewButton_1_1_1_1_1_1_1_1_1_1.setVisible(true);
				btnNewButton_12.setVisible(true);
			}
		});
		//btnNewButton_1_1_1_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1_1_1_1_1.setBounds(845, 503, 103, 51);
		panel_8.add(btnNewButton_1_1_1_1_1_1_1_1_1);
		
		lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_29.setBounds(55, 70, 817, 526);
		panel_8.add(lblNewLabel_29);
		
		lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_28.setBounds(0, 0, 974, 656);
		panel_8.add(lblNewLabel_28);
		
		lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_27.setBounds(0, 0, 974, 656);
		panel_8.add(lblNewLabel_27);
		
		panel_9 = new JPanel();
		panel_9.setBounds(0, 0, 974, 656);
		layeredPane.add(panel_9);
		panel_9.setLayout(null);
		
		btnNewButton_12 = new JButton("EXIT");
		btnNewButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		btnNewButton_12.setVisible(false);
		btnNewButton_12.setFont(pixelMplus);
		btnNewButton_12.setBackground(new Color(255, 204, 153));
		btnNewButton_12.setForeground(new Color(51, 153, 0));
		btnNewButton_12.setBorder(null);
		btnNewButton_12.setBounds(863, 570, 103, 51);
		panel_9.add(btnNewButton_12);
		
		lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Q10. What is it?");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(pixelMplus);
		//lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(151, 42, 556, 61);
		panel_9.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/duck.jpg")));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(215, 144, 537, 318);
		panel_9.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
		textField_9.setFont(new Font("Arial", Font.BOLD, 40));
		textField_9.setColumns(10);
		textField_9.setBounds(253, 472, 464, 51);
		panel_9.add(textField_9);
		
		btnNewButton_2_1_1_1_1_1_1_1_1 = new JButton("CHECK");
		btnNewButton_2_1_1_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1_1_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_2_1_1_1_1_1_1_1_1.setBorder(null);
		btnNewButton_2_1_1_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_2_1_1_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_2_1_1_1_1_1_1_1_1.isEnabled()) {
				String answer=textField_9.getText();
				if (answer.equals(proArray.get(9).getWord())) {
					textField_9.setForeground(Color.GREEN);
					textField_9.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (answer.equals(proArray.get(9).getWord()) && (textField_9.getForeground().equals(Color.RED))) {
					textField_9.setForeground(Color.GREEN);
					textField_9.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));
					JOptionPane.showMessageDialog(null, "Great Job!!");
					sum=sum+1;
				} else if (!answer.equals(proArray.get(9).getWord()) && (textField_9.getForeground().equals(Color.RED))){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					textField_9.setForeground(Color.RED);
					textField_9.setText(proArray.get(9).getWord());
					textField_9.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));	
				}
				btnNewButton_2_1_1_1_1_1_1_1_1.setEnabled(false);
				if (answer.equals("")) {
					JOptionPane.showMessageDialog(null, "OOPSY!!\nWrite the Answer😀");
					btnNewButton_2_1_1_1_1_1_1_1_1.setEnabled(true);
				} else if (!answer.equals(proArray.get(9).getWord()) && (!textField_9.getForeground().equals(Color.RED))) {
					textField_9.setForeground(Color.RED);
					textField_9.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
					textField_9.setFont(new Font("Arial", Font.PLAIN, 30));
					textField_9.setText("Try again!");
					btnNewButton_2_1_1_1_1_1_1_1_1.setEnabled(true);
				}
				}
			}
		});
		//btnNewButton_2_1_1_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_2_1_1_1_1_1_1_1_1.setBounds(405, 570, 181, 51);
		panel_9.add(btnNewButton_2_1_1_1_1_1_1_1_1);
		
		btnNewButton_1_1_1_1_1_1_1_1_1_1 = new JButton("RESULT");
		btnNewButton_1_1_1_1_1_1_1_1_1_1.setVisible(false);
		btnNewButton_1_1_1_1_1_1_1_1_1_1.setForeground(new Color(51, 153, 0));
		btnNewButton_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1_1_1_1_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1_1_1_1_1_1_1.setFont(pixelMplus);
		btnNewButton_1_1_1_1_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {		
			@Override
			public void mousePressed(MouseEvent e) {
				if (btnNewButton_1_1_1_1_1_1_1_1_1_1.isEnabled()) {
				if (textField_9.getText().equals(proArray.get(9).getWord())) {
					DefaultPieDataset dset2= new DefaultPieDataset();
					dset2.setValue("Incorrect", 10-sum);	
					dset2.setValue("Correct", sum);
					
					JFreeChart jfchart2=
					ChartFactory.createPieChart3D("Test Results", dset2, true, true, false); 
					jfchart2.setBackgroundPaint(Color.YELLOW);
					jfchart2.getTitle().setFont(new Font("Courier New",Font.BOLD,15));
					
					ChartFrame cf2=new ChartFrame("", jfchart2);
					cf2.pack();
					cf2.setBounds(100,1000,1000,705);
					cf2.setVisible(true);
					
					cf2.setLocation(500,200);
					cf2.setResizable(false);
				} else {
					layeredPane.removeAll();
					layeredPane.add(panel_9);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
				int correct=sum;
				int incorrect=10-sum;
				
				// 기존 RESULT 테이블 correct, incorrect 컬럼값 삭제
				ERDClass_dr1 dao_dr1;
				try { 
					dao_dr1 = new ERDClass_dr1();
					dao_dr1.delete_score();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				ERDClass_dr2 dao_dr2;
				try { 
					dao_dr2 = new ERDClass_dr2();
					dao_dr2.delete_score1();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// RESULT 테이블 correct, incorrect 컬럼에 신규값 insert
				DAOClass dao1;
					try { 
						dao1 = new DAOClass();
						dao1.insert_score1(correct);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					DAOClass1 dao2;
					try { 
						dao2 = new DAOClass1();
						dao2.insert_score2(incorrect);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					// RESULT 테이블에 들어간 신규 correct, incorrect 값 USERINFO의 FW, FL에 전달
					DAOClass_userinfo1 dao_info1;
					try { 
						dao_info1 = new DAOClass_userinfo1();
						dao_info1.userinfo_score(correct, name);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					DAOClass_userinfo2 dao_info2;
					try { 
						dao_info2 = new DAOClass_userinfo2();
						dao_info2.userinfo_score1(incorrect, name);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					// USERINFO 테이블의 GSCORE_W, GSCORE_L에 FW, FL 값 각각 통산
				    ERDClass_uw dao_uw;
					try { 
						dao_uw = new ERDClass_uw();
						dao_uw.send_score(name);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					ERDClass_ul dao_ul;
					try { 
						dao_ul = new ERDClass_ul();
						dao_ul.send_score1(name);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				btnNewButton_1_1_1_1_1_1_1_1_1_1.setEnabled(false);
				}
			}
		});
		//btnNewButton_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Courier New", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1_1_1_1_1_1.setBounds(824, 503, 142, 51);
		panel_9.add(btnNewButton_1_1_1_1_1_1_1_1_1_1);
		
		lblNewLabel_32 = new JLabel("New label");
		lblNewLabel_32.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/memo1.png")));
		lblNewLabel_32.setBounds(55, 70, 817, 526);
		panel_9.add(lblNewLabel_32);
		
		lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/screen design1.png")));
		lblNewLabel_31.setBounds(0, 0, 974, 656);
		panel_9.add(lblNewLabel_31);
		
		lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setIcon(new ImageIcon(WordImageClass.class.getResource("/Images/notepaper.png")));
		lblNewLabel_30.setBounds(0, 0, 974, 656);
		panel_9.add(lblNewLabel_30);
	}
}
