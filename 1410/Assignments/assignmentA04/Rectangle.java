package assignmentA04;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * William McConnell
 * CS 1410 
 * Assignment A04
 */

/**
 * Class that creates a rectangle with a length and width
 * @author William McConnell
 *
 */
public class Rectangle implements Shape, Printable{

	private final int length;
	private final int width;

	/**
	 * Constructor for the Rectangle that initializes the parameters of length and
	 * width
	 * 
	 * @param l Length of the Rectangle
	 * @param w Width of the Rectangle
	 */
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	/**
	 * Getter for the Length of the Rectangle
	 * @return Length of the Rectangle
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Getter for the Width of the Rectangle
	 * @return Width of the Rectangle
	 */

	public int getWidth() {
		return width;
	}

	/**
	 * Overridden toString method that returns the type of object: Rectangle and the
	 * length and width parameters.
	 */
	@Override
	public String toString() {
		return "Rectangle(" + length + "x" + width + ")";
	}

	/**
	 * Overridden print method that prints a representation of the Rectangle
	 */
	@Override
	public void print() {
		
		for (int i = 0; i < width; i++)
		{
			if (i == 0 || i == width - 1)
				for (int j = 0; j < length; j++)
					System.out.print("o ");
			else
				for(int k = 0; k < length; k++)
				{
					if(k == 0 || k == length - 1)
						System.out.print("o ");
					else
						System.out.print("  ");
				}
			System.out.println();
		}
	}

	/**
	 * Overridden perimeter method that returns the perimeter of the Rectangle
	 * as a double rounded to one decimal place.
	 */
	@Override
	public double perimeter() {
		
		BigDecimal bd = new BigDecimal(2 * length + 2 * width);
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Overridden area method that returns the area of the Rectangle
	 * as a double rounded to one decimal place.
	 */
	@Override
	public double area() {
		
		BigDecimal bd = new BigDecimal(length * width);
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}
