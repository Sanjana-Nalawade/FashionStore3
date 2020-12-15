package newArrivalsgirls;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class girl3 {

	static private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public girl3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 768, 633);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(girl1.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		label_1.setBounds(10, 11, 245, 47);
		frame.getContentPane().add(label_1);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 732, 47);
		frame.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 69, 167, 514);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(girl3.class.getResource("/Images/2100698a - Copy.jpg")));
		lblNewLabel.setBounds(187, 69, 340, 354);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMrpIn = new JLabel("MRP incl. all taxes; Add'l charges may apply on discounted price");
		lblMrpIn.setForeground(Color.GRAY);
		lblMrpIn.setBounds(187, 478, 340, 14);
		frame.getContentPane().add(lblMrpIn);
		
		JLabel lblRs = new JLabel("Rs 448");
		lblRs.setBounds(187, 454, 91, 20);
		frame.getContentPane().add(lblRs);
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRs.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("Little Marie Honey Bee Print Dress");
		lblNewLabel_1.setBounds(187, 434, 435, 20);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(girl3.class.getResource("/Images/kids/thumbnails/2100698b.jpg")));
		label_3.setBounds(566, 69, 134, 172);
		frame.getContentPane().add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox.setToolTipText("QTY");
		comboBox.setBounds(240, 519, 43, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblQty = new JLabel("QTY :");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQty.setBounds(187, 516, 54, 23);
		frame.getContentPane().add(lblQty);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_2.setBounds(567, 434, 133, 172);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Specification :");
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		
		JLabel lblBrandawadox = new JLabel("Brand-Little Marie");
		lblBrandawadox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_2.add(lblBrandawadox);
		
		JLabel lblTypeTee = new JLabel("Type : Dress");
		panel_2.add(lblTypeTee);
		
		JLabel lblNewLabel_7 = new JLabel("Neck - Round Neck");
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel(" Sleeves-Sleeveless");
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel(" Fit- Regular fit");
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" Occation- Casual wear");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Material - Cotton Blend");
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(187, 554, 167, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(girl3.class.getResource("/Images/kids/thumbnails/2100698c.jpg")));
		label_2.setBounds(562, 245, 138, 178);
		frame.getContentPane().add(label_2);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 5120, 2880);
		frame.getContentPane().add(label);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(girl3.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
	}
}
