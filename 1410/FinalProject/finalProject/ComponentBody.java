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
			health = 10 + componentAttributes.getConstitution().getAttributeMod();
			maxHealth = 10 + componentAttributes.getConstitution().getAttributeMod();
			break;
		case ROGUE:
			health = 8 + componentAttributes.getConstitution().getAttributeMod();
			maxHealth = 8 + componentAttributes.getConstitution().getAttributeMod();
			break;
		case WIZARD:
			health = 6 + componentAttributes.getConstitution().getAttributeMod();
			maxHealth = 6 + componentAttributes.getConstitution().getAttributeMod();
			break;
		default:
			health = 8 + componentAttributes.getConstitution().getAttributeMod();
			maxHealth = 8 + componentAttributes.getConstitution().getAttributeMod();
			break;
		}
	}

	private void assignArmor(PClass pClass, ComponentAttributes componentAttributes)
	{
		switch (pClass) {
		case FIGHTER:
		case ROGUE:
		case WIZARD:
		default:
			ac = 10 + componentAttributes.getDexterity().getAttributeMod();
			acFlatFooted = 10;
			acTouch = 10 + componentAttributes.getDexterity().getAttributeMod();
			break;
		}
	}

	private void assignInitiative(PClass pClass, ComponentAttributes componentAttributes)
	{
		switch (pClass) {
		case FIGHTER:
		case ROGUE:
		case WIZARD:
		default:
			initiative = componentAttributes.getDexterity().getAttributeMod();
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
