package men;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import women_dresses.D1;
import women_dresses.D2;
import women_dresses.D3;
import women_dresses.D4;
import women_dresses.D5;
import women_dresses.D6;
import women_dresses.D7;
import women_dresses.D8;

import men_shoes.Sh1;
import men_shoes.Sh2;
import men_shoes.Sh3;
import men_shoes.Sh4;
import men_shoes.Sh5;
import men_shoes.Sh6;
import men_shoes.Sh7;
import men_shoes.Sh8;
import shopping_catagories.Mens_wear;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class M_shoes {

	static private JFrame frmFashionStore;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public M_shoes() {
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
		label_1.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		label_1.setBounds(10, 11, 245, 47);
		frmFashionStore.getContentPane().add(label_1);
		
		JLabel label_66 = new JLabel("");
		label_66.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/6.jpg")));
		label_66.setBounds(328, 334, 131, 155);
		frmFashionStore.getContentPane().add(label_66);
		label_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh6.initialize();
			}
		});
		
		JLabel label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh1.initialize();
			}
		});
		label_11.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/1.jpg")));
		label_11.setBounds(187, 69, 131, 152);
		frmFashionStore.getContentPane().add(label_11);
		
		JLabel label_33 = new JLabel("");
		label_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh3.initialize();
			}
		});
		label_33.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/3.jpg")));
		label_33.setBounds(469, 69, 131, 152);
		frmFashionStore.getContentPane().add(label_33);
		
		JLabel label_44 = new JLabel("");
		label_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh4.initialize();
			}
		});
		label_44.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/4.jpg")));
		label_44.setBounds(610, 69, 131, 152);
		frmFashionStore.getContentPane().add(label_44);
		label_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh4.initialize();
			}
		});
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/2.jpg")));
		label_22.setBounds(328, 69, 131, 152);
		frmFashionStore.getContentPane().add(label_22);
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh2.initialize();
			}
		});
		
		JLabel label_55 = new JLabel("");
		label_55.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/5.jpg")));
		label_55.setBounds(187, 334, 131, 155);
		frmFashionStore.getContentPane().add(label_55);
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh5.initialize();
			}
		});
		
		JLabel label_88 = new JLabel("");
		label_88.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/8.jpg")));
		label_88.setBounds(610, 334, 131, 155);
		frmFashionStore.getContentPane().add(label_88);
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh8.initialize();
			}
		});
		
		JLabel label_77 = new JLabel("");
		label_77.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Men/shoes/7.jpg")));
		label_77.setBounds(469, 334, 131, 155);
		frmFashionStore.getContentPane().add(label_77);
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Sh7.initialize();
			}
		});
		
		JLabel lblRs_2 = new JLabel("Rs. 3,998");
		lblRs_2.setBounds(509, 264, 74, 15);
		frmFashionStore.getContentPane().add(lblRs_2);
		lblRs_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
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
				M_Dresses.initialize();
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
				M_jeans.initialize();
			}
		});
		
		JLabel lblshoes = new JLabel("Shoes");
		lblshoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblshoes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblshoes.setBounds(0, 126, 167, 43);
		panel.add(lblshoes);
		lblshoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				M_shoes.initialize();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 732, 47);
		frmFashionStore.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/arrow_back_black_192x192.png")));
		back.setBounds(357, 0, 47, 47);
		panel_1.add(back);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				Mens_wear.initialize();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				//Awabox.initialize();
			}
		});
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(187, 220, 131, 62);
		frmFashionStore.getContentPane().add(panel_2);
		
		JLabel lblAwaboxStarPrint = new JLabel("Air Max Infuriate Low ");
		lblAwaboxStarPrint.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblAwaboxStarPrint);
		
		JLabel lblNewLabel = new JLabel("Basketball Shoes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblNewLabel);
		
		JLabel lblRs = new JLabel("Rs. 2,798");
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblRs);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				//kookie.initialize();
			}
		});
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(328, 220, 131, 62);
		frmFashionStore.getContentPane().add(panel_3);
		
		JLabel lblKookieKidsCats = new JLabel("CL \u201CAttentive");
		lblKookieKidsCats.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblKookieKidsCats);
		
		JLabel lblLeatherPackTrainers = new JLabel(" Leather Pack\u201D Trainers");
		lblLeatherPackTrainers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblLeatherPackTrainers);
		
		JLabel lblRs_1 = new JLabel("Rs. 4,000");
		lblRs_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblRs_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				//kiabi.initialize();
			}
		});
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(469, 220, 131, 62);
		frmFashionStore.getContentPane().add(panel_4);
		
		JLabel lblKiabiGiraffePrint = new JLabel("Air Zoom Pegasus ");
		lblKiabiGiraffePrint.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblKiabiGiraffePrint);
		
		JLabel lblShortsSetyellowgrey = new JLabel("34 Running Shoes");
		lblShortsSetyellowgrey.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblShortsSetyellowgrey);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				//memory.initialize();
			}
		});
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(611, 220, 131, 62);
		frmFashionStore.getContentPane().add(panel_5);
		
		JLabel lblMemoryLifeLove = new JLabel("Air Epic Speed Tr Ii ");
		lblMemoryLifeLove.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(lblMemoryLifeLove);
		
		JLabel lblWinsPrintSequined = new JLabel("Training Shoes");
		lblWinsPrintSequined.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinsPrintSequined.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(lblWinsPrintSequined);
		
		JLabel lblRs_3 = new JLabel("Rs. 2,118");
		lblRs_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblRs_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(187, 486, 131, 62);
		frmFashionStore.getContentPane().add(panel_6);
		
		JLabel lblLittleKangroosPom = new JLabel("Tanjun Racer Shoes");
		lblLittleKangroosPom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6.add(lblLittleKangroosPom);
		
		JLabel lblRs_4 = new JLabel("Rs. 2,198");
		lblRs_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblRs_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(328, 486, 131, 62);
		frmFashionStore.getContentPane().add(panel_7);
		
		JLabel lblBabyhugFullSleeves = new JLabel("Hi Top Sneakers");
		lblBabyhugFullSleeves.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblBabyhugFullSleeves);
		
		JLabel lblSolidColurShirt = new JLabel("");
		lblSolidColurShirt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblSolidColurShirt);
		
		JLabel lblRs_5 = new JLabel("Rs. 795");
		lblRs_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblRs_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(469, 486, 131, 62);
		frmFashionStore.getContentPane().add(panel_8);
		
		JLabel lblLipsticksCouture = new JLabel("Casual Slip-Ons In");
		lblLipsticksCouture.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8.add(lblLipsticksCouture);
		
		JLabel lblPrintedShortJumpsuit = new JLabel(" Contrast Detailing");
		lblPrintedShortJumpsuit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8.add(lblPrintedShortJumpsuit);
		
		JLabel lblRs_6 = new JLabel("Rs. 495");
		lblRs_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblRs_6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(611, 486, 131, 62);
		frmFashionStore.getContentPane().add(panel_9);
		
		JLabel lblKneeLengthDungree = new JLabel("Lunarglide 9 ");
		lblKneeLengthDungree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(lblKneeLengthDungree);
		
		JLabel lblRunningShoes = new JLabel("Running Shoes");
		lblRunningShoes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(lblRunningShoes);
		
		JLabel lblRs_7 = new JLabel("Rs. 4,398");
		lblRs_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(lblRs_7);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(M_shoes.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		label.setBounds(0, 0, 752, 594);
		frmFashionStore.getContentPane().add(label);
	}
}