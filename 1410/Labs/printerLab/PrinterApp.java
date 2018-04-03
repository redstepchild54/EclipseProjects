package printerLab;

import java.util.ArrayList;

public class PrinterApp {

	public static void main(String[] args) {
		
		InkjetPrinter inkjet = new InkjetPrinter(1234567);

		System.out.println(inkjet);
		System.out.println("Remaining Cartridge: " + inkjet.getRemainingCartridge() + "%");
		System.out.println();
		
		LaserPrinter laser = new LaserPrinter(12345678);
		
		System.out.println(laser);
		System.out.println("Remaining Toner: " + laser.getRemainingToner() + "%");
		System.out.println();
		
		System.out.println("List of Printers:");
		
		ArrayList<Printer> printers = new ArrayList<>();
		
		printers.add(inkjet);
		printers.add(laser);
		
		for (Printer el : printers)
		{
			System.out.println(el);
			for (int i = 0; i < 11; i++)
				el.print();
			System.out.println();
		}
	}

}