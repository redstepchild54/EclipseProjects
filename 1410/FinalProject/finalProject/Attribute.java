package finalProject;

public class Attribute {
	
	private int attribute;
	private int attributeMod;
	
	public Attribute(int attribute) {
		this.attribute = attribute;
		attributeMod = attribute/ 2 - 5;
	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
		setAttributeMod(attribute);
	}

	public int getAttributeMod() {
		return attributeMod;
	}
	private void setAttributeMod(int attribute) {
		attributeMod = attribute/2 - 5;
	}

	@Override
	public String toString() {
		return "Attribute [attribute=" + attribute + ", attributeMod=" + attributeMod + "]";
	}

	
	

}
