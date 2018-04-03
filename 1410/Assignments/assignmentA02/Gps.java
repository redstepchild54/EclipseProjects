package assignmentA02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Gps class that constructs an array list of GpsPositions and has methods of
 * modifying them.
 * 
 * @author William McConnell
 *
 */

public class Gps {
	private ArrayList<GpsPosition> route = new ArrayList<GpsPosition>();

	/**
	 * Constructor that constructs a Gps object by adding a GpsPosition to the first
	 * element of the array list
	 * 
	 * @param position
	 *            GpsPosition that is the first parameter of the Gps arraylist
	 */

	public Gps(GpsPosition position) {
		route.add(position);
	}

	/**
	 * Getter that returns the current array list
	 * 
	 * @return Array list object that will be returned
	 */

	public ArrayList<GpsPosition> getRoute() {
		return route;

	}

	/**
	 * Method that adds a GpsPosition as the next position in the Arraylist
	 * 
	 * @param position
	 *            GpsPosition that will be added as the next parameter in the array
	 *            list
	 */

	public void update(GpsPosition position) {
		route.add(position);
	}

	/**
	 * Method that adds a random value between -0.5 and 0.5 to both the current
	 * position's latitude and logitude and sets that as the next position in the
	 * array list
	 */
	public void randomUpdate() {
		GpsPosition temp = position();
		Random rand = new Random();
		double tempLon;
		double tempLat;
		do {
			tempLon = (temp.getLongitude() + (rand.nextDouble() - 0.5));
			tempLat = (temp.getLatitude() + (rand.nextDouble() - 0.5));
		} while (Math.abs(tempLat) > 90 || Math.abs(tempLon) > 180);
		route.add(new GpsPosition(tempLat, tempLon, temp.getElevation()));

	}

	/**
	 * Method that calls the distance function and adds the distance between every
	 * position in the array list.
	 * 
	 * @return total distance between every position in the array list.
	 */

	public GpsPosition position() {
		return route.get(route.size() - 1);
	}

	public double distanceTraveled() {
		double total = 0;

		for (int i = 0; i < route.size() - 1; i++) {
			total += distance(route.get(i), route.get(i + 1));
		}

		return total;
	}

	/**
	 * Method that calculates the distance between two positions in meters.
	 * 
	 * @param from
	 *            Starting position
	 * @param to
	 *            Ending position
	 * @return Distance between starting and ending position.
	 */

	private double distance(GpsPosition from, GpsPosition to) {
		final int R = 6371;
		double latDistance = Math.toRadians(to.getLatitude() - from.getLatitude());
		double lonDistance = Math.toRadians(to.getLongitude() - from.getLongitude());
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
				+ Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2) * Math.cos(Math.toRadians(from.getLatitude()))
						* Math.cos(Math.toRadians(to.getLatitude()));
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double dist = R * c;
		double height = (from.getElevation() - to.getElevation()) / 1000;
		dist = Math.pow(dist, 2) + Math.pow(height, 2);

		return Math.sqrt(dist);
	}

	/**
	 * Method that resets the Gps object and keeps the current position as the only
	 * position
	 */

	public void reset() {
		Gps temp = new Gps(position());
		route.clear();
		route.add(temp.position());
	}
	public static void main(String[] args) {
		
	}
}
