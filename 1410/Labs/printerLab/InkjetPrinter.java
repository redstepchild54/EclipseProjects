package printerLab;

public class InkjetPrinter extends Printer{

	private int remainingCartridge;
	
	public InkjetPrinter(int sNumber) {
		super(sNumber);
		remainingCartridge = 100;
	}

	@Override
	public void print() {
		
		if (remainingCartridge > 0)
		{
			remainingCartridge -= 10;
			System.out.println("Remaining Cartridge: " + remainingCartridge + "%");
		}
		else
			System.out.println("Toner is empty");
		
	}

	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	
	
}
