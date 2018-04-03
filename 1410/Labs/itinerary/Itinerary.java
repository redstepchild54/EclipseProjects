package itinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class Itinerary {

	static ArrayList<String> itinerary = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	static String userInput;
	static String isDone;
	static boolean keepGoing = true;
	static String travelRoute;

	public static void getInput() {
		System.out.print("Destination: ");
		userInput = sc.nextLine();
		isDone = userInput.toUpperCase();
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		do {
			getInput();
			if (isDone.compareTo("DONE") == 0) {
				keepGoing = false;
			} else {
				itinerary.add(userInput);
			}
		} while (keepGoing == true);

		for (int i = 0; i < itinerary.size(); i++) {
			itinerary.set(i, itinerary.get(i).toUpperCase());
			sb.append(itinerary.get(i));
			if (i != itinerary.size() - 1) {
				sb.append(" to ");
			}
		}
		travelRoute = sb.toString();
		System.out.println("Travel Route:");
		System.out.println(travelRoute);
	}

}
