package quadrotorLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrotorApp {

	public static void main(String[] args) {
		
		List<Quadrotor> rotors = new ArrayList(	Arrays.asList(new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), 
												new Quadrotor(4, 4, 6), new Quadrotor(5, 4, 2), 
												new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));
		
		System.out.println(rotors);
		changeOrientation(rotors);
		System.out.println(rotors);
		
		Quadrotor searchItem = new Quadrotor(4,6,4);
		
		String contains = "";
		
		if (!rotors.contains(searchItem))
			contains = "not ";
		int numberOfRoters = rotors.size();
		
		System.out.println("rotors does " + contains + "contain " + searchItem);
		System.out.println("Number of rotors: " + numberOfRoters);
		
		rotors.remove(searchItem);
		System.out.println(rotors);
		rotors.remove(0);
		System.out.println(rotors);

	}
	
	private static void changeOrientation(List<Quadrotor> ad)
	{		
		for (int i = 0; i < ad.size(); i++)
		{		
			ad.set(i, new Quadrotor(ad.get(i).getY(), ad.get(i).getX(), ad.get(i).getZ()));
		}
	}

}
