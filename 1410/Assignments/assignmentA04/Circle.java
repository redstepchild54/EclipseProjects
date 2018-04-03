package assignmentA04;

/*
 * William McConnell
 * CS 1410 
 * Assignment A04
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class that creates a circle with a radius parameter
 * @author William McConnell
 *
 */
public class Circle implements Shape{

	private final int radius;

	/**
	 * Constructor that initializes the Circle with a radius
	 * @param r Radius of the Circle
	 */
	public Circle(int r) {
		radius = r;
	}

	/**
	 * Method that returns the diameter of the Circle
	 * @return Diameter of the Circle
	 */
	public int diameter() {
		return 2 * radius;
	}

	/**
	 * Method that returns the circumference of the circle as
	 * a double to one decimal place.
	 * @return Circumference of the Circle
	 */
	public double circumference() {
		BigDecimal bd = new BigDecimal(2 * Math.PI * radius);
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Getter for the radius of the circle
	 * @return Radius of the Circle
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Overridden toString method that returns the type of object: Circle
	 * and the radius parameter.
	 */
	@Override
	public String toString() {
		return "Circle(" + radius + ")";
	}

	/**
	 * Overridden perimeter method that returns the circumference of the circle
	 * as a double rounded to one decimal place.
	 */
	@Override
	public double perimeter() {

		BigDecimal bd = new BigDecimal(2 * Math.PI * radius);
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Overridden area method that returns the area of the circle
	 * as a double rounded to one decimal place.
	 */
	@Override
	public double area() {

		BigDecimal bd = new BigDecimal(Math.PI * radius * radius);
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}
