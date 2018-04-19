package finalProject;

public class ComponentAlignment extends Component {

	Alignment alignment;
	
	public ComponentAlignment(ComponentTemplate componentTempate) {
		super(componentTempate);
		alignment = Alignment.NEUTRAL;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	@Override
	public String toString() {
		return "Alignment: " + alignment.toString();
	}

}
