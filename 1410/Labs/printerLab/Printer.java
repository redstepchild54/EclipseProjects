package printerLab;

public abstract class Printer {

	private int serialNumber;
	
	public Printer(int number)
	{
		serialNumber = number;
	}
	
	abstract void print();
		
	public String toString()
	{
		return Printer.class.getSimpleName() + " #" + serialNumber;
	}
}
