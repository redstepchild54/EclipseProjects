package fileLab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MountainApp {
	
	private static int lineCounter = 0;
	
	public static void main(String[] args) {
		
		List<Mountain> mountainList = new LinkedList<>();
		
		try(Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv")))
		{
			while (reader.hasNextLine())
			{
				lineCounter++;
				Mountain newMountain = getMountain(reader.nextLine());
				if (newMountain != null)
					mountainList.add(newMountain);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("No file found with that name.");
			System.out.println();
		}
		
		for (Mountain el: mountainList)
			System.out.println(el);
		
	}

	private static Mountain getMountain(String nextLine) {
		Mountain myMountain = null;
		String[] mountainParts = nextLine.split(",");
		
		try
		{
			int altitude = Integer.parseInt(mountainParts[1]);
			boolean hasGlacier = Boolean.parseBoolean(mountainParts[2]);
			
			myMountain = new Mountain(mountainParts[0], altitude, hasGlacier);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(nextLine + " ... could not be read as a Mountain.");
			System.out.println("Line: " + lineCounter + "\n");
		}
		
		return myMountain;
	}
}
