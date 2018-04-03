package testing;

import javax.swing.JFrame;

public class North extends JFrame{
	
	private static int strength;
	private static int agility;
	private static int fighting;
	private static int awareness;
	private static int stamina;
	private static int dexterity;
	private static int intellect;
	private static int presence;
	
	private static int abilitiesPoints;
	
	private static int powersPoints;
	
	private static int skillsPoints;
	
	private static int advantagesPoints;
	private static int defensesPoints;
	private static int remainingPoints;
	private static int totalPoints =  abilitiesPoints + powersPoints + skillsPoints + advantagesPoints + defensesPoints + remainingPoints;
	
	public North (int strength, int agility, int fighting, int awareness, int stamina, int dexterity, int intellect, int presence)
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

}
