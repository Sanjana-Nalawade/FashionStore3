package one;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import shopping_catagories.Kids_wear;
import shopping_catagories.Mens_wear;
import shopping_catagories.Womens_wear;

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

public class ShoppingCatagories {

	static private JFrame frmFashionstore;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingCatagories window = new ShoppingCatagories();
					//window.FashionStore.setVisible(true);
					ShoppingCatagories frame = new ShoppingCatagories();
					//frame.setVisible(true);
					//frmFashionstore.dispose();
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
	public ShoppingCatagories() {
		initialize();
	}

	static public void initialize() {
		frmFashionstore = new JFrame();
		frmFashionstore.setTitle("FashionStore");
		frmFashionstore.setBounds(100, 100, 768, 633);
		frmFashionstore.setVisible(true);
		frmFashionstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFashionstore.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Mens_wear.initialize();
			}
		});
		panel.setBackground(Color.WHITE);
		panel.setBounds(30, 189, 188, 39);
		frmFashionstore.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMale = new JLabel("Men's Wear");
		lblMale.setFont(new Font("Niagara Engraved", Font.PLAIN, 39));
		lblMale.setBounds(33, 0, 188, 39);
		panel.add(lblMale);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Womens_wear.initialize();
			}
		});
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(282, 189, 198, 39);
		frmFashionstore.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWomensClothing = new JLabel("Womens Wear");
		lblWomensClothing.setFont(new Font("Niagara Engraved", Font.PLAIN, 39));
		lblWomensClothing.setBounds(21, 0, 209, 39);
		panel_1.add(lblWomensClothing);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Kids_wear.initialize();
			}
		});
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(539, 189, 188, 39);
		frmFashionstore.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblKidsWear = new JLabel("Kids Wear");
		lblKidsWear.setFont(new Font("Niagara Engraved", Font.PLAIN, 38));
		lblKidsWear.setBounds(40, 0, 209, 39);
		panel_2.add(lblKidsWear);
		
		JLabel lblWhatDoYou = new JLabel("What do you want to shop today?");
		lblWhatDoYou.setFont(new Font("Niagara Engraved", Font.PLAIN, 80));
		lblWhatDoYou.setBounds(10, 13, 732, 75);
		frmFashionstore.getContentPane().add(lblWhatDoYou);
		
		JLabel label_men = new JLabel("");
		label_men.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Mens_wear.initialize();
			}
		});
		label_men.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/03-512.png")));
		label_men.setBounds(72, 99, 90, 92);
		frmFashionstore.getContentPane().add(label_men);
		
		JLabel label_women = new JLabel("");
		label_women.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Womens_wear.initialize();
			}
		});
		label_women.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/dress_fashion_shopping_cloth_elegant_female_clothing_retail_commerce_clothes_shop_consumerism_flat_design_icon-512.png")));
		label_women.setBounds(332, 99, 90, 92);
		frmFashionstore.getContentPane().add(label_women);
		
		JLabel Label_kids = new JLabel("");
		Label_kids.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Kids_wear.initialize();
			}
		});
		Label_kids.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/unnamed.png")));
		Label_kids.setBounds(588, 99, 119, 90);
		frmFashionstore.getContentPane().add(Label_kids);
		
		JLabel men_pic = new JLabel("");
		men_pic.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/images (23).jpeg")));
		men_pic.setBounds(-87, 239, 360, 369);
		frmFashionstore.getContentPane().add(men_pic);
		label_men.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionstore.dispose();
				Mens_wear.initialize();
			}
		});
		JLabel women_pic = new JLabel("");
		women_pic.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/pexels-photo-949670.jpeg")));
		women_pic.setBounds(10, 212, 488, 490);
		frmFashionstore.getContentPane().add(women_pic);
		
		JLabel kid_pic = new JLabel("");
		kid_pic.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/images (20).jpeg")));
		kid_pic.setBounds(497, 219, 255, 420);
		frmFashionstore.getContentPane().add(kid_pic);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/whitebackground.png")));
		label_1.setBounds(10, 13, 732, 75);
		frmFashionstore.getContentPane().add(label_1);
		
		JLabel pinkbackground = new JLabel("");
		pinkbackground.setIcon(new ImageIcon(ShoppingCatagories.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		pinkbackground.setBounds(0, 0, 752, 594);
		frmFashionstore.getContentPane().add(pinkbackground);
	}

}
