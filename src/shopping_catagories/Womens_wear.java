package shopping_catagories;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import kidsWear.New_Arrivals;
import women.W_Dresses;

import one.ShoppingCatagories;
import one.cart;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class Womens_wear {

	static private JFrame FashionStore;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Womens_wear() {
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
		LOGO.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		LOGO.setBounds(10, 11, 245, 52);
		FashionStore.getContentPane().add(LOGO);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 732, 52);
		FashionStore.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/arrow_back_black_192x192.png")));
		back.setBounds(509, 0, 47, 52);
		panel.add(back);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				ShoppingCatagories.initialize();
			}
		});
		
		JLabel lblCart = new JLabel("");
		lblCart.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/download.png")));
		lblCart.setBounds(607, 0, 63, 52);
		panel.add(lblCart);
		lblCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				cart.initialize();
			}
		});
		
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		label_4.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/2.jpg")));
		label_4.setBounds(10, 388, 178, 207);
		FashionStore.getContentPane().add(label_4);
		
		JLabel label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		label_9.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/5.jpg")));
		label_9.setBounds(559, 388, 183, 207);
		FashionStore.getContentPane().add(label_9);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		label_8.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/3.jpg")));
		label_8.setBounds(188, 388, 188, 207);
		FashionStore.getContentPane().add(label_8);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		label_6.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/4.jpg")));
		label_6.setBounds(375, 388, 185, 207);
		FashionStore.getContentPane().add(label_6);
		
		JLabel label_NEW = new JLabel("");
		label_NEW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				W_Dresses.initialize();
			}
		});
		label_NEW.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/sale_5.jpg")));
		label_NEW.setBounds(468, 62, 150, 150);
		FashionStore.getContentPane().add(label_NEW);
		
		JLabel lblFeatured = new JLabel("Featured");
		lblFeatured.setFont(new Font("Narkisim", Font.PLAIN, 28));
		lblFeatured.setBounds(10, 356, 150, 30);
		FashionStore.getContentPane().add(lblFeatured);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 356, 732, 30);
		FashionStore.getContentPane().add(panel_1);
		
		JLabel label_DESIGNER = new JLabel("");
		label_DESIGNER.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				W_Dresses.initialize();
			}
		});
		label_DESIGNER.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/Brand_CLP_W_MissChase_1406.jpg")));
		label_DESIGNER.setBounds(628, 62, 113, 153);
		FashionStore.getContentPane().add(label_DESIGNER);
		
		JLabel label_BRAND = new JLabel("");
		label_BRAND.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				W_Dresses.initialize();
			}
		});
		label_BRAND.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/Sale_3.jpg")));
		label_BRAND.setBounds(468, 223, 274, 126);
		FashionStore.getContentPane().add(label_BRAND);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FashionStore.dispose();
				W_Dresses.initialize();
			}
		});
		label_1.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Women/Sale_4.jpg")));
		label_1.setBounds(10, 62, 448, 292);
		FashionStore.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(192, 192, 192)));
		label.setIcon(new ImageIcon(Womens_wear.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		label.setBounds(0, 35, 752, 594);
		FashionStore.getContentPane().add(label);
	}
}
