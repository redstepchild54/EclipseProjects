package entityProjectTest;

public class SavingThrow {
	
	private int fortitude;
	private int reflex;
	private int will;
	
	public SavingThrow(PClass pClass, Attributes attribute)
	{
		setBaseSavingThrow(pClass);
		adjustSavingThrow(attribute);
	}

	private void setBaseSavingThrow(PClass pClass)
	{
		switch (pClass) {
		case FIGHTER:
			fortitude = 2;
			reflex = 0;
			will = 0;
			break;
		case ROGUE:
			fortitude = 0;
			reflex = 2;
			will = 0;
			break;
		case WIZARD:
			fortitude = 0;
			reflex = 0;
			will = 2;
			break;
		default:
			fortitude = 0;
			reflex = 0;
			will = 0;
			break;
		}
	}
	private void adjustSavingThrow(Attributes attributes)
	{
		fortitude += attributes.constitution.getAttributeMod();
		reflex += attributes.dexterity.getAttributeMod();
		will += attributes.wisdom.getAttributeMod();
	}

	@Override
	public String toString() {
		return String.format("Fortitude: %s%nReflex: %s%nWill: %s", fortitude, reflex, will);
	}
}
