package printerLab;

public class LaserPrinter extends Printer{

	private int remainingToner;
	
	public LaserPrinter(int sNumber)
	{
		super(sNumber);
		remainingToner = 100;
	}

	public int getRemainingToner() {
		return remainingToner;
	}

	@Override
	public void print() {
		
		if (remainingToner > 0)
		{
			remainingToner -= 10;
			System.out.println("Remaining Toner: " + remainingToner + "%");
		}
		else
			System.out.println("Toner is empty");
	}
	
}
