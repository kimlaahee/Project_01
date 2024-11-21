package project;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Main.title;
import jaco.mp3.player.MP3Player;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;


public class phone_7 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblNewLabel_1;
    Font pixelMplus;
    JButton btnNewButton_2;
    private JButton btnNewButton;
    private JButton btnNewButton_3;
    int cnt = 0;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    phone_7 frame = new phone_7(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public phone_7(String name) {
    	
        Dimension frameSize = getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getSize().width) / 2 - 500;
        int y = (screenSize.height - getSize().height) / 2 - 352;
        //setBounds(x,y,1000,705);
    	
    	try {
			pixelMplus=Font.createFont(Font.TRUETYPE_FONT, new File("./DungGeunMo.ttf")).deriveFont(25f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("./DungGeunMo.ttf")));
		}
		catch(IOException | FontFormatException e) {

		}
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(x, y, 1000, 705);
        contentPane = new JPanel();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 40));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(237, 413, 496, 67);
        contentPane.add(textField);
        textField.setColumns(10);

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 40));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblNewLabel_1.setBounds(237, 519, 496, 56);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton_2 = new JButton("CHECK");
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.setFont(pixelMplus);
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkAnswer();
            }
        });
        btnNewButton_2.setBounds(824, 413, 97, 67);
        contentPane.add(btnNewButton_2);
        
        btnNewButton = new JButton("NEXT");
        btnNewButton.setBorder(null);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (btnNewButton.isEnabled()) {
                    setVisible(false);
                    new math_8(null).setVisible(true);
                }
        	}
        });
        btnNewButton.setFont(pixelMplus);
        btnNewButton.setBounds(386, 600, 199, 56);
        btnNewButton.setEnabled(false);
        contentPane.add(btnNewButton);
        
        btnNewButton_3 = new JButton("READ");
        btnNewButton_3.setBorder(null);
        btnNewButton_3.setBackground(Color.WHITE);
        btnNewButton_3.setFont(pixelMplus);
        btnNewButton_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (btnNewButton.isEnabled()) {
        			File f2 = new File("./music/phone.mp3");
            		MP3Player mp3 = new MP3Player(f2);
            		mp3.play();
                }
        	}
        });
        btnNewButton_3.setBounds(824, 519, 97, 56);
        contentPane.add(btnNewButton_3);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(phone_7.class.getResource("/project_picture/smartphone-153650_640 (1).png")));
        lblNewLabel.setBounds(158, 29, 678, 360);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
                new title(name).setVisible(true);
        	}
        });
        lblNewLabel_2.setIcon(new ImageIcon(phone_7.class.getResource("/project_picture/chalkboard-7426329_640 (1) (1).png")));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(0, -24, 984, 666);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_4 = new JLabel("Q.7");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 50));
        lblNewLabel_4.setBounds(0, 0, 171, 134);
        contentPane.add(lblNewLabel_4);
        
        JButton EXIT = new JButton("EXIT");
        EXIT.setBorder(null);
        EXIT.setBounds(875, 589, 97, 47);
        EXIT.setFont(pixelMplus);
        contentPane.add(EXIT);
    }

    private void checkAnswer() {
        String inword = textField.getText(); // ����ڰ� �Է��� �ܾ�
        inword = inword.toLowerCase();
        String dbword = getWordFromDB(); // �����ͺ��̽����� ��ȸ�� �ܾ�
        String sentence = getSentenceFromDB(inword); // �����ͺ��̽����� ��ȸ�� ����
        
        if (dbword != null && inword.equals(dbword)) { // �ܾ ��ġ�ϴ� ���
            lblNewLabel_1.setVisible(true);
            lblNewLabel_1.setText(sentence); // ���� ���
            btnNewButton.setEnabled(true);
        } else { // �ܾ ��ġ���� �ʴ� ���
            lblNewLabel_1.setText("Wrong Answer!");
            textField.setText(""); // �Է� �ʵ� �ʱ�ȭ
            btnNewButton.setEnabled(false);
            cnt = cnt + 1;
        }
        if(cnt >= 2) {
        	btnNewButton.setEnabled(true);
        	textField.setText("phone");
        }
    }
//===========================================================================================================================================================
    
    private String getWordFromDB() {
        String dbword = null;
        Connection con1 = null;
        try {
            // Oracle JDBC ����̹� �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // �����ͺ��̽� ���� ����
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");


            String sql = "SELECT words FROM test1 WHERE words = ?";
            PreparedStatement preparedStatement = con1.prepareStatement(sql);
            

            preparedStatement.setString(1, "phone");
            
            // ���� ���� �� ��� ó��
            ResultSet result = preparedStatement.executeQuery();

            // ��� ���� ó��
            if (result.next()) {
                dbword = result.getString("words"); // ù ��° ���� words �� �� ��������
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // �׻� �����ͺ��̽� ���� �ݱ�
            if (con1 != null) {
                try {
                    con1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return dbword;
    }


    private String getSentenceFromDB(String word) {
        String sentence = null;
        Connection con1 = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

            String sql = "select sentence from test1 where words = ?";
            PreparedStatement preparedStatement = con1.prepareStatement(sql);
            preparedStatement.setString(1, word);
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                sentence = result.getString("sentence"); // �����ͺ��̽����� ��ȸ�� ����
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con1 != null) {
                try {
                    con1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return sentence;
    }
}