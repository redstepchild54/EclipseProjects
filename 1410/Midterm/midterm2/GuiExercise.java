package midterm2;

/*
 * William McConnell
 * CSIS 1410
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author William McConnell
 * Class that creates a JFrame that displays a cloud and has buttons with the ability to modify the some properties of the display.
 */

public class GuiExercise extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExercise frame = new GuiExercise();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiExercise() {
		
		JLabel lblCloud = new JLabel("");
		JPanel panel = new JPanel();
		JRadioButton rdbtnLight = new JRadioButton("Light");
		JLabel lblPurpleCloud = new JLabel("Purple Cloud");
		JRadioButton rdbtnDark = new JRadioButton("Dark");
		
		createFrameComponents(lblCloud, panel, rdbtnLight, lblPurpleCloud, rdbtnDark);
		
		radioButtonEvents(lblCloud, rdbtnLight, lblPurpleCloud, rdbtnDark);
		
	}

	/**
	 * 
	 *@param lblCloud JLabel that displays the Icon.
	 * @param panel JPanel that holds the JRadioButton and the Title JLabel
	 * @param rdbtnLight Light JRadioButton
	 * @param lblPurpleCloud JLabel that displays the Title "Purple Cloud"
	 * @param rdbtnDark Dark JRadioButton
	 * 
	 * Method that creates and sets up the frame components inside the JFrame
	 */
	
	private void createFrameComponents(JLabel lblCloud, JPanel panel, JRadioButton rdbtnLight, JLabel lblPurpleCloud,
			JRadioButton rdbtnDark) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblCloud.setOpaque(true);
		lblCloud.setBackground(Color.WHITE);
		lblCloud.setIcon(new ImageIcon(GuiExercise.class.getResource("/midterm2/Cloud.png")));
		contentPane.add(lblCloud, BorderLayout.CENTER);
		
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		rdbtnLight.setFocusable(false);
		rdbtnLight.setSelected(true);
		buttonGroup.add(rdbtnLight);
		rdbtnLight.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(rdbtnLight);
		
		lblPurpleCloud.setForeground(Color.GRAY);
		lblPurpleCloud.setBorder(new EmptyBorder(0, 20, 0, 20));
		lblPurpleCloud.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPurpleCloud.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPurpleCloud);
		
		rdbtnDark.setFocusable(false);
		buttonGroup.add(rdbtnDark);
		rdbtnDark.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnDark);
	}

	/**
	 * 
	 * @param lblCloud JLabel that displays the Icon.
	 * @param rdbtnLight Light JRadioButton
	 * @param lblPurpleCloud JLabel that displays the Title "Purple Cloud"
	 * @param rdbtnDark Dark JRadioButton
	 * 
	 * Method that creates event handlers for the radio buttons, implements the action performed interface, and registers the event handler objects
	 */
	private void radioButtonEvents(JLabel lblCloud, JRadioButton rdbtnLight, JLabel lblPurpleCloud,
			JRadioButton rdbtnDark) {
		rdbtnLight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblPurpleCloud.setForeground(Color.GRAY);
				lblCloud.setBackground(Color.WHITE);
				
			}
		});
		
		rdbtnDark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblPurpleCloud.setForeground(Color.BLACK);
				lblCloud.setBackground(Color.BLACK);
				
			}
		});
	}

}
