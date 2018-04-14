package finalProject;

public class ComponentRace extends Component {

	Race race;
	
	public ComponentRace(ComponentTemplate componentTempate, Race race, PClass pClass, ComponentAttributes attributes) {
		super(componentTempate);
		this.race = race;
		initializeAttributes(race, pClass, attributes);
	}

	private void initializeAttributes(Race race, PClass pClass, ComponentAttributes attributes) {
		
		switch(race)
		{
		case DWARF:
			attributes.getConstitution().setAttribute(attributes.getConstitution().getAttribute() + 2);
			attributes.getWisdom().setAttribute(attributes.getWisdom().getAttribute() + 2);
			attributes.getCharisma().setAttribute(attributes.getCharisma().getAttribute() - 2);
			break;
		case ELF:
			attributes.getDexterity().setAttribute(attributes.getDexterity().getAttribute() + 2);
			attributes.getIntelligence().setAttribute(attributes.getIntelligence().getAttribute() + 2);
			attributes.getConstitution().setAttribute(attributes.getConstitution().getAttribute() - 2);
			break;
		case HUMAN:
			
			switch(pClass)
			{
			case FIGHTER:
				attributes.getStrength().setAttribute(attributes.getStrength().getAttribute() + 2);
				break;
			case ROGUE:
				attributes.getDexterity().setAttribute(attributes.getDexterity().getAttribute() + 2);
				break;
			case WIZARD:
				attributes.getIntelligence().setAttribute(attributes.getIntelligence().getAttribute() + 2);
				break;
			default:
				break;
			}
			
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return race.toString();
	}

	public Race getRace() {
		return race;
	}
	
}
