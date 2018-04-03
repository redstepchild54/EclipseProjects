package part2;

//William McConnell

/**
 * Class that contains the main method that takes the names of painters and welcomes them.
 * @author William McConnell
 *
 */
public class Excercise2 {

	/**
	 * Main method that takes the names of painters and welcomes them.
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] painters = new String[] {"Picasso", "Chagall", "Dali", "Miro"};
		StringBuilder sb = new StringBuilder();
		
		sb.append("Welcome ");
		int count = 0;
		
		for (String el : painters)
		{
			count++;
			if (count != painters.length)
				sb.append("Mr. " + el + ", ");
			else
				sb.append("and Mr. " + el + ".");
		}

		System.out.println(sb);
	}

}
