package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SquarePattern extends JPanel {
	private final Random rand = new Random();

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xStart = 10;
		int x = 10;
		int y = 10;
		int h = 20;
		int w = 20;
		int p = 5;

		Random rand = new Random();

		int count = 0;

		g.setColor(Color.BLACK);
		g.fillRect(x, y, 45, 45);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				count++;
				if (count != 3) {
					g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
					g.fillRect(x, y, w, h);
				}
				x += w + p;
			}
			x = xStart;
			y += h + p;
		}
	}

}
