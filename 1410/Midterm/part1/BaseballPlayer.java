package part1;

//William McConnell

/**
 * An extended version of Athlete that adds the batting average to the Athlete and changes how the Athlete practices.
 * @author William McConnell
 *
 */
public class BaseballPlayer extends Athlete{

	private double battingAve;
	
	
	/**
	 * Constructor for the BaseballPlayer that initializes their name and batting average.
	 * @param name Name of the BaseballPlayer
	 * @param battingAvg Batting Average of the Baseball Player
	 */
	public BaseballPlayer(String name, double battingAvg) {
		super(name);
		this.battingAve = battingAvg;
	}

	/**
	 * Getter for the Batting Average of the Baseball Player
	 * @return Batting Average of the Baseball Player
	 */
	public double getBattingAve() {
		return battingAve;
	}

	/**
	 * Method that prints the Baseball Player practicing.
	 */
	@Override
	public void practice()
	{
		System.out.println("hitting the ball");
	}
	
	
	/**
	 * Prints the type of Athlete, their name and their batting average.
	 */
	@Override
	public String toString() {
		return super.toString() + ": " + battingAve;
	} 
	
	

}
