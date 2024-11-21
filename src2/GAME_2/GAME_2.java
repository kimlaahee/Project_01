package GAME_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.sql.SQLException;

/*import org.python.core.PyObject;
import org.python.util.PythonInterpreter;*/

import Main.User_DB_Select;
import Main.VOClass;
import Main.title;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.FontFormatException;
import java.io.IOException;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;
import Main.title;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.*; // JFrame
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*; // Container
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import java.awt.*;
import static javax.swing.JOptionPane.showConfirmDialog;


public class GAME_2 extends JFrame {

	Font pixelMplus;
	private JPanel contentpanel;
	DAOClassW dao_i_W;
	ArrayList <VOClassW> proArrayW;


	
	/**
	 * Launch the application.
	 */

	int chkpic=0;
	int chkw=0;
	int donnum1=0;
	int donnum2=0;
	int donnum3=0;
	int donnum4=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GAME_2 frame = new GAME_2(null);
					frame.setLocationRelativeTo(null);
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
	 * @return 
	 */
	


	public GAME_2(String name) {

		
		
		
		
		Dimension frameSize = getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getSize().width) / 2 - 500;
		int y = (screenSize.height - getSize().height) / 2 - 352;
		
		
		
		
		// 占쎈뼊占쎈선 DB 揶쏆빘猿�
		try {
			dao_i_W = new DAOClassW();
			proArrayW = dao_i_W.getAllInfo();
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

				
		//占쎈？占쎈뱜 筌욑옙占쎌젟
		
		try {
			pixelMplus=Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")).deriveFont(40f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("DungGeunMo.ttf")));
		}
		catch(IOException | FontFormatException e) {
		}
		
//		(占쎈？占쎈뱜 癰귨옙野껓옙 占쎌뜚占쎈릭占쎈뮉 揶쏆빘猿쒙쭗占�).setFont(pixelMplus);
		
		
		
//		PythonInterpreter python = new PythonInterpreter();
//		python.set("search", 20);
//		python.exec("square= a*a");
//		
//		int StringWriter;
//		--
//		StringWriter out = new StringWriter();
//		python.setOut(out);
//		//占쎈솁占쎌뵠占쎈쑌 占쎈뮞占쎄쾿�뵳���뱜 占쎈솁占쎌뵬 占쎄땀 �굜遺얜굡 占쎄땀 癰귨옙占쎈땾 search占쎈퓠 20 占쎌읈占쎈뼎
//		python.set("search", 20);
//		python.execfile("D:\\game2");
//		
//		String result =out.toString();
//		System.out.println(result);		
//		python.close
//		
//		
//		
	
		
		
		// DB占쎈퓠占쎄퐣 �겫�뜄�쑎占쎌궞 20揶쏆뮇�벥 占쎈뼊占쎈선餓ο옙 占쎌삏占쎈쑁占쎌벥 �뚎됱쓥占쎄퐜甕곤옙 占쎄문占쎄쉐 獄쏉옙 占쎈떄占쎄퐣 占쎈�쏉옙逾놅옙釉� 占쎌젟占쎈땾�몴占� 揶쏉옙 �뵳�딅뮞占쎈뱜占쎈퓠 �빊遺쏙옙
		int a[] = new int[20];
		int b[] = new int[4];
		int c[] = new int[4];

		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			a[i] = r.nextInt(20);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
				}
			}
		}
		
		
		Random e = new Random();
		for (int i = 0; i < 4; i++) {
			b[i] = e.nextInt(4);
			for (int j = 0; j < i; j++) {
				if (b[i] == b[j]) {
					i--;
				}
			}
		}

		int na = b[0];
		int nb = b[1];
		int nc = b[2];
		int nd = b[3];
		
		c[0]=a[na];
		c[1]=a[nb];
		c[2]=a[nc];
		c[3]=a[nd];

		int image1 = c[0];
		int image2 = c[1];
		int image3 = c[2];
		int image4 = c[3];
		
		int word1 = a[0];
		int word2 = a[1];
		int word3 = a[2];
		int word4 = a[3];
		
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,1000,705);
		
		
		
		
		contentpanel = new JPanel();
		contentpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentpanel);
		contentpanel.setLayout(null);
		
		
	
		
		
		JLabel l_1 = new JLabel("");
		l_1.setBounds(107, 260, 267, 275);
		contentpanel.add(l_1);
		
		JLabel l_1_1 = new JLabel("");
		l_1_1.setBounds(107, 260, 267, 275);
		contentpanel.add(l_1_1);
		
		JLabel l_2 = new JLabel("");
		l_2.setBounds(357, 260, 267, 275);
		contentpanel.add(l_2);
		
		JLabel l_2_1 = new JLabel("");
		l_2_1.setBounds(357, 260, 267, 275);
		contentpanel.add(l_2_1);
		
		JLabel l_3 = new JLabel("");
		l_3.setBounds(607, 260, 267, 275);
		contentpanel.add(l_3);
		
		JLabel l_3_1 = new JLabel("");
		l_3_1.setBounds(607, 260, 267, 275);
		contentpanel.add(l_3_1);
		
		JLabel l_4 = new JLabel("");
		l_4.setBounds(107, 260, 515, 275);
		contentpanel.add(l_4);
		
		JLabel l_4_1 = new JLabel("");
		l_4_1.setBounds(107, 260, 515, 275);
		contentpanel.add(l_4_1);
		
		JLabel l_5 = new JLabel("");
		l_5.setBounds(357, 260, 515, 275);
		contentpanel.add(l_5);
		
		JLabel l_5_1 = new JLabel("");
		l_5_1.setBounds(357, 260, 515, 275);
		contentpanel.add(l_5_1);
		
		JLabel l_6 = new JLabel("");
		l_6.setBounds(107, 260, 765, 275);
		contentpanel.add(l_6);
		
		JLabel l_6_1 = new JLabel("");
		l_6_1.setBounds(107, 260, 765, 275);
		contentpanel.add(l_6_1);
		
		JLabel l_7 = new JLabel("");
		l_7.setBounds(107, 260, 15, 275);
		contentpanel.add(l_7);
		
		JLabel l_8 = new JLabel("");
		l_8.setBounds(357, 260, 15, 275);
		contentpanel.add(l_8);
		
		JLabel l_9 = new JLabel("");
		l_9.setBounds(607, 260, 15, 275);
		contentpanel.add(l_9);
		
		JLabel l_10 = new JLabel("");
		l_10.setBounds(857, 260, 15, 275);
		contentpanel.add(l_10);
		


		JButton EXIT = new JButton("EXIT");
		EXIT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new title(name).setVisible(true);
			}
		});
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (chkpic == 1) {
					if (word4 == image1) {
						l_6_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor4_1.png")));
						showMessageDialog(null, "GREAT!");
						donnum4=1;
						chkpic = 0;
					} else {
						l_6_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor4_1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_6_1.setIcon(null);
						
					}

				} else if (chkpic == 2) {
					if (word4 == image2) {
						l_5_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor3.png")));
						showMessageDialog(null, "GREAT!");
						donnum4=1;
						chkpic = 0;
					} else {
						l_5_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor3.png")));
						showMessageDialog(null, "Wrong choice...");
						l_5_1.setIcon(null);
						
					}

				} else if (chkpic == 3) {
					if (word4 == image3) {
						l_3_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor2.png")));
						showMessageDialog(null, "GREAT!");
						donnum4=1;
						chkpic = 0;
					} else {
						l_3_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor2.png")));
						showMessageDialog(null, "Wrong choice...");
						l_3_1.setIcon(null);
						
					}

				} else if (chkpic == 4) {
					if (word4 == image4) {
						l_10.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor1.png")));
						showMessageDialog(null, "GREAT!");
						donnum4=1;
						chkpic = 0;
					} else {
						l_10.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_10.setIcon(null);
						
					}
				}
				if ((donnum1 + donnum2 + donnum3 + donnum4) == 4) {
					showMessageDialog(null, "Clear!!!");
					int answer = JOptionPane.showConfirmDialog(null, "Play again? ?", "GAME CLEAR",
							JOptionPane.YES_NO_OPTION);
					if (answer == 0) {
						dispose();
						new GAME_2(name).setVisible(true);
					} else if (answer == 1) {
						dispose();
						new title(name).setVisible(true);
					}

				}
			}
		});
		btnNewButton_7.setBounds(755, 575, 200, 70);
		contentpanel.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (chkpic == 1) {
					if (word3 == image1) {
						l_4_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor3.png")));
						showMessageDialog(null, "GREAT!");
						donnum3=1;
						chkpic = 0;
					} else {
						l_4_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor3.png")));
						showMessageDialog(null, "Wrong choice...");
						l_4_1.setIcon(null);
						
					}

				} else if (chkpic == 2) {
					if (word3 == image2) {
						l_2_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor2.png")));
						showMessageDialog(null, "GREAT!");
						donnum3=1;
						chkpic = 0;
					} else {
						l_2_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor2.png")));
						showMessageDialog(null, "Wrong choice...");
						l_2_1.setIcon(null);
					}

				} else if (chkpic == 3) {
					if (word3 == image3) {
						l_9.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor1.png")));
						showMessageDialog(null, "GREAT!");
						donnum3=1;
						chkpic = 0;
					} else {
						l_9.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_9.setIcon(null);
					}

				} else if (chkpic == 4) {
					if (word3 == image4) {
						l_3.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor2_1.png")));
						showMessageDialog(null, "GREAT!");
						donnum3=1;
						chkpic = 0;
					} else {
						l_3.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor2_1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_3.setIcon(null);
					}
				}
				if ((donnum1 + donnum2 + donnum3 + donnum4) == 4) {
					showMessageDialog(null, "Clear!!!");
					int answer = JOptionPane.showConfirmDialog(null, "Play again? ?", "GAME CLEAR",
							JOptionPane.YES_NO_OPTION);
					if (answer == 0) {
						dispose();
						new GAME_2(name).setVisible(true);
					} else if (answer == 1) {
						dispose();
						new title(name).setVisible(true);
					}

				}
			}
		});
		btnNewButton_6.setBounds(508, 575, 200, 70);
		contentpanel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (chkpic == 1) {
					if (word2 == image1) {
						l_1_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor2.png")));
						showMessageDialog(null, "GREAT!");
						donnum2=1;
						chkpic = 0;
					} else {
						l_1_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor2.png")));
						showMessageDialog(null, "Wrong choice...");
						l_1_1.setIcon(null);
					}

				} else if (chkpic == 2) {
					if (word2 == image2) {
						l_8.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor1.png")));
						showMessageDialog(null, "GREAT!");
						donnum2=1;
						chkpic = 0;
					} else {
						l_8.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_8.setIcon(null);
					}

				} else if (chkpic == 3) {
					if (word2 == image3) {
						l_2.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor2_1.png")));
						showMessageDialog(null, "GREAT!");
						donnum2=1;
						chkpic = 0;
					} else {
						l_2.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor2_1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_2.setIcon(null);
					}

				} else if (chkpic == 4) {
					if (word2 == image4) {
						l_5.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor3_1.png")));
						showMessageDialog(null, "GREAT!");
						donnum2=1;
						chkpic = 0;
					} else {
						l_5.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor3_1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_5.setIcon(null);
					}
				}
				if ((donnum1 + donnum2 + donnum3 + donnum4) == 4) {
					showMessageDialog(null, "Clear!!!");
					int answer = JOptionPane.showConfirmDialog(null, "Play again? ?", "GAME CLEAR",
							JOptionPane.YES_NO_OPTION);
					if (answer == 0) {
						dispose();
						new GAME_2(name).setVisible(true);
					} else if (answer == 1) {
						dispose();
						new title(name).setVisible(true);
					}

				}
			}
		});
		btnNewButton_5.setBounds(267, 575, 200, 70);
		contentpanel.add(btnNewButton_5);
	
		
		
		
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (chkpic == 1) {
					if (word1 == image1) {
						l_7.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor1.png")));
						showMessageDialog(null, "GREAT!");
						donnum1=1;
						chkpic = 0;
					} else {
						l_7.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_7.setIcon(null);
					}

				} else if (chkpic == 2) {
					if (word1 == image2) {
						l_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor2_1.png")));
						showMessageDialog(null, "GREAT!");
						donnum1=1;
						chkpic = 0;
					} else {
						l_1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor2_1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_1.setIcon(null);
					}

				} else if (chkpic == 3) {
					if (word1 == image3) {
						l_4.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor3_1.png")));
						showMessageDialog(null, "GREAT!");
						donnum1=1;
						chkpic = 0;
					} else {
						l_4.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor3_1.png")));
						showMessageDialog(null, "Wrong choice...");
						l_4.setIcon(null);
					}

				} else if (chkpic == 4) {
					if (word1 == image4) {
						l_6.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/cor4.png")));
						showMessageDialog(null, "GREAT!");
						donnum1=1;
						chkpic = 0;
					} else {
						l_6.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/incor4.png")));
						showMessageDialog(null, "Wrong choice...");
						l_6.setIcon(null);
					}
				}
				if ((donnum1 + donnum2 + donnum3 + donnum4) == 4) {
					showMessageDialog(null, "Clear!!!");
					int answer = JOptionPane.showConfirmDialog(null, "Play again? ?", "GAME CLEAR",
							JOptionPane.YES_NO_OPTION);
					if (answer == 0) {
						dispose();
						new GAME_2(name).setVisible(true);
					} else if (answer == 1) {
						dispose();
						new title(name).setVisible(true);
					}

				}
			}
		});
		btnNewButton_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				chkw=1;
			}
		});
		btnNewButton_4.setBounds(20, 575, 200, 70);
		contentpanel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				chkpic=0;
			}
		});
		btnNewButton_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				chkpic=2;
			}
		});
		btnNewButton_3.setBounds(297, 69, 150, 150);
		contentpanel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				chkpic=0;
			}
		});
		btnNewButton_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				chkpic=3;
			}
		});
		btnNewButton_2.setBounds(546, 69, 149, 150);
		contentpanel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				chkpic=0;
			}
		});
		btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				chkpic=4;
			}
		});
		btnNewButton_1.setBounds(785, 69, 150, 150);
		contentpanel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				chkpic=0;
			}
		});
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				chkpic=1;
				
			}
		});
		btnNewButton.setBounds(46, 69, 150, 150);
		contentpanel.add(btnNewButton);
		EXIT.setContentAreaFilled(false);
		EXIT.setBorderPainted(false);
		EXIT.setOpaque(false);
		EXIT.setBounds(0, 0, 125, 48);
		EXIT.setFont(pixelMplus);
		contentpanel.add(EXIT);
		
		
	
	
		
		
		JLabel Image1 = new JLabel("");
		Image1.setIcon(new ImageIcon(GAME_2.class.getResource(String.format("/Images/%d.jpg",image1))));
		Image1.setBounds(46, 69, 150, 150);
		contentpanel.add(Image1);
		
		JLabel Image2 = new JLabel("");
		Image2.setIcon(new ImageIcon(GAME_2.class.getResource(String.format("/Images/%d.jpg",image2))));
		Image2.setBounds(297, 69, 150, 150);
		contentpanel.add(Image2);
		
		JLabel Image3 = new JLabel("");
		Image3.setIcon(new ImageIcon(GAME_2.class.getResource(String.format("/Images/%d.jpg",image3))));
		Image3.setBounds(545, 69, 150, 150);
		contentpanel.add(Image3);
		
		JLabel Image4 = new JLabel("");
		Image4.setIcon(new ImageIcon(GAME_2.class.getResource(String.format("/Images/%d.jpg",image4))));
		Image4.setBounds(785, 69, 150, 150);
		contentpanel.add(Image4);
		
		

		JLabel Word_Label1 = new JLabel(proArrayW.get(word1).getWord());
		Word_Label1.setBounds(20, 575, 200, 70);
		contentpanel.add(Word_Label1);
		Word_Label1.setHorizontalAlignment(JLabel.CENTER);
		Word_Label1.setFont(pixelMplus);

		
		JLabel Word_Label2 = new JLabel(proArrayW.get(word2).getWord());
		Word_Label2.setBounds(267, 575, 200, 70);
		contentpanel.add(Word_Label2);
		Word_Label2.setHorizontalAlignment(JLabel.CENTER);
		Word_Label2.setFont(pixelMplus);

		
		JLabel Word_Label3 = new JLabel(proArrayW.get(word3).getWord());
		Word_Label3.setBounds(508, 575, 200, 70);
		contentpanel.add(Word_Label3);
		Word_Label3.setHorizontalAlignment(JLabel.CENTER);
		Word_Label3.setFont(pixelMplus);

		
		JLabel Word_Label4 = new JLabel(proArrayW.get(word4).getWord());
		Word_Label4.setBounds(755, 575, 200, 70);
		contentpanel.add(Word_Label4);
		Word_Label4.setHorizontalAlignment(JLabel.CENTER);
		Word_Label4.setFont(pixelMplus);

		
		
		
		
		
		JLabel imageselectarea1 = new JLabel("");
		imageselectarea1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/imagearea1.png")));
		imageselectarea1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				int chknum1=image1;
				System.out.println(chknum1);
				
			}
		});
		imageselectarea1.setBounds(0, 0, 250, 250);
		contentpanel.add(imageselectarea1);
		
		JLabel imageselectarea2 = new JLabel("");
		imageselectarea2.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/imagearea2.png")));
		imageselectarea2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				
				int chknum2=image2;
				System.out.println(chknum2);

			}
		});
		imageselectarea2.setBounds(246, 0, 250, 250);
		contentpanel.add(imageselectarea2);
		
		JLabel imageselectarea3 = new JLabel("");
		imageselectarea3.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/imagearea3.png")));
		imageselectarea3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				
				int chknum3=image3;
				System.out.println(chknum3);
			}
		});
		imageselectarea3.setBounds(488, 0, 260, 270);
		contentpanel.add(imageselectarea3);
		
		JLabel imageselectarea4 = new JLabel("");
		imageselectarea4.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/imagearea4.png")));
		imageselectarea4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				int chknum4=image4;
				System.out.println(chknum4);
				
			}
		});
		imageselectarea4.setBounds(734, 0, 250, 270);
		contentpanel.add(imageselectarea4);
		
		JLabel wordselectarea1 = new JLabel("");
		wordselectarea1.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/wordspace.png")));
		wordselectarea1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				
				int chknum5 = word1;
				System.out.println(chknum5);
