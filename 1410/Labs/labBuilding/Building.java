package labBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//x and y coordinates
		int xStart = 10;
		int x = xStart;
		int y = 10;
		
		//width, height and padding
		int w = 10;
		int h = 10;
		int p = 2;
		
		//columns and rows
		int c = 50;
		int r = 50;
		
		Random rand = new Random();
		int red; int green; int blue;

		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
				red = rand.nextInt(255);
				green = rand.nextInt(255);
				blue = rand.nextInt(255);
				g.setColor(new Color(red,green,blue));
				g.fillRect(x, y, w, h);
				x += w + p;
			}
			x = xStart;
			y += h + p;
		}

	}

}
