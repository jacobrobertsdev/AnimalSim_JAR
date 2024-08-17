
package animals;

import java.util.Arrays;

import exceptions.InvalidSubspeciesException;
import interfaces.Swimmable;
import interfaces.Walkable;

/**
 * BrownBear is a subclass of Animal.
 * 
 * @author JacobRoberts
 */

public class BrownBear extends Animal implements Walkable, Swimmable {

	private String subSpecies;

	/**
	 * Default constructor
	 */
	public BrownBear() {
		super(0, new Location(0, 0));
		this.full = false;
		this.rested = true;
		this.subSpecies = "Alaskan";
	}

	/**
	 * Preferred constructor
	 * 
	 * @param simID must be greater than 0.
	 * @param location object of type Location.
	 * @param subSpecies String value
	 */
	public BrownBear(int simID, Location location, String subSpecies) {
		super(simID, location);
		this.subSpecies = subSpecies;
		this.full = false;
		this.rested = true;
	}

	@Override
	public void swim(int direction) {
		
		if (direction < 1 || direction > 4) {
			System.out.println("Direction must be 1 (N), 2 (E), 3 (S), 4 (W)");
			
		} else {
			
			switch (direction){
			
			case 1:
				this.location.setyCoord(this.location.getyCoord() + 2);
				break;
			
			case 2:
				this.location.setxCoord(this.location.getxCoord() + 2);
				break;
				
			case 3:
				this.location.setyCoord(this.location.getyCoord() - 2);
				break;
			
			case 4:
				this.location.setxCoord(this.location.getxCoord() - 2);
				break;
			}
		}
	}

	@Override
	public void walk(int direction) {
		
		if (direction < 1 || direction > 4) {
			System.out.println("Direction must be 1 (N), 2 (E), 3 (S), 4 (W)");
			
		} else {
			
			switch (direction){
			
			case 1:
				this.location.setyCoord(this.location.getyCoord() + 3);
				break;
			
			case 2:
				this.location.setxCoord(this.location.getxCoord() + 3);
				break;
				
			case 3:
				this.location.setyCoord(this.location.getyCoord() - 3);
				break;
			
			case 4:
				this.location.setxCoord(this.location.getxCoord() - 3);
				break;
			}
		}

	}

	/**
	 * @return the subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}

	/**
	 * @param subSpecies the subSpecies to set.
	 * @throws InvalidSubspeciesException if subSpecies does not equal "Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", or "Siberian".
	 */
	public void setSubSpecies(String subSpecies) {
		
		String[] validSpecies = { "Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian" };
		boolean isValid = false;


			for (String species : validSpecies) {
				if (subSpecies.equalsIgnoreCase(species)) {
					isValid = true;
					break;
				}
			}

			if (isValid) {
				this.subSpecies = subSpecies;
			} else {
				throw new InvalidSubspeciesException(
						"Invalid Subspecies. Must be Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian (not case sensitive)");
			}
	}

	/**
	 * Returns all instance fields and their values in a string format.
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + Arrays.toString(this.location.getCoordinates()) + ", full=" + full
				+ ", rested=" + rested + "]";
	}

}
