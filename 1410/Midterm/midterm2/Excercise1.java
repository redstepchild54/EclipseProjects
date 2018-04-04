package midterm2;

/*
 * William McConnell
 * CSIS 1410
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * 
 * @author William McConnell
 *	Class that creates a list of Characters, modifies the list, and displays the list.
 */
public class Excercise1 {
	
	/**
	 * 
	 * @param args
	 * Main method that runs the program.
	 */
	
	public static void main (String[] args)
	{
		List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		
		System.out.println("Original List : " + vowels);
		Character searchItem = 'x';
		
		System.out.print("The Letter " + searchItem + " is ");
		if(!vowels.contains(searchItem))
			System.out.print("not ");
		System.out.println("in the list.");
		
		Collections.reverse(vowels);
		System.out.println("List Backwards: " + vowels);
		
		Collections.shuffle(vowels);
		System.out.println("Mixed up List : " + vowels);
		
		Collections.fill(vowels, searchItem);
		System.out.println("List of all x : " + vowels);
		
	}	
}
