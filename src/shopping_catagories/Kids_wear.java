package shopping_catagories;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import kidsWear.New_Arrivals;
import one.ShoppingCatagories;

//import fashionstore3.ShoppingCatagories;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kids_wear {

	static private JFrame FashionStore;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Kids_wear() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static public void initialize() {
		FashionStore = new JFrame();
		FashionStore.setTitle("FashionStore");
		FashionStore.setBounds(100, 100, 768, 633);
		FashionStore.setVisible(true);
		FashionStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FashionStore.getContentPane().setLayout(null);
		
		JLabel LOGO = new JLabel("");
		LOGO.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		LOGO.setBounds(10, 11, 245, 52);
		FashionStore.getContentPane().add(LOGO);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 732, 52);
		FashionStore.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/arrow_back_black_192x192.png")));
		back.setBounds(440, 0, 47, 47);
		panel.add(back);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/download.png")));
		label_2.setBounds(540, 0, 63, 52);
		panel.add(label_2);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				ShoppingCatagories.initialize();
			}
		});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.GRAY);
		panel_5.setBounds(638, 343, 104, 19);
		FashionStore.getContentPane().add(panel_5);
		
		JLabel lblClearanceSale = new JLabel("CLEARANCE SALE");
		lblClearanceSale.setForeground(Color.WHITE);
		panel_5.add(lblClearanceSale);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_4.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-415223.jpeg")));
		label_4.setBounds(0, 397, 185, 232);
		FashionStore.getContentPane().add(label_4);
		
		JLabel label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_9.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-1115774.jpeg")));
		label_9.setBounds(563, 397, 179, 269);
		FashionStore.getContentPane().add(label_9);
		
		JLabel label_SALE = new JLabel("");
		label_SALE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_SALE.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/carefree-cheerful-child-459949.jpg")));
		label_SALE.setBounds(638, 226, 104, 136);
		FashionStore.getContentPane().add(label_SALE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(468, 203, 139, 19);
		FashionStore.getContentPane().add(panel_2);
		
		JLabel lblNewArrivals = new JLabel("NEW ARRIVALS");
		lblNewArrivals.setForeground(Color.WHITE);
		panel_2.add(lblNewArrivals);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_8.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-765200.jpeg")));
		label_8.setBounds(189, 397, 199, 207);
		FashionStore.getContentPane().add(label_8);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_6.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-969363.jpeg")));
		label_6.setBounds(387, 397, 210, 269);
		FashionStore.getContentPane().add(label_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(468, 334, 150, 19);
		FashionStore.getContentPane().add(panel_4);
		
		JLabel lblTopBrands = new JLabel("TOP BRANDS");
		lblTopBrands.setForeground(Color.WHITE);
		panel_4.add(lblTopBrands);
		
		JLabel label_NEW = new JLabel("");
		label_NEW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_NEW.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-164835.jpeg")));
		label_NEW.setBounds(468, 62, 150, 160);
		FashionStore.getContentPane().add(label_NEW);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(628, 196, 114, 19);
		FashionStore.getContentPane().add(panel_3);
		
		JLabel lblDesignerClothing = new JLabel("DESIGNER CLOTHING");
		lblDesignerClothing.setForeground(Color.WHITE);
		panel_3.add(lblDesignerClothing);
		
		JLabel lblFeatured = new JLabel("Featured");
		lblFeatured.setFont(new Font("Narkisim", Font.PLAIN, 28));
		lblFeatured.setBounds(10, 373, 150, 27);
		FashionStore.getContentPane().add(lblFeatured);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 364, 732, 36);
		FashionStore.getContentPane().add(panel_1);
		
		JLabel label_DESIGNER = new JLabel("");
		label_DESIGNER.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_DESIGNER.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/images (21).jpeg")));
		label_DESIGNER.setBounds(628, 62, 114, 153);
		FashionStore.getContentPane().add(label_DESIGNER);
		
		JLabel label_BRAND = new JLabel("");
		label_BRAND.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_BRAND.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-325867.jpeg")));
		label_BRAND.setBounds(468, 233, 150, 129);
		FashionStore.getContentPane().add(label_BRAND);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				New_Arrivals.initialize();
			}
		});
		label_1.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/kids/pexels-photo-933186.jpeg")));
		label_1.setBounds(10, 62, 448, 300);
		FashionStore.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Kids_wear.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		label.setBounds(0, 35, 826, 594);
		FashionStore.getContentPane().add(label);
	}
}
