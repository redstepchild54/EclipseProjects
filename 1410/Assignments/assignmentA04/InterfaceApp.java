package assignmentA04;

/*
 * William McConnell
 * CS 1410 
 * Assignment A04
 */

/**
 * Class that creates and manages objects of different shapes
 * @author William McConnell
 *
 */
public class InterfaceApp {

	/**
	 * Main method that creates the objects and outputs their values. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape[] shapes = {new Rectangle(6,3), new Rectangle(5,4), new Square(4), new Square(3), 
				new IsoscelesRightTriangle(5), new IsoscelesRightTriangle(3), new Circle(7), new Circle(2)};
		
		System.out.println("Shape Array:");
		System.out.println("------------");
		
		for (Shape el: shapes)
		{
			System.out.println(el);
			System.out.println("Perimeter: " + el.perimeter());
			System.out.println("Area: " + el.area());
			
			if(el instanceof Printable)
				((Printable) el).print();
			
			System.out.println();
		}
	}
}
