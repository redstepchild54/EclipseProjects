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
	DieRoller dieRoller = new DieRoller();
	
	public ComponentCharacterDescription(ComponentTemplate componentTemplate, PClass pClass, Race race)
	{
		super(componentTemplate);
		initializeAge(pClass, race);
		initializeHeightandWeight(race, gender);
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
				break;
			}
			
			height.setHeight(height.getHeightinInches() + hwModifier);
			weight += hwModifier * 3;
			
		case HUMAN:
			
			switch(gender)
			{
			case MALE:
				break;
			case FEMALE:
				break;
			default:
				break;
			}
			
			
		default:
			break;
		}
		
	}
}
