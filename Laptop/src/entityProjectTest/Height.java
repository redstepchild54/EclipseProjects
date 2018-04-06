package entityProjectTest;

public class Height {
	
	private int feet;
	private int inches;
	
	public Height(int feet, int inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	
	public Height(int inches)
	{
		feet = inches / 12;
		this.inches = inches % 12;
	}
	
	public int getFeet() {
		return feet;
	}

	public int getInches() {
		return inches;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public void setHeight(int feet, int inches)
	{
		this.feet = feet;
		this.inches = inches;
	}

	public void setHeight(int inches)
	{
		feet = inches / 12;
		this.inches = inches % 12;
	}
	
	public int getHeightinInches()
	{
		return feet * 12 + inches;
	}
}
