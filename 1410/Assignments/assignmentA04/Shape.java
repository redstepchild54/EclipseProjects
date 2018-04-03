package assignmentA04;

/*
 * William McConnell
 * CS 1410 
 * Assignment A04
 */

/**
 * Interface that is applied to shapes. This interface allows the shape to return a perimeter and area.
 * @author William McConnell
 *
 */
public interface Shape {
	
	/**
	 * Method that returns the perimeter of the shape
	 * @return Perimeter of the shape
	 */
	double perimeter();
	
	/**
	 * Method that returns the area of the shape
	 * @return Area of the shape
	 */
	double area();
	
}
