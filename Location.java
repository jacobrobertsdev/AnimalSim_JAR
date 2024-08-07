/**
 * This class encapsulates the X and Y coordinates on a simulation map.
 * 
 * @author JacobRoberts
 */

public class Location {
	
	private int xCoord;
	private int yCoord;

	// Constructors
	
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}

	public Location(int x, int y) {
		setxCoord(x);
		setyCoord(y);
	}
	
	/**
	 * Updates both the x and y coordinates.
	 * Throws InvalidCoordinateException if x or y are less than 0
	 * 
	 * @param x the x coordinate to set
	 * @param y the y coordinate to set
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
	
	// Getters and Setters
	
	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}

	/**
	 * @param xCoord the xCoord to set
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
