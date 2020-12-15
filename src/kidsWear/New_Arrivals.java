package kidsWear;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import shopping_catagories.Kids_wear;
import shopping_catagories.Womens_wear;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;

import newArrivalsgirls.boy1;
import newArrivalsgirls.boy2;
import newArrivalsgirls.boy3;
import newArrivalsgirls.boy4;
import newArrivalsgirls.boy5;
import newArrivalsgirls.boy6;
import newArrivalsgirls.boy7;
import newArrivalsgirls.boy8;
import newArrivalsgirls.girl1;
import newArrivalsgirls.girl2;
import newArrivalsgirls.girl3;
import newArrivalsgirls.girl4;
import newArrivalsgirls.girl5;
import newArrivalsgirls.girl6;
import newArrivalsgirls.girl7;
import newArrivalsgirls.girl8;
import newArrivalsgirls.kiabi;
import newArrivalsgirls.kookie;
import newArrivalsgirls.memory;

public class New_Arrivals {

	static private JFrame frmFashionStore;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public New_Arrivals() {
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				New_Arrivals.dispose();
				Kids_wear.initialize();
			}
		});
		lblNewLabel_1.setBounds(675, -61, 46, 190);
		frmFashionStore.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/index.jpg")));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		label_1.setBounds(10, 11, 245, 47);
		frmFashionStore.getContentPane().add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 69, 167, 514);
		frmFashionStore.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 11, 732, 47);
		frmFashionStore.getContentPane().add(panel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(187, 69, 565, 514);
		frmFashionStore.getContentPane().add(tabbedPane);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		tabbedPane.addTab("Girls", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl6.initialize();
			}
		});
		label_2.setBounds(141, 242, 131, 155);
		panel_10.add(label_2);
		label_2.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/2149740a.jpg")));
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(0, 0, 131, 155);
		panel_10.add(label_3);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl1.initialize();
			}
		});
		label_3.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/2084635a.jpg")));
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(277, 0, 127, 155);
		panel_10.add(label_4);
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl3.initialize();
			}
		});
		label_4.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/2100698a.jpg")));
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(407, 0, 132, 155);
		panel_10.add(label_5);
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl4.initialize();
			}
		});
		label_5.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/Screenshot_20180705-011625.png")));
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(136, 0, 131, 155);
		panel_10.add(label_6);
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl2.initialize();
			}
		});
		label_6.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/Screenshot_20180705-011629.png")));
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl5.initialize();
			}
		});
		label_7.setBounds(0, 242, 131, 155);
		panel_10.add(label_7);
		label_7.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/Screenshot_20180705-011631.png")));
		
		JLabel label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl8.initialize();
			}
		});
		label_9.setBounds(412, 242, 131, 155);
		panel_10.add(label_9);
		label_9.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/2117004a.jpg")));
		
		JLabel lblLipstickCout = new JLabel("lipstick cout");
		lblLipstickCout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl7.initialize();
			}
		});
		lblLipstickCout.setBounds(277, 242, 132, 155);
		panel_10.add(lblLipstickCout);
		lblLipstickCout.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/Screenshot_20180705-011641.png")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 155, 131, 62);
		panel_10.add(panel_2);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl1.initialize();			}
		});
		panel_2.setBackground(Color.WHITE);
		
		JLabel lblAwaboxStarPrint = new JLabel("Huali Kids Bird");
		lblAwaboxStarPrint.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblAwaboxStarPrint);
		
		JLabel lblNewLabel = new JLabel("Print Dress - White");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblNewLabel);
		
		JLabel lblRs = new JLabel("Rs 448");
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblRs);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(136, 155, 131, 62);
		panel_10.add(panel_3);
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl2.initialize();
			}
		});
		panel_3.setBackground(Color.WHITE);
		
		JLabel lblKookieKidsCats = new JLabel("Kookie Kids Cats ");
		lblKookieKidsCats.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblKookieKidsCats);
		
		JLabel lblPrintdTeepurple = new JLabel("Printd Tee-Purple");
		lblPrintdTeepurple.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblPrintdTeepurple);
		
		JLabel lblRs_1 = new JLabel("Rs 195");
		lblRs_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblRs_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(275, 155, 131, 62);
		panel_10.add(panel_4);
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl3.initialize();
			}
		});
		panel_4.setBackground(Color.WHITE);
		
		JLabel lblKiabiGiraffePrint = new JLabel("Little Marie Honey");
		lblKiabiGiraffePrint.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblKiabiGiraffePrint);
		
		JLabel lblShortsSetyellowgrey = new JLabel("Bee Print Dress");
		lblShortsSetyellowgrey.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(lblShortsSetyellowgrey);
		
		JLabel lblRs_2 = new JLabel("Rs 448");
		panel_4.add(lblRs_2);
		lblRs_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl6.initialize();
			}
		});
		panel_7.setBounds(141, 395, 131, 62);
		panel_10.add(panel_7);
		panel_7.setBackground(Color.WHITE);
		
		JLabel lblBabyhugFullSleeves = new JLabel("B&G Kids Flower");
		lblBabyhugFullSleeves.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblBabyhugFullSleeves);
		
		JLabel lblSolidColurShirt = new JLabel("Applique Dress");
		lblSolidColurShirt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(lblSolidColurShirt);
		
		JLabel lblRs_5 = new JLabel("Rs 490");
		lblRs_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblRs_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl7.initialize();
			}
		});
		panel_8.setBounds(277, 395, 131, 62);
		panel_10.add(panel_8);
		panel_8.setBackground(Color.WHITE);
		
		JLabel lblLipsticksCouture = new JLabel("Lilpicks Couture ");
		lblLipsticksCouture.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8.add(lblLipsticksCouture);
		
		JLabel lblPrintedShortJumpsuit = new JLabel("Printed Short Jumpsuit");
		lblPrintedShortJumpsuit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_8.add(lblPrintedShortJumpsuit);
		
		JLabel lblRs_6 = new JLabel("Rs 639");
		lblRs_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblRs_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(408, 155, 131, 62);
		panel_10.add(panel_5);
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				girl4.initialize();
			}
		});
		panel_5.setBackground(Color.WHITE);
		
		JLabel lblMemoryLifeLove = new JLabel("Memory Life Love Wins");
		lblMemoryLifeLove.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(lblMemoryLifeLove);
		
		JLabel lblWinsPrintSequined = new JLabel("Print Sequined Top");
		lblWinsPrintSequined.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(lblWinsPrintSequined);
		
		JLabel lblRs_3 = new JLabel("Rs 328");
		lblRs_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblRs_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl5.initialize();
			}
		});
		panel_6.setBounds(0, 395, 131, 62);
		panel_10.add(panel_6);
		panel_6.setBackground(Color.WHITE);
		
		JLabel lblLittleKangroosPom = new JLabel("Little Kangaroos Pom ");
		lblLittleKangroosPom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6.add(lblLittleKangroosPom);
		
		JLabel lblPomSolidShorts = new JLabel("Pom Solid Shorts");
		lblPomSolidShorts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6.add(lblPomSolidShorts);
		
		JLabel lblRs_4 = new JLabel("Rs 499");
		lblRs_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblRs_4);
		
		JPanel panel_9 = new JPanel();
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				girl8.initialize();
			}
		});
		panel_9.setBounds(412, 395, 127, 62);
		panel_10.add(panel_9);
		panel_9.setBackground(Color.WHITE);
		
		JLabel lblFirstclapFrontPocket = new JLabel("Memory Life Rabbit");
		lblFirstclapFrontPocket.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(lblFirstclapFrontPocket);
		
		JLabel lblKneeLengthDungree = new JLabel("       Print Top         ");
		lblKneeLengthDungree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(lblKneeLengthDungree);
		
		JLabel lblRs_7 = new JLabel("Rs 328");
		lblRs_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(lblRs_7);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		tabbedPane.addTab("Boys", null, panel_11, null);
		panel_11.setLayout(null);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy7.initialize();
			}
		});
		label_8.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2235648a.jpg")));
		label_8.setBounds(282, 276, 131, 155);
		panel_11.add(label_8);
		
		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				boy1.initialize();
				}
		});
		label_10.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/Screenshot_20180705-011621.png")));
		label_10.setBounds(0, 11, 131, 152);
		panel_11.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy3.initialize();
			}
		});
		label_11.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2049289a.jpg")));
		label_11.setBounds(282, 11, 127, 152);
		panel_11.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy4.initialize();
			}
		});
		label_12.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2244600a.jpg")));
		label_12.setBounds(423, 11, 132, 152);
		panel_11.add(label_12);
		
		JLabel label_14 = new JLabel("");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy5.initialize();
			}
		});
		label_14.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2107381a.jpg")));
		label_14.setBounds(0, 276, 131, 155);
		panel_11.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy8.initialize();
			}
		});
		label_15.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2276918a.jpg")));
		label_15.setBounds(423, 276, 131, 155);
		panel_11.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy2.initialize();
			}
		});
		label_16.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2027539a.jpg")));
		label_16.setBounds(140, 11, 132, 155);
		panel_11.add(label_16);
		
		JPanel panel_12 = new JPanel();
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmFashionStore.dispose();
				boy1.initialize();
			}
		});
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 162, 131, 62);
		panel_11.add(panel_12);
		
		JLabel label_18 = new JLabel("Awabox Star Print Tee");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_12.add(label_18);
		
		JLabel label_19 = new JLabel("& Checkered Shorts Set");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_12.add(label_19);
		
		JLabel label_20 = new JLabel("Rs 615");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_12.add(label_20);
		
		JPanel panel_13 = new JPanel();
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy2.initialize();
			}
		});
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(141, 162, 131, 62);
		panel_11.add(panel_13);
		
		JLabel lblBabyhugFull = new JLabel("Babyhug Full Sleeves ");
		lblBabyhugFull.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_13.add(lblBabyhugFull);
		
		JLabel lblStripedSweaterWith = new JLabel("Striped Sweater & Pant");
		lblStripedSweaterWith.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_13.add(lblStripedSweaterWith);
		
		JLabel lblRs_8 = new JLabel("Rs 499");
		lblRs_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_13.add(lblRs_8);
		
		JPanel panel_14 = new JPanel();
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy3.initialize();
			}
		});
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(282, 162, 131, 62);
		panel_11.add(panel_14);
		
		JLabel lblBabyoyeDungareeStyle = new JLabel("Babyoye Dungare Style ");
		lblBabyoyeDungareeStyle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_14.add(lblBabyoyeDungareeStyle);
		
		JLabel lblShortsSet = new JLabel("Denim Romper");
		lblShortsSet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_14.add(lblShortsSet);
		
		JLabel lblRs_10 = new JLabel("Rs 799");
		panel_14.add(lblRs_10);
		lblRs_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel panel_15 = new JPanel();
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy4.initialize();
			}
			
		});
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(424, 162, 131, 62);
		panel_11.add(panel_15);
		
		JLabel lblToffyhouseStriped = new JLabel("ToffyHouse Striped");
		lblToffyhouseStriped.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_15.add(lblToffyhouseStriped);
		
		JLabel lblTeeTrouser = new JLabel("Tee & Trouser ");
		lblTeeTrouser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_15.add(lblTeeTrouser);
		
		JLabel lblRs_11 = new JLabel("Rs 700");
		lblRs_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_15.add(lblRs_11);
		
		JPanel panel_16 = new JPanel();
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy5.initialize();
			}
		});
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(0, 428, 131, 62);
		panel_11.add(panel_16);
		
		JLabel lblBabyhugPartyWear = new JLabel("Babyhug Party Wear");
		lblBabyhugPartyWear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_16.add(lblBabyhugPartyWear);
		
		JLabel lblCheckShirtAnd = new JLabel("Check Shirt And Bow");
		lblCheckShirtAnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_16.add(lblCheckShirtAnd);
		
		JLabel lblRs_12 = new JLabel("Rs 600");
		lblRs_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_16.add(lblRs_12);
		
		JPanel panel_17 = new JPanel();
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy7.initialize();
			}
		});
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(282, 428, 131, 62);
		panel_11.add(panel_17);
		
		JLabel lblMarkMia = new JLabel("Mark & Mia ");
		lblMarkMia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_17.add(lblMarkMia);
		
		JLabel lblRomperWithTie = new JLabel("Romper With Tie");
		lblRomperWithTie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_17.add(lblRomperWithTie);
		
		JLabel lblRs_13 = new JLabel("Rs 700");
		lblRs_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_17.add(lblRs_13);
		
		JPanel panel_18 = new JPanel();
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy6.initialize();
			}
		});
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(141, 428, 131, 62);
		panel_11.add(panel_18);
		
		JLabel lblOlioKidsFull = new JLabel("Olio Kids Tee  &");
		lblOlioKidsFull.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_18.add(lblOlioKidsFull);
		
		JLabel lblTeeLounge = new JLabel(" Lounge Pant Animal Print");
		lblTeeLounge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_18.add(lblTeeLounge);
		
		JLabel lblRs_9 = new JLabel("Rs 400");
		lblRs_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_18.add(lblRs_9);
		
		JPanel panel_19 = new JPanel();
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy8.initialize();
			}
		});
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(424, 428, 131, 62);
		panel_11.add(panel_19);
		
		JLabel lblBownbeeEmbroidered = new JLabel("BownBee Embroidered");
		lblBownbeeEmbroidered.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_19.add(lblBownbeeEmbroidered);
		
		JLabel lblJacketWithDhoti = new JLabel("Jacket With Dhoti Set");
		lblJacketWithDhoti.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_19.add(lblJacketWithDhoti);
		
		JLabel lblRs_14 = new JLabel("Rs 850");
		lblRs_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_19.add(lblRs_14);
		
		JLabel label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmFashionStore.dispose();
				boy6.initialize();
			}
		});
		label_13.setBounds(140, 271, 132, 160);
		panel_11.add(label_13);
		label_13.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/kids/thumbnails/boys/2228039a.jpg")));
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 752, 460);
		frmFashionStore.getContentPane().add(label);
		label.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
	}

	protected static void dispose() {
		// TODO Auto-generated method stub
		
	}
}
