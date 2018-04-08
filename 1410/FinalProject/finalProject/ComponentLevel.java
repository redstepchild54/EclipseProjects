package finalProject;

public class ComponentLevel extends Component {

	int level;
	
	public ComponentLevel(ComponentTemplate componentTempate, int level) {
		super(componentTempate);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Level: " + level;
	}
	
}
