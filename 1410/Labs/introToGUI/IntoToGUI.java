package introToGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class IntoToGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntoToGUI frame = new IntoToGUI();
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
	public IntoToGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMyFirstGui = new JLabel("My First GUI");
		lblMyFirstGui.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblMyFirstGui.setOpaque(true);
		lblMyFirstGui.setBackground(Color.BLUE);
		lblMyFirstGui.setForeground(Color.GREEN);
		lblMyFirstGui.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMyFirstGui, BorderLayout.NORTH);
		
		JButton btnWest = new JButton("WEST");
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(textField);
		textField.setColumns(16);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setOpaque(true);
		lblHi.setBackground(Color.RED);
		lblHi.setForeground(Color.ORANGE);
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setFont(new Font("Papyrus", Font.PLAIN, 71));
		contentPane.add(lblHi, BorderLayout.CENTER);
	}

}
