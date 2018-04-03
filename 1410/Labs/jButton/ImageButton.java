package jButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton extends JFrame{

	final JButton imgButton;
	final Icon startImage;
	final Icon clickImage;
	
	private class ButtonClickEventHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if (imgButton.isRolloverEnabled())
			{
				imgButton.setRolloverEnabled(false);
				imgButton.setIcon(clickImage);
			}
			else
			{
				imgButton.setRolloverEnabled(true);
				imgButton.setIcon(startImage);;
			}
			
		}
		
	}
	
	public ImageButton()
	{
		setTitle("Lab Button");
		
		Icon image1 = new ImageIcon(ImageButton.class.getResource("/Images/Image1.png"));
		Icon image2 = new ImageIcon(ImageButton.class.getResource("/Images/Image2.png"));
		
		startImage = image1;
		clickImage = new ImageIcon(ImageButton.class.getResource("/Images/Image3.gif"));
		imgButton = new JButton(image1);
		
		
		imgButton.setRolloverIcon(image2);
		
		add(imgButton);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 660, 660);
		
		ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
		imgButton.addActionListener(buttonEventHandler);
	}
	
}
