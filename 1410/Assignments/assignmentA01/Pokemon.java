package assignmentA01;
/**
 * Pokemon Class represents a Pokemon to be indexed with parameterized values for each of its attributes.
 * @author William McConnell
 *
 */
/**
 * @author William McConnell
 *
 */
public class Pokemon 
{
	private String name = new String();
	private String primaryType = new String();
	private String secondaryType = new String();
	private int kdex;
	private int evolution;
	private final int id;
	private static int count = 10000;
	
	/**
	 * Constructs and initializes a Pokemon object with parameters.
	 * @param name Name of the Pokemon
	 * @param ptype First Type of the Pokemon ex: Fire, Water, Psychic
	 * @param stype Second Type of the Pokemon ex: Ice, Dragon, Bug
	 * @param kdex Kanto Pokedex Number 1-151
	 * @param eve Evolution Stage. 1 for First Stage, 2 for Second Stage, etc.
	 */
	public Pokemon(String name, String ptype, String stype, int kdex, int eve)
	{
		this.name = name;
		this.primaryType = ptype;
		this.secondaryType = stype;
		this.kdex = kdex;
		this.evolution = eve;
		this.id = count++;
	}

	/**
	 * Gets the Pokemon Name
	 * @return Name of Pokemon
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the Pokemon
	 * @param name Name of the Pokemon
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the primary element type for the Pokemon
	 * @return Primary element
	 */
	public String getPrimaryType() {
		return primaryType;
	}

	/**
	 * Sets the primary element type for the Pokemon
	 * @param primaryType Primary element
	 */
	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}

	/**
	 * Gets the secondary element type for the Pokemon
	 * @return Secondary element
	 */
	public String getSecondaryType() {
		return secondaryType;
	}

	/**
	 * Sets the secondary element type for the Pokemon 
	 * @param secondaryType Secondary Element
	 */
	public void setSecondaryType(String secondaryType) {
		this.secondaryType = secondaryType;
	}

	/**
	 * Gets the Kanto Pokedex number for the Pokemon
	 * @return Kanto Pokedex number
	 */
	public int getKdex() {
		return kdex;
	}
	
	/**
	 * Sets the Kanto Pokedex number for the Pokemon
	 * @param kdex Kanto Pokedex number
	 */
	public void setKdex(int kdex) {
		this.kdex = kdex;
	}
	
	/**
	 * Gets the evolutionary stage of the Pokemon
	 * @return Evolutionary stage
	 */
	public int getEvolution() {
		return evolution;
	}

	/**
	 * Sets the evolutionary stage of the Pokemon
	 * @param evolution Evolutionary stage
	 */
	public void setEvolution(int evolution) {
		this.evolution = evolution;
	}
	
	/**
	 * Gets the  current Counter that will be used for the next ID
	 * @return Current counter used for next ID
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * Gets the unique ID number of the Pokemon
	 * @return Unique ID number
	 */
	public int getId() {
		return id;
	}

	/**
	 * Custom toString method that displays all parameters for the Pokemon object.
	 */
	@Override
	public String toString() {
		return name + ", Primary Type: " + primaryType + ", Secondary Type: " + secondaryType 
				+ ", Kanto Pokedex Number: " + kdex + ", Evolution Stage: " + evolution + ", id: " + id;
	}
	
	
	
}
