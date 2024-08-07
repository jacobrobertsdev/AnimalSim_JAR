/**
 * This class encapsulates the X and Y coordinates on a simulation map.
 * 
 * @author JacobRoberts
 */

public class Location {
	
	private int xCoord;
	private int yCoord;

	// Constructors
	
	/**
	 * Default constructor
	 */
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}

	/**
	 * Preferred constructor
	 * 
	 * @param x the x coordinate to set, must be 0 or greater.
	 * @param y the y coordinate to set, must be 0 or greater.
	 */
	public Location(int x, int y) {
		setxCoord(x);
		setyCoord(y);
	}
	
	/**
	 * Updates both the x and y coordinates.
	 * 
	 * @param x the x coordinate to set, must be 0 or greater.
	 * @param y the y coordinate to set, must be 0 or greater.
	 */
	public void update (int x, int y) {
		setxCoord(x);
		setyCoord(y);
	}
	
	
	/**
	 * Adds x and y coordinates to an integer array and returns the array.
	 * 
	 * @return array of integer coordinates [x,y]
	 */
	public int[] getCoordinates() {
		int[] coords = {this.xCoord, this.yCoord};
		return coords;
	}
	
	
	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}

	/**
	 * @param xCoord the xCoord to set
	 * @throws InvalidCoordinateExceptionif x is less than 0
	 */
	public void setxCoord(int xCoord) {

		// Validate input, throw exception if invalid
		try {

			if (xCoord < 0) {

				throw new InvalidCoordinateException("X cannot be less than 0");

			} else {

				this.xCoord = xCoord;
			}

		} catch (InvalidCoordinateException e) {

			System.out.println(e.getMessage());
		}

	}

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}

	/**
	 * @param yCoord the yCoord to set
	 * @throws InvalidCoordinateExceptionif y is less than 0
	 */
	public void setyCoord(int yCoord) {
		
		// Validate input, throw exception if invalid.
		try {

			if (yCoord < 0) {

				throw new InvalidCoordinateException("Y cannot be less than 0");

			} else {

				this.yCoord = yCoord;
			}

		} catch (InvalidCoordinateException e) {

			System.out.println(e.getMessage());
		}
	}

}