//				Word_Label1.setBorder(BorderFactory.createLineBorder(Color.GREEN,5,true));
			}
		});

		wordselectarea1.setBounds(0, 546, 250, 120);
		contentpanel.add(wordselectarea1);
		
		JLabel wordselectarea2 = new JLabel("");
		wordselectarea2.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/wordspace.png")));
		wordselectarea2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				
				int chknum6 = word2;
				System.out.println(chknum6);

			}
		});
		wordselectarea2.setBounds(246, 546, 250, 120);
		contentpanel.add(wordselectarea2);
		
		JLabel wordselectarea3 = new JLabel("");
		wordselectarea3.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/wordspace.png")));
		wordselectarea3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				int chknum7 = word3;
				System.out.println(chknum7);

			}
		});
		wordselectarea3.setBounds(488, 546, 250, 120);
		contentpanel.add(wordselectarea3);
		
		JLabel wordselectarea4 = new JLabel("");
		wordselectarea4.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/wordspace.png")));
		wordselectarea4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				
				
				
				
				int chknum8=word4;
				System.out.println(chknum8);

			}
		});
		wordselectarea4.setBounds(734, 546, 250, 120);
		contentpanel.add(wordselectarea4);


		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GAME_2.class.getResource("/Images_GAME2/GAME2_BGI.png")));
		lblNewLabel.setBounds(0, 0, 984, 666);
		contentpanel.add(lblNewLabel);
	}
	

}
