package assignmentA03;

/*
 * William McConnell
 * CS 1410 
 * Assignment A03
 */

/**
 * Class that creates a rectangle with a length and width
 * 
 * @author William McConnell
 *
 */
public class Rectangle {

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

}
