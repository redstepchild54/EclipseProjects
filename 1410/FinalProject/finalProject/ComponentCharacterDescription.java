package finalProject;

import java.awt.Color;
import java.util.Random;

public class ComponentCharacterDescription extends Component{

	private String characterName;
	private String playerName;
	private int age;
	private Height height;
	private int weight;
	private int hwModifier;
	private Color hair;
	private Color eyes;
	private Gender gender;
	private Race race;
	DieRoller dieRoller = new DieRoller();
	
	public ComponentCharacterDescription(ComponentTemplate componentTemplate, PClass pClass, Race race)
	{
		super(componentTemplate);
		this.race = race;
		initializeAge(pClass, race);
		gender = Gender.MALE;
		initializeHeightandWeight(race, gender);
		characterName = "Character";
		playerName = "Player";
		hair = Color.BLACK;
		eyes = Color.BLUE;
	}

	private void initializeAge(PClass pClass, Race race)
	{	
		switch(race)
		{
		case DWARF:
			age = 40;
			
			switch(pClass)
			{
			case ROGUE:
				age += dieRoller.dieRoll(3, 6);
				break;
			case FIGHTER:
				age += dieRoller.dieRoll(5, 6);
				break;
			case WIZARD:
				age += dieRoller.dieRoll(7, 6);
				break;
			default:
				break;
			}
			
			break;
		case ELF:
			age = 110;
			
			switch(pClass)
			{
			case ROGUE:
				age += dieRoller.dieRoll(4, 6);
				break;
			case FIGHTER:
				age += dieRoller.dieRoll(6,6);
				break;
			case WIZARD:
				age += dieRoller.dieRoll(10, 6);
				break;
			default:
				break;
			}
			
			break;
		case HUMAN: 
			age = 15;
			
			switch(pClass)
			{
			case ROGUE:
				age += dieRoller.dieRoll(1, 4);
				break;
			case FIGHTER:
				age += dieRoller.dieRoll(1, 6);
				break;
			case WIZARD:
				age += dieRoller.dieRoll(2, 6);
			default:
				break;
			}
			
			break;
		default:
			age = 15;
			break;
		}
	}

	private void initializeHeightandWeight(Race race, Gender gender) {
		
		switch(race)
		{
		case DWARF:
			
			switch(gender)
			{
			case MALE:
				height = new Height(3, 9);
				weight = 150;
				break;
			case FEMALE:
				height = new Height(3, 3);
				weight = 120;
				break;
			default:
				height = new Height(3, 9);
				weight = 150;
				break;
			}
			
			hwModifier = dieRoller.dieRoll(2, 4);
			height.setHeight(height.getHeightinInches() + hwModifier);
			weight += hwModifier * 7;
			break;
			
		case ELF:
			
			switch(gender)
			{
			case MALE:
				height = new Height(5, 4);
				weight = 100;
				hwModifier = dieRoller.dieRoll(2, 8);
				break;
			case FEMALE:
				height = new Height(5, 4);
				weight = 90;
				hwModifier = dieRoller.dieRoll(2, 6);
				break;
			default:
				height = new Height(5, 4);
				weight = 100;
				hwModifier = dieRoller.dieRoll(2, 8);
				break;
			}
			
			height.setHeight(height.getHeightinInches() + hwModifier);
			weight += hwModifier * 3;
			
		case HUMAN:
			
			switch(gender)
			{
			case MALE:
				height = new Height(4,10);
				weight = 120;
				break;
			case FEMALE:
				height = new Height(4,5);
				weight = 85;
				break;
			default:
				height = new Height(4,10);
				weight = 120;
				break;
			}
			
			hwModifier = dieRoller.dieRoll(2, 10);
			height.setHeight(height.getHeightinInches() + hwModifier);
			weight+= hwModifier * 5;
			
		default:
			break;
		}
		
	}

	
	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Height getHeight() {
		return height;
	}

	public void setHeight(Height height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Color getHair() {
		return hair;
	}

	public void setHair(Color hair) {
		this.hair = hair;
	}

	public Color getEyes() {
		return eyes;
	}

	public void setEyes(Color eyes) {
		this.eyes = eyes;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
		initializeHeightandWeight(race, gender);
	}

	@Override
	public String toString() {
		return String.format("Character Name: %s%nPlayer Name: %s%nGender: %s%nAge: %s%nHeight: %sft %sin%nWieght: %s%nHair Color: %s%nEye Color: %s%n", 
							  characterName, playerName, gender, age, height.getFeet(), height.getInches(), weight, hair.toString(), eyes.toString());
	}

	
}
