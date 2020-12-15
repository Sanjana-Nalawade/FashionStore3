package women_shoes;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kidsWear.New_Arrivals;
import women.W_Dresses;
import women_jeans.J2;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class S1 extends S2{

	static private JFrame frame;
	public static int s1;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public S1() {
		s1=1200;
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
		label_1.setBounds(10, 11, 245, 47);
		label_1.setIcon(new ImageIcon(New_Arrivals.class.getResource("/Images/Screenshot-2018-6-30 Wix Logo Maker(1).png")));
		frame.getContentPane().add(label_1);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 732, 47);
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 64, 167, 519);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(S1.class.getResource("/Images/Women/Clothes/shoes/1_1.jpg")));
		label_2.setBackground(new Color(192, 192, 192));
		label_2.setOpaque(true);
		label_2.setBounds(220, 69, 242, 294);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(S1.class.getResource("/Images/Women/Clothes/shoes/1_2.jpg")));
		label_3.setBackground(new Color(192, 192, 192));
		label_3.setOpaque(true);
		label_3.setBounds(532, 69, 145, 145);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(S1.class.getResource("/Images/Women/Clothes/shoes/1_3.jpg")));
		label_4.setBackground(new Color(192, 192, 192));
		label_4.setOpaque(true);
		label_4.setBounds(532, 218, 145, 145);
		frame.getContentPane().add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(555, 378, 133, 169);
		frame.getContentPane().add(panel_2);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setForeground(Color.DARK_GRAY);
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_2.add(lblDescription);
		
		JLabel lblBrandName = new JLabel("brand name :  red couture");
		lblBrandName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_2.add(lblBrandName);
		
		JLabel lblMaterialGeorgette = new JLabel("material :  georgette");
		panel_2.add(lblMaterialGeorgette);
		
		JLabel lblLengthinches = new JLabel("length (inches) :  24");
		panel_2.add(lblLengthinches);
		
		JLabel lblPrintPattern = new JLabel("print & pattern :  solids");
		panel_2.add(lblPrintPattern);
		
		JLabel label_10 = new JLabel(" Fit- Regular fit");
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel(" Occation- Casual wear");
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("Material - Cotton Blend");
		panel_2.add(label_12);
		
		JLabel lblKnotHemCrop = new JLabel("Crochet Design Toe Post Flat Slippers ");
		lblKnotHemCrop.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKnotHemCrop.setBounds(220, 378, 435, 20);
		frame.getContentPane().add(lblKnotHemCrop);
		
		JLabel label_14 = new JLabel("\u20B91200.00");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(220, 406, 91, 20);
		frame.getContentPane().add(label_14);
		
		JLabel lblMrpInclAll = new JLabel("MRP incl. all taxes, Additional charges may apply on discounted price.");
		lblMrpInclAll.setForeground(Color.GRAY);
		lblMrpInclAll.setBounds(220, 428, 341, 14);
		frame.getContentPane().add(lblMrpInclAll);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(186, 64, 556, 520);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton button = new JButton("ADD TO CART");
		button.setBounds(87, 434, 167, 29);
		panel_3.add(button);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					/* Integer v1 = (Integer) cb1.getSelectedItem();
		                Integer v2 = (Integer) cb2.getSelectedItem();
		                int sum = v1.intValue() + v2.intValue();
		                txt.setText("42"); // really should convert sum to a String	 */				
					
					
					//String text = (String)comboBox.getSelectedItem();
					// nos = Integer.parseInt(text);
					// System.out.println("** "+nos);
						s1=1200;
						int df = 1111;
						
						W_Dresses.initialize();
						frame.dispose();
					}
				catch(Exception er)
					{
						er.printStackTrace();	
					}
						
			}
		});
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 752, 595);
		label.setIcon(new ImageIcon(S1.class.getResource("/Images/Linen-Solid-Color-Background-Wallpaper-5120x2880.png")));
		frame.getContentPane().add(label);
	}
}
