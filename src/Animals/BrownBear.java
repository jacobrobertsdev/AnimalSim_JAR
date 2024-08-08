
package animals;

import exceptions.InvalidSubspeciesException;

/**
 * BrownBear is a subclass of Animal.
 * 
 * @author JacobRoberts
 */

public class BrownBear extends Animal{

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
		String[] validSpecies = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
		boolean isValid = false;
		
		try {
			
			for(String species : validSpecies) {
				if (subSpecies.toLowerCase().equals(species.toLowerCase())) {
					isValid = true;
				} 
			}
			
			if (isValid) {
				this.subSpecies = subSpecies;
			} else {
				throw new InvalidSubspeciesException("Invalid Subspecies. Must be Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian");
			}
			
			
		} catch (InvalidSubspeciesException e) {
			System.out.println(e.getMessage());
		}
		
	}

	/**
	 * Returns all instance fields and their values in a string format.
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}

}
