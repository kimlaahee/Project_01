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


public class worker_10 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblNewLabel_1;
   private JButton btnNewButton;
   Font pixelMplus;
    JButton btnNewButton_2;
    private JButton btnNewButton_3;
    int cnt = 0;
    


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    worker_10 frame = new worker_10(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public worker_10(String name) {
       
    	
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
        textField.setBounds(259, 468, 496, 49);
        contentPane.add(textField);
        textField.setColumns(10);

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 40));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblNewLabel_1.setBounds(259, 527, 496, 49);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton_2 = new JButton("CHECK");
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setFont(pixelMplus);
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkAnswer();
            }
        });
        btnNewButton_2.setBounds(814, 466, 97, 56);
        contentPane.add(btnNewButton_2);
        
        btnNewButton = new JButton("end");
        btnNewButton.setBorder(null);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
              if (btnNewButton.isEnabled()) {
                    setVisible(false);
                    new title(name).setVisible(true);
                }
           }
        });
        btnNewButton.setFont(pixelMplus);
        btnNewButton.setBounds(379, 600, 206, 56);
        btnNewButton.setEnabled(false);
        contentPane.add(btnNewButton);
        
        btnNewButton_3 = new JButton("READ");
        btnNewButton_3.setBorder(null);
        btnNewButton_3.setFont(pixelMplus);
        btnNewButton_3.setBackground(Color.WHITE);
        btnNewButton_3.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
              if (btnNewButton.isEnabled()) {
                 File f2 = new File("./music/worker.mp3");
                  MP3Player mp3 = new MP3Player(f2);
                  mp3.play();
                }
           }
        });
        btnNewButton_3.setBounds(814, 527, 97, 49);
        btnNewButton_3.setEnabled(false);
        contentPane.add(btnNewButton_3);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(worker_10.class.getResource("/project_picture/men-at-work-145925_640 (1).png")));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(181, 10, 619, 449);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
                new title(name).setVisible(true);
        	}
        });
        lblNewLabel_2.setIcon(new ImageIcon(worker_10.class.getResource("/project_picture/whiteboard-7246528_640.png")));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(0, -10, 984, 666);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_4 = new JLabel("Q.10");
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
        String inword = textField.getText(); // 사용자가 입력한 단어
        inword = inword.toLowerCase();
        String dbword = getWordFromDB(); // 데이터베이스에서 조회한 단어
        String sentence = getSentenceFromDB(inword); // 데이터베이스에서 조회한 문장
        
        if (dbword != null && inword.equals(dbword)) { // 단어가 일치하는 경우
            lblNewLabel_1.setVisible(true);
            lblNewLabel_1.setText(sentence); // 문장 출력
            btnNewButton.setEnabled(true);
            btnNewButton_3.setEnabled(true);
        } else { // 단어가 일치하지 않는 경우
            lblNewLabel_1.setText("Wrong Answer!");
            textField.setText(""); // 입력 필드 초기화
            btnNewButton.setEnabled(false);
            btnNewButton_3.setEnabled(false);
            cnt = cnt + 1;
        }
        if(cnt >= 2) {
           btnNewButton.setEnabled(true);
           textField.setText("worker"); 
        } 
    }

    
    private String getWordFromDB() {
        String dbword = null;
        Connection con1 = null;
        try {
            // Oracle JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // 데이터베이스 연결 설정
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");


            String sql = "SELECT words FROM test1 WHERE words = ?";
            PreparedStatement preparedStatement = con1.prepareStatement(sql);
            

            preparedStatement.setString(1, "worker");
            
            // 쿼리 실행 및 결과 처리
            ResultSet result = preparedStatement.executeQuery();

            // 결과 집합 처리
            if (result.next()) {
                dbword = result.getString("words"); // 첫 번째 행의 words 열 값 가져오기
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 항상 데이터베이스 연결 닫기
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
                sentence = result.getString("sentence"); // 데이터베이스에서 조회한 문장
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