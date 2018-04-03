package assignmentA01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class runs the indexing application for for the Pokemon Class
 * For a full list of Pokemon information from the 1st Generation Kando Region:
 * https://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_Kanto_Pok%C3%A9dex_number
 * @author willi
 *
 */
public class PokemonApp {
	static ArrayList<Pokemon> poke = new ArrayList<Pokemon>();

	static Scanner userInput = new Scanner(System.in);

	static int userchoice = 0;
	static int idInput = 0;
	static boolean findSuccess;
	static String newName = new String();
	static String newFirstType = new String();
	static String newSecondType = new String();
	static int newKdex;
	static int newEvolution;
	static int exitChoice = 6;

	/**
	 * Method that runs the menu display based on a choice parameter
	 * @param choice Choice based on the input menu
	 */
	public static void menuChoice(int choice) {
		switch (choice) {
		case 1:
			display();
			menu();
			break;
		case 2:
			addItem();
			menu();
			break;
		case 3:
			findItem();
			menu();
			break;
		case 4:
			deleteItem();
			menu();
			break;
		case 5:
			displayCount();
			menu();
			break;
		case 6:
			exit();
			break;
		default:
			errorInput();
			menu();
		}
	}

	/**
	 * Method that displays the menu options
	 */
	private static void menu() {
		System.out.println("1. Display all items");
		System.out.println("2. Add a Pokemon");
		System.out.println("3. Find a Pokemon");
		System.out.println("4. Delete an Pokemon");
		System.out.println("5. Number of Pokemon in list");
		System.out.println("6. Exit");
		System.out.print("Enter your selection:");
	}

	/**
	 * Method that displays the values in the Pokemon ArrayList.
	 */
	private static void display() {
		System.out.println();
		for (Pokemon el : poke) {
			System.out.println(el);
		}
		System.out.println();
	}

	/**
	 * Method that adds new Pokemon objects to the ArrayList
	 */
	private static void addItem() {
		System.out.print("\nName: ");
		userInput.nextLine();
		newName = userInput.nextLine();
		System.out.print("First Type: ");
		newFirstType = userInput.nextLine();
		System.out.print("Second Type: ");
		newSecondType = userInput.nextLine();
		System.out.print("Kanto Pokedex Number: ");
		inputInt();
		newKdex = userInput.nextInt();
		System.out.print("Evolution Stage: ");
		inputInt();
		newEvolution = userInput.nextInt();

		poke.add(new Pokemon(newName, newFirstType, newSecondType, newKdex, newEvolution));
		System.out.println();
	}

	/**
	 * Method that finds a Pokemon in the ArrayList based on the ID number
	 */
	private static void findItem() {
		System.out.print("\nID: ");
		inputInt();
		idInput = userInput.nextInt();
		findSuccess = false;
		for (Pokemon el : poke) {
			if (el.getId() == idInput) {
				System.out.println(el + "\n");
				findSuccess = true;
			}
		}
		if (findSuccess == false)
			System.out.printf("Could not find Pokemon with ID: %d\n\n", idInput);
	}

	/**
	 * Method that deletes a Pokemon from the ArrayList based on the ID number
	 */
	private static void deleteItem() {
		System.out.print("\nID: ");
		inputInt();
		idInput = userInput.nextInt();
		findSuccess = false;
		for (Pokemon el : poke) {
			if (el.getId() == idInput) {
				System.out.println(el + " has been deleted.\n");
				poke.remove(el);
				findSuccess = true;
				break;
			}
		}
		if (findSuccess == false)
			System.out.printf("Could not find Pokemon with ID: %d\n\n", idInput);
	}

	/**
	 * Method that displays the total number of Pokemon objects in the ArrayList
	 */
	public static void displayCount() {
		System.out.printf("\nNumber of Pokemon: %d\n\n", poke.size());
	}

	/**
	 * Method that exits the menu
	 */
	public static void exit() {
		System.out.println("\nThank you for using PokemonApp!\n");
	}

	/**
	 * Method that displays an invalid error message when wrong input information is used
	 */
	public static void errorInput() {
		System.out.println("\nEnter a valid selection.\n");
	}

	/**
	 * Method that checks to make sure the next entered value is an integer 
	 * Gives an invalid message if the entered value is not an integer and allows the user to input again
	 */
	public static void inputInt() {
		while (!userInput.hasNextInt()) {
			System.out.println("\nEnter a valid selection\n");
			userInput.next();
		}
	}

	/**
	 * Main method that runs the program
	 * @param args
	 */
	public static void main(String[] args) {

		poke.add(new Pokemon("Bulbasaur", "Grass", "Poison", 1, 1));
		poke.add(new Pokemon("Charmander", "Fire", "None", 4, 1));
		poke.add(new Pokemon("Alakazam", "Psychic", "None", 65, 3));
		poke.add(new Pokemon("Dewgong", "Water", "Ice", 87, 2));
		poke.add(new Pokemon("Venonat", "Bug", "Poison", 48, 1));
		
		menu();
		do {
			inputInt();
			userchoice = userInput.nextInt();
			menuChoice(userchoice);

		} while (userchoice != exitChoice);
	}

}
