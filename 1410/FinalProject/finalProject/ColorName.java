package finalProject;

import java.awt.Color;
import java.io.Serializable;
import java.util.Hashtable;

public class ColorName implements Serializable{
	
	private Hashtable<Color, String> colors = new Hashtable<>();
	
	public ColorName()
	{
		initializeColors();
	}
	
	private void initializeColors()
	{
		colors.put(Color.BLACK, "Black");
		colors.put(Color.BLUE, "Blue");
		colors.put(Color.CYAN, "Cyan");
		colors.put(Color.DARK_GRAY, "Dark Gray");
		colors.put(Color.GRAY, "Gray");
		colors.put(Color.GREEN, "Green");
		colors.put(Color.LIGHT_GRAY, "Light Gray");
		colors.put(Color.MAGENTA, "Magenta");
		colors.put(Color.ORANGE, "Orange");
		colors.put(Color.PINK, "Pink");
		colors.put(Color.RED, "Red");
		colors.put(Color.WHITE, "White");
		colors.put(Color.YELLOW, "Yellow");
	}
	
	public String getColorName(Color color)
	{
		return colors.get(color);
	}
}
