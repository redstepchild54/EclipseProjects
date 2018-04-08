package finalProject;

public class ComponentBody extends Component{
	
	private int health;
	private int maxHealth;
	private int ac;
	private int acFlatFooted;
	private int acTouch;
	private int initiative;
	
	public ComponentBody(ComponentTemplate componentTemplate, PClass pClass, ComponentAttributes componentAttributes)
	{
		super(componentTemplate);
		assignHealth(pClass, componentAttributes);
		assignArmor(pClass, componentAttributes);
		assignInitiative(pClass, componentAttributes);
	}
	
	private void assignHealth(PClass pClass, ComponentAttributes componentAttributes)
	{
		switch (pClass) {
		case FIGHTER:
			health = 10 + componentAttributes.constitution.getAttributeMod();
			maxHealth = 10 + componentAttributes.constitution.getAttributeMod();
			break;
		case ROGUE:
			health = 8 + componentAttributes.constitution.getAttributeMod();
			maxHealth = 8 + componentAttributes.constitution.getAttributeMod();
			break;
		case WIZARD:
			health = 6 + componentAttributes.constitution.getAttributeMod();
			maxHealth = 6 + componentAttributes.constitution.getAttributeMod();
			break;
		default:
			health = 8 + componentAttributes.constitution.getAttributeMod();
			maxHealth = 8 + componentAttributes.constitution.getAttributeMod();
			break;
		}
	}

	private void assignArmor(PClass pClass, ComponentAttributes componentAttributes)
	{
		switch (pClass) {
		case FIGHTER:
			ac = 10 + componentAttributes.dexterity.getAttributeMod();
			acFlatFooted = 10;
			acTouch = 10 + componentAttributes.dexterity.getAttributeMod();
			break;
		case ROGUE:
			ac = 10 + componentAttributes.dexterity.getAttributeMod();
			acFlatFooted = 10;
			acTouch = 10 + componentAttributes.dexterity.getAttributeMod();
			break;
		case WIZARD:
			ac = 10 + componentAttributes.dexterity.getAttributeMod();
			acFlatFooted = 10;
			acTouch = 10 + componentAttributes.dexterity.getAttributeMod();
			break;
		default:
			ac = 10 + componentAttributes.dexterity.getAttributeMod();
			acFlatFooted = 10;
			acTouch = 10 + componentAttributes.dexterity.getAttributeMod();
			break;
		}
	}

	private void assignInitiative(PClass pClass, ComponentAttributes componentAttributes)
	{
		switch (pClass) {
		case FIGHTER:
			initiative = componentAttributes.dexterity.getAttributeMod();
			break;
		case ROGUE:
			initiative = componentAttributes.dexterity.getAttributeMod();
			break;
		case WIZARD:
			initiative = componentAttributes.dexterity.getAttributeMod();
			break;
		default:
			initiative = componentAttributes.dexterity.getAttributeMod();
			break;
		}
	}

	@Override
	public String toString() {
		return String.format("Health: %s%nMax Health: %s%nAC: %s%nFlat Footed: %s%nTouch %s%nInitiative: %s", 
				health, maxHealth, ac, acFlatFooted, acTouch, initiative);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getAcFlatFooted() {
		return acFlatFooted;
	}

	public void setAcFlatFooted(int acFlatFooted) {
		this.acFlatFooted = acFlatFooted;
	}

	public int getAcTouch() {
		return acTouch;
	}

	public void setAcTouch(int acTouch) {
		this.acTouch = acTouch;
	}

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
}
