/**
 * The Animal class encapsulates a generic animal that can be sub-classed by other classes.
 * @author JacobRoberts
 */


abstract class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	// Constructors
	
	/**
	 * Empty-argument constructor
	 */
	public Animal() {
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	}
	
	/**
	 * Preferred Constructor
	 * 
	 * @param simID
	 * @param location
	 */
	public Animal(int simID, Location location) {
		this.simID = simID;
		this.location = location;
		this.full = false;
		this.rested = true;
	}
	
	/**
	 * Generates a random double between 0 and 1.
	 * Sets full to false if random number <= 0.5.
	 * Sets full to true if random number > 0.5.
	 * 
	 */
	public void eat() {
		
		double random = Math.random();
		
		if (random <= 0.5) {
			this.full = false;
		} else {
			this.full = true;
		}
	}
	
	
	/**
	* Generates a random double between 0 and 1.
	 * Sets rested to false if random number <= 0.5.
	 * Sets rested to true if random number > 0.5.
	 * 
	 */
	public void sleep() {
		
		double random = Math.random();
		
		if (random <= 0.5) {
			this.rested = false;
		} else {
			this.rested = true;
		}
	}
	
	// Getters and Setters

	/**
	 * @return the simID
	 */
	public int getSimID() {
		return simID;
	}

	/**
	 * @param simID the simID to set
	 */
	public void setSimID(int simID) {
		this.simID = simID;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the full
	 */
	public boolean isFull() {
		return full;
	}

	/**
	 * @param full the full to set
	 */
	public void setFull(boolean full) {
		this.full = full;
	}

	/**
	 * @return the rested
	 */
	public boolean isRested() {
		return rested;
	}

	/**
	 * @param rested the rested to set
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}

	
	
	
}
