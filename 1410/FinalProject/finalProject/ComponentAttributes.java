package finalProject;

import java.util.Arrays;
import java.util.Random;

public class ComponentAttributes extends Component{
	
	private Attribute strength;
	private Attribute dexterity;
	private Attribute constitution;
	private Attribute intelligence;
	private Attribute wisdom;
	private Attribute charisma;
	
	private int[] attributeArray = new int[6];
	private int pointBuy;
	private final int POINTBUYVAL = 15;
	
	public ComponentAttributes(ComponentTemplate componentTemplate, PClass pClass)
	{
		super(componentTemplate);
		do
		{
			pointBuy = 0;
			pointBuy = setAttributeArray();
		}
		while (pointBuy < POINTBUYVAL);
		
		Arrays.sort(attributeArray);
		
		assignAttributes(pClass);
	}

	@Override
	public String toString() {
		return String.format("STR: %-2d Mod: %-2d%nDEX: %-2d Mod: %-2d%nCON: %-2d Mod: %-2d%nINT: %-2d Mod: %-2d%nWIS: %-2d Mod: %-2d%nCHA: %-2d Mod: %-2d", 
								strength.getAttribute(), strength.getAttributeMod(), dexterity.getAttribute(), dexterity.getAttributeMod(),
								constitution.getAttribute(), constitution.getAttributeMod(), intelligence.getAttribute(), intelligence.getAttributeMod(),
								wisdom.getAttribute(), wisdom.getAttributeMod(), charisma.getAttribute(), charisma.getAttributeMod());
	}

	private int setAttributeArray()
	{
		Random rnd = new Random();
		for (int i = 0; i < 6; i++)
		{
			attributeArray[i] = 8 + rnd.nextInt(6) + rnd.nextInt(6);
		}
		
		for(int el: attributeArray)
		{
			switch (el){
			
			case 7: pointBuy -= 4; 
				break;
			case 8: pointBuy -= 2;
				break;
			case 9: pointBuy -= 1;
				break;
			case 10: pointBuy += 0;
				break;
			case 11: pointBuy += 1;
				break; 
			case 12: pointBuy += 2;
				break;
			case 13: pointBuy += 3;
				break;
			case 14: pointBuy += 5;
				break;
			case 15: pointBuy += 7;
				break;
			case 16: pointBuy += 10;
				break;
			case 17: pointBuy += 13;
				break;
			case 18: pointBuy += 17;
				break;
			default: pointBuy += 0;
				break;
			}
		}
		
		return pointBuy;
		
	}

	private void assignAttributes(PClass pClass)
	{
		switch (pClass){
		
		case FIGHTER: 
			charisma = new Attribute(attributeArray[0]);
			intelligence = new Attribute(attributeArray[1]);
			wisdom = new Attribute(attributeArray[2]);
			dexterity = new Attribute(attributeArray[3]);
			constitution = new Attribute(attributeArray[4]);
			strength = new Attribute(attributeArray[5]);
			break;
		case ROGUE:
			charisma = new Attribute(attributeArray[0]);
			intelligence = new Attribute(attributeArray[1]);
			wisdom = new Attribute(attributeArray[2]);
			strength = new Attribute(attributeArray[3]);
			constitution = new Attribute(attributeArray[4]);
			dexterity = new Attribute(attributeArray[5]);
			break;
		case WIZARD:
			charisma = new Attribute(attributeArray[0]);
			strength = new Attribute(attributeArray[1]);
			wisdom = new Attribute(attributeArray[2]);
			constitution = new Attribute(attributeArray[3]);
			dexterity = new Attribute(attributeArray[4]);
			intelligence = new Attribute(attributeArray[5]);
			break;
		default:
			charisma = new Attribute(attributeArray[0]);
			intelligence = new Attribute(attributeArray[1]);
			wisdom = new Attribute(attributeArray[2]);
			dexterity = new Attribute(attributeArray[3]);
			constitution = new Attribute(attributeArray[4]);
			strength = new Attribute(attributeArray[5]);
			break;
		}
	}

	public Attribute getStrength() {
		return strength;
	}

	public void setStrength(Attribute strength) {
		this.strength = strength;
	}

	public Attribute getDexterity() {
		return dexterity;
	}

	public void setDexterity(Attribute dexterity) {
		this.dexterity = dexterity;
	}

	public Attribute getConstitution() {
		return constitution;
	}

	public void setConstitution(Attribute constitution) {
		this.constitution = constitution;
	}

	public Attribute getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Attribute intelligence) {
		this.intelligence = intelligence;
	}

	public Attribute getWisdom() {
		return wisdom;
	}

	public void setWisdom(Attribute wisdom) {
		this.wisdom = wisdom;
	}

	public Attribute getCharisma() {
		return charisma;
	}

	public void setCharisma(Attribute charisma) {
		this.charisma = charisma;
	}
	
	
	
}
