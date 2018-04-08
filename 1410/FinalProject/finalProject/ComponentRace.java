package finalProject;

public class ComponentRace extends Component {

	Race race;
	
	public ComponentRace(ComponentTemplate componentTempate, Race race, ComponentAttributes attributes) {
		super(componentTempate);
		this.race = race;
		initializeAttributes(race, attributes);
	}

	private void initializeAttributes(Race race, ComponentAttributes attributes) {
		
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
