package enumLab;

public enum Coin {
	
	PENNY(2.5, 19.05), NICKEL(5.0, 21.21), DIME(2.268, 17.91), QUARTER(5.670, 24.26);
	
	private final double weight;
	private final double diameter;
	
	Coin(double weight, double diameter)
	{
		this.weight = weight;
		this.diameter = diameter;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s w:%.1f d:%.1f", super.toString(), weight, diameter);
	}

}
