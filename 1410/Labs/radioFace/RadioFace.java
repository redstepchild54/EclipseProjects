package radioFace;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class RadioFace extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblLaugh = new JLabel("");
	private JLabel lblSmile = new JLabel("");
	private JLabel lblNeutral = new JLabel("");
	private JLabel lblSad = new JLabel("");
	private JLabel lblDepressed = new JLabel("");
	private JRadioButton rdbtnLaugh = new JRadioButton("Laugh");
	private JRadioButton rdbtnSmile = new JRadioButton("Smile");
	private JRadioButton rdbtnNeutral = new JRadioButton("Neutral");
	private JRadioButton rdbtnSad = new JRadioButton("Sad");		
	private JRadioButton rdbtnDepressed = new JRadioButton("Depressed");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioFace frame = new RadioFace();
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
	public RadioFace() {
		createMainPanel();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(5, 1, 0, 0));
		
		createLaughButton(panel, rdbtnLaugh);
		createSmileButton(panel, rdbtnSmile);
		createNeutralButton(panel, rdbtnNeutral);
		createSadButton(panel, rdbtnSad);
		createDepressedButton(panel, rdbtnDepressed);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		createLaugh(layeredPane, lblLaugh);
		createSmile(layeredPane, lblSmile);
		createNeutral(layeredPane, lblNeutral);
		createSad(layeredPane, lblSad);
		createDepressed(layeredPane, lblDepressed);
	}

	private void createMainPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	private void createDepressedButton(JPanel panel, JRadioButton rdbtnDepressed) {
		rdbtnDepressed.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if (rdbtnDepressed.isSelected())
					lblDepressed.setVisible(true);
				else
					lblDepressed.setVisible(false);
			}
		});
		rdbtnDepressed.setFocusable(false);
		buttonGroup.add(rdbtnDepressed);
		rdbtnDepressed.setBackground(Color.BLACK);
		rdbtnDepressed.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnDepressed.setForeground(Color.RED);
		panel.add(rdbtnDepressed);
	}

	private void createSadButton(JPanel panel, JRadioButton rdbtnSad) {
		rdbtnSad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				if (rdbtnSad.isSelected())
					lblSad.setVisible(true);
				else
					lblSad.setVisible(false);
				
			}
		});
		rdbtnSad.setFocusable(false);
		buttonGroup.add(rdbtnSad);
		rdbtnSad.setBackground(Color.BLACK);
		rdbtnSad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSad.setForeground(Color.RED);
		panel.add(rdbtnSad);
	}

	private void createNeutralButton(JPanel panel, JRadioButton rdbtnNeutral) {
		rdbtnNeutral.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				if (rdbtnNeutral.isSelected())
					lblNeutral.setVisible(true);
				else
					lblNeutral.setVisible(false);
				
			}
		});
		rdbtnNeutral.setFocusable(false);
		buttonGroup.add(rdbtnNeutral);
		rdbtnNeutral.setBackground(Color.BLACK);
		rdbtnNeutral.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNeutral.setForeground(Color.RED);
		panel.add(rdbtnNeutral);
	}

	private void createSmileButton(JPanel panel, JRadioButton rdbtnSmile) {
		rdbtnSmile.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if (rdbtnSmile.isSelected())
					lblSmile.setVisible(true);
				else
					lblSmile.setVisible(false);
				
			}
		});
		rdbtnSmile.setFocusable(false);
		buttonGroup.add(rdbtnSmile);
		rdbtnSmile.setBackground(Color.BLACK);
		rdbtnSmile.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnSmile.setForeground(Color.RED);
		panel.add(rdbtnSmile);
	}

	private void createLaughButton(JPanel panel, JRadioButton rdbtnLaugh) {
		rdbtnLaugh.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				if (rdbtnLaugh.isSelected())
					lblLaugh.setVisible(true);
				else
					lblLaugh.setVisible(false);
				
			}
		});
		rdbtnLaugh.setFocusable(false);
		buttonGroup.add(rdbtnLaugh);
		rdbtnLaugh.setBackground(Color.BLACK);
		rdbtnLaugh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnLaugh.setForeground(Color.RED);
		panel.add(rdbtnLaugh);
	}

	private void createDepressed(JLayeredPane layeredPane, JLabel lblDepressed) {
		lblDepressed.setVisible(false);
		lblDepressed.setIconTextGap(0);
		lblDepressed.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepressed.setIcon(new ImageIcon(RadioFace.class.getResource("/Images/depressed.png")));
		lblDepressed.setBounds(10, 10, 225, 225);
		layeredPane.add(lblDepressed);
	}

	private void createSad(JLayeredPane layeredPane, JLabel lblSad) {
		lblSad.setVisible(false);
		lblSad.setIconTextGap(0);
		lblSad.setHorizontalAlignment(SwingConstants.CENTER);
		lblSad.setIcon(new ImageIcon(RadioFace.class.getResource("/Images/sad.png")));
		lblSad.setBounds(10, 10, 225, 225);
		layeredPane.add(lblSad);
	}

	private void createNeutral(JLayeredPane layeredPane, JLabel lblNeutral) {
		lblNeutral.setVisible(false);
		lblNeutral.setIconTextGap(0);
		lblNeutral.setHorizontalAlignment(SwingConstants.CENTER);
		lblNeutral.setIcon(new ImageIcon(RadioFace.class.getResource("/Images/neutral.png")));
		lblNeutral.setBounds(10, 10, 225, 225);
		layeredPane.add(lblNeutral);
	}

	private void createSmile(JLayeredPane layeredPane, JLabel lblSmile) {
		lblSmile.setVisible(false);
		lblSmile.setIconTextGap(0);
		lblSmile.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmile.setIcon(new ImageIcon(RadioFace.class.getResource("/Images/smile.png")));
		lblSmile.setBounds(10, 10, 225, 225);
		layeredPane.add(lblSmile);
	}

	private void createLaugh(JLayeredPane layeredPane, JLabel lblLaugh) {
		lblLaugh.setVisible(false);
		lblLaugh.setIconTextGap(0);
		lblLaugh.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaugh.setIcon(new ImageIcon(RadioFace.class.getResource("/Images/laugh.png")));
		lblLaugh.setBounds(10, 10, 225, 225);
		layeredPane.add(lblLaugh);
	}
}
