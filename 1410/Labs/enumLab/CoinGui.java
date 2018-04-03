package enumLab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoinGui extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnPenny;
	private JButton btnNickel;
	private JButton btnDime;
	private JButton btnQuarter;
	private JLabel lblCointext;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
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
	public CoinGui() {
		createStartingPane();
		
		createCointext();
		
		createCoinPanel();
		
		createPennyButton();		
		createNickelButton();		
		createDimeButton();		
		createQuarterButton();		
	}

	private void createQuarterButton() {
		btnQuarter = new JButton("");
		btnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCointext.setText(Coin.QUARTER.toString());
			}
		});
		btnQuarter.setFocusable(false);
		btnQuarter.setIcon(new ImageIcon(CoinGui.class.getResource("/images/UsQuarter.png")));
		panel.add(btnQuarter);
	}

	private void createDimeButton() {
		btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCointext.setText(Coin.DIME.toString());
			}
		});
		btnDime.setFocusable(false);
		btnDime.setIcon(new ImageIcon(CoinGui.class.getResource("/images/UsDime.png")));
		panel.add(btnDime);
	}

	private void createNickelButton() {
		btnNickel = new JButton("");
		btnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCointext.setText(Coin.NICKEL.toString());
			}
		});
		btnNickel.setFocusable(false);
		btnNickel.setIcon(new ImageIcon(CoinGui.class.getResource("/images/UsNickel.png")));
		panel.add(btnNickel);
	}

	private void createPennyButton() {
		btnPenny = new JButton("");
		btnPenny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblCointext.setText(Coin.PENNY.toString());
			}
		});
		btnPenny.setFocusable(false);
		btnPenny.setIcon(new ImageIcon(CoinGui.class.getResource("/images/UsPenny.png")));
		panel.add(btnPenny);
	}

	private void createCoinPanel() {
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 4, 5, 5));
	}

	private void createCointext() {
		lblCointext = new JLabel("");
		lblCointext.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblCointext.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCointext, BorderLayout.CENTER);
	}

	private void createStartingPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
