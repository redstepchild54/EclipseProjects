package testing;

public class AbilityPoints {

	private static int strength;
	private static int agility;
	private static int fighting;
	private static int awareness;
	private static int stamina;
	private static int dexterity;
	private static int intellect;
	private static int presence;
	
	private static int abilitiesPoints;
	
	public AbilityPoints(int strength, int agility, int fighting, int awareness, int stamina, int dexterity, int intellect, int presence)
	{
		this.strength = strength;
		this.agility = agility;
		this.fighting = fighting;
		this.awareness = awareness;
		this.stamina = stamina;
		this.dexterity = dexterity;
		this.intellect = intellect;
		this.presence = presence;
		
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		AbilityPoints.strength = strength;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getAgility() {
		return agility;
	}

	public static void setAgility(int agility) {
		AbilityPoints.agility = agility;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getFighting() {
		return fighting;
	}

	public static void setFighting(int fighting) {
		AbilityPoints.fighting = fighting;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getAwareness() {
		return awareness;
	}

	public static void setAwareness(int awareness) {
		AbilityPoints.awareness = awareness;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getStamina() {
		return stamina;
	}

	public static void setStamina(int stamina) {
		AbilityPoints.stamina = stamina;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getDexterity() {
		return dexterity;
	}

	public static void setDexterity(int dexterity) {
		AbilityPoints.dexterity = dexterity;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getIntellect() {
		return intellect;
	}

	public static void setIntellect(int intellect) {
		AbilityPoints.intellect = intellect;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getPresence() {
		return presence;
	}

	public static void setPresence(int presence) {
		AbilityPoints.presence = presence;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}

	public static int getAbilitiesPoints() {
		return abilitiesPoints;
	}

	public static void setAbilitiesPoints(int abilitiesPoints) {
		AbilityPoints.abilitiesPoints = abilitiesPoints;
		abilitiesPoints = (strength + agility + fighting + awareness + stamina + dexterity + intellect + presence) * 2;
	}
}
