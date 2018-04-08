package finalProject;

public class ComponentSavingThrows extends Component{
	
	private int fortitude;
	private int reflex;
	private int will;
	
	public ComponentSavingThrows(ComponentTemplate componentTemplate, PClass pClass, ComponentAttributes attribute)
	{
		super(componentTemplate);
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
	private void adjustSavingThrow(ComponentAttributes componentAttributes)
	{
		fortitude += componentAttributes.getConstitution().getAttributeMod();
		reflex += componentAttributes.getDexterity().getAttributeMod();
		will += componentAttributes.getWisdom().getAttributeMod();
	}

	@Override
	public String toString() {
		return String.format("Fortitude: %s%nReflex: %s%nWill: %s", fortitude, reflex, will);
	}
}
