package examples;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class register {

	static private JFrame frame;
	private static JTextField textFieldname;
	private static JLabel lblEmailid;
	private static JTextField textFieldemail;
	private static JLabel lblContactno;
	private static JTextField textFieldContactno;
	private static JLabel lblAge;
	private static JTextField textFieldUsername;
	private static JPasswordField passwordField;
	private static JPasswordField passwordField_1;
	private static JList list;
	private static JButton btnSubmit;
	private static JSpinner spinner;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public register() {
		initialize();
	}

	static public void initialize() {
		frame = new JFrame();
		//frame.setSize(466, 500);
		frame.setTitle("Registration form");
		frame.setBounds(100, 100, 469, 500);
		frame.setVisible(true);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(40, 35, 83, 14);
		frame.getContentPane().add(lblName);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(133, 32, 301, 20);
		frame.getContentPane().add(textFieldname);
		textFieldname.setColumns(10);
		
		lblEmailid = new JLabel("email-id :");
		lblEmailid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmailid.setBounds(40, 75, 83, 14);
		frame.getContentPane().add(lblEmailid);
		
		textFieldemail = new JTextField();
		textFieldemail.setBounds(133, 73, 301, 20);
		frame.getContentPane().add(textFieldemail);
		textFieldemail.setColumns(10);
		
		lblContactno = new JLabel("Contact no. :");
		lblContactno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContactno.setBounds(40, 115, 83, 14);
		frame.getContentPane().add(lblContactno);
		
		textFieldContactno = new JTextField();
		textFieldContactno.setBounds(133, 113, 301, 20);
		frame.getContentPane().add(textFieldContactno);
		textFieldContactno.setColumns(10);
		
		lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAge.setBounds(40, 155, 83, 14);
		frame.getContentPane().add(lblAge);
		
		spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		spinner.setBounds(133, 152, 49, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(40, 195, 83, 14);
		frame.getContentPane().add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(133, 193, 301, 20);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(40, 235, 83, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("Re-enter");
		lblNewLabel.setBounds(40, 275, 83, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword_1 = new JLabel("Password :");
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword_1.setBounds(40, 295, 83, 14);
		frame.getContentPane().add(lblPassword_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 233, 301, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(133, 293, 301, 20);
		frame.getContentPane().add(passwordField_1);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Male", "Female", "Other"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(260, 136, 70, 54);
		frame.getContentPane().add(list);
		
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textFieldname.getText();
				textFieldemail.getText();
				textFieldContactno.getText();
				spinner.getValue();
				passwordField.getPassword();
				passwordField_1.getPassword();
				textFieldUsername.getText();
				
				if(!passwordField_1.getText().equals(passwordField.getText())) {
					JOptionPane.showMessageDialog(null,"password does not match");
				}
				if(passwordField_1.getText().equals(passwordField.getText())) {
					
					String dbName="log_reg";
					String driverName="com.mysql.cj.jdbc.Driver";
								String url="jdbc:mysql://localhost:3306/";
								
								try{String a[]= {"M","F","O"};
									Class.forName(driverName);
									Connection con=DriverManager.getConnection(url+dbName, "root", "root");
									
									java.sql.PreparedStatement st=con.prepareStatement("insert into reg values(?,?,?,?,?)");
									
									java.sql.PreparedStatement st1=con.prepareStatement("insert into login values(?,?)");
									st.setString(1, textFieldname.getText());
									st.setString(2,textFieldemail.getText());
									st.setString(3,textFieldContactno.getText());
									st.setInt(4,(int) spinner.getValue());
									st.setString(5,a[list.getSelectedIndex()]);
									st1.setString(1,textFieldUsername.getText());
									st1.setString(2,passwordField.getText());
									java.sql.PreparedStatement st3=con.prepareStatement("Select * from login where username=?");
									st3.setString(1, textFieldUsername.getText());
									//st3.setString(2,String.valueOf(passwordField.getText()));
									ResultSet rs3=st3.executeQuery();
										if(rs3.next()) {
											JOptionPane.showMessageDialog(null,"username already exists");
										}else{
											int rs=st.executeUpdate();
											int rs1=st1.executeUpdate();
											frame.setEnabled(false);
											JOptionPane.showMessageDialog(null,"Registration successful");
											frame.setVisible(false);
										}
										
										
							}
								catch(Exception e)
								{
									e.printStackTrace();
								}
				}
				
			}
		});
		btnSubmit.setBounds(162, 379, 89, 23);
		frame.getContentPane().add(btnSubmit);
		frame.transferFocus();
	}
}
