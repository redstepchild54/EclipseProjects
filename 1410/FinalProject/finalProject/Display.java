package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JFrame {

	private JPanel contentPane;
	private JPanel panelHome;
	private JPanel panelCreateCharacter;
	private JPanel panelCreateCharacterTextFields;
	private JPanel panelCreateCharacterDropdowns;
	private JPanel panelImportCharacter;
	private JPanel panelCharacters;
	private CardLayout cardLayout;
	private JTextField txtFileName;
	private JTextField txtPlayername;
	private JTextField txtCharacterName;
	
	private EntityFactory entityFactory = new EntityFactory();
	private List<Entity> entities = new ArrayList<>();
	private Component component;
	private FileHandler fileHandler = new FileHandler();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
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
	public Display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout = new CardLayout(0,0); 
		contentPane.setLayout(cardLayout);
		
		panelHome = new JPanel();
		contentPane.add(panelHome, "Home");
		panelHome.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		
		JButton btnHomeCreateCharacter = new JButton("Create Character");
		btnHomeCreateCharacter.setFocusable(false);
		btnHomeCreateCharacter.setPreferredSize(new Dimension(200, 30));
		btnHomeCreateCharacter.setBorder(null);
		panelHome.add(btnHomeCreateCharacter);
		
		JButton btnHomeImportCharacter = new JButton("Import Character");
		
		btnHomeImportCharacter.setFocusable(false);
		btnHomeImportCharacter.setPreferredSize(new Dimension(200, 30));
		btnHomeImportCharacter.setBorder(null);
		panelHome.add(btnHomeImportCharacter);
		
		panelCreateCharacter = new JPanel();
		contentPane.add(panelCreateCharacter, "Create Character");
		panelCreateCharacter.setLayout(new GridLayout(0, 1, 0, 10));
		
		panelCreateCharacterTextFields = new JPanel();
		panelCreateCharacter.add(panelCreateCharacterTextFields);
		panelCreateCharacterTextFields.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblPlayerName = new JLabel("Your Name");
		panelCreateCharacterTextFields.add(lblPlayerName);
		
		txtPlayername = new JTextField();
		panelCreateCharacterTextFields.add(txtPlayername);
		txtPlayername.setColumns(10);
		
		JLabel lblCharacterName = new JLabel("Character Name");
		panelCreateCharacterTextFields.add(lblCharacterName);
		
		txtCharacterName = new JTextField();
		panelCreateCharacterTextFields.add(txtCharacterName);
		txtCharacterName.setColumns(10);
		
		panelCreateCharacterDropdowns = new JPanel();
		panelCreateCharacter.add(panelCreateCharacterDropdowns);
		panelCreateCharacterDropdowns.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblGender = new JLabel("Gender");
		panelCreateCharacterDropdowns.add(lblGender);
		
		JLabel lblRace = new JLabel("Race");
		panelCreateCharacterDropdowns.add(lblRace);
		
		JLabel lblClass = new JLabel("Class");
		panelCreateCharacterDropdowns.add(lblClass);
		
		JComboBox comboBoxGender = new JComboBox();
		panelCreateCharacterDropdowns.add(comboBoxGender);
		comboBoxGender.setModel(new DefaultComboBoxModel(Gender.values()));
		
		JComboBox comboBoxRace = new JComboBox();
		panelCreateCharacterDropdowns.add(comboBoxRace);
		comboBoxRace.setModel(new DefaultComboBoxModel(Race.values()));
		
		JComboBox comboBoxClass = new JComboBox();
		panelCreateCharacterDropdowns.add(comboBoxClass);
		comboBoxClass.setModel(new DefaultComboBoxModel(PClass.values()));
		
		JLabel lblAlignment = new JLabel("Alignment");
		panelCreateCharacterDropdowns.add(lblAlignment);
		
		JLabel lblHairColor = new JLabel("Hair Color");
		panelCreateCharacterDropdowns.add(lblHairColor);
		
		JLabel lblEyeColor = new JLabel("Eye Color");
		panelCreateCharacterDropdowns.add(lblEyeColor);
		
		JComboBox comboBoxAlignment = new JComboBox();
		panelCreateCharacterDropdowns.add(comboBoxAlignment);
		comboBoxAlignment.setModel(new DefaultComboBoxModel(Alignment.values()));
		
		JComboBox comboBoxHairColor = new JComboBox();
		panelCreateCharacterDropdowns.add(comboBoxHairColor);
		
		JComboBox comboBoxEyeColor = new JComboBox();
		panelCreateCharacterDropdowns.add(comboBoxEyeColor);
		
		JPanel panelCreateCharacterCreateCharacterButton = new JPanel();
		panelCreateCharacter.add(panelCreateCharacterCreateCharacterButton);
		panelCreateCharacterCreateCharacterButton.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblCreatecharacteremptylabel = new JLabel("");
		panelCreateCharacterCreateCharacterButton.add(lblCreatecharacteremptylabel);
		
		JButton btnCreateCharacterCreateCharacter = new JButton("Create Character");
		btnCreateCharacterCreateCharacter.setFocusable(false);
		panelCreateCharacterCreateCharacterButton.add(btnCreateCharacterCreateCharacter);
		
		panelImportCharacter = new JPanel();
		contentPane.add(panelImportCharacter, "Import Character");
		panelImportCharacter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		
		JLabel lblImportcharacterfilename = new JLabel("Character Import File Name: ");
		panelImportCharacter.add(lblImportcharacterfilename);
		
		txtFileName = new JTextField();
		panelImportCharacter.add(txtFileName);
		txtFileName.setColumns(30);
		
		JButton btnFileName = new JButton("Go");
		btnFileName.setFocusable(false);
		panelImportCharacter.add(btnFileName);
		
		panelCharacters = new JPanel();
		contentPane.add(panelCharacters, "Characters");
		
		btnHomeCreateCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cardLayout.show(contentPane, "Create Character");
						
			}
		});
		
		btnHomeImportCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cardLayout.show(contentPane, "Import Character");
			}
		});
	}

}
