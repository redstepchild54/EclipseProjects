package part1;

//William McConnell

/**
 * Class that contains the Main method that creates and displays information about athletes
 * @author William McConnell
 *
 */
public class AthleteApp {

	/**
	 * Main method that creates and displays information about athletes
	 * @param args
	 */
	public static void main(String[] args) {
		Athlete athlete = new Athlete("Rafal Nadal");
		SoccerPlayer sp = new SoccerPlayer("Lionel Messi", "Forward");
		BaseballPlayer bp = new BaseballPlayer("Ted Williams", 0.344);
		
		Athlete[] athletes = new Athlete[]{athlete, sp, bp};

		for (Athlete el : athletes)
		{
			System.out.println(el);
			el.practice();
			if (el instanceof SoccerPlayer)
				((SoccerPlayer) el).headBall();
			System.out.println();
		}
	}

}
