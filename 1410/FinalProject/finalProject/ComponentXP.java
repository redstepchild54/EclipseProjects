package finalProject;

public class ComponentXP extends Component {

	int xp;
	
	public ComponentXP(ComponentTemplate componentTempate, int xp) {
		super(componentTempate);
		this.xp = xp;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	@Override
	public String toString() {
		return "XP: " + xp;
	}
	
}
