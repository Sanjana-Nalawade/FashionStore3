package one;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

import database.FashionService;
import one.cart;

import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;

public class UserLogin {

	private JFrame FashionStore;
	private JTextField textField;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField username;
	private JTextField emailid;
	private JTextField address;
	private JPasswordField password;
	private JPasswordField confirrmpassword;
	private JTextField mobilenumber;
	private JPasswordField passwordField;

	int am=cart.s;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
					window.FashionStore.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FashionStore = new JFrame();
		FashionStore.setTitle("Fashion Store");
		FashionStore.getContentPane().setBackground(Color.LIGHT_GRAY);
		FashionStore.setIconImage(Toolkit.getDefaultToolkit().getImage(UserLogin.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		FashionStore.setBounds(100, 100, 768, 633);
		FashionStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FashionStore.getContentPane().setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		label_3.setBounds(458, 54, 237, 49);
		FashionStore.getContentPane().add(label_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(405, 114, 323, 458);
		FashionStore.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		tabbedPane.addTab("Login", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 85, 225, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.GRAY);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblUsername.setBounds(94, 51, 117, 23);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblPassword.setBounds(94, 187, 100, 23);
		panel.add(lblPassword);
		
		JLabel lblIncorrectUsernameOr = new JLabel("");
		lblIncorrectUsernameOr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncorrectUsernameOr.setForeground(Color.RED);
		lblIncorrectUsernameOr.setBounds(82, 254, 184, 14);
		panel.add(lblIncorrectUsernameOr);
		
		JButton btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String pwd=password.getText();
				FashionService fs=new FashionService();
				//int a=fs.checkUser(username, pwd);
				
		
				
			}
			
		});
		
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogIn.setBounds(108, 279, 89, 23);
		panel.add(btnLogIn);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
			String dbName="fashion";
			String driverName="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/";
				
