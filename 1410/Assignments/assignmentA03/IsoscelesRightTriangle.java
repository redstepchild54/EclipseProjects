package assignmentA03;

/*
 * William McConnell
 * CS 1410 
 * Assignment A03
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class that creates an iscoceles right triangle with a leg parameter.
 * @author William McConnell
 *
 */
public class IsoscelesRightTriangle {

	private final int leg;

	/**
	 * Constructor that initializes the IsoscelesRightTriangle with a leg. 
	 * @param l Leg of the IscocelesRightTriagle
	 */
	public IsoscelesRightTriangle(int l) {
		leg = l;
	}

	/**
	 * Method that returns the hypotenuse of the triangle in the form of a double to one decimal place
	 * @return Hypotenuse of the triangle
	 */
	public double hypotenuse() {
		BigDecimal bd = new BigDecimal(Math.sqrt(2 * Math.pow(leg, 2)));
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Getter for the leg of the triangle.
	 * @return Leg of the triangle
	 */
	public int getLeg() {
		return leg;
	}

	/**
	 * Overridden toString method that returns the type of object: IsoscelesRightTriangle
	 * and the leg parameter.
	 */
	@Override
	public String toString() {
		return "IsoscelesRightTriangle(" + leg + ")";
	}
}
