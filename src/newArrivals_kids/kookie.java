package newArrivals_kids;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kidsWear.New_Arrivals;

public class kookie {

	static private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public kookie() {
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
		label_1.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Awabox.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		label.setBounds(0, 0, 752, 583);
		frame.getContentPane().add(label);
	}

}
