/**
 * The Animal class encapsulates a generic animal that can be sub-classed by other classes.
 * 
 * @author JacobRoberts
 */

import Exceptions.InvalidSimIDException;

abstract class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	/**
	 * Default constructor
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
	 * @param simID must be greater than 0.
	 * @param location object of type Location.
	 */
	public Animal(int simID, Location location) {
		setSimID(simID);
		this.location = location;
		this.full = false;
		this.rested = true;
	}
	
	/**
	 * Generates a random double between 0 and 1.
	 * Sets full to false if random number is less than or equal to 0.5.
	 * Sets full to true if random number is greater than 0.5.
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
	 * Sets rested to false if random number is less than or equal to 0.5.
	 * Sets rested to true if random number is greater than 0.5.
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
	
	

	/**
	 * @return the simID
	 */
	public int getSimID() {
		return simID;
	}

	/**
	 * @param simID the simID to set
	 * @throws InvalidSimIDException if simID is less than or equal to 0.
	 */
	public void setSimID(int simID) {
		
		try {
			if(simID > 0) {
				this.simID = simID;
			} else if (simID <= 0) {
				throw new InvalidSimIDException("simID must be greater than 0");
			}
		} catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
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
