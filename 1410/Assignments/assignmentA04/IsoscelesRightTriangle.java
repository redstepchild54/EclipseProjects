package assignmentA04;

/*
 * William McConnell
 * CS 1410 
 * Assignment A04
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class that creates an iscoceles right triangle with a leg parameter.
 * @author William McConnell
 *
 */
public class IsoscelesRightTriangle implements Shape, Printable{

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

	/**
	 * Overridden print method that prints a representation of the IsoscelesRightTriangle
	 */
	@Override
	public void print() {

		for (int i = 0; i < leg - 1; i++)
		{
			System.out.print("o ");
			
			for (int j = 0; j < i; j++)
			{
				if(j == i - 1)
					System.out.print("o");
				else
					System.out.print("  ");
			}
			
			System.out.println("");
		}
		
		for (int k = 0; k < leg; k++)
			System.out.print("o ");
		
		System.out.println("");
	}

	/**
	 * Overridden perimeter method that returns the perimeter of the IsoscelesRightTriangle
	 * as a double rounded to one decimal place.
	 */
	@Override
	public double perimeter() {

		BigDecimal bd = new BigDecimal(leg + leg + hypotenuse());
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Overridden area method that returns the area of the IsoscelesRightTriangle
	 * as a double rounded to one decimal place.
	 */
	@Override
	public double area() {

		BigDecimal bd = new BigDecimal(leg * leg / 2.0);
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
