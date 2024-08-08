package animals;

import exceptions.InvalidWingspanException;

/**
 * Goldfinch is a subclass of Animal
 * 
 * @author JacobRoberts
 */

public class Goldfinch extends Animal {

	private double wingSpan;

	/**
	 * Default constructor
	 */
	public Goldfinch() {
		super(0, new Location(0, 0));
		this.wingSpan = 9.0;
	}

	/**
	 * Preferred constructor
	 * 
	 * @param simID    must be greater than 0.
	 * @param location object of type Location.
	 * @param wingSpan double between 5.0 and 11.0.
	 */

	public Goldfinch(int simID, Location location, double wingSpan) {
		super(simID, location);
		setWingSpan(wingSpan);
		this.full = false;
		this.rested = true;
	}

	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}

	/**
	 * @param wingSpan the wingSpan to set.
	 * @throws InvalidWingspanException if wingSpan is not between 5.0 and 11.0.
	 */
	public void setWingSpan(double wingSpan) {

		try {
			if (wingSpan < 5.0 || wingSpan > 11.0) {
				throw new InvalidWingspanException("wingSpan must be between 5.0 and 11.0.");
			} else {
				this.wingSpan = wingSpan;
			}
		} catch (InvalidWingspanException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Returns all instance fields and their values in a string format.
	 */
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}

}