				try{
					Class.forName(driverName);
					Connection con=DriverManager.getConnection(url+dbName, "root", "root");
					java.sql.PreparedStatement st=con.prepareStatement("Select * from fashion2 where username=? and password=?");
					st.setString(1, textField.getText());
					st.setString(2,String.valueOf(passwordField.getText()));
					ResultSet rs=st.executeQuery();
						if(rs.next()) {
							//JOptionPane.showMessageDialog(null,"Login Successful");
							FashionStore.dispose();
							ShoppingCatagories.initialize();
							
						
						}
						else {
							lblIncorrectUsernameOr.setText("Invalid Username or Password");
						}
						
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
		}}
		);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(41, 221, 225, 29);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("Register", null, panel_1, null);
		panel_1.setLayout(null);
		
		firstname = new JTextField();
		firstname.setBounds(95, 11, 193, 20);
		panel_1.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(95, 42, 193, 20);
		panel_1.add(lastname);
		lastname.setColumns(10);
		
		JLabel lblName = new JLabel("   First Name ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(0, 12, 93, 19);
		panel_1.add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(10, 42, 75, 20);
		panel_1.add(lblLastName);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(95, 73, 193, 20);
		panel_1.add(username);
		
		JLabel lblUsername_1 = new JLabel("Username");
		lblUsername_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername_1.setBounds(10, 73, 75, 20);
		panel_1.add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword_1.setBounds(10, 139, 75, 20);
		panel_1.add(lblPassword_1);
		
		emailid = new JTextField();
		emailid.setColumns(10);
		emailid.setBounds(95, 108, 193, 20);
		panel_1.add(emailid);
		
		JLabel lblConfirmpassword = new JLabel("Confirm Password");
		lblConfirmpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmpassword.setBounds(10, 173, 123, 20);
		panel_1.add(lblConfirmpassword);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmailId.setBounds(10, 108, 75, 20);
		panel_1.add(lblEmailId);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(10, 221, 102, 14);
		panel_1.add(lblAddress);
		
		address = new JTextField();
		address.setBounds(95, 216, 193, 42);
		panel_1.add(address);
		address.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(127, 139, 161, 20);
		panel_1.add(password);
		
		confirrmpassword = new JPasswordField();
		confirrmpassword.setBounds(127, 173, 161, 20);
		panel_1.add(confirrmpassword);
		
		JLabel lblPasswordDoesNot = new JLabel("");
		lblPasswordDoesNot.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPasswordDoesNot.setBackground(new Color(255, 0, 0));
		lblPasswordDoesNot.setForeground(new Color(255, 0, 0));
		lblPasswordDoesNot.setBounds(165, 191, 123, 20);
		panel_1.add(lblPasswordDoesNot);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number ");
		lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobileNumber.setBounds(10, 269, 142, 20);
		panel_1.add(lblMobileNumber);
		
		mobilenumber = new JTextField();
		mobilenumber.setColumns(10);
		mobilenumber.setBounds(127, 269, 161, 20);
		panel_1.add(mobilenumber);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSignUp.setBounds(95, 396, 89, 23);
		panel_1.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				firstname.getText();
				lastname.getText();
				username.getText();
				emailid.getText();
				address.getText();
				mobilenumber.getText();
				//passwordField.getPassword();
				password.getPassword();
				confirrmpassword.getPassword();
				//amt.getAmt();
				am=cart.s;
				
				if(!confirrmpassword.getText().equals(password.getText())) {
					lblPasswordDoesNot.setText("Password does not match");
				}
				if(confirrmpassword.getText().equals(password.getText())) {
					
					
					
					String dbName="fashion";
					String driverName="com.mysql.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/";
								
								try{String a[]= {"M","F","O"};
									Class.forName(driverName);
									Connection con=DriverManager.getConnection(url+dbName, "root", "root");
									
									java.sql.PreparedStatement st=con.prepareStatement("insert into fashion1 values(?,?,?,?,?,?)");
									
									java.sql.PreparedStatement st1=con.prepareStatement("insert into fashion2 values(?,?)");
									
									st.setString(1, firstname.getText());
									st.setString(2, lastname.getText());
									st.setString(3, username.getText());
									st.setString(4,emailid.getText());
									st.setString(5,mobilenumber.getText());
									st.setString(6,address.getText());
									//st.setInt(7,am); 
									//FashionService fs=new FashionService();
									
									
									st1.setString(1,username.getText());
									st1.setString(2,password.getText());
									
									//st1.setString(3,passwordField_2.getText());
									/*java.sql.PreparedStatement st3=con.prepareStatement("Select * from fash3 where username=?");
									st3.setString(1, textField_3.getText());
									st3.setString(2,String.valueOf(passwordField.getText()));
									ResultSet rs3=st3.executeQuery();*/
									
										//int amt= 0;

									
											int rs=st.executeUpdate();
											int rs1=st1.executeUpdate();
											FashionStore.setEnabled(false);
											JOptionPane.showMessageDialog(null,"Registration successful");
											
											FashionService fs=new FashionService();											
											
											FashionStore.dispose();
											ShoppingCatagories.initialize();
											
											//fs.total(firstname,lastname,username,emailid,mobilenumber,address,amt);
										}
									
							
								catch(Exception e)
								{
									e.printStackTrace();
								}
				}
				
			}
		});
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Male", "Female", "Other"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(95, 305, 75, 51);
		panel_1.add(list);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSex.setBounds(10, 304, 46, 14);
		panel_1.add(lblSex);
		
		JCheckBox chckbxIAgreeTo = new JCheckBox("I agree to the Terms & Condition");
		chckbxIAgreeTo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxIAgreeTo.setBounds(42, 366, 183, 23);
		panel_1.add(chckbxIAgreeTo);		
				
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/Josephine-Skriver-And-Caroline-Brasch-Nielsen-Poses-For-Vero-Moda-05 - Copy (2).jpg")));
		label.setBounds(21, 29, 374, 543);
		FashionStore.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/white1.png")));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(405, 29, 323, 543);
		FashionStore.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		label_2.setBounds(0, 0, 752, 594);
		FashionStore.getContentPane().add(label_2);
	}
}
