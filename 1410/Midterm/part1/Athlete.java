package part1;

//William McConnell

/**
 * Class creates an Athlete, initialized with a name, this class contains a method for printing the Athlete practicing.
 * @author William McConnell
 * 
 */
public class Athlete {

	private String name;

	/**
	 * Constructor of the Athlete Class that sets the name of the Athlete.
	 * @param name Name of the Athlete.
	 */
	public Athlete(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name of the Athlete.
	 * @return Name of the Athlete.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Method that prints the Athlete practicing.
	 */
	public void practice()
	{
		System.out.println("Practicing");
	}

	/**
	 * Prints the type of Athlete and their name.
	 */
	@Override
	public String toString() {
		return Athlete.class.getSimpleName() + ": " + name;
	}
	
	
	
}
