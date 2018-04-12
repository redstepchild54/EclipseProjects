package printTimeTableLab;

import java.io.FileNotFoundException;
import java.util.Formatter;

public abstract class TimesTables {

	private static int num = 10;
	public static void main(String[] args) {
		
		try (Formatter formatter = new Formatter("TimesTable.txt");)
		{
			for (int i = 1; i <= num; i+=2)
			{
				for (int j = 1; j <= num; j++)
				{
					formatter.format("%2d * %d = %d\t\t", j, i, (i*j));
					formatter.format("%2d * %d = %d%n", j, i+1, ((i+1)*j));
				}
				formatter.format("%n");
			}
			System.out.println("File Updated.");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found!");
		}
	}

}
