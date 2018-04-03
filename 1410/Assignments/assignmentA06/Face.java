package assignmentA06;

/*
 * William McConnell
 * CS 1410 
 * Assignment A06
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author William McConnell
 *
 */

public class Face extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JLabel lblCatFace;
	private JLabel lblEyes;
	private JLabel lblNose;
	private JLabel lblMouth;
	private JPanel panel;
	private JLabel lblChoose;
	private JCheckBox chckbxEyes;
	private JCheckBox chckbxNose; 
	private JCheckBox chckbxMouth;
	private JButton btnUpdate; 
	
	private static int faceCount = 1;
	private static int eyesCount = 1;
	private static int noseCount = 1;
	private static int mouthCount = 1;
	private final int faceMax = 5;
	private final int eyesMax = 14;
	private final int noseMax = 4;
	private final int mouthMax = 7;
	
	private String filePath = "/assignmentA06/Images/";
	private String faceName = "Cat Face";
	private String eyesName = "Eyes";
	private String mouthName = "Mouth";
	private String noseName = "Nose";
	private String imageType = ".png";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Face frame = new Face();
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
	public Face() {
		contentPane = new JPanel();
		layeredPane = new JLayeredPane();
		lblCatFace = new JLabel("");
		lblEyes = new JLabel("");
		lblNose = new JLabel("");
		lblMouth = new JLabel("");
		panel = new JPanel();
		lblChoose = new JLabel("Choose");
		chckbxEyes = new JCheckBox("Eyes");
		chckbxEyes.setFocusable(false);
		chckbxNose = new JCheckBox("Nose");
		chckbxNose.setFocusable(false);
		chckbxMouth = new JCheckBox("Mouth");
		btnUpdate = new JButton("Update");
		
		createPane();
		createLayeredPane();
		createCatLabel();
		createEyesLabel();
		createNoseLabel();
		createMouthLabel();
		createPanel();
		createChooseLabel();
		createEyesCheckbox();
		createNoseCheckbox();
		createMouthCheckbox();
		createUpdateButton();
		
	}

	private void createUpdateButton() {
		btnUpdate.setFocusable(false);
		btnUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chckbxEyes.isSelected())
				{
					eyesCount++;
					if (eyesCount > eyesMax)
						eyesCount = 1;
					lblEyes.setIcon(new ImageIcon(Face.class.getResource(filePath + eyesName + eyesCount + imageType)));
				}
				
				if (chckbxNose.isSelected())
				{
					noseCount++;
					if (noseCount > noseMax)
						noseCount = 1;
					lblNose.setIcon(new ImageIcon(Face.class.getResource(filePath + noseName + noseCount + imageType)));
				}
				
				if (chckbxMouth.isSelected())
				{
					mouthCount++;
					if (mouthCount > mouthMax)
						mouthCount = 1;
					lblMouth.setIcon(new ImageIcon(Face.class.getResource(filePath + mouthName + mouthCount + imageType)));
				}
				
				if (!chckbxEyes.isSelected() && !chckbxNose.isSelected() && !chckbxMouth.isSelected())
				{
					faceCount++;
					if (faceCount > faceMax)
						faceCount = 1;
					lblCatFace.setIcon(new ImageIcon(Face.class.getResource(filePath + faceName + faceCount + imageType)));
				}
			}
		});
	}

	private void createMouthCheckbox() {
		chckbxMouth.setFocusable(false);
		chckbxMouth.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chckbxMouth);
	}

	private void createNoseCheckbox() {
		chckbxNose.setFocusable(false);
		chckbxNose.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chckbxNose);
	}

	private void createEyesCheckbox() {
		chckbxEyes.setFocusable(false);
		chckbxEyes.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chckbxEyes);
	}

	private void createChooseLabel() {
		lblChoose.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblChoose);
	}

	private void createPanel() {
		panel.setBorder(new EmptyBorder(30, 10, 30, 30));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(10, 1, 0, 0));
	}

	private void createMouthLabel() {
		layeredPane.setLayer(lblMouth, 4);
		lblMouth.setIcon(new ImageIcon(Face.class.getResource("/assignmentA06/Images/Mouth1.png")));
		lblMouth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMouth.setBounds(10, 11, 687, 629);
		layeredPane.add(lblMouth);
	}

	private void createNoseLabel() {
		lblNose.setIcon(new ImageIcon(Face.class.getResource("/assignmentA06/Images/Nose1.png")));
		lblNose.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNose, 3);
		lblNose.setBounds(10, 11, 687, 629);
		layeredPane.add(lblNose);
	}

	private void createEyesLabel() {
		lblEyes.setHorizontalAlignment(SwingConstants.CENTER);
		lblEyes.setIcon(new ImageIcon(Face.class.getResource("/assignmentA06/Images/Eyes1.png")));
		layeredPane.setLayer(lblEyes, 2);
		lblEyes.setBounds(10, 11, 687, 629);
		layeredPane.add(lblEyes);
	}

	private void createCatLabel() {
		layeredPane.setLayer(lblCatFace, 1);
		lblCatFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblCatFace.setIcon(new ImageIcon(Face.class.getResource("/assignmentA06/Images/Cat Face1.png")));
		lblCatFace.setBounds(10, 11, 687, 629);
		layeredPane.add(lblCatFace);
	}

	private void createLayeredPane() {
		layeredPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		layeredPane.setOpaque(true);
		layeredPane.setBackground(Color.DARK_GRAY);
		contentPane.add(layeredPane, BorderLayout.CENTER);
	}

	private void createPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}
