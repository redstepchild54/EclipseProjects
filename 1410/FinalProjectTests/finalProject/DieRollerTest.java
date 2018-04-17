package finalProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class DieRollerTest {

	private DieRoller dr = new DieRoller();
	
	@Test
	public void testDieRoll() {
		
		int value;
		int lowValue = 1;
		int d4 = 4;
		int d6 = 6;
		int d8 = 8;
		int d10 = 10;
		int d12 = 12;
		int d20 = 20;
		int d100 = 100;
		
		for (int i = 0; i < 1000; i++)
		{
			value = dr.dieRoll(1, d4);
			if (value < 1 || value > d4)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(2, d4);
			if (value < 1 || value > 2 * d4)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(10, d4);
			if (value < 1 || value > 10 * d4)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(1, d6);
			if (value < 1 || value > d6)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(1, d8);
			if (value < 1 || value > d8)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(1, d10);
			if (value < 1 || value > d10)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(1, d12);
			if (value < 1 || value > d12)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(1, d20);
			if (value < 1 || value > d20)
				fail("Vale is outside expected roll.");
			
			value = dr.dieRoll(1, d100);
			if (value < 1 || value > d100)
				fail("Vale is outside expected roll.");
		}
	}

}
