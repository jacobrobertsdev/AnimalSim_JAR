package interfaces;

/**
 * The Swimmable interface represents Animals that can swim in a specified direction.
 * Implementing classes should provide the logic for movement based on a given direction.
 * Implementing classes should define how the movement is carried out based on the provided direction.
 * Directions are represented by integers where each integer corresponds to a specific direction.
 * 
 * @author JacobRoberts
 */

public interface Swimmable {

	/**
	 * Moves the animal a specified number of units in the direction passed in.
	 * 
	 * @param direction integer to specify the direction (1, 2, 3, or 4).
	 */
	public void swim(int direction);
}
