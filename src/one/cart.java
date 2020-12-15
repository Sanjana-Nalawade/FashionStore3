package one;
import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import one.ShoppingCatagories;
import shopping_catagories.Kids_wear;
import shopping_catagories.Mens_wear;
import shopping_catagories.Womens_wear;

import women_dresses.D1;
import women_dresses.D2;
import women_dresses.D3;
import women_dresses.D4;
import women_dresses.D5;
import women_dresses.D6;
import women_dresses.D7;
import women_dresses.D8;

import women_jeans.J1;
import women_jeans.J2;
import women_jeans.J3;
import women_jeans.J4;
import women_jeans.J5;
import women_jeans.J6;
import women_jeans.J7;
import women_jeans.J8;

import women_shoes.S1;
import women_shoes.S2;
import women_shoes.S3;
import women_shoes.S4;
import women_shoes.S6;
import women_shoes.S7;
import women_shoes.S8;
import women_shoes.S5;

//import database.FashionDAO;
import one.UserLogin;
import database.FashionBean;
import database.FashionService;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class cart extends D1 {
	

	static private JFrame frmFashionstore;
	public static int s;
	String n[];
	public void usname(String n) {	
	}
	
	
	
	public static void main(String[] args) {
		
		//D1 d=new D1();
		//s1=D1.d1;
		System.out.println(s);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart window = new cart();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public cart() {
		s=D1.d1+D2.d2+D3.d3+D4.d4+D5.d5+D6.d7+D8.d8;	
		
		initialize();
	}

	private void String(String string) {
		// TODO Auto-generated method stub
		
	}

	static public void initialize() {
		frmFashionstore = new JFrame();
		frmFashionstore.setTitle("FashionStore");
		frmFashionstore.setBounds(100, 100, 768, 633);
		frmFashionstore.setVisible(true);
		frmFashionstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFashionstore.getContentPane().setLayout(null);
		
		JLabel lblTot = new JLabel("");
		lblTot.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTot.setBounds(332, 383, 208, 33);
		lblTot.setOpaque(true);
		lblTot.setBackground(new Color(220, 220, 220));
		lblTot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmFashionstore.getContentPane().add(lblTot);
		
		JLabel lblName = new JLabel("Username");
		lblName.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblName.setBackground(new Color(255, 255, 255));
		lblName.setOpaque(true);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(212, 226, 99, 33);
		frmFashionstore.getContentPane().add(lblName);
		
		JLabel labelfname = new JLabel("");
		labelfname.setBorder(new LineBorder(new Color(0, 0, 0)));
		labelfname.setOpaque(true);
		labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelfname.setBackground(new Color(220, 220, 220));
		labelfname.setBounds(332, 305, 208, 33);
		frmFashionstore.getContentPane().add(labelfname);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane.setBackground(new Color(220, 220, 220));
		textPane.setBounds(332, 226, 208, 33);
		frmFashionstore.getContentPane().add(textPane);
		
		JLabel lblIncorrectUsernameOr = new JLabel("");
		lblIncorrectUsernameOr.setIcon(null);
		lblIncorrectUsernameOr.setForeground(Color.RED);
		lblIncorrectUsernameOr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncorrectUsernameOr.setBounds(312, 260, 253, 12);
		frmFashionstore.getContentPane().add(lblIncorrectUsernameOr);
		
		JButton btnBill = new JButton("BILL");
		btnBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBill.setBounds(333, 459, 99, 33);
		frmFashionstore.getContentPane().add(btnBill);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 11, 732, 47);
		frmFashionstore.getContentPane().add(panel);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(cart.class.getResource("/Images/arrow_back_black_192x192.png")));
		back.setBounds(503, 0, 47, 47);
		panel.add(back);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				ShoppingCatagories.initialize();
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(cart.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1) - Copy.png")));
		label.setBounds(0, 0, 245, 47);
		panel.add(label);
		
		JLabel lblMyCart = new JLabel("MY CART");
		lblMyCart.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMyCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyCart.setOpaque(true);
		lblMyCart.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
		lblMyCart.setBounds(212, 119, 328, 43);
		frmFashionstore.getContentPane().add(lblMyCart);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 245, 238));
		panel_1.setBounds(175, 84, 391, 472);
		frmFashionstore.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFname = new JLabel("First Name");
		lblFname.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFname.setBounds(32, 221, 99, 33);
		panel_1.add(lblFname);
		lblFname.setBackground(Color.WHITE);
		lblFname.setOpaque(true);
		lblFname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(32, 302, 99, 33);
		panel_1.add(lblTotal);
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotal.setBackground(new Color(255, 255, 255));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setOpaque(true);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel pinkbackground = new JLabel("");
		pinkbackground.setBounds(10, -10, 752, 594);
		pinkbackground.setIcon(new ImageIcon(cart.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		frmFashionstore.getContentPane().add(pinkbackground);
		
		btnBill.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			/*	public void displaySpecficCoulmns() {
					String sql = "select Username from fashion2";
					try {
					    stmt = con.createStatement();
					    ResultSet res = stmt.executeQuery(sql);
					    while (res.next()) {
					        System.out.print(res.getString(1));
					       // System.out.print(res.getString(2));
					        }
					} catch (SQLException e) {
					    e.printStackTrace();
					}
					}  */
				
			//	D1 d=new D1();
				//s1=D1.d1();
				
				s=D1.d1+D2.d2+D3.d3+D4.d4+D5.d5+D6.d7+D8.d8+J1.j1+J2.j2+J3.j3+J4.j4+J5.j5+J6.j6+J7.j7+J8.j8+S1.s1+S2.s2+S3.s3+S4.s4+S5.s5+S6.s6+S7.s7+S8.s8;
				System.out.println(s);
				
				lblTot.setText(" "+s); 
				System.out.println("2 "+s);
				
				
				String dbName="fashion";
				String driverName="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/";
					
					try{
						Class.forName(driverName);
						Connection con=DriverManager.getConnection(url+dbName, "root", "root");
					
						java.sql.PreparedStatement st=con.prepareStatement("Select * from fashion1 where username=?");
						st.setString(1, textPane.getText());
						
						//java.sql.PreparedStatement st1=con.prepareStatement("insert into fashion1(Amount) values(?) where username=?");
						//st1.setInt(1, s);
			//	update fashion1 set Amount = s where username = textPane.getText();
						
						
						//insert into fashion1 (username, Amount) values (username, s);
						ResultSet rs=st.executeQuery();
						
			
							if(rs.next()) {
				
								labelfname.setText(" "+rs.getString(1)); 
								
								st.setString(1, lblTot.getText());
								//int rs1=st1.executeUpdate();
								//int rs1=st1.executeUpdate();
								System.out.println("table Alter sucessfully");
							
							}
							else {
								lblIncorrectUsernameOr.setText("Invalid Username or Password");
							}
							
				}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				
				
				
				
				
				frmFashionstore.setVisible(true);
				//System.exit(0);
			}
		});
		
	}
}

