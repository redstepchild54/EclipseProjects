package part1;

//William McConnell

/**
 * An extended version of Athlete that adds a position to the Athlete and changes how the Athlete practices. This Class also 
 * contains a method for heading the ball.
 * @author William McConnell
 *
 */
public class SoccerPlayer extends Athlete{

	private String position;
	
	/**
	 * Constructor for the Soccer Player that initializes their name and position.
	 * @param name Name of the Soccer Player
	 * @param position Position of the Soccer Player
	 */
	public SoccerPlayer(String name, String position) {
		super(name);
		this.position = position;
	}

	/**
	 * Getter that gets the position of the Soccer Player
	 * @return Position of the Soccer Player
	 */
	public String getPosition() {
		return position;
	}
	
	/**
	 * Method that prints the Soccer Player's position heading the ball
	 */
	public void headBall()
	{
		System.out.println("A " + position + " is heading the ball"); 
	}

	/**
	 * Method that prints the Soccer Player practicing.
	 */
	@Override
	public void practice()
	{
		System.out.println("kicking the ball");
	}
	
	/**
	 * Prints the type of Athlete, their name and their position.
	 */
	@Override
	public String toString() {
		return super.toString() + ": " + position;
	}
	
	
}
