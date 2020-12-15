package women;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import newArrivals_kids.Awabox;
import newArrivals_kids.kiabi;
import newArrivals_kids.kookie;
import newArrivals_kids.memory;
import one.cart;
import shopping_catagories.Womens_wear;
import women_jeans.J1;
import women_jeans.J2;
import women_jeans.J3;
import women_jeans.J4;
import women_jeans.J5;
import women_jeans.J6;
import women_jeans.J8;
import women_shoes.S1;
import women_shoes.S2;
import women_shoes.S3;
import women_shoes.S4;
import women_shoes.S5;
import women_shoes.S6;
import women_shoes.S7;
import women_shoes.S8;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class W_Shoes {

	static private JFrame frmFashionStore;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public W_Shoes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static public void initialize() {
		frmFashionStore = new JFrame();
		frmFashionStore.setTitle("Fashion Store");
		frmFashionStore.setBounds(100, 100, 768, 633);
		frmFashionStore.setVisible(true);
		frmFashionStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFashionStore.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		label_1.setBounds(10, 11, 245, 47);
		frmFashionStore.getContentPane().add(label_1);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/6.jpg")));
		lbl6.setBounds(328, 334, 114, 155);
		frmFashionStore.getContentPane().add(lbl6);
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S6.initialize();
			}
		});
		
		JLabel lbl1 = new JLabel("");
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S1.initialize();
			}
		});
		lbl1.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/1.jpg")));
		lbl1.setBounds(187, 69, 114, 152);
		frmFashionStore.getContentPane().add(lbl1);
		
		JLabel lbl3 = new JLabel("");
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S3.initialize();
			}
		});
		lbl3.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/3.jpg")));
		lbl3.setBounds(469, 69, 114, 152);
		frmFashionStore.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S4.initialize();
			}
		});
		lbl4.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/4.jpg")));
		lbl4.setBounds(610, 69, 114, 152);
		frmFashionStore.getContentPane().add(lbl4);
		
		JLabel lbl2 = new JLabel("");
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S2.initialize();
			}
		});
		lbl2.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/2.jpg")));
		lbl2.setBounds(328, 69, 114, 152);
		frmFashionStore.getContentPane().add(lbl2);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/5.jpg")));
		lbl5.setBounds(187, 334, 114, 155);
		frmFashionStore.getContentPane().add(lbl5);
		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S5.initialize();
			}
		});
		
		JLabel lbl8 = new JLabel("");
		lbl8.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/8.jpg")));
		lbl8.setBounds(610, 334, 114, 155);
		frmFashionStore.getContentPane().add(lbl8);
		lbl8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				S8.initialize();
			}
		});
				
		JLabel lbl7 = new JLabel("lipstick cout");
		lbl7.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Women/Clothes/shoes/7.jpg")));
		lbl7.setBounds(469, 334, 114, 155);
		frmFashionStore.getContentPane().add(lbl7);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 69, 167, 514);
		frmFashionStore.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDresses = new JLabel("Category");
		lblDresses.setHorizontalAlignment(SwingConstants.CENTER);
		lblDresses.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDresses.setBounds(0, 0, 167, 43);
		panel.add(lblDresses);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 39, 167, 12);
		panel.add(separator);
		
		JLabel lblTops = new JLabel("Tops & Tees");
		lblTops.setHorizontalAlignment(SwingConstants.CENTER);
		lblTops.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTops.setBounds(0, 39, 167, 43);
		panel.add(lblTops);
		lblTops.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				W_Dresses.initialize();
			}
		});
		
		JLabel lblJeans = new JLabel("Jeans");
		lblJeans.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeans.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJeans.setBounds(0, 81, 167, 43);
		panel.add(lblJeans);
		lblJeans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				W_Jeans.initialize();
			}
		});
		
		JLabel lblShoes = new JLabel("Shoes");
		lblShoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblShoes.setBounds(0, 126, 167, 43);
		panel.add(lblShoes);
		lblShoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				W_Shoes.initialize();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 732, 47);
		frmFashionStore.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/arrow_back_black_192x192.png")));
		back.setBounds(510, 0, 47, 47);
		panel_1.add(back);
		
		JLabel lblCart = new JLabel("");
		lblCart.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/download.png")));
		lblCart.setBounds(596, 0, 63, 47);
		panel_1.add(lblCart);
		lblCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				cart.initialize();
			}
		});
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Womens_wear.initialize();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Awabox.initialize();
			}
		});
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(187, 220, 114, 62);
		frmFashionStore.getContentPane().add(panel_2);
		
		JLabel lblAwaboxStarPrint = new JLabel("Crochet Design Toe ");
		lblAwaboxStarPrint.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblAwaboxStarPrint);
		
		JLabel lblNewLabel = new JLabel("Post Flat Slippers");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblNewLabel);
		
		JLabel lblRs = new JLabel("\u20B91200.00");
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblRs);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				kookie.initialize();
			}
		});
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(328, 220, 114, 62);
		frmFashionStore.getContentPane().add(panel_3);
		
		JLabel lblKookieKidsCats = new JLabel("Pointed Toe Net");
		lblKookieKidsCats.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblKookieKidsCats);
		
		JLabel lblPointedToeNet = new JLabel("       Flats           ");
		lblPointedToeNet.setHorizontalAlignment(SwingConstants.CENTER);
		lblPointedToeNet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblPointedToeNet);
		
		JLabel lblRs_1 = new JLabel("\u20B91642.00");
		lblRs_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblRs_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				kiabi.initialize();
			}
		});
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(469, 220, 114, 62);
		frmFashionStore.getContentPane().add(panel_4);
		
		JLabel lblKiabiGiraffePrint = new JLabel("PU Cap Toe Flats");
		lblKiabiGiraffePrint.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblKiabiGiraffePrint);
		
		JLabel lblRs_2 = new JLabel("\u20B91932.00");
		panel_4.add(lblRs_2);
		lblRs_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				memory.initialize();
			}
		});
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(611, 220, 114, 62);
		frmFashionStore.getContentPane().add(panel_5);
		
		JLabel lblMemoryLifeLove = new JLabel("Round Toe Lace Up");
		lblMemoryLifeLove.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(lblMemoryLifeLove);
		
		JLabel lblWinsPrintSequined = new JLabel(" PU Sneakers");
		lblWinsPrintSequined.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinsPrintSequined.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(lblWinsPrintSequined);
		
		JLabel lblRs_3 = new JLabel("\u20B92256.00");
		lblRs_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblRs_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(187, 486, 114, 62);
		frmFashionStore.getContentPane().add(panel_6);
		
		JLabel lblLittleKangroosPom = new JLabel("Toe Ring Flat Slipper");
		lblLittleKangroosPom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6.add(lblLittleKangroosPom);
		
		JLabel lblRs_4 = new JLabel("\u20B91200.00");
		lblRs_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblRs_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(328, 486, 114, 62);
		frmFashionStore.getContentPane().add(panel_7);
		
		JLabel lblBabyhugFullSleeves = new JLabel("Pom Pom Detail Toe");
		lblBabyhugFullSleeves.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblBabyhugFullSleeves);
		
		JLabel lblPostSandals = new JLabel(" Post Sandals");
		lblPostSandals.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblPostSandals);
		
		JLabel lblSolidColurShirt = new JLabel("");
		lblSolidColurShirt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblSolidColurShirt);
		
		JLabel lblRs_5 = new JLabel("\u20B9441.00");
		lblRs_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblRs_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(469, 486, 114, 62);
		frmFashionStore.getContentPane().add(panel_8);
		
		JLabel lblLipsticksCouture = new JLabel("Toe Ring Flat Sandals");
		lblLipsticksCouture.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8.add(lblLipsticksCouture);
		
		JLabel lblPrintedShortJumpsuit = new JLabel(" With Studded");
		lblPrintedShortJumpsuit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8.add(lblPrintedShortJumpsuit);
		
		JLabel lblRs_6 = new JLabel("\u20B91435.00");
		lblRs_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblRs_6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(611, 486, 114, 62);
		frmFashionStore.getContentPane().add(panel_9);
		
		JLabel lblKneeLengthDungree = new JLabel("Knot Detail Linen");
		lblKneeLengthDungree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(lblKneeLengthDungree);
		
		JLabel lblSliders = new JLabel(" Sliders        ");
		lblSliders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(lblSliders);
		
		JLabel lblRs_7 = new JLabel("\u20B9393.00");
		lblRs_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(lblRs_7);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(W_Shoes.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		label.setBounds(0, 0, 752, 594);
		frmFashionStore.getContentPane().add(label);
	}
}
