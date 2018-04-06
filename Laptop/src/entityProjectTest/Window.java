package entityProjectTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class Window extends JFrame {

	private JPanel contentPane;
	
	private static int strength = 4;
	private static int agility = 3;
	private static int fighting = 7;
	private static int awareness = 1;
	private static int stamina = 4;
	private static int dexterity = 3;
	private static int intellect = 1;
	private static int presence = 1;
	
	private static int abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	
	private static int powersPoints = 28;
	
	
	
	private static int skillsPoints = 15;
	
	private static int advantagesPoints = 8;
	private static int defensesPoints = 5;
	private static int remainingPoints = 12;
	private static int totalPoints =  abilitiesPoints + powersPoints + skillsPoints + advantagesPoints + defensesPoints + remainingPoints;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_0 = new JPanel();
		tabbedPane.addTab("Home", null, panel_0, null);
		panel_0.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_0_1 = new JPanel();
		panel_0.add(panel_0_1, BorderLayout.NORTH);
		panel_0_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblAbilitiesPoints = new JLabel("ABILITIES " + abilitiesPoints);
		panel_0_1.add(lblAbilitiesPoints);
		
		JLabel lblPowersPoints = new JLabel("POWERS " + powersPoints);
		panel_0_1.add(lblPowersPoints);
		
		JLabel lblAdvantagesPoints = new JLabel("ADVANTAGES " + advantagesPoints);
		panel_0_1.add(lblAdvantagesPoints);
		
		JLabel lblSkillsPoints = new JLabel("SKILLS " + skillsPoints);
		panel_0_1.add(lblSkillsPoints);
		
		JLabel lblDefensesPoints = new JLabel("DEFENSES " + defensesPoints);
		panel_0_1.add(lblDefensesPoints);
		
		JLabel lblRemainingPoints = new JLabel("REMAINING " + remainingPoints);
		panel_0_1.add(lblRemainingPoints);
		
		JLabel lblTotalPoints = new JLabel("TOTAL " + totalPoints);
		panel_0_1.add(lblTotalPoints);
		
		JPanel panel_0_2 = new JPanel();
		panel_0.add(panel_0_2, BorderLayout.CENTER);
		panel_0_2.setLayout(new GridLayout(2, 8, 0, 0));
		
		JLabel lblStrength = new JLabel("Strength");
		panel_0_2.add(lblStrength);
		
		JLabel lblStrengthvalue = new JLabel(Integer.toString(strength));
		panel_0_2.add(lblStrengthvalue);
		
		JLabel lblAgility = new JLabel("Agility");
		panel_0_2.add(lblAgility);
		
		JLabel lblAgilityvalue = new JLabel(Integer.toString(agility));
		panel_0_2.add(lblAgilityvalue);
		
		JLabel lblFighting = new JLabel("Fighting");
		panel_0_2.add(lblFighting);
		
		JLabel lblFightingvalue = new JLabel(Integer.toString(fighting));
		panel_0_2.add(lblFightingvalue);
		
		JLabel lblAwareness = new JLabel("Awareness");
		panel_0_2.add(lblAwareness);
		
		JLabel lblAwarenessvalue = new JLabel(Integer.toString(awareness));
		panel_0_2.add(lblAwarenessvalue);
		
		JLabel lblStamina = new JLabel("Stamina");
		panel_0_2.add(lblStamina);
		
		JLabel lblStaminavalue = new JLabel(Integer.toString(stamina));
		panel_0_2.add(lblStaminavalue);
		
		JLabel lblDexterity = new JLabel("Dexterity");
		panel_0_2.add(lblDexterity);
		
		JLabel lblDexterityvalue = new JLabel(Integer.toString(dexterity));
		panel_0_2.add(lblDexterityvalue);
		
		JLabel lblIntellect = new JLabel("Intellect");
		panel_0_2.add(lblIntellect);
		
		JLabel lblIntillectvalue = new JLabel(Integer.toString(intellect));
		panel_0_2.add(lblIntillectvalue);
		
		JLabel lblPresence = new JLabel("Presence");
		panel_0_2.add(lblPresence);
		
		JLabel lblPresencevalue = new JLabel(Integer.toString(presence));
		panel_0_2.add(lblPresencevalue);
		
		JPanel panel_0_3 = new JPanel();
		panel_0.add(panel_0_3, BorderLayout.EAST);
		
		JPanel panel_0_4 = new JPanel();
		panel_0.add(panel_0_4, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Skills", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Powers", null, panel_2, null);
		//JComponent homeTab = makeTextPanel();
		
		//tabbedPane.addTab("Home", component);
	}
}
