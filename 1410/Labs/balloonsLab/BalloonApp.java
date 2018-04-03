package balloonsLab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class BalloonApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonApp frame = new BalloonApp();
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
	public BalloonApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		contentPane.setLayout(new BorderLayout(0, 10));
		setContentPane(contentPane);
		
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setFocusable(false);
		lblLabBalloon.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblLabBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabBalloon.setFont(new Font("Verdana", Font.BOLD, 24));
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);
		
		JPanel panelInterface = new JPanel();
		panelInterface.setFocusable(false);
		contentPane.add(panelInterface, BorderLayout.SOUTH);
		
		JButton btnGenerateBalloons = new JButton("Generate Balloons");
		btnGenerateBalloons.setFocusable(false);
		btnGenerateBalloons.setFont(new Font("Verdana", Font.BOLD, 20));
		panelInterface.add(btnGenerateBalloons);
		
		JLabel lblResults = new JLabel("No Balloons!");
		lblResults.setFocusable(true);
		lblResults.setOpaque(true);
		lblResults.setBackground(Color.LIGHT_GRAY);
		lblResults.setFont(new Font("Verdana", Font.BOLD, 25));
		lblResults.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInterface.add(lblResults);
		
		JPanel panel = new JPanel();
		panel.setFocusable(false);
		panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 2, 20, 0));
		
		JLabel Balloon1 = new JLabel();
		Balloon1.setFont(new Font("Verdana", Font.BOLD, 18));
		Balloon1.setHorizontalTextPosition(SwingConstants.CENTER);
		Balloon1.setHorizontalAlignment(SwingConstants.CENTER);
		Balloon1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Balloon1.setFocusable(false);
		Balloon1.setBorder(new LineBorder(new Color(0, 0, 0)));
		Balloon1.setOpaque(true);
		Balloon1.setBackground(Color.WHITE);
		panel.add(Balloon1);
		
		JLabel Balloon2 = new JLabel();
		Balloon2.setFont(new Font("Verdana", Font.BOLD, 18));
		Balloon2.setHorizontalTextPosition(SwingConstants.CENTER);
		Balloon2.setHorizontalAlignment(SwingConstants.CENTER);
		Balloon2.setVerticalTextPosition(SwingConstants.BOTTOM);
		Balloon2.setFocusable(false);
		Balloon2.setBorder(new LineBorder(new Color(0, 0, 0)));
		Balloon2.setOpaque(true);
		Balloon2.setBackground(Color.WHITE);
		panel.add(Balloon2);
		
		btnGenerateBalloons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random rand = new Random();
				
				Balloon b1 = new Balloon(Size.values()[rand.nextInt(Size.values().length)], rand.nextBoolean());
				Balloon b2 = new Balloon(Size.values()[rand.nextInt(Size.values().length)], rand.nextBoolean());
				
				Balloon1.setIcon(new ImageIcon(BalloonApp.class.getResource(b1.getImagePath())));
				Balloon2.setIcon(new ImageIcon(BalloonApp.class.getResource(b2.getImagePath())));
				Balloon1.setText(b1.toString());
				Balloon2.setText(b2.toString());
				
				if (b1.equals(b2))
					lblResults.setText("It's a Match!");
				else
					lblResults.setText("No Match!");
			}
		});
	}

}
