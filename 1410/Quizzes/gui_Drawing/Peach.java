package gui_Drawing;

import java.awt.*;
import javax.swing.*;

public class Peach extends JPanel{
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("This is some text", 25, 120);
		
		g.setColor(Color.BLUE);
		g.drawLine(150, 25, 175, 25);
		
		g.setColor(Color.RED);
		g.drawRect(150, 50, 50, 50);
		
		g.setColor(Color.GREEN);
		g.fillOval(150, 110 , 30, 30);
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(150, 160, 100, 100, true);
		
	}

}
