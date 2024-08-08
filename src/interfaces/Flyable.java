package interfaces;

import animals.Location;

/**
 * The Flyable interface represents Animals that can fly in a specified direction.
 * Implementing classes should provide the logic for movement based on a given direction.
 * Implementing classes should define how the movement is carried out based on the provided direction.
 * Directions are represented by integers where each integer corresponds to a specific direction.
 * 
 * @author JacobRoberts
 */

public interface Flyable {

	/**
	 * Updates the location object of the class that implements the interface.
	 * 
	 * @param location the new Location object
	 */
	public void fly(Location location);
}
