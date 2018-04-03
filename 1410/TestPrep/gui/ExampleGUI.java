package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExampleGUI extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleGUI frame = new ExampleGUI();
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
	public ExampleGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblExampleGui = new JLabel("Example GUI");
		lblExampleGui.setBorder(new EmptyBorder(10, 10, 10, 10));
		lblExampleGui.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExampleGui.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblExampleGui, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton rdbtnLeft = new JRadioButton("Left");
		rdbtnLeft.setSelected(true);
		rdbtnLeft.setBorder(new EmptyBorder(10, 10, 10, 10));
		rdbtnLeft.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnLeft.setFocusable(false);
		buttonGroup.add(rdbtnLeft);
		panel.add(rdbtnLeft);
		
		JRadioButton rdbtnRight = new JRadioButton("Right");
		rdbtnRight.setBorder(new EmptyBorder(10, 10, 10, 10));
		rdbtnRight.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnRight.setFocusable(false);
		buttonGroup.add(rdbtnRight);
		panel.add(rdbtnRight);
		
		JLabel lblLeft = new JLabel("");
		lblLeft.setMinimumSize(new Dimension(300, 300));
		lblLeft.setPreferredSize(new Dimension(300, 300));
		lblLeft.setBorder(new EmptyBorder(0, 10, 0, 10));
		lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeft.setIcon(new ImageIcon(ExampleGUI.class.getResource("/gui/schlange.gif")));
		lblLeft.setOpaque(true);
		lblLeft.setFocusable(false);
		lblLeft.setBackground(Color.BLACK);
		contentPane.add(lblLeft, BorderLayout.WEST);
		
		JLabel lblRight = new JLabel("");
		lblRight.setMinimumSize(new Dimension(300, 300));
		lblRight.setPreferredSize(new Dimension(300, 300));
		lblRight.setBorder(new EmptyBorder(0, 10, 0, 10));
		lblRight.setHorizontalAlignment(SwingConstants.CENTER);
		lblRight.setOpaque(true);
		lblRight.setFocusable(false);
		lblRight.setBackground(Color.BLACK);
		contentPane.add(lblRight, BorderLayout.EAST);
		
		rdbtnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblLeft.setIcon(new ImageIcon(ExampleGUI.class.getResource("/gui/schlange.gif")));
				lblRight.setIcon(null);
				
			}
		});
		
		rdbtnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblRight.setIcon(new ImageIcon(ExampleGUI.class.getResource("/gui/schlange.gif")));
				lblLeft.setIcon(null);
				
			}
		});
	}

}
