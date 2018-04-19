package finalProject;

import java.io.Serializable;

public class Attribute implements Serializable{
	
	private int attribute;
	private int attributeMod;
	
	public Attribute(int attribute) {
		
		if (attribute < 0)
		{
			this.attribute = 0;
			throw new IllegalArgumentException("Value must be positive");
		}
		else
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
		return "Attribute [attribute=" + getAttribute() + ", attributeMod=" + getAttributeMod() + "]";
	}

	
	

}
