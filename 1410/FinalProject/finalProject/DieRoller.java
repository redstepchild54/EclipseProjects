package finalProject;

import java.io.Serializable;
import java.util.Random;

public class DieRoller implements Serializable{
	
	public DieRoller() {
		
	}

	public int dieRoll(int NumberOfDie, int dieType)
	{
		Random rnd = new Random();
		int returnVal = 0;
		
		if(NumberOfDie <= 0)
			return 0;
		
		for (int i = 0; i < NumberOfDie; i++)
		{
			returnVal += rnd.nextInt(dieType) + 1;
		}
		return returnVal; 
	}
}
