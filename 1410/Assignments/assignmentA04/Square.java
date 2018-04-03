package assignmentA04;

/*
 * William McConnell
 * CS 1410 
 * Assignment A03
 */
/**
 * Class that creates a square with a width and length equal to a side
 * parameter. Square is a Rectangle.
 * @author William McConnell
 *
 */
public class Square extends Rectangle{

	/**
	 * Constructor that initializes the Square with length and width equal to a
	 * side.
	 * @param s Side of the Square
	 */
	public Square(int s) {
		super(s, s);
	}

	/**
	 * Getter for the side of the Square.
	 * @return Side of the Square.
	 */
	public int getSide() {
		return getLength();
	}

	/**
	 * Overridden toString method that returns the type of object: Square and the
	 * side parameter.
	 */
	@Override
	public String toString() {
		return "Square(" + getSide() + ")";
	}

}
