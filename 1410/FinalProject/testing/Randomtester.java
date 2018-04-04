package testing;

import java.util.Random;

public class Randomtester {

	public static void main (String[] args)
	{
		Random rnd = new Random();
		for (int i = 0; i < 20; i++)
			System.out.println(rnd.nextInt(6));
	}
	
}
