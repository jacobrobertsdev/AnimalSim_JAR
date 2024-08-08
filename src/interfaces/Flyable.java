package interfaces;

import animals.Location;

public interface Flyable {

	/**
	 * Updates the location object of the class that implements the interface.
	 * 
	 * @param location the new Location object
	 */
	public void fly(Location location);
}
