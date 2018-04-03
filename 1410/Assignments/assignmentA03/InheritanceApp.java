package assignmentA03;

/*
 * William McConnell
 * CS 1410 
 * Assignment A03
 */

/**
 * Class that creates and manages objects of different shapes
 * @author William McConnell
 *
 */
public class InheritanceApp {

	/**
	 * Main method that creates the objects and outputs their values. 
	 * @param args
	 */
	public static void main(String[] args) {

		Rectangle myRectangle = new Rectangle(5, 4);
		Square mySquare = new Square(4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		Circle myCircle = new Circle(4);

		Rectangle rectangle2 = mySquare;

		Rectangle[] rectangles = new Rectangle[] { rectangle2, mySquare, myRectangle };

		System.out.println(myRectangle);
		System.out.println("Length: " + myRectangle.getLength());
		System.out.println("Width: " + myRectangle.getWidth());
		System.out.println();

		System.out.println(mySquare);
		System.out.println("Side: " + mySquare.getSide());
		System.out.println();

		System.out.println(myIsoscelesRightTriangle);
		System.out.println("Leg: " + myIsoscelesRightTriangle.getLeg());
		System.out.println("Hypotenuse: " + myIsoscelesRightTriangle.hypotenuse());
		System.out.println();

		System.out.println(myCircle);
		System.out.println("Diameter: " + myCircle.diameter());
		System.out.println("Circumference: " + myCircle.circumference());
		System.out.println("Radius: " + myCircle.getRadius());
		System.out.println();

		System.out.println("rectangle2:");
		System.out.println("-----------");
		System.out.println(rectangle2);
		System.out.println("Length: " + rectangle2.getLength());
		System.out.println("Width: " + rectangle2.getWidth());
		System.out.println();

		/*This was asked in the assignment description
		* When you try to utilize the getSide() method, you can't initially 
		* because rectangle two is a rectangle2 is being treated as a rectangle
		* instead of a square. rectangle2 needs to be casted in order to use the getSide() method
		* System.out.println(((Square) rectangle2).getSide());
		*/

		System.out.println("Rectangle Array:");
		System.out.println("----------------");

		for (Rectangle el : rectangles) {
			System.out.println(el);
			System.out.println("Length: " + el.getLength());
			System.out.println("Width: " + el.getWidth());
			System.out.println();
		}
	}
}
