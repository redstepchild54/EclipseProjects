package finalProject;

public class ComponentSize extends Component {

	Size size;
	
	public ComponentSize(ComponentTemplate componentTempate, Size size) {
		super(componentTempate);
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Size: " + size;
	}

}
