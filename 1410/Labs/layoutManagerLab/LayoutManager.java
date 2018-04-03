package layoutManagerLab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LayoutManager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutManager frame = new LayoutManager();
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
	public LayoutManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblLabel = new JLabel("Label 1");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLabel.setOpaque(true);
		lblLabel.setBackground(Color.RED);
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLabel);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.setFocusable(false);
		btnClickMe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		btnClickMe.setForeground(Color.WHITE);
		btnClickMe.setBackground(Color.BLUE);
		contentPane.add(btnClickMe);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setOpaque(true);
		lblHi.setBackground(Color.RED);
		contentPane.add(lblHi);
		
		JButton btnButton = new JButton("Button");
		btnButton.setFocusable(false);
		btnButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		btnButton.setForeground(Color.WHITE);
		btnButton.setBackground(Color.BLUE);
		contentPane.add(btnButton);
		
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (btnClickMe.getBackground().equals(Color.BLUE))
					btnClickMe.setBackground(Color.GREEN);
				else
				{
					btnClickMe.setBackground(Color.BLUE);
					if (!lblHi.getBackground().equals(Color.YELLOW))
						lblHi.setBackground(Color.YELLOW);
				}	
			}
		});
	}

}
