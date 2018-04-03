package assignmentA02;

/**
 * The GpsPosition class holds a Latitude Longitude and Elevation.
 * 
 * @author William McConnell
 *
 */
public class GpsPosition {

	private double latitude;
	private double longitude;
	private double elevation;

	/**
	 * GpsPosition constructor constructs an object with Latitude, Longitude, and
	 * Elevation parameters
	 * 
	 * @param latitude
	 *            Latitude Position between -90 & 90
	 * @param longitude
	 *            Longitude Position between -180 & 180
	 * @param elevation
	 *            Elevation altitude in meters.
	 */

	public GpsPosition(double latitude, double longitude, double elevation) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		if (latitude > 90 || latitude < -90 || longitude > 180 || longitude < -180)
			throw new IllegalArgumentException("Invalid latitude and/or longitude");
	}

	/**
	 * Getter that returns the Latitude position
	 * 
	 * @return Latitude of the GpsPosition
	 */

	public double getLatitude() {
		return latitude;
	}

	/**
	 * Getter that returns the Longitude position
	 * 
	 * @return Longitude of the GpsPosition
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Getter that returns the Elevation Position
	 * 
	 * @return Elevation of the GpsPositoin in meters
	 */

	public double getElevation() {
		return elevation;
	}

	/**
	 * Overrides the toString method to display the Latitude, Longitude and
	 * Elevation of the GpsPosition
	 */
	@Override
	public String toString() {

		return String.format("%.6f, %.6f (%.1f)", latitude, longitude, elevation);
	}

}
